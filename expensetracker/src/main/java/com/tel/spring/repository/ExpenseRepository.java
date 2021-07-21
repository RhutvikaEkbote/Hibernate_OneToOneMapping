package com.tel.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tel.spring.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}
