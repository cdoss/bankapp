CREATE TABLE customer(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	first_name VARCHAR(64),
	middle_initial VARCHAR(1),
	last_name VARCHAR(64),
	suffix VARCHAR(32)
);

CREATE TABLE contact_info(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	customer_id BIGINT,
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
	FOREIGN KEY (customer_id) REFERENCES customer(id)
);

CREATE TABLE account_type(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(32)	
);

CREATE TABLE account(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	customer_id BIGINT,
	balance DECIMAL(65,2),
	account_type VARCHAR(32),
	is_frozen BOOLEAN,
	is_overdrafted BOOLEAN,
	FOREIGN KEY (customer_id) REFERENCES customer(id),
	FOREIGN KEY (account_type) REFERENCES account_type(name)
);
