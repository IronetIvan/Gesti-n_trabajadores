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
public interface Directivo {
    //variables sin CONSTANTES
    //metodos solon tienen la firma
    default void presentacion(){
        System.out.println("PRESENTACION DEL DIRECTIVO");
    }
    public void mandarMensaje(String s);
    public int emitirVoto(int v);
}
