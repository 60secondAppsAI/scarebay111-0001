package com.scarebay111.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.scarebay111.domain.Order;
import com.scarebay111.dto.OrderDTO;
import com.scarebay111.dto.OrderSearchDTO;
import com.scarebay111.dto.OrderPageDTO;
import com.scarebay111.dto.OrderConvertCriteriaDTO;
import com.scarebay111.service.GenericService;
import com.scarebay111.dto.common.RequestDTO;
import com.scarebay111.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface OrderService extends GenericService<Order, Integer> {

	List<Order> findAll();

	ResultDTO addOrder(OrderDTO orderDTO, RequestDTO requestDTO);

	ResultDTO updateOrder(OrderDTO orderDTO, RequestDTO requestDTO);

    Page<Order> getAllOrders(Pageable pageable);

    Page<Order> getAllOrders(Specification<Order> spec, Pageable pageable);

	ResponseEntity<OrderPageDTO> getOrders(OrderSearchDTO orderSearchDTO);
	
	List<OrderDTO> convertOrdersToOrderDTOs(List<Order> orders, OrderConvertCriteriaDTO convertCriteria);

	OrderDTO getOrderDTOById(Integer orderId);







}





