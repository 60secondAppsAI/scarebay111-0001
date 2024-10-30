package com.scarebay111.dao;

import java.util.List;

import com.scarebay111.dao.GenericDAO;
import com.scarebay111.domain.Bid;





public interface BidDAO extends GenericDAO<Bid, Integer> {
  
	List<Bid> findAll();
	






}


