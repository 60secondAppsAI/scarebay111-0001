package com.scarebay111.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.scarebay111.dao.GenericDAO;
import com.scarebay111.service.GenericService;

import jakarta.transaction.Transactional;


@Service
@Transactional
public abstract class GenericServiceImpl<T, ID> implements GenericService<T, ID> {

	private GenericDAO<T,ID> genericDAO;

	public T getById(Integer id) {
        genericDAO = getDAO();
        
    	Optional <T> optionalT = genericDAO.findById((ID) id);
    	T t = null;
    	if(optionalT.isPresent())
    		t = optionalT.get();
        return t;
    }
    

	
}