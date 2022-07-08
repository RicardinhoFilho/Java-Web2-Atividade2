/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author User
 */
public class Usuarios {
    
    static List<Usuario> usuarios = new ArrayList<Usuario>();
    
    public Usuarios(){
        
    };
    
    public  void addUsuario(Usuario usuario){
           usuarios.add(usuario);
     }
     
      public List<Usuario> getUsuarios(){
           return usuarios;
     }
    
}
