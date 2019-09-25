/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_trabajadores;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario DAM 2
 */
public class Gestion_trabajadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empresa empresa = new Empresa();
        Trabajador asalariado = new Asalariado("Adrian", "Olmo", "1247", 100, 2);
        Trabajador autonomo = new Autonomo("Ivan", "Redondo", "1234", 1);
        empresa.registroEmpleado(asalariado);
        empresa.registroEmpleado(autonomo);
        
        Socio socio = new Socio("sjkdgh", "hgsdkjd", "12461A");
        Directivo director = new Director("sdgaasd", "ashguiasd", "jhdsg");
        
        director.emitirVoto(5);
        //empresa.registroEmpleado(director.emitirVoto());
        //List lista = new ArrayList();
        //List listaentera = new List(){
            
        //}
    }
    
}
