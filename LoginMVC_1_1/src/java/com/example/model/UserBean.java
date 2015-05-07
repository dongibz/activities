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

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
    private String password = "gibz";

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
    
    public boolean isUserValid(String username, String password){
        if(username.equals(this.username)&&password.equals(this.password)){
            return true;
        }else{
            return false;
        }
    }
}
