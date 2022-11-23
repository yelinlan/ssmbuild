USE SCHOOL;
DROP TABLE IF EXISTS BOOKS;
CREATE TABLE BOOKS
(
    bookId     INT(10)      NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '书ID',
    bookName   VARCHAR(100) NOT NULL COMMENT '书名',
    bookCounts INT(11)      NOT NULL COMMENT '数量',
    detail      VARCHAR(200) NOT NULL COMMENT '描述'
);

INSERT INTO BOOKS (bookId, bookName, bookCounts, detail)
VALUES (1, 'JAVA', 1, '从入门到放弃'),
       (2, 'MYSQL', 10, '从别库到跑路'),
       (3, 'LINUX', 5, '从进门到进牢');
