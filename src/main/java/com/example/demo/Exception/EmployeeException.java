/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Exception;

/**
 *
 * @author Admin
 */
public class EmployeeException extends RuntimeException {
    
    public EmployeeException(){
        super("Invalid username or password");
    }
}
