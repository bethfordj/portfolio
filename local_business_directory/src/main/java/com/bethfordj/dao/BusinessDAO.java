package com.bethfordj.dao;

import java.util.List;

import com.bethfordj.dao.model.Business;
import com.bethfordj.dao.model.BusinessFilter;
import com.bethfordj.dao.model.BusinessSortOrder;

public interface BusinessDAO {
	
	List<Business> getAll();
	List<Business> getAll(BusinessFilter filter, BusinessSortOrder sortOrder);
}
