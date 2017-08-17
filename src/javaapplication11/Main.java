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
public class Main {
    public static void main(String[] args) {
        Cuenta magdalena=new Cuenta();
        magdalena.numero=1012;
        magdalena.clave=1234;
        magdalena.saldo=0;
        magdalena.usuario="magdalena sanchez";
        
        magdalena.consignar(100000);
        magdalena.versaldo();
    }
}
