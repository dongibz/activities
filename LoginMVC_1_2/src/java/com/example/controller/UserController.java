package com.example.controller;

import com.example.dao.UserDao;
import com.example.model.UserBean;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class UserController extends HttpServlet{
    
    private static final String addOrEdit = "/user.jsp";
    private static final String home = "/home.jsp";
    
    @Override
    public void init() throws ServletException{
        
    }
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String forward ="";
        String action = request.getParameter("action");
        
        if(action.equals("edit")){
            int userid = Integer.parseInt(request.getParameter("userid"));
            UserBean user = UserDao.getUserById(userid);
            request.setAttribute("user", user);
            forward = addOrEdit;
        }else if(action.equals("add")){
            forward = addOrEdit;
        }else if(action.equals("delete")){
            int userid = Integer.parseInt(request.getParameter("userid"));
            UserDao.deleteUser(userid);
            forward = home;
            HttpSession session = request.getSession();
            session.setAttribute("users",UserDao.getAllUsers());
        }
        RequestDispatcher rd = request.getRequestDispatcher(forward);
        rd.forward(request,response);
            
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
    
    @Override
    public void destroy(){
        
    }   
}
