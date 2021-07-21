package com.tel.spring.service;

import java.util.List;

import com.tel.spring.model.Expense;

public interface ExpenseService {

	List<Expense> findAll();
	
}
