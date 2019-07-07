Create Table business (
       busines_id serial primary key,
       name varchar(128) not null,
       slogan varchar(256),
       image varchar(128),
       rating decimal(3,2)
);

Create Table business_type (
        business_id long,
        type_id long,
        
        Primary Key (business_id, type_id)
);

Create Table type (
        type_id serial primary key,
        specific_type varchar(64),
        general_type varchar(64) not null
);

Create Table contact (
        contact_id serial primary key,
        business_id long not null,
        phone1 varchar(13) not null,
        label1 varchar(30),
        phone2 varchar(10),
        label2  varchar(30),
        email varchar(64),
        url varchar(256),
        
        constraint fk_business_business_id foreign key (business_id) references business(business_id),
        constraint chk_label2_if_phone2_not_null check ((phone2 is not null AND label1 is not null AND label2 is not null) OR (phone2 is null AND label1 is null AND label2 is null))       
);

Create Table address (
        address_id serial primary key,
        business_id long not null,
        street1 varchar(256) not null,
        street2 varchar(256),
        street3 varchar(256),
        city varchar(64),
        state varchar(64) not null,
        zip_code int not null,

        constraint fk_business_business_id foreign key (business_id) references business(business_id),
);