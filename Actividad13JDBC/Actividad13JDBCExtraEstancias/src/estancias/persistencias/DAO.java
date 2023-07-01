/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estancias.persistencias;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author mi tamura
 */
public abstract class DAO {
    protected Connection conexion= null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    
    private final String USUARIO= "root";
    private final String CONTRASENIA= "root";
    private final String BASEDEDATOS= "estancias_exterior";
    private final String DRIVER= "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase() throws SQLException, ClassNotFoundException{
        try{
            Class.forName(DRIVER);
            String urlBaseDeDatos= "jdbc:mysql://localhost:3306/"+BASEDEDATOS+"?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USUARIO, CONTRASENIA);
        }
        catch(SQLException | ClassNotFoundException e){
            throw e;
        }
    }
    protected void desconectarBase() throws Exception{
        try{
            if(sentencia!=null)
                sentencia.close();
            if(resultado!=null)
                resultado.close();
            if(conexion!=null)
                conexion.close();
        }
        catch(Exception e){
            throw e;
        }
    }
    protected void insertarModificarEliminar(String sql) throws Exception{
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        }
        catch(Exception e){
            throw e;
        }
        finally{
            desconectarBase();
        }
    }
    protected void consultarBase(String sql) throws Exception{
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
}
