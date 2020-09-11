
目  录
1.	前言	1
2.	现状描述	1
2.1	系统现状	1
2.2	问题描述	1
3.	调优过程	1
3.1	操作系统	1
3.2	数据库	2
 
1.	前言
数据库优化是在数据库运行过程中需要持续进行的一项工作,目的是让数据库处于最佳的运行状态,保证数据库的性能。本次是针对全国NMA平台数据库进行的一次优化工作，优化后性能有一定的改善，因此将整个优化过程记录如下，供其它系统平台数据库优化时参考，但切记，不同的配置环境，优化调整会有所不同，绝不可完全按照此设置值进行调整。
2.	现状描述
2.1	系统现状
NMA全国系统平台数据库由两台PCServer服务器部署Oracle10gRAC数据库集群模式。单台服务器硬件配置为2CPU*8核，32G内存。
NMA版本为2.0，经过一段时间的系统持续调优后，运行正常。
2.2	问题描述
NMA全国系统平台前期运行正常，只是将本公司的NMA3.0版本的数据从单机数据库服务器（2cpu，8G内存，Oracle11g数据库）上迁移到Oracle10gRAC集群下之后。
迁移后，在全国系统平台Oracle10gRAC环境下同时运行了针对全国的NMA2.0和针对本公司的NMA3.0。两台服务器节点的负载相对较高，CPU利用率持续在50-60%之间，I/O等待很高，导致NMA3.0访问速度缓慢。
3.	调优过程
3.1	操作系统
针对全国NMA平台数据库服务器操作系统的I/O等待严重，巧用linux服务器的/dev/shm/，提高磁盘I/O吞吐量,提高访问速度。/dev/shm/是linux下一个目录，/dev/shm目录不在磁盘上，而是在内存里，因此使用linux /dev/shm/的效率非常高，直接写进内存。
linux下/dev/shm的容量默认最大为内存的一半大小，使用df -h命令可以看到。通过/etc/fstab文件来修改/dev/shm的容量(增加size选项即可)，在此处，根据实际修改内容如下：
tmpfs     /dev/shm    tmpfs   defaults,size=32G   0,0
3.2	数据库
1、根据数据库运行情况，进行数据库参数的调整，具体调整参数如下：
--数据库系统全局区占用最大内存，一般设置为服务器物理内存的50-75%
alter system set sga_max_size=20480M scope=spfile;
--数据库系统全局区占用目标内存，一般设置低于sga_max_size参数值
alter system set sga_target=20000M scope=spfile;
--数据库打开游标数，根据系统运行情况判断进行设置，该值太小会影响部分事务出现等待现象
alter system set open_cursors=3000 scope=spfile;
--数据库数据写进程，默认值为1，如果数据量较大，根据情况调整该值大小，提高CPU性能
alter system set db_writer_processes=8 scope=spfile;
--数据库进程全局区内存区，一般设置为数据库内存的20%
alter system set pga_aggregate_target=5120M scope=spfile;
--该参数为实例的发行版本级别，可以充分利用RDBMS引擎内置的所有功能。
alter system set compatible='10.2.0.4' scope=spfile;
--该参数决定了全表扫描中一次可以读取多少数据块。使用表扫描将提高表扫描时并行操作的性能。
alter system set db_file_multiblock_read_count=32 scope=spfile;
2、进行了数据库表分析，语法如下：
analyze table  table_name compute statistics;
3、进行了索引分析，语法如下：
analyze index  index_name   compute statistics;
