
■テーブルの内容
ITDB=# select * from account;
 loginid |   pass   |     name      | roleid
---------+----------+---------------+--------
 Admin   | password | Administrator |      2
 root    | root     | Master        |      1
(2 行)


ITDB=# \c ITDB
データベース"ITDB"にユーザー"postgres"として接続しました。
ITDB=# select * from account;
 loginid |   pass   |     name      | roleid
---------+----------+---------------+--------
 Admin   | password | Administrator |      2
 root    | root     | Master        |      1
(2 行)

■実行結果 (HelloWorldTest/main)
loginid:Admin name:Administrator pass:password roleid:2
loginid:root name:Master pass:root roleid:1
