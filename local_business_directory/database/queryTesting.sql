Select bus.business_id, name, slogan, image, rating, type.type_id, specific_type, general_type, address_id, street1, street2, street3, state, zip_code, contact_id, phone1, label1, phone2, label2, email, url From business As bus
Join contact On bus.business_id = contact.business_id
Join business_type As bt On bus.business_id = bt.business_id
Join type On bt.type_id = type.type_id
Join address On bus.business_id = address.business_id;

Truncate business_type Cascade;
Truncate type Cascade;
Truncate address Cascade;
Truncate contact Cascade;
Truncate business Cascade;

SELECT bus.business_id, name, slogan, image, rating, type.type_id, specific_type, general_type, address_id, street1, street2, street3, 
state, zip_code, contact_id, phone1, label1, phone2, label2, email, url From business As bus 
Join contact On bus.business_id = contact.business_id 
Join business_type As bt On bus.business_id = bt.business_id 
Join type On bt.type_id = type.type_id 
Join address On bus.business_id = address.business_id  WHERE  city Like ?  Order By  bus.name ASC;

SELECT bus.business_id, name, slogan, image, rating, type.type_id, specific_type, general_type, address_id, street1, street2, street3, city, state, zip_code, contact_id, phone1, label1, phone2, label2, email, url From business As bus Join contact On bus.business_id = contact.business_id Join business_type As bt On bus.business_id = bt.business_id Join type On bt.type_id = type.type_id Join address On bus.business_id = address.business_id  WHERE  city Like ?  Order By  general_type ASC, specific_type ASC;
%testCity%

Select * From business;
Select * From contact;
Select * From address;
Select * From type;
Select * From business_type;

Select business_id From business Where name = ? And slogan = ?;


Start Transaction;

Insert Into business (business_id, name, slogan, image, rating) Values (default, 'testBus', 'Work, please', 'bus.IMG', 3);
Insert Into type (type_id, specific_type, general_type) Values (default, 'thatoneoverthere', 'thatone');
Insert Into address (address_id, business_id, street1, city, state, zip_code) Values (default, (Select business_id from business Where name = 'testBus'), '123 Test St.', 'Test City', 'Ohio', 42231);
Insert Into contact (contact_id, business_id, phone1, label1, email, url) Values (default, (Select business_id from business Where name = 'testBus'), '999-999-9999', 'Mobile', 'test@test.com', 'www.test.com');
Insert Into business_type (business_id, type_id) Values ((Select business_id from business Where name = 'testBus'),(Select type_id from type Where (specific_type = 'thatoneoverthere') AND (general_type = 'thatone')));

Rollback;