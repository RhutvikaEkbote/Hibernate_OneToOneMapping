package com.tel.spring.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tel.spring.model.Expense;
import com.tel.spring.repository.ExpenseRepository;


@Service
public class ExpenseServiceImpl implements ExpenseService{

	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
		// TODO Auto-generated method stub
		return expenseRepository.findAll();
	}

	
	
}
