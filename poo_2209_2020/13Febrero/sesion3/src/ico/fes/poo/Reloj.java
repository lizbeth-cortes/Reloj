/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.poo;

/**
 *
 * @author LABCOM2
 */
    public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {       
        
        while(true){
            if (hora<24){
                this.hora = hora;
                setSegundo(segundo);
                setMinuto(minuto);
            }
            if (hora==24) {
                hora=00; 
                this.hora = hora;  
                
    }  
        }
        
            }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        while(true){
            minuto++;
            if (minuto<60){
                this.minuto = minuto;
                setSegundo(segundo);
            }       
            if (minuto==60) {
                minuto=00;
                hora++;
                this.minuto = minuto; 
                setHora(hora);
    }
        }
            }
    
    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {  
        
        while(true){
            System.out.println(hora + ":" + minuto + ":" + segundo);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt();
                    }
            segundo++;
            if (segundo<60){
                this.segundo = segundo;
            }       
            if (segundo==60) {
                segundo=00;
                this.segundo = segundo;          
                setMinuto(minuto);
    }
        }
            }
        
    public void mostrarHora(){
        {
        System.out.println(this.hora + ":"+this.minuto + ":"+this.segundo);
    }
  }
}
