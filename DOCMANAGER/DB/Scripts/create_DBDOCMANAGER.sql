create database DBDOCMANAGER;
use DBDOCMANAGER;

CREATE TABLE document
(
	id       	BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `code`      CHAR(7) NOT NULL,
	name     	VARCHAR(30),
	description VARCHAR(300),
    type        VARCHAR(30),
    `number`    VARCHAR(30),
    acronym     VARCHAR(10) NOT NULL,
    emission    TIMESTAMP NOT NULL,
    validity    TIMESTAMP,
    `status` 	BOOLEAN NOT NULL

)engine = innodb;

CREATE TABLE category
(
	id       	BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `code`      CHAR(7) NOT NULL,
	name     	VARCHAR(30),
	description VARCHAR(300),
    type        VARCHAR(30),
    `status` 	BOOLEAN NOT NULL

)engine = innodb;

CREATE TABLE attachment
(
	id       	BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `code`      CHAR(7) NOT NULL,
	name     	VARCHAR(30),
	description VARCHAR(300),
    type        VARCHAR(30),
    `status` 	BOOLEAN NOT NULL

)engine = innodb;

CREATE TABLE properties
(
	id       	BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `code`      CHAR(7) NOT NULL,
	name     	VARCHAR(30),
	description VARCHAR(300),
    type        VARCHAR(30),
    `status` 	BOOLEAN NOT NULL

)engine = innodb;

CREATE TABLE document_category
(
	id_document  BIGINT NOT NULL,
	id_category  BIGINT NOT NULL,
    date_initial TIMESTAMP NOT NULL DEFAULT current_timestamp(),
    date_final   TIMESTAMP NOT NULL,
    
	CONSTRAINT fk_document FOREIGN KEY (id_document) REFERENCES document (id),
	CONSTRAINT fk_category FOREIGN KEY (id_category) REFERENCES category (id)

)engine = innodb;

CREATE TABLE document_properties
(
	id_document   BIGINT NOT NULL,
	id_properties BIGINT NOT NULL,
    date_initial  TIMESTAMP NOT NULL DEFAULT current_timestamp(),
    date_final    TIMESTAMP NOT NULL,
    
	CONSTRAINT fk_document1 FOREIGN KEY (id_document) REFERENCES document (id),
	CONSTRAINT fk_properties FOREIGN KEY (id_properties) REFERENCES properties (id)

)engine = innodb;

CREATE TABLE document_attachment
(
	id_document   BIGINT NOT NULL,
	id_attachment BIGINT NOT NULL,
    date_initial  TIMESTAMP NOT NULL DEFAULT current_timestamp(),
    date_final    TIMESTAMP NOT NULL,
    
	CONSTRAINT fk_document2 FOREIGN KEY (id_document) REFERENCES document (id),
	CONSTRAINT fk_attachment FOREIGN KEY (id_attachment) REFERENCES attachment (id)

)engine = innodb;

