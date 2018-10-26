CREATE TABLE customer(
	customer_id INT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(64),
	middle_initial VARCHAR(1),
	last_name VARCHAR(64),
	suffix VARCHAR(32)
);

CREATE TABLE contact_info(
	id INT AUTO_INCREMENT PRIMARY KEY,
	customer_id INT,
	address VARCHAR(64),
	address2 VARCHAR(64),
	city VARCHAR(64),
	state VARCHAR(64),
	zip_code INT,
	home_phone INT,
	business_phone INT,
	cell_phone INT,
	fax_number INT,
	email_address VARCHAR(64),
	customer_id INT FOREIGN KEY REFERENCES customer(customer_id)
);

CREATE TABLE account_type(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(32)	
);

CREATE TABLE account(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	customer_id INT,
	balance BIGINT,
	account_type VARCHAR(32),
	is_frozen BOOLEAN,
	is_overdrafted BOOLEAN,
	customer_id INT FOREIGN KEY REFERENCES customer(customer_id),
	account_type VARCHAR FOREIGN KEY REFERENCES account_type(name)
);