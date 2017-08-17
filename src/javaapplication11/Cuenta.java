/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author Estudiante
 */
public class Cuenta {
public String usuario;
    public int numero;
    public int clave;
    public double saldo;
    
    public boolean consignar(double monto){
        if(monto>0){
            this.saldo+=monto;
            return true;
        }else{
        return false;
        }
    }
 
    public boolean retirar(double monto){
        if(monto>0&& monto<this.saldo){
            this.saldo-=monto;
            return true;
        }else{
        return false;
        }
    }
    public boolean cambiarClave(int claveActual,int nuevaClave){
        if(claveActual==this.clave){
            this.clave=nuevaClave;
            return true;
        }else{
        return false;
        }
    }    
    public void versaldo(){
       System.out.println(this.saldo);
    }    
}
