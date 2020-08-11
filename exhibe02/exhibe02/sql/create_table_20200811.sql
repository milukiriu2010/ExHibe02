CREATE TABLE BOOK 
(
	ISBN char(17) primary key not null,
	NAME varchar(64) not null,
	PRICE integer not null
);

insert into book(isbn,name,price) values('ISBN4-0000-0000-0','‚È‚¼‚È‚¼',500);

CREATE TABLE Person 
(
	id integer primary key not null,
	NAME text not null
);

CREATE TABLE Person_Books
(
	personId integer not null,
	ISBN char(17) not null,
	constraint fk_person_books
	  FOREIGN KEY (isbn) REFERENCES book(isbn)
);

