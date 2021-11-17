package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Employee;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public interface EmployeeDao extends CrudRepository<Employee,Integer> {

    @Query
    List<Employee> LastName(@Param("lastname")String lastName);
}
