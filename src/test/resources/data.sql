INSERT INTO customer (first_name, middle_initial, last_name, suffix) VALUES ('John', null, 'Doe', null), ('Jane', 'F', 'Doe', null);

INSERT INTO contact_info (customer_id, address, address2, city, state, zip_code, home_phone, business_phone, cell_phone, fax_number, email_address) VALUES (1, '123 Unknown St', null, 'Lostville', 'MA', 01902, null, null, null, null, 'johndoe01902@gmail.com');

INSERT INTO account_type (name) VALUES ('Checking'), ('Savings');

INSERT INTO account (customer_id, balance, account_type, is_frozen, is_overdrafted) VALUES (1, 0.00, 'Checking', false, false), (2, 0.00, 'Checking', false, false);
