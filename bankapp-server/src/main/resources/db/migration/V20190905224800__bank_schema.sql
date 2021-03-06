DROP TABLE IF EXISTS customer;
CREATE TABLE customer(
	id INT AUTO_INCREMENT,
	first_name VARCHAR(64),
	middle_initial VARCHAR(1),
	last_name VARCHAR(64),
	suffix VARCHAR(32),
	PRIMARY KEY(id)
);

DROP TABLE IF EXISTS contact_info;
CREATE TABLE contact_info(
	id INT AUTO_INCREMENT,
	customer_id INT,
	address VARCHAR(64),
	address2 VARCHAR(64),
	city VARCHAR(64),
	state VARCHAR(64),
	zip_code VARCHAR(16),
	home_phone VARCHAR(32),
	business_phone VARCHAR(32),
	cell_phone VARCHAR(32),
	fax_number VARCHAR(32),
	email_address VARCHAR(64),
	PRIMARY KEY(id),
	FOREIGN KEY fk_customer(customer_id) REFERENCES customer(id) ON DELETE CASCADE
);

DROP TABLE IF EXISTS account_type;
CREATE TABLE account_type(
	id INT AUTO_INCREMENT,
	name VARCHAR(32),
	PRIMARY KEY(id),
	UNIQUE KEY(name)
);

DROP TABLE IF EXISTS account;
CREATE TABLE account(
	id BIGINT AUTO_INCREMENT,
	customer_id INT,
	balance BIGINT,
	account_type VARCHAR(32),
	is_frozen BOOLEAN,
	is_overdrafted BOOLEAN,
	PRIMARY KEY(id),
	FOREIGN KEY fk_customer(customer_id) REFERENCES customer(id) ON DELETE CASCADE,
	FOREIGN KEY fk_account_type(account_type) REFERENCES account_type(name)
);
