环境变量
vim /etc/profile
set java environment
. /etc/profile


tomcat

设置tomcat后台启动
./startup.sh &

查看启动日志
./catalina.sh run

运行jar
nohup java -jar fn.java &
nohup不挂断运行命令，当账户退出或终端关闭时，程序仍然运行
&表示后台运行


解压打包

7z e filename.7z


压缩包
jar cvf fn.jar
打包
jar xvf fn.jar

同一台服务器运行多个tomcat
修改三个端口
8005
8080
8009
为其他端口



查看端口
netstat -alnp | grep 8080
kill -9 xxxx
