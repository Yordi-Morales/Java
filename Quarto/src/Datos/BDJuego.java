/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Objetos.ObjNumpartido;
import Objetos.ObjPartidareal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class BDJuego {
    
    
     public ArrayList<ObjPartidareal> LeerArchivo() {
        try {
            File archivo2 = new File("Partidas.txt");
            BufferedReader archi2 = new BufferedReader(new FileReader(archivo2));
            while (archi2.ready()) {
                String[] separar = new String[7];
                separar = archi2.readLine().split(",");
                ObjPartidareal.Partida.add(new ObjPartidareal(separar[0], separar[1], separar[2],separar[3],separar[4],separar[5],separar[6]));
            }
            archi2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer del arhivo", "Mensaje de error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return ObjPartidareal.Partida;
    }
     
     public ArrayList<ObjNumpartido> LeerArchivo2() {
        try {
            File archivo2 = new File("NumeroPartida.txt");
            BufferedReader archi2 = new BufferedReader(new FileReader(archivo2));
            while (archi2.ready()) {
                String[] separar = new String[0];
                separar = archi2.readLine().split(",");
                ObjNumpartido.numpartido2.add(new ObjNumpartido(separar[0]));
            }
            archi2.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al leer del arhivo", "Mensaje de error",
                    JOptionPane.ERROR_MESSAGE);
        }
        return ObjPartidareal.Partida;
    }
     
     
      
    public void IngresarEnArchivo(String datos){
        try{
            File archivo=new File("Partidas.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(datos + "\r\n");
            archi.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al escribir el arhivo", "Mensaje de error",
            JOptionPane.ERROR_MESSAGE);
        }
    }
    
    //contado partida
    public void IngresarEnArchivo2(String datos){
        try{
            File archivo=new File("NumeroPartida.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(datos + "\r\n");
            archi.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al escribir el arhivo", "Mensaje de error",
            JOptionPane.ERROR_MESSAGE);
        }
    }
}
