Select bus.business_id, name, slogan, image, rating, type.type_id, specific_type, general_type, address_id, street1, street2, street3, state, zip_code, contact_id, phone1, label1, phone2, label2, email, url From business As bus
Join contact On bus.business_id = contact.business_id
Join business_type As bt On bus.business_id = bt.business_id
Join type On bt.type_id = type.type_id
Join address On bus.business_id = address.business_id;




Select * From business;
Select * From contact;
Select * From address;
Select * From type;
Select * From business_type;

Select business_id From business Where name = ? And slogan = ?;


Start Transaction;

Insert Into business (business_id, name, slogan, image, rating) Values (default, ?, ?, ?, ?);
Insert Into type (type_id, specific_type, general_type) Values (default, ?, ?);
Insert Into address (address_id, business_id, street1, state, zip_code) Values (default, (Select business_id from business Where name = 'testBusiness'), '123 Test St.', 'Ohio', 42231);
Insert Into contact (contact_id, business_id, phone1, label1, email, url) Values (default, (Select business_id from business Where name = 'testBusiness'), '999-999-9999', 'Mobile', 'test@test.com', 'www.test.com');
Insert Into business_type (business_id, type_id) Values ((Select business_id from business Where name = 'testBusiness'),(Select type_id from type Where (specific_type = 'testSpecType') AND (general_type = 'testGenType')));

Rollback;