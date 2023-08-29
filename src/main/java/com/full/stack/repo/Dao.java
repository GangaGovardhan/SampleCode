package com.full.stack.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.full.stack.model.EmpData;

public interface Dao extends JpaRepository<EmpData, Integer> {

}
