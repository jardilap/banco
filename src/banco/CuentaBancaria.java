/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author ESTUDIANTE
 */
public class CuentaBancaria {
    public String dueno;
    public int clave;
    public int numero;
    public int nuevaClave;
    public float saldo;
    public float retiro;
    public float consignar;
    
    public CuentaBancaria(String nombre){
        this.dueno = nombre;
    }
    
    public void cambiarClave(){
        this.clave = this.nuevaClave;
    }
    public void withdraw(){
        this.saldo -= this.retiro;
    }
    public void check(){
        System.out.println("Su saldo es de " + this.saldo);
    }
    public void consignar(){
        this.saldo += this.consignar;
    }
    
}
