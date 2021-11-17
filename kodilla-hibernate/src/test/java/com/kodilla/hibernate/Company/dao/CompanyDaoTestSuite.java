package com.kodilla.hibernate.Company.dao;

import com.kodilla.hibernate.invoice.Company;
import com.kodilla.hibernate.invoice.Employee;
import com.kodilla.hibernate.invoice.dao.CompanyDao;
import com.kodilla.hibernate.invoice.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
 class CompanyDaoTestSuite {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Test
    void CompanyTest(){

        Company company = new Company("asad");
        Employee employee = new Employee("Jan","Nowotka");

        employee.setCompany(company);

        employeeDao.save(employee);

        int company_Id = company.getId();
        int employee_Id = employee.getId();



        List<Company> Liters = companyDao.SerchCompany("asa");
        List<Employee> List = employeeDao.LastName("Nowotka");



        assertNotEquals(0,company_Id);
        assertNotEquals(0,employee_Id);

        employeeDao.deleteAll();
    }

}
