package com.scarebay111.dao;

import java.util.List;

import com.scarebay111.dao.GenericDAO;
import com.scarebay111.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


