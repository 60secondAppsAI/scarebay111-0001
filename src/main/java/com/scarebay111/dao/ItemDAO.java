package com.scarebay111.dao;

import java.util.List;

import com.scarebay111.dao.GenericDAO;
import com.scarebay111.domain.Item;





public interface ItemDAO extends GenericDAO<Item, Integer> {
  
	List<Item> findAll();
	






}


