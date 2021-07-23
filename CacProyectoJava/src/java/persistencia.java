
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marce
 */
public class persistencia {
    private Connection cn;
    private ResultSet rs;
    private PreparedStatement ps;
    private ResultSet rsn;
    
    public String servidor, basededatos,usuario, clave, ejecutar;
    
    public Connection conectarse() { //coneccion con frontend
        try {
            Class.forName("com.mysql.jdbc.driver");
      
        servidor = "localhost:3306/"; //remotemysql.com 
        
        basededatos = "cacproyecto2021";
        
        usuario = "root";
        
        clave = "";
        
        cn = DriverManager.getConnection("jdbc:mysql//" + servidor + basededatos+"?autoReconnect=true&useSSL", usuario, clave); //Autoreconecta a pesar de errores y SSL para que sea segura
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(persistencia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
    
    public ResultSet consultaSQL (String busqueda) {     
        try {
        // consulta a la base de datos
        ps = conectarse().prepareStatement(busqueda);
        
        rs = ps.executeQuery();
        rsn = (ResultSet) rs.getMetaData();
         
        } catch (SQLException ex) {
            Logger.getLogger(persistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
    
    
}
