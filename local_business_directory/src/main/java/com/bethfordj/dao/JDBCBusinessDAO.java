package com.bethfordj.dao;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.bethfordj.dao.model.Address;
import com.bethfordj.dao.model.Business;
import com.bethfordj.dao.model.BusinessFilter;
import com.bethfordj.dao.model.BusinessSortOrder;
import com.bethfordj.dao.model.BusinessType;
import com.bethfordj.dao.model.ContactInfo;


@Component
public class JDBCBusinessDAO implements BusinessDAO {
	
	private static final String SELECT_BUSINESSES_SQL = "SELECT bus.business_id, name, slogan, image, rating, type_id, specific_type, general_type, " + 
						"address_id, street1, street2, street3, state, zip_code, " + 
						"contact_id, phone1, label1, phone2, label2, email, url " +
						"From business As bus " + 
						"Join contact On bus.business_id = contact.business_id " +
						"Join business_type As bt On bus.business_id = bt.business_id " +
						"Join type On bt.type_id = type.type_id " +
						"Join address On bus.business_id = address.business_id ";

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public JDBCBusinessDAO(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
    @Override
    public List<Business> getAll() {
        return getAll(null, null);
    }
    
    @Override
    public List<Business> getAll(BusinessFilter filter, BusinessSortOrder sortOrder) {
        if (filter == null) {
            filter = new BusinessFilter();
        }
        
    	String sql = SELECT_BUSINESSES_SQL;
        
        List<String> filters = new ArrayList<>();
        List<Object> queryParameters = new ArrayList<>();

        if (filter.getBusinessName() != null) {
            filters.add(" bus.name Like ? ");
            queryParameters.add("%" + filter.getBusinessName() + "%");
        }

        if (filter.getCityName() != null) {
            filters.add(" city Like ? ");
            queryParameters.add("%" + filter.getCityName() + "%");
        }

        if (filter.getZipCode() != 0) {
            filters.add(" zip_code = ? ");
            queryParameters.add(filter.getZipCode());
        }
        
        if (filter.getType() != null) {
            filters.add(" general_type Like ? ");
            queryParameters.add("%" + filter.getType() + "%");
        }

        if (!filters.isEmpty()) {
            sql += " WHERE ";
            sql += String.join(" AND ", filters);
        }

        sql += " Order By ";
        if (sortOrder == BusinessSortOrder.GENERAL_TYPE) {
            sql += " general_type ASC, specific_type ASC;";
        } else if (sortOrder == BusinessSortOrder.RATING_HIGH_TO_LOW) {
            sql += " rating DESC ";
        } else if (sortOrder == BusinessSortOrder.RATING_LOW_TO_HIGH) {
            sql += " rating ASC ";
        } else {
            sql += " bus.name ASC ";
        }

        SqlRowSet result = jdbcTemplate.queryForRowSet(sql, queryParameters.toArray());

        List<Business> searchResults = new ArrayList<Business>();
        
        if (result.next()) {
            return mapRowSetToBusinessList(result);
        }
        return searchResults;
    }
    
    public void saveNewBusiness(Business newBusiness) {
    	String sqlBus = "Insert Into business (business_id, name, slogan, image, rating) Values (default, ?, ?, ?, ?);";
        jdbcTemplate.update(sqlBus, newBusiness.getBusinessName(), newBusiness.getSlogan(), newBusiness.getImageName(), newBusiness.getRating());
        
        getBusinessId(newBusiness);
        
        saveNewAddress(newBusiness);
        saveNewContact(newBusiness);
       
        		
        
    }
    
 
    

    
    private void saveNewAddress(Business newBusiness) {
    	Address newAddress = newBusiness.getAddress();
    	String sqlAdd = "Insert Into address (address_id, business_id, street1,  street2, street3, state, zip_code) " +
    			"Values (default, ?, ?, ?, ?, ?, ?);";
    	jdbcTemplate.update(sqlAdd, newBusiness.getBusinessId(), newAddress.getStreet1(), newAddress.getStreet2(), 
    			newAddress.getStreet3(), newAddress.getState(), newAddress.getZipCode()); 
    	getAddressId(newBusiness, newAddress);
    }
    
    private void saveNewContact(Business newBusiness) {
    	ContactInfo newContact = newBusiness.getContact();
    	String sqlCon = "Insert Into contact (contact_id, business_id, phone1, label1, phone2, label2, email, url) " +
    			"Values (default, ?, ?, ?, ?, ?, ?, ?);";
    	jdbcTemplate.update(sqlCon, newBusiness.getBusinessId(), newContact.getPhone1(), newContact.getLabel1(), 
    			newContact.getPhone2(), newContact.getLabel2(), newContact.getEmail(), newContact.getWebsite());
    	getContactId(newBusiness, newContact);
    }
    
    private void saveNBType(Business newBusiness) {
    	BusinessType newType = newBusiness.getType();
    	String sqlTyp = "Insert Into type (type_id, specific_type, general_type) Values (default, ?, ?);";
    	jdbcTemplate.update(sqlTyp, newType.getSpecificType(), newType.getGeneralType());
    	getTypeId(newBusiness, newType);
    }
	
    private void getBusinessId(Business newBusiness) {
    	String sql = "Select business_id From business Where name = ? And slogan = ?;";
    	SqlRowSet result = jdbcTemplate.queryForRowSet(sql, newBusiness.getBusinessName(), newBusiness.getSlogan());
    	
    	if (result.next()) {
    		newBusiness.setBusinessId(result.getLong("business_id"));
    	}
    }
    
    private void getAddressId(Business newBusiness, Address newAddress) {
    	String sql = "Select address_id From address Where street1 = ? And state = ?;";
    	SqlRowSet result = jdbcTemplate.queryForRowSet(sql, newAddress.getStreet1(), newAddress.getState());
    	
    	if (result.next()) {
    		newAddress.setAddressId(result.getLong("address_id"));
    	}
    	newBusiness.setAddress(newAddress);
    }
    
    private void getContactId(Business newBusiness, ContactInfo newContact) {
    	String sql = "Select contact_id From contact Where phone1 = ? And url = ?;";
    	SqlRowSet result = jdbcTemplate.queryForRowSet(sql, newContact.getPhone1(), newContact.getWebsite());
    	
    	if (result.next()) {
    		newContact.setContactId(result.getLong("contact_id"));
    	}
    	newBusiness.setContact(newContact);
    }
    
    private void getTypeId(Business newBusiness, BusinessType newType) {
    	
    }
    
	private List<Business> mapRowSetToBusinessList(SqlRowSet result) {
		List<Business> list = new ArrayList<Business>();
		
		while(result.next()) {
			list.add(mapRowSetToBusiness(result));
		}
		return list;
	}
	
	private Business mapRowSetToBusiness(SqlRowSet result) {
		Business b = new Business();
		
		b.setAddress(mapRowSetToAddress(result));
		b.setType(mapRowSetToBusinessType(result));
		b.setContact(mapRowSetToContactInfo(result));
		b.setBusinessName(result.getString("name"));
		b.setImageName(result.getString("image"));
		b.setSlogan(result.getString("slogan"));
		b.setRating(result.getDouble("rating"));
		
		return b;
	}
	
	private ContactInfo mapRowSetToContactInfo(SqlRowSet result) {
		ContactInfo ci = new ContactInfo();
		
		ci.setContactId(result.getLong("contact_id"));
		ci.setPhone1(result.getString("phone1"));
		ci.setLabel1(result.getString("label1"));
		ci.setPhone2(result.getString("phone2"));
		ci.setLabel2(result.getString("label2"));
		
		return ci;
	}
	
	private BusinessType mapRowSetToBusinessType(SqlRowSet result) {
		BusinessType bt = new BusinessType();
		
		bt.setGeneralType(result.getString("general_type"));
		bt.setSpecificType(result.getString("specific_type"));
		bt.setTypeId(result.getLong("type_id"));
		
		return bt;
	}
	
	private Address mapRowSetToAddress(SqlRowSet result) {
		Address a = new Address();
		a.setAddressId(result.getLong("address_id"));
		a.setStreet1(result.getString("street1"));
		a.setStreet2(result.getString("street2"));
		a.setStreet3(result.getString("street3"));	
		a.setState(result.getString("state"));
		a.setZipCode(result.getInt("zip_code"));
		
		return a;
	}

}
