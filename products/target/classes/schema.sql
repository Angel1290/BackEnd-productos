

create table products(
	id_product INT  PRIMARY KEY,
	nombre_product VARCHAR (100),
	price VARCHAR (100),
	category VARCHAR (100)	
);


create table categorys(
	id_category INT PRIMARY KEY,
	category VARCHAR (100)
);

create table user_se(
	id INT  PRIMARY KEY,
	username VARCHAR (50),
	lastname VARCHAR (50),
	firstname VARCHAR (50),
	country VARCHAR (50),
	password VARCHAR (50),
	role VARCHAR (50)
);