package com.scarebay111.dao;

import java.util.List;

import com.scarebay111.dao.GenericDAO;
import com.scarebay111.domain.User;

import java.util.Optional;




public interface UserDAO extends GenericDAO<User, Integer> {
  
	List<User> findAll();
	






}


