/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class ObjPartidareal {
    
    String numpartida;
    String nombre11;
    String nombre22;
    String puntos11;
    String puntos22;
    String numfichas;
    String tiempojuego;
    
    public ObjPartidareal(String numpartida, String nombre11, String nombre22, String puntos11, String puntos22, String numfichas, String tiempojuego) {
        this.numpartida = numpartida;
        this.nombre11 = nombre11;
        this.nombre22 = nombre22;
        this.puntos11 = puntos11;
        this.puntos22 = puntos22;
        this.numfichas = numfichas;
        this.tiempojuego = tiempojuego;
    }
    
    public static ArrayList Partida=new ArrayList<>();

    public String getNumpartida() {
        return numpartida;
    }

    public void setNumpartida(String numpartida) {
        this.numpartida = numpartida;
    }

    public String getNombre11() {
        return nombre11;
    }

    public void setNombre11(String nombre11) {
        this.nombre11 = nombre11;
    }

    public String getNombre22() {
        return nombre22;
    }

    public void setNombre22(String nombre22) {
        this.nombre22 = nombre22;
    }

    public String getPuntos11() {
        return puntos11;
    }

    public void setPuntos11(String puntos11) {
        this.puntos11 = puntos11;
    }

    public String getPuntos22() {
        return puntos22;
    }

    public void setPuntos22(String puntos22) {
        this.puntos22 = puntos22;
    }

    public String getNumfichas() {
        return numfichas;
    }

    public void setNumfichas(String numfichas) {
        this.numfichas = numfichas;
    }

    public String getTiempojuego() {
        return tiempojuego;
    }

    public void setTiempojuego(String tiempojuego) {
        this.tiempojuego = tiempojuego;
    }

    public static ArrayList getPartida() {
        return Partida;
    }

    public static void setPartida(ArrayList Partida) {
        ObjPartidareal.Partida = Partida;
    }

    
       
    
    
}
