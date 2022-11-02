package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.shop.entity.Customer;
import com.shop.entity.Notice;

public interface CustomerRepository  extends JpaRepository<Customer, Long>,
	QuerydslPredicateExecutor<Customer>{

}
