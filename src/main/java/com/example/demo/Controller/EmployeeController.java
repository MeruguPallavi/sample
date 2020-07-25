/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.Service.EmployeeService;
import com.example.demo.dto.Employee;

@Controller
public class EmployeeController {
    @Autowired 
    private EmployeeService empServ;
    @RequestMapping (value = "login")
public String login(Employee emp){
    
    String message = empServ.login(emp);
    
    return message;
    
}
        
            
}

                
