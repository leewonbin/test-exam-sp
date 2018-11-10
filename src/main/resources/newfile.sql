SET SESSION FOREIGN_KEY_CHECKS=0;

/* Drop Tables */

DROP TABLE IF EXISTS clientInterest;
DROP TABLE IF EXISTS gmjAcademy;
DROP TABLE IF EXISTS gmjArchitectInfo;
DROP TABLE IF EXISTS gmjBBoard;
DROP TABLE IF EXISTS gmjBook;
DROP TABLE IF EXISTS gmjComment;
DROP TABLE IF EXISTS gmjCBoard;
DROP TABLE IF EXISTS gmjclient;
DROP TABLE IF EXISTS gmjVBoard;




/* Create Tables */

CREATE TABLE clientInterest
(
	-- 번호
	gmjUserNo int unsigned NOT NULL COMMENT '번호',
	gmjPlace1 varchar(255) NOT NULL,
	gmjPlace2 varchar(255) NOT NULL,
	gmjPlace3 varchar(255) NOT NULL,
	gmjPlace4 varchar(255) NOT NULL,
	gmjPlace5 varchar(255) NOT NULL,
	gmjPlaceCnt int
);


CREATE TABLE gmjAcademy
(
	-- 번호
	-- 
	gmjAcademyNo int NOT NULL AUTO_INCREMENT COMMENT '번호
',
	-- 학원명
	gmjAcademyName varchar(100) NOT NULL COMMENT '학원명',
	gmjAcademyTitle varchar(100) NOT NULL,
	-- 정보
	gmjAcademyDesc text NOT NULL COMMENT '정보',
	PRIMARY KEY (gmjAcademyNo)
);


CREATE TABLE gmjArchitectInfo
(
	-- 건물번호
	gmjArchitectBNo int unsigned NOT NULL AUTO_INCREMENT COMMENT '건물번호',
	-- 작가 번호
	-- 
	gmjArchitectNo int NOT NULL COMMENT '작가 번호
',
	-- 건축가 국어이름
	gmjArchitectKName varchar(30) NOT NULL COMMENT '건축가 국어이름',
	-- 건축가 일본명
	-- 
	gmjArchitectJName varchar(30) NOT NULL COMMENT '건축가 일본명
',
	-- 건축가 영어이름
	-- 
	gmjArchitectEName varchar(30) NOT NULL COMMENT '건축가 영어이름
',
	-- 건축가의 건물 국어이름
	gmjArchitectKBN varchar(50) COMMENT '건축가의 건물 국어이름',
	-- 건물 일본명
	gmjArchitectJBN varchar(50) COMMENT '건물 일본명',
	-- 건물영어이름
	gmjArchitectEBN varchar(100) COMMENT '건물영어이름',
	gmjArchitectArea varchar(10) NOT NULL,
	-- 국가
	-- 
	gmjArchitectBAddress1 varchar(100) NOT NULL COMMENT '국가
',
	-- 시도 단위
	-- 
	gmjArchitectBAddress2 varchar(100) NOT NULL COMMENT '시도 단위
',
	gmjArchitectBAddress3 varbinary(100) NOT NULL,
	gmjArchitectBTtitle varchar(100) NOT NULL,
	-- 건물설명
	gmjArchitectBDesc varchar(1000) NOT NULL COMMENT '건물설명',
	-- 이미지
	-- 
	gmjArchitectBPicture varchar(100) NOT NULL COMMENT '이미지
',
	gmjArchitectBFavorite int NOT NULL,
	gmjArchitectTtitle text NOT NULL,
	gmjArchitectDesc text NOT NULL,
	PRIMARY KEY (gmjArchitectBNo)
);


CREATE TABLE gmjBBoard
(
	gmjBBoardNo int NOT NULL AUTO_INCREMENT,
	gmjBBoardTitle varchar(100) NOT NULL,
	gmjBBoardDesc text NOT NULL,
	gmjBBoardCredat varchar(50) NOT NULL,
	gmjBBoardModdat varchar(50) NOT NULL,
	gmjBBoardCnt int NOT NULL,
	PRIMARY KEY (gmjBBoardNo)
);


