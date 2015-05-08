package com.example.dao;

import com.example.model.UserBean;
import com.example.util.DbUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;

public class UserDao extends HttpServlet{
    
    public static void addUser(UserBean user){
        DbUtil db = new DbUtil();
        
//        String username = request.getParameter("username");
//        String password = request.getParameter("password");
        
        try{
            PreparedStatement stmt = db.getConnection().prepareStatement("INSERT INTO users (username, password) VALUES (?,?);");
            stmt.setString(1, "username");
            stmt.setString(2, "password");            
            stmt.executeUpdate();
            
            stmt.close();
            db.disconnect();
        }catch(SQLException ex){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static List<UserBean> getAllUsers(){
        List<UserBean> users = new ArrayList();
        DbUtil db = new DbUtil();
        try{
            Statement stmt = db.getConnection().createStatement();
            ResultSet rs = stmt.executeQuery("select * from users");
            while(rs.next()){
                UserBean user = new UserBean();
                user.setUserid(rs.getInt("userid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                users.add(user);
            }
            rs.close();
            stmt.close();
            db.disconnect();
        }catch(SQLException ex){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    
    public static UserBean getUserById(int userId){
        UserBean user = new UserBean();
        DbUtil db = new DbUtil();
        try{
            PreparedStatement stmt = db.getConnection().prepareStatement("select from users where userid=?");
            stmt.setInt(1, userId);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                user.setUserid(rs.getInt("userid"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            rs.close();
            stmt.close();
            db.disconnect();
        }catch(SQLException ex){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
    public static void deleteUser(int userId){
        DbUtil db = new DbUtil();
        
        try{            
            PreparedStatement stmt = db.getConnection().prepareStatement("DELETE FROM users WHERE userid=?");
            stmt.setInt(1, userId);
            stmt.executeUpdate();
            stmt.close();
            db.disconnect();
        }catch(SQLException ex){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void updateUser(int userId){
        DbUtil db = new DbUtil();
        
        try{            
            PreparedStatement stmt = db.getConnection().prepareStatement("DELETE FROM users WHERE userid=?");
            stmt.setInt(1, userId);
            stmt.executeUpdate();
            stmt.close();
            db.disconnect();
        }catch(SQLException ex){
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static boolean isValid(UserBean user){
        boolean result = false;
        DbUtil db = new DbUtil();
        Connection connection = db.getConnection();
        
        try{
            PreparedStatement stmt = connection.prepareStatement("select * from users where username=? and password=?");
            stmt.setString(1,user.getUsername());
            stmt.setString(2,user.getPassword());
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                result = true;
            }
            rs.close();
            stmt.close();
            db.disconnect();
        }catch(SQLException e){
            System.out.println("CONNECTION PROBLEM.");
            e.printStackTrace();
        }
        return result;
    }
    public static void main(String[] args){
        UserBean user = new UserBean();
        user.setPassword("gibz");
        user.setUsername("gibz");
        
        System.out.println(UserDao.isValid(user));
    }
}
