/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author AAQ
 */
public class BDUsuarios {

    public void InsertarEnArchivo(String lista) {
        try {
            File archivo = new File("ListaUsuarios.txt");
            BufferedWriter archi = new BufferedWriter(new FileWriter(archivo, true));
            archi.write(lista + "\r\n");
            archi.close();
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo" + e);
        }
    }
    
    public ArrayList<String> LeerDesdeArchivo()
    {
        ArrayList<String> contenido = new ArrayList<>();
        try {
            File archivo = new File("ListaUsuarios.txt");
            BufferedReader archi = new BufferedReader(new FileReader(archivo));
            while (archi.ready())
            {
                contenido.add(archi.readLine());
            }
            archi.close();
        } catch (Exception e) {
            System.out.println("Error al leer del archivo" + e);
        }
        return contenido;
    }
}
