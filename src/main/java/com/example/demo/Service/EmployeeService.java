/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotatedElementUtils;
import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.Exception.EmployeeException;
import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.dto.Employee;

/**
 *
 * @author Admin
 */
public class EmployeeService {
    @Autowired
    private EmployeeRepository repo;
    
    public String login(Employee emp) throws EmployeeException{
        List<EmployeeEntity> empEntitys = repo.findAll();
        try{
        for(EmployeeEntity empEntity:empEntitys){
            if(empEntity.getUsername()==emp.getUsername() &&
                empEntity.getPassword() == emp.getPassword()){
                System.out.println( "home page opened");
            }
        }
        return "home page opened";
        }
        catch(Exception e){
            throw new EmployeeException();
        }
    }
}
