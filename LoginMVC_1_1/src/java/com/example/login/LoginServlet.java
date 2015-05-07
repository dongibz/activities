/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.login;

import com.example.dao.UserDao;
import com.example.model.UserBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author asi
 */
public class LoginServlet extends HttpServlet{
    
    @Override
    public void init() throws ServletException{
        
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        UserBean userBean = new UserBean();
        UserDao userDao = new UserDao();
        
        userBean.setUsername(username);
        userBean.setPassword(password);
        
        boolean isUserValid = userDao.isValid(userBean);
        
        HttpSession session = request.getSession();
        session.setAttribute("username", username);
        
        if(isUserValid){
            RequestDispatcher view = request.getRequestDispatcher("home.jsp");
            view.forward(request, response);
        }else{
            RequestDispatcher view = request.getRequestDispatcher("index.html");
            view.forward(request, response);
        }
            
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
    
    @Override
    public void destroy(){
        
    }    
}
