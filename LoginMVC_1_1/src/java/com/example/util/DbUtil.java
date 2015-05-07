/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author asi
 */
public class DbUtil {
    private Connection connection = null;
    
    public Connection getConnection(){
        if(connection!=null){
            return connection;
        }else{
            try{
                Properties prop = new Properties();
                InputStream inputStream = DbUtil.class.getClassLoader().getResourceAsStream("com/example/util/db.properties");
                prop.load(inputStream);
                
                String driver = prop.getProperty("driver");
                String url = prop.getProperty("url");
                String user = prop.getProperty("user");
                String pass = prop.getProperty("password");
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, pass);
                
                
//                String driver = "com.mysql.jdbc.Driver";
//                String url="jdbc:mysql://192.168.1.62:3306/Users";
//                Class.forName(driver);
//                connection = DriverManager.getConnection(url,"root","");
            }catch(ClassNotFoundException e){
                System.out.println("CLASS NOT FOUND");
                e.printStackTrace();
            }catch(SQLException e){
                System.out.println("1 SQL EXCEPTION");
                e.printStackTrace();
            }catch(FileNotFoundException e){
                System.out.println("2 SQL EXCEPTION");
                e.printStackTrace();
            }catch(IOException e){
                System.out.println("3 SQL EXCEPTION");
                e.printStackTrace();
            }catch(Exception e){
                System.out.println("4 SQL EXCEPTION");
                e.printStackTrace();
            }
            return connection;
        }
    }
    public boolean disconnect(){
        try{
            connection.close();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
}
