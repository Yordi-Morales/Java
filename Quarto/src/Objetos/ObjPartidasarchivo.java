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
public class ObjPartidasarchivo {
    String nombrex1;
    String nombrex2;
    String cantidadpartidas;
    String partidasganas1;
    String partidasganas2;
    String partidasempatadas;
    String puntos1;
    String puntos2;
    
    public static ArrayList listaPartidas=new ArrayList<>();

    public String getNombrex1() {
        return nombrex1;
    }

    public void setNombrex1(String nombrex1) {
        this.nombrex1 = nombrex1;
    }

    public String getNombrex2() {
        return nombrex2;
    }

    public void setNombrex2(String nombrex2) {
        this.nombrex2 = nombrex2;
    }

    public String getCantidadpartidas() {
        return cantidadpartidas;
    }

    public void setCantidadpartidas(String cantidadpartidas) {
        this.cantidadpartidas = cantidadpartidas;
    }

    public String getPartidasganas1() {
        return partidasganas1;
    }

    public void setPartidasganas1(String partidasganas1) {
        this.partidasganas1 = partidasganas1;
    }

    public String getPartidasganas2() {
        return partidasganas2;
    }

    public void setPartidasganas2(String partidasganas2) {
        this.partidasganas2 = partidasganas2;
    }

    public String getPartidasempatadas() {
        return partidasempatadas;
    }

    public void setPartidasempatadas(String partidasempatadas) {
        this.partidasempatadas = partidasempatadas;
    }

    public String getPuntos1() {
        return puntos1;
    }

    public void setPuntos1(String puntos1) {
        this.puntos1 = puntos1;
    }

    public String getPuntos2() {
        return puntos2;
    }

    public void setPuntos2(String puntos2) {
        this.puntos2 = puntos2;
    }

    public static ArrayList getListaPartidas() {
        return listaPartidas;
    }

    public static void setListaPartidas(ArrayList listaPartidas) {
        ObjPartidasarchivo.listaPartidas = listaPartidas;
    }

    public ObjPartidasarchivo(String nombrex1, String nombrex2, String cantidadpartidas, String partidasganas1, String partidasganas2, String partidasempatadas, String puntos1, String puntos2) {
        this.nombrex1 = nombrex1;
        this.nombrex2 = nombrex2;
        this.cantidadpartidas = cantidadpartidas;
        this.partidasganas1 = partidasganas1;
        this.partidasganas2 = partidasganas2;
        this.partidasempatadas = partidasempatadas;
        this.puntos1 = puntos1;
        this.puntos2 = puntos2;
    }
    
    
    
    
    
    
}
