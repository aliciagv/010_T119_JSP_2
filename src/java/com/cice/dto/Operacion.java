/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

/**
 *
 * @author cice
 */
public class Operacion {
    
    private double num;
    private double num2;
    private String operacion;

    public Operacion() {
    }

    public Operacion(double num, double num2, String operacion) {
        this.num = num;
        this.num2 = num2;
        this.operacion = operacion;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    
    
    
}
