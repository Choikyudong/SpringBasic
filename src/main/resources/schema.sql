CREATE TABLE mybatis
(
    id        bigint auto_increment primary key,
    email     varchar(50),
    password  varchar(100),
    name  varchar(30),
    phone varchar(30)
);

insert into mybatis(email, password, name, phone)
values ('Test1@naver.com', '12345', '테스터1', '01099887700');
insert into mybatis(email, password, name, phone)
values ('Test2@naver.com', '12345', '테스터2', '01088997700');
insert into mybatis(email, password, name, phone)
values ('Test3@naver.com', '12345', '테스터3', '01011254188');
insert into mybatis(email, password, name, phone)
values ('Test4@naver.com', '12345', '테스터4', '01044728940');
insert into mybatis(email, password, name, phone)
values ('Test5@naver.com', '12345', '테스터5', '01015448282');