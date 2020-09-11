#达梦建库语句

create tablespace "TS_GSODS_NCMG_BASE" datafile '/opt/dmdbms/data/DAMENG/GSODS/TS_GSODS_NCMG_BASE.DBF' size 512 autoextend 
on  maxsize 102400 CACHE = NORMAL

create user "DB_GSODS_NCMG_BASE" identified by "eemp@V1.0#NCMG" 
limit failed_login_attemps 3, password_lock_time 1, password_grace_time 10
default tablespace "TS_GSODS_NCMG_BASE"
default index tablespace "TS_GSODS_NCMG_BASE";

grant "PUBLIC","VTI" ,"RESOURCE" to "DB_GSODS_NCMG_BASE";

alter user "DB_GSODS_AREV_BASE_SQ" identified by "eemp@V1.0#AREV" ;
/**********************************/
