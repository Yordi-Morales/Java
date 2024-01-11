/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;
import datos.BDUsuarios;
import java.util.ArrayList;

/**
 *
 * @author AAQ
 */
public class Usuarios {
    
    BDUsuarios bdusuarios = new BDUsuarios();
    
    public void InsertarUsuarios(String lista)
    {        
        bdusuarios.InsertarEnArchivo(lista);        
    }
    
    public ArrayList<String> LeerUsuarios()
    {
        ArrayList<String> listaUsuarios = bdusuarios.LeerDesdeArchivo();     
        return listaUsuarios;
    }
}
