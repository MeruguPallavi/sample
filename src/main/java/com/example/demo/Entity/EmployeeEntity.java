/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;

import lombok.Setter;
/**
 *
 * @author Admin
 */
@Getter
@Setter
@Entity
public class EmployeeEntity {
    @Id
    @GeneratedValue
    private long id;
    
    @Column
    private String username;
    private String password;
    
    
    
}
