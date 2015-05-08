package com.example.model;

public class UserBean {
    private int userid;
    private String username = "gibz";    
    private String password = "gibz";    
    
    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

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
