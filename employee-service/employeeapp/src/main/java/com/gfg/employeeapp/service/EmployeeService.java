package com.gfg.employeeapp.service;

import com.gfg.employeeapp.entity.Employee;
import com.gfg.employeeapp.repository.EmployeeRepo;
import com.gfg.employeeapp.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;
    @Autowired
    private ModelMapper mapper;
    public EmployeeResponse getEmployeeById(int id){
        Optional<Employee> employee = employeeRepo.findById(id);
        EmployeeResponse employeeResponse = mapper.map(employee,EmployeeResponse.class);
        return employeeResponse;
    }
}
