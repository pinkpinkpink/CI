sudo service mysql start
sudo service mysql stop


# 连接
- mysql -h host -u user -p
- mysql -u user -p
mysql
- quit


# 查询
- Select version(),current_date;

# 创建使用数据库

- show databases;

- use test

- creat database db;

- alter user 'root'@'localhost' identified by 'myNewPass';

- set PASSWORD FOR 'root'@'localhost' = PASSWORD('MyNewPass');

- creat TABLE pet (name VARCHAR(20),owner VARCHAR(20),
    -> species VARCHAR(20),sex CHAR(1)   
    
- show tables;

- source ./textTable.txt


# 检索数据

- SELECT what_to_select FROM which_table WHERE conditions_to_satisfy;

- SELECT * FROM pet WHERE name = 'bowser';

- SELECT * FROM pet WHERE species = 'snack' OR species = 'bird';


- SELECT 1 is NULL, 1 is not NULL;

# 模式匹配

- SELECT * FROM pet WHERE name LIKE 'b%'；

# 计算行

- SELECT owner，COUNT(*) FROM pet GROUP BY owner;

- SELECT DATABASE();

- SHOW TABLES;

# 查询

- mysql database;

- SELECT MAX(article) As article FROM shop;

- SELECT article ,dearler ,price FROM shop WHERE

price =(SELECT MAX(price) FROM shop);

- SELECT article ,MAX(price) As price FROM shop GROUP

BY article;

# 访问量

# 批处理

- mysql < batch-file

case

if

# JDBC

create prodcedue demosp(in inputParam VARCHAR(255),INOUT inoutParam INT)

BEGIN z int;

SET z = inoutParam;
