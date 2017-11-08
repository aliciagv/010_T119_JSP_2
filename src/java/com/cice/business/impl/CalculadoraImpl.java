/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.business.impl;

import com.cice.business.ICalculadora;

/**
 *
 * @author cice
 */
public class CalculadoraImpl implements ICalculadora {
    
    // revisar el patrón singleton para devolver CalculadoraImpl 
    
    @Override
    public double suma(double num1, double num2) {
        double resultado;
        resultado = num1 + num2;
        return resultado;
    }
    

    @Override
    public double resta(double num1, double num2) {
        double resultado;
        resultado = num1 - num2;
        return resultado;
    }

    @Override
    public double multiplicacion(double num1, double num2) {
        double resultado;
        resultado = num1 * num2;
        return resultado;
    }

    @Override
    public double division(double num1, double num2) {
        double resultado;
        resultado = num1 / num2;
        return resultado;
    }

}
