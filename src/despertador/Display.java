/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package despertador;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Display extends Despertador{
    int hora =13;
    int minutos=52;
    //CONSTRUCTORES POR DEFECTO.
    public Display() {
    }

    public Display(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }
    //PARA VER Y MODIFICAR LA HORA.
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    // NOS MUESTRA LA HORA.
    @Override
    public String toString() {
        return "Display{" + "hora=" + hora + ", minutos=" + minutos + '}';
    }
    
    //VARIABLE DE LIMITE DE MINUTOS
    public int cambiarMinutos(){
        if(minutos>59){
            hora+=1;
            minutos=0;
        }
        return minutos;
    }
    
     //VARIABLE DE LIMITE DE HORAS
    public int cambiarHora(){
        if(hora>24){
            hora=1;
        }
        return hora;
    }
    
}
