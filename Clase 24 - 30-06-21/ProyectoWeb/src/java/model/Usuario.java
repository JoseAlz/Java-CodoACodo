package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marce
 */
public class Usuario {
    private String usuario;
    private String clave;
    
    public Usuario(){
        
    }
   
    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        
    }
    
    public String getUsuario() {
        
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        
        this.usuario = usuario;
        
    }
    
    public String getClave() {
        
        return clave;
    }
    
    public void setClave(String clave) {
        
        this.clave = clave;
        
    }
    
    @Override
    public String toString() {
        return "Usuario(" + "usuario=" + usuario + ", clave=" + clave + ")";
        
    }
}
