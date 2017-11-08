/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.servlet;

import com.cice.dto.Operacion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author cice
 */
public class CalculadoraServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String num1 =req.getParameter("numero1");
        String num2 =req.getParameter("numero2");
        String operacion =req.getParameter("operacion");
        
        //compruebo que los núemro son números
        try {
        double inum1 = Integer.parseInt(num1);
        double inum2= Integer.parseInt(num2);
      //  Operacion operacion= new Operacion(inum1,inum2,operacion);
        } catch (NumberFormatException ex) {
            resp.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
        }
        
        
        
        
        
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    

  
}
