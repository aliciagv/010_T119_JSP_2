/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.business;

import com.cice.business.impl.CalculadoraImpl;
import com.cice.dto.Operacion;

/**
 *
 * @author cice
 */
public class Calculos {
    
    private Operacion operacion;
    private static  ICalculadora calculadora;

    
    static {
        calculadora = new CalculadoraImpl();
    }
    
    public Calculos() {
    }

    
    public Calculos(Operacion operacion) {
        this.operacion = operacion;
    }

    public Operacion getOperacion() {
        return operacion;
    }

    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }
    
   
    
    public double calcular(){
        double resultado=0;
        switch (operacion.getOperacion()) {
            case "sumar":
                resultado= calculadora.suma(operacion.getNum(), operacion.getNum2());
                break;
            case "restar":
                resultado=calculadora.resta(operacion.getNum(), operacion.getNum2());
                break;
            case "multiplicar":
                resultado= calculadora.multiplicacion(operacion.getNum(), operacion.getNum2());
                break;
            case "dividir":
                resultado= calculadora.division(operacion.getNum(), operacion.getNum2());
            default:
                
                throw new AssertionError();
        }
        return resultado;
    
    }
    
    
}
