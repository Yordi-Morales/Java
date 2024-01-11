/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

import java.util.ArrayList;

/**
 *
 * @author julia
 */
public class ObjJugador {
    
    String nombre1;
    String nombre2;
    
    
    public static ArrayList listaUsuarios=new ArrayList<>();

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public static ArrayList getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList listaUsuarios) {
        ObjJugador.listaUsuarios = listaUsuarios;
    }

    public ObjJugador(String nombre1, String nombre2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }


    
    
}
