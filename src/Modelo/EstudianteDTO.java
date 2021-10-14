/**
 * Recibe información suelta de la vista para compactarla en objetos tipo <Estudiante> 
 * segun lo requieran las utilidades que la aplicación ofrece  
 * Crear, Actualizar, Consultar, Eliminar
 */
package Modelo;

import Vista.*;
import java.util.InputMismatchException;

/**
 * EstudianteDTO
 * Es la clase que se encarga de obtener datos del usuario y llenar la clase Estudiante y enviarla a la Vista o viceversa.
 * @author Paulo Acero
 */
public class EstudianteDTO {
    
    Imprimible I = new Imprimible();
    String nom = new String();
    String ape = new String();
    String nac = new String();
    String coi = new String();
    String cop = new String();
    String prog = new String();
    long cel;
    long tel;
    
    /**
     * @param nom Nombres del Estudiante
     * @param ape Apellidos del Estudiante
     * @param nac Fecha de Nacimiento del Estudiante
     * @param coi Correo Institucional del Estudiante
     * @param cop Correo Personal del Estudiante
     * @param prog Programa del Estudiante
     * @param cel Número Celular del Estudiante
     * @param tel Número Fijo del Estudiante
     */
    
     /**
     * Constructor Vacio.
     */
    public EstudianteDTO(){
    }
    
     /**
     *  Método que captura datos de los atributos del objeto Estudiante empaquetandolos en el objeto y lo retorna
     *  Si en el momento de capturar datos tipo long hay error, se les asigna cero
     *  @return Retorna objeto tipo Estudiante con todos sus atributos diligenciados 
    */
    public Estudiante CrearEstudianteDTO(String nom, String ape, String nac, String coi, String cop, long cel, long tel, String prog) throws InputMismatchException {
        Estudiante est = new Estudiante(nom, ape, nac, coi, cop, cel, tel, prog);
        return est;
    }
    
    /**
     * Método que captura el correo institucional que ingresa el usuario para buscar un estudiante. 
     * @return Retorna un Objeto tipo Estudiante con todos sus datos.
     */
    public Estudiante BuscarEstudianteDTO(String coi)throws InputMismatchException{
        Estudiante est = new Estudiante(" ", " ", " ", coi, " ", ' ', ' ', " ");
        return est;
    }
    
    /**
     * Método que captura el correo institucional, correo personal, el número de celular, el número fijo y el programa que ingresa el usuario para modificar un estudiante. 
     * @return Retorna un Objeto tipo Estudiante con todos sus datos modificados.
     */
    public Estudiante ModificarEstudianteDTO(String coi, String cop, long cel, long tel, String prog) throws InputMismatchException {
        Estudiante est = new Estudiante(" ", " ", " ", coi, cop, cel, tel, prog);
        return est;
    }
    
    /**
     * Método que captura el correo institucional que ingresa el usuario para buscar y eliminar el estudiante. 
     * @return Retorna un Objeto tipo Estudiante con todos sus datos.
     */
    public Estudiante EliminarEstudianteDTO(String coi)throws InputMismatchException{
        Estudiante est = new Estudiante(" ", " ", " ", coi, " ", ' ', ' ', " ");
        return est;
    }
}
