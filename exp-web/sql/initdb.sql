-- mysql -uusername -p
-- 


CREATE DATABASE `spring_example` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
use spring_example;

CREATE TABLE `userinfo` (
  `userId` int(10) NOT NULL,
  `userName` varchar(128) NOT NULL COMMENT '用户名', 
  `password` varchar(256) NOT NULL COMMENT '用户密码', 
  `age` int(10) DEFAULT '0' COMMENT '年龄',
  `type` tinyint(2) DEFAULT '1' COMMENT '用户类型 1 普通用户',
  `profile` text COMMENT '自我介绍',
  `createTime` datetime NOT NULL COMMENT '发表时间',
  `updateTime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`userId`),
  KEY `index_create_time` (`createTime`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `userinfo` (userId, userName, password, age)values(1, "zhch", "mm", 12);
insert into `userinfo` (userId, userName, password, age)values(2, "lisi", "mm", 8);
update `userinfo` set createTime=updateTime;