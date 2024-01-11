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
public class ObjNumpartido {
    
    String numpartido;
    
     public static ArrayList numpartido2=new ArrayList<>();

    public String getNumpartido() {
        return numpartido;
    }

    public void setNumpartido(String numpartido) {
        this.numpartido = numpartido;
    }

    public static ArrayList getNumpartido2() {
        return numpartido2;
    }

    public static void setNumpartido2(ArrayList Numpartido2) {
        ObjNumpartido.numpartido2 = Numpartido2;
    }

    public ObjNumpartido(String numpartido) {
        this.numpartido = numpartido;
    }
     
     
    
}
