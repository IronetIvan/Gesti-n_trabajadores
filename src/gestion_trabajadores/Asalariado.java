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
public class Asalariado extends Trabajador {

    private int pagas;

    public Asalariado(String nombre, String apellido, String dni, double sueldoAnual, int pagas) {
        super(nombre, apellido, dni, sueldoAnual);
        this.pagas = pagas;
        //calcularSalario();
    }

    @Override
    public void calcularSalario() {
        sueldoMes = this.sueldoAnual / this.pagas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.printf("Pagas %d \n", pagas);
    }
}
