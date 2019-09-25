/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_trabajadores;

/**
 *
 * @author Usuario DAM 2
 */
public class Autonomo extends Trabajador {

    public Autonomo(String nombre, String apellido, String dni, double sueldoAnual) {
        super(nombre, apellido, dni, sueldoAnual);
    }

    @Override
    public void calcularSalario() {
        sueldoAnual = sueldoAnual / 12;
    }
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
    }
}