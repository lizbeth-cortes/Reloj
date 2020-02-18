/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import ico.fes.poo.Reloj;

/**
 *
 * @author LABCOM2
 */
public class Sesion3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Reloj wacho=new Reloj(23,59,59);/*no toma en cuenta el valor de las horas, pero sí toma el valor de los minutos y segundos*/
        wacho.setHora(24);/*sí toma en cuenta el valor de las horas*/
        wacho.setMinuto(13);/*no toma en cuenta el valor de las minutos*/
        wacho.setSegundo(14);/*no toma en cuenta el valor de los segundos*/
        wacho.mostrarHora();
        /*intenté arreglarlo, sin embargo no pude*/
    }
    
}
