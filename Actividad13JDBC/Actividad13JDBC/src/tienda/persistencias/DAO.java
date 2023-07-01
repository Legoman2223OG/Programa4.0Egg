/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencias;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mi tamura
 */
public abstract class DAO {
    //Clases de conexion,statement y result set.
    protected Connection conexion = null;
    protected Statement sentencia= null;
    protected ResultSet resultado= null;
    //Parametros de conexion a Base de datos
    private final String USUARIO = "root";
    private final String CONTRASENIA = "root";
    private final String BASEDEDATOS = "tienda";
    private final String DRIVER = "com.mysql.cj.jdbc.Driver";
    
    protected void conectarBase() throws SQLException, ClassNotFoundException{
        try {
            Class.forName(DRIVER);
            //useSSL desactiva warnings.
            String urlBaseDeDatos = "jdbc:mysql://localhost:3306/" + BASEDEDATOS + "?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, USUARIO, CONTRASENIA);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("No se encontro la libreria de JDBC.");
            System.out.println("O posiblemente hubo un error al conectar a la base de datos");
            throw ex;
        }
    }
    protected void desconectarBase() throws Exception {
        try{
            //El result set alberga alguna consulta, por lo cual
            //Deberiamos cerrar la conexion del resultset.
            //Esto es por si hay varias conexiones a la base de datos a la
            //vez.
            if(resultado != null){
                resultado.close();
            }
            //Lo mismo con las sentencias, debemos de cerrarlas una vez
            //hecha la consulta.
            if(sentencia != null){
                sentencia.close();
            }
            //Con esto nos asegurariamos de cerrar TODAS las conexiones
            //y incluso en el caso de que alguna ya este cerrada.
            if(conexion != null){
                conexion.close();
            }
        }
        catch(Exception e){
            throw e;
        }
    }
    //En sql debemos de pasar una query SQL de modificacion,insert o drop.
    protected void insertarModificarEliminar(String sql) throws ClassNotFoundException, SQLException, Exception{
        try{
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        }
        catch(ClassNotFoundException | SQLException e){
            //Incluiremos un roll back para evitar que la sentencia modifique todo
            //y perdamos datos si ocurre un error.
            //Se usa demasiado en projectos reales.
            //conexion.rollback();
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
            resultado = sentencia.executeQuery(sql);
        }
        catch(Exception e){
            throw e;
        }
    }
}
