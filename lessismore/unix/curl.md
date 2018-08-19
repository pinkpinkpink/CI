- fetch video

curl http://192.168.3.4:8080/2015%E7%A7%8B.%E6%8E%9F%E4%B8%8A%E4%BB%8A%E6%97%A5%E5%AD%90%E7%9A%84%E5%A4%87%E5%BF%98%E5%BD%95/

| grep -P "http:[^>]*?(mp4)" -o | xargs wget 


-p 正则表达式

（mp4）视频类型

| xargs wget 用wget下载

