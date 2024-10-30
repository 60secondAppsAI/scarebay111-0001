package com.scarebay111.dao;

import java.util.List;

import com.scarebay111.dao.GenericDAO;
import com.scarebay111.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


