/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.servlet;

import com.cice.business.Calculos;
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
        
        //compruebo que los número son números
        Operacion op= new Operacion(Double.parseDouble(num1),Double.parseDouble(num2),operacion);
        Calculos c = new Calculos(op);
        
        double resultado= c.calcular();
        
        System.out.println("Resultado: " + resultado);      
        
        
        
        
        
        
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    

  
}
