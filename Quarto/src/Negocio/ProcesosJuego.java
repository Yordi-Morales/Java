/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import Datos.BDJuego;
import Objetos.ObjJugador;
import Objetos.ObjNumpartido;

import static Objetos.ObjNumpartido.numpartido2;
import Objetos.ObjPartidareal;
import java.util.ArrayList;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class ProcesosJuego {

    BDJuego data = new BDJuego();

    String Forma1 = "Circulo";
    String Forma2 = "Cuadrado";
    String Tamano1 = "Grande";
    String Tamano2 = "Chiquito";
    String Color1 = "Azul";
    String Color2 = "Rosa";
    String Huecado1 = "Hueco";
    String Huecado2 = "Completo";

    public String posicion(int posicion) {
        String Jugador = null;
        ArrayList<ObjJugador> jug = ObjJugador.listaUsuarios;
        for (int i = 0; i < jug.size(); i++) {
            if (posicion == 0) {
                Jugador = jug.get(0).getNombre1();
            } else {
                Jugador = jug.get(0).getNombre2();
            }
        }
        return Jugador;
    }

    public String posicionfila(int index) {
        String posicion = "";
        if (index == 0) {
            posicion = "Fila 1";
        } else if (index == 4) {
            posicion = "Fila 2";
        } else if (index == 8) {
            posicion = "Fila 3";
        } else if (index == 12) {
            posicion = "Fila 4";
        }

        return posicion;
    }

    public String resultado(JButton[] verificargane) {

        String uno = verificargane[0].getIcon().toString();
        String dos = verificargane[1].getIcon().toString();
        String tres = verificargane[2].getIcon().toString();
        String cuatro = verificargane[3].getIcon().toString();

        String resul = "";
        boolean resultadocirculos = uno.contains(Forma1);
        if (uno.contains(Forma1) && dos.contains(Forma1) && tres.contains(Forma1) && cuatro.contains(Forma1)) {
            resul = "Redondas";
            return resul;
        } else if (uno.contains(Forma2) && dos.contains(Forma2) && tres.contains(Forma2) && cuatro.contains(Forma2)) {
            resul = "Cuadradas";
            return resul;
        } else if (uno.contains(Tamano1) && dos.contains(Tamano1) && tres.contains(Tamano1) && cuatro.contains(Tamano1)) {
            resul = "Grandes";
            return resul;
        } else if (uno.contains(Tamano2) && dos.contains(Tamano2) && tres.contains(Tamano2) && cuatro.contains(Tamano2)) {
            resul = "Pequeñas";
            return resul;
        } else if (uno.contains(Color1) && dos.contains(Color1) && tres.contains(Color1) && cuatro.contains(Color1)) {
            resul = "Azules";
            return resul;
        } else if (uno.contains(Color2) && dos.contains(Color2) && tres.contains(Color2) && cuatro.contains(Color2)) {
            resul = "Rosadas";
            return resul;
        } else if (uno.contains(Huecado1) && dos.contains(Huecado1) && tres.contains(Huecado1) && cuatro.contains(Huecado1)) {
            resul = "Huecas";
            return resul;
        } else if (uno.contains(Huecado2) && dos.contains(Huecado2) && tres.contains(Huecado2) && cuatro.contains(Huecado2)) {
            resul = "Completas";
            return resul;
        } else {
            resul = "FALSO";
            return resul;
        }
        /*if(resultadocirculos){
            
        }*/

    }

    public boolean test1(String[] verificargane) {
        System.out.println("procesos2:" + verificargane[0]);
        return false;
    }

    public ArrayList<ObjPartidareal> LeerUsuarios() {
        ArrayList<ObjPartidareal> listaUsuarios = data.LeerArchivo();
        return listaUsuarios;
    }
    //numero partido
    public ArrayList<ObjNumpartido> LeerUsuarios2() {
        ArrayList<ObjNumpartido> numpartido2= data.LeerArchivo2();
        return numpartido2;
    }

    public void InsertarUsuariocompra(ArrayList<ObjPartidareal> Partida) {
        String datos = "";
        for (int i = 0; i <= Partida.size() - 1; i++) {
            
            String numpartida=Partida.get(i).getNumpartida();
            String nombre11=Partida.get(i).getNombre11();
            String nombre22=Partida.get(i).getNombre22();
            String puntos11=Partida.get(i).getPuntos11();
            String puntos22=Partida.get(i).getPuntos22();
            String numfichas=Partida.get(i).getNumfichas();
            String tiempojuego=Partida.get(i).getTiempojuego();;

            datos = numpartida + "," + nombre11 + "," + nombre22 + "," + puntos11+ "," + puntos22+ "," + numfichas+ "," + tiempojuego;
        }

        data.IngresarEnArchivo(datos);
        
    }
      public void InsertarNumero(ArrayList<ObjNumpartido> numpartido) {
        String datos = "";
        for (int i = 0; i <= numpartido.size() - 1; i++) {
            
            String numpartida=numpartido.get(i).getNumpartido();
            

            datos = numpartida;
        }

        data.IngresarEnArchivo2(datos);
        
    }

}
