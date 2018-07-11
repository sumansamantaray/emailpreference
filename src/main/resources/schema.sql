CREATE TABLE email_preferences
(
	email_preference_id int PRIMARY KEY auto_increment,
    account_number varchar(100) NOT NULL,
    email_address varchar(100) DEFAULT NULL,
    domestic_Inb varchar(1),
    domestic_Out varchar(1),
    international_Inb varchar(1),
    international_Out varchar(1),
    book_Inb varchar(1),
    book_Out varchar(1),
    email_format varchar(10)
);