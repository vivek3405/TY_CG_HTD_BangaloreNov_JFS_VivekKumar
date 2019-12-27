package com.capgemini.empspringboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.empspringboot.dto.EmployeeBean;

public interface EmployeeRepositry extends JpaRepository<EmployeeBean, Integer> {
	
	public EmployeeBean findByEmail(String email);
	
	@Query("from EmployeeBean where name=:key or email=:key")
	public List<EmployeeBean> findByKey(@Param("key")String key);
	
	@Transactional
	@Modifying //because we are modifying in the database
	@Query("update EmployeeBean set password =:password where id=:id")
	public void changePassword(@Param("id")int id, @Param("password") String password);

}