CREATE TABLE gmjBook
(
	gmjBookNo int NOT NULL AUTO_INCREMENT,
	gmjBookName varchar(50) NOT NULL,
	gmjBookTitle varchar(100) NOT NULL,
	gmjBookDesc text NOT NULL,
	PRIMARY KEY (gmjBookNo)
);


CREATE TABLE gmjCBoard
(
	-- 커뮤니티 번호
	-- 
	gmjCBoardNo int unsigned NOT NULL AUTO_INCREMENT COMMENT '커뮤니티 번호
',
	-- 커뮤니티 이름
	gmjCBoardTitle varchar(100) NOT NULL COMMENT '커뮤니티 이름',
	-- 커뮤니티설명
	gmjCBoardDesc text NOT NULL COMMENT '커뮤니티설명',
	-- 커뮤니티 조회수
	gmjCBoardCnt int NOT NULL COMMENT '커뮤니티 조회수',
	-- 커뮤니티 등록일
	gmjCBoardCredat varchar(50) NOT NULL COMMENT '커뮤니티 등록일',
	-- 커뮤니티 수정날짜
	gmjCBoardModdat varchar(50) NOT NULL COMMENT '커뮤니티 수정날짜',
	PRIMARY KEY (gmjCBoardNo)
);


CREATE TABLE gmjclient
(
	-- 번호
	gmjUserNo int unsigned NOT NULL AUTO_INCREMENT COMMENT '번호',
	-- 유저아이디
	gmjUserEmail varchar(100) NOT NULL COMMENT '유저아이디',
	-- 유저비밀번호
	gmjUserPwd varchar(30) NOT NULL COMMENT '유저비밀번호',
	-- 유저 이름
	gmjUserName varchar(10) NOT NULL COMMENT '유저 이름',
	-- 유저 핸드폰번호
	gmjUserPhone varchar(20) NOT NULL COMMENT '유저 핸드폰번호',
	-- 생일
	gmjUserBirth date NOT NULL COMMENT '생일',
	-- 유저성별
	gmjUserSex varchar(5) NOT NULL COMMENT '유저성별',
	-- 주소
	-- 
	gmjUserAddress varchar(100) NOT NULL COMMENT '주소
',
	PRIMARY KEY (gmjUserNo)
);


CREATE TABLE gmjComment
(
	gmjCommentNo int NOT NULL AUTO_INCREMENT,
	-- 번호
	gmjUserNo int unsigned NOT NULL COMMENT '번호',
	-- 커뮤니티 번호
	-- 
	gmjCBoardNo int unsigned NOT NULL COMMENT '커뮤니티 번호
',
	gmjCommentText text NOT NULL,
	gmjCommentCredat datetime NOT NULL,
	gmjCommentModdat datetime NOT NULL,
	PRIMARY KEY (gmjCommentNo)
);


CREATE TABLE gmjVBoard
(
	gmjVBoardNo int NOT NULL AUTO_INCREMENT,
	gmjVBoardTitle varchar(50) NOT NULL,
	gmjVBoardDesc text NOT NULL,
	gmjVBoardCreddat varchar(50) NOT NULL,
	gmjVBoardModdat varchar(50) NOT NULL,
	gmjVBoardCnt int NOT NULL,
	PRIMARY KEY (gmjVBoardNo)
);



/* Create Foreign Keys */

ALTER TABLE gmjComment
	ADD FOREIGN KEY (gmjCBoardNo)
	REFERENCES gmjCBoard (gmjCBoardNo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE clientInterest
	ADD FOREIGN KEY (gmjUserNo)
	REFERENCES gmjclient (gmjUserNo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE gmjComment
	ADD FOREIGN KEY (gmjUserNo)
	REFERENCES gmjclient (gmjUserNo)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



