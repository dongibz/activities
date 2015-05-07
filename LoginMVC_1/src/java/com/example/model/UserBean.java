/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;

/**
 *
 * @author asi
 */
public class UserBean {
    private String username = "gibz";
    private String password = "gibz";
    
    public boolean isUserValid(String username, String password){
        if(username.equals(this.username)&&password.equals(this.password)){
            return true;
        }else{
            return false;
        }
    }
}
