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
public class Gerente extends Trabajador implements Directivo{

    public Gerente(String nombre, String apellido, String dni, double sueldoAnual) {
        super(nombre, apellido, dni, sueldoAnual);
    }

    @Override
    public void calcularSalario() {
   
    }

    @Override
    public void mandarMensaje(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int emitirVoto(int v) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
