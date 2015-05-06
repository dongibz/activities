/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author asi
 */
public class ProcessAdminServlet extends HttpServlet{
    
    public void init() throws ServletException{
        
    }
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        String type = request.getParameter("type");
        String name = request.getParameter("name");
        String course = request.getParameter("course");
        String languages[] = request.getParameterValues("language");
        String champion = request.getParameter("champ");
        out.println("<h1>Hello "+type+" "+name+"!!!</h1>");
        out.println("<h2>Are you sure you will graduate "+course+"?");
        out.println("<h3>You should learn</h3>");      
        for(String langs : languages){
            out.print(langs+"<br>");
        }
        if(champion.equals("Pacman")){            
            out.println("<h3>Your champ is "+champion+"!</h3>");
        }else{
            out.println("<h3>"+champion+" cheated the Fight!</h3>");
        }
            
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doGet(request, response);
    }
    
    public void destroy(){
        
    }    
    
}
