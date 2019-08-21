DROP TABLE IF EXISTS person_phone;
DROP TABLE IF EXISTS phone;
DROP TABLE IF EXISTS address;
DROP TABLE IF EXISTS person;


CREATE TABLE person (
        user_id serial primary key,
        first_name varchar(35) not null,
        last_name varchar(35) not null
);

CREATE TABLE address (
        address_id serial primary key,
        user_id int not null,
        category varchar(8) not null,
        other_description varchar(64),
        line_one varchar(255) not null,
        line_two varchar(255),
        line_three varchar(255),
        city varchar(255) not null,
        province varchar(64) not null,
        postal_code varchar(20) not null,
        
        constraint fk_person_user_id foreign key (user_id) references person(user_id),
        constraint chk_address_category check (category IN ('Home', 'Work', 'Shipping', 'Billing', 'Other')),
        constraint chk_category_description check ( (category = 'Other' AND other_description IS NOT NULL ) OR ( category <> 'Other' AND other_description IS NULL ) )
);

CREATE TABLE phone (
        phone_id serial primary key,
        category varchar(8) not null,
        other_description varchar(64),
        phone_number varchar(20) not null
);

CREATE TABLE person_phone (
        user_id int,
        phone_id int,
        
        PRIMARY KEY (user_id, phone_id),
        constraint fk_person_person_id foreign key (user_id) references person(user_id),
        constraint fk_phone_phone_id foreign key (phone_id) references phone(phone_id)             
);


