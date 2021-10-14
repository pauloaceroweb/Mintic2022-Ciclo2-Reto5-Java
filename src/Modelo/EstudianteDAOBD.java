/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Clase donde se hace la conexión a la base de datos y se encuentran todos los
 * métodos para la ejacución del programa.
 * @author Paulo Acero
 */
public class EstudianteDAOBD {

    private Connection connection = null;
    private ResultSet resultSet = null;
    private Statement statement = null;
    private String db = "db_estudiantes.db";
    private String tabla = "Estudiante";
    
    /**
     * Constructor donde se realiza la Conexión a la base de datos y se crea la tabla.
     */
    public EstudianteDAOBD() {
        String q;
        // Realiza la conexión a la Base de Datos
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:" + this.db);
            //System.out.println("Ya estamos Conectados a la base de datos SQLite [" + this.db + "]");
            q = "CREATE TABLE " + tabla + " ("
                    + "nombres TEXT (50) NOT NULL,"
                    + "apellidos	TEXT (50) NOT NULL,"
                    + "nacimiento	TEXT (50) NOT NULL,"
                    + "correoInst	TEXT (50) NOT NULL,"
                    + "correoPers	TEXT (50) NOT NULL,"
                    + "celular	NUMERIC NOT NULL,"
                    + "fijo	NUMERIC NOT NULL,"
                    + "programa	TEXT (50) NOT NULL,"
                    + "PRIMARY KEY(correoInst)"
                    + ");";
            //System.out.println("SQL Creacion Tabla = " + q);
            PreparedStatement pstm = connection.prepareStatement(q);
            pstm.execute();
            pstm.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }
    
    /**
     * Método que se encarga de crear un Estudiante mandando la consulta a la Base de datos.
     * @param est Variable de tipo Object Estudiante donde ingresan los datos del estudiante
     * @param table Variable donde se carga la tabla que viene de la Base de Datos.
     * @return Retorna un resultado booleano si se crea o no.
     */
    public boolean crearestudianteDAOBD(Estudiante est, String table) {
        boolean res = false;
        String fields = "nombres, apellidos, nacimiento, correoInst, correoPers, celular, fijo, programa";//Nombres de campos de BD
        String values = "'" + est.getNombres() + "','" + est.getApellidos() + "','" + est.getNacimiento() + "','" + est.getCorreoInst() + "','" + est.getCorreoPers() + "'," + est.getCelular() + "," + est.getFijo() + ",'" + est.getPrograma() + "'";
        //Se arma la consulta
        String q = "INSERT INTO " + table + " (" + fields + ") VALUES (" + values + ");";
        //System.out.println("SQL-CREAR:" + q);
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = connection.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return res;
    }
    
    /**
     * Método donde se busca el objeto por la llave primaria (Correo Institucional)
     * @param est Variable de tipo Object Estudiante donde ingresan los datos del estudiante
     * @param table Variable donde se carga la tabla que viene de la Base de Datos.
     * @return Retorna todos los datos del Estudiante.
     */
    public Estudiante BuscarEstudianteDAOBD(Estudiante est, String table) {
        boolean existe = false;
        String q= "SELECT * FROM "+table+" WHERE correoInst='"+ est.getCorreoInst()+"';";
        //String q = "SELECT * FROM " + table + " WHERE ID=" + est.getCorreoInst() + ";";
        //System.out.println("SQL Consulta=" + q);
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(q);

            while (resultSet.next()) {
                est.setNombres(resultSet.getString("nombres"));
                est.setApellidos(resultSet.getString("apellidos"));
                est.setNacimiento(resultSet.getString("nacimiento"));
                est.setCorreoInst(resultSet.getString("correoInst"));
                est.setCorreoPers(resultSet.getString("correoPers"));
                est.setCelular(resultSet.getLong("celular"));
                est.setFijo(resultSet.getLong("fijo"));
                est.setPrograma(resultSet.getString("Programa"));
                existe = true;
            }
            if (existe == false) {
                est = null;
            }
        } catch (SQLException ex) {
            System.out.println(ex);
            est = null;
        }
        return est;
    }
    
    /**
     * Método donde se modifica el estudiante mediante una sentencia a la Base de datos.
     * @param est Variable de tipo Object Estudiante donde ingresan los datos del estudiante
     * @param table Variable donde se carga la tabla que viene de la Base de Datos.
     * @return Retorna los datos modificados del Estudiante.
     */
    public boolean ModificarEstudianteDAOBD(Estudiante est, String table) {
        String fields = "correoPers='" + est.getCorreoPers() + "'," + "celular=" + est.getCelular() + "," + "fijo=" + est.getFijo() + "," + "programa='" + est.getPrograma() + "'";
        String condicion = "correoInst='" + est.getCorreoInst() + "'";
        //String fields = "programa='"+est.getprograma()+"'";
        //String condicion = "ID="+est.getID();
        Estudiante e1 = new Estudiante();
        boolean res = false;
        //Se arma la consulta
        String q = "UPDATE " + table + " SET " + fields + " WHERE " + condicion + ";";
        //System.out.println("SQL ACTUALIZAR=" + q);
        //se ejecuta la consulta
        e1 = BuscarEstudianteDAOBD(est, table);
        if (e1 != null)
         try {
            PreparedStatement pstm = connection.prepareStatement(q);
            pstm.execute();
            pstm.close();
            res = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
        return res;
    }  
    
    /**
     * Método donde se elimina el estudiante mediante una sentencia a la Base de datos.
     * @param est Variable de tipo Object Estudiante donde ingresan los datos del estudiante
     * @param table Variable donde se carga la tabla que viene de la Base de Datos.
     * @return Retorna Null.
     */
    public boolean EliminarEstudianteDAOBD(Estudiante est, String table) {
        Estudiante e1 = new Estudiante();
        boolean res = false, prueba;
        //Se arma la consulta
        String condicion = "correoInst='" + est.getCorreoInst() + "'";
        String q = "DELETE FROM " + table + " WHERE " + condicion + ";";
        //System.out.println("SQL ELIMINAR=" + q);
        //se ejecuta la consulta
        e1 = BuscarEstudianteDAOBD(est, table);
        if (e1 != null)
            
        try {
            PreparedStatement pstm = connection.prepareStatement(q);
            prueba = pstm.execute();

            pstm.close();
            //System.out.println("retorno de execute=" + prueba);
            res = true;
        } catch (SQLException e) {
            System.out.println(e);
        }
       return res;
    }
    
    /**
     * Método donde se busca la posición del estudiante mediante una sentencia a la Base de datos.
     * @param pos Variable donde envia la posición
     * @param table Variable donde se carga la tabla que viene de la Base de Datos.
     * @return Retorna un estudiante o Null.
     */
    public Object[] LeeposEstudianteDAOBD(int pos, String table) {
        int i = 0;
        String q = "SELECT * FROM " + table + ";";
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(q);
            while (resultSet.next()) {
                Object[] est = {resultSet.getString("nombres"), resultSet.getString("apellidos"),
                    resultSet.getString("nacimiento"), resultSet.getString("correoInst"),
                    resultSet.getString("correoPers"), resultSet.getString("celular"),
                    resultSet.getString("fijo"), resultSet.getString("programa")};
                i++;
                if (i == pos) {
                    return est;
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }

    /**
     * Método para desconectar la Base de Datos.
     */
    public void desconectar() {
        try {
            resultSet.close();
            statement.close();
            connection.close();
            System.out.println("Desconectado de la base de datos [ " + this.db + "]");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

}
