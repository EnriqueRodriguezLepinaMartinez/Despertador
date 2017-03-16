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
public class Alarma extends Display{
    boolean alarm;
    int horaAlar;
    int minutoAlar;

    
    //CONSTRUCTORES
    public Alarma() {
    }

    public Alarma(boolean alarm, int horaAlar, int minutoAlar) {
        this.alarm = alarm;
        this.horaAlar = horaAlar;
        this.minutoAlar = minutoAlar;
    }

    
    //VER MODIFICAR ALARMA
    public boolean isAlarm() {
        return alarm;
    }

    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }

    public int getHoraAlar() {
        return horaAlar;
    }

    public void setHoraAlar(int horaAlar) {
        this.horaAlar = horaAlar;
    }

    public int getMinutoAlar() {
        return minutoAlar;
    }

    public void setMinutoAlar(int minutoAlar) {
        this.minutoAlar = minutoAlar;
    }
    
    
    //METODO PARA QUE CUANDO LA ALARMA SEA LA MISMA QUE LA HORA, DEVUELVA TRUE.
    public boolean suena(){
        if(hora==horaAlar & minutos==minutoAlar){
            return alarm = true;
        }
        return alarm = false;
    }
}
