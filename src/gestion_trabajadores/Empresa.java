/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_trabajadores;

import java.util.ArrayList;

/**
 *
 * @author Usuario DAM 2
 */
public class Empresa {
    int votos;
    ArrayList<Trabajador> ListaTrabajadores;

    public Empresa() {
        this.ListaTrabajadores = new ArrayList();
    }

    public void registroEmpleado(Trabajador trabajador) {
        if (!existeTrabajador(trabajador.getDni())){
           ListaTrabajadores.add(trabajador); 
        }else{
            System.out.println("El trabajador ya existe! \n");
        }
    }

    public void listarTrabajadores(){
        for(Trabajador item : ListaTrabajadores){
            item.mostrarDatos();
        }
    }
    public boolean existeTrabajador(String dni) {
        for (Trabajador item : ListaTrabajadores) {
            if (item.getDni().equals(dni)) {
                return true;
            }
        }
        return false;
    }
    public void registrarVotos(){
    this.votos += votos;
}
}
