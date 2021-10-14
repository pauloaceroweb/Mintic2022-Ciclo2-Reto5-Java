/**
 * Paquete Modelo donde encontramos nuestras clases:
 * 1. Estudiante.java
 * 2. EstudianteDAO.java
 * 3. EstudianteDTO.java
 */
package Modelo;

import java.io.Serializable;

/**
 * Estudiante (Value Object)
 * Clase que contiene atributos, constructores, gettes y setters no tiene comportamiento.
 * @author Paulo Acero
 */
public class Estudiante implements Serializable {
    private static final long SerialVersionUID = 1095827248314682118L;
    String nombres;
    String apellidos;
    String nacimiento;
    String correoInst;
    String correoPers;
    long celular;
    long fijo;
    String programa;
    
    /**
     * Estudiante
     * Método constructor donde representa el Objeto con sus Atributos.
     */
    public Estudiante (){
        nombres = new String();
        apellidos = new String ();
        nacimiento = new String ();
        correoInst = new String ();
        correoPers = new String ();
        programa = new String ();
        celular = 0;
        fijo = 0;
    }
    
    /**
     * Estudiante
     * Método constructor que crea un Estudiante recibiendo los siguientes parámetros:
     * @param nom Nombres del Estudiante.
     * @param ape Apellidos del Estudiante.
     * @param nac Fecha de nacimiento.
     * @param coi Correo Institucional.
     * @param cop Correo Personal.
     * @param cel Número de Teléfono Celular.
     * @param tel Número de Teléfono Fijo.
     * @param prog Nombre del programa al cual pertenece.
     */
    public Estudiante (String nom, String ape, String nac, String coi, String cop, long cel, long tel, String prog){
        nombres = new String(nom);
        apellidos = new String (ape);
        nacimiento = new String (nac);
        correoInst = new String (coi);
        correoPers = new String (cop);
        celular = cel;
        fijo = tel;
        programa = new String (prog);
    }
    
    /**
     * Accesa y asigna los nombres del Estudiante
     * @param nom Nombres del Estudiante.
     */
    public void setNombres(String nom){
        nombres = nom;
    }
    
    /**
     * Accesa y asigna los apellidos del Estudiante
     * @param ape Apellidos del Estudiante.
     */
    public void setApellidos(String ape){
        apellidos = ape;
    }
    
    /**
     * Accesa y asigna la fecha de nacimiento del estudiante.
     * @param nac Fecha de nacimiento del estudiante.
     */
    public void setNacimiento(String nac){
        nacimiento = nac;
    }
    
    /**
     * Accesa y asigna el correo institucional del estudiante.
     * @param coi Correo institucional del estudiante.
     */
    public void setCorreoInst(String coi){
        correoInst = coi;
    }
    
    /**
     * Accesa y asigna el correo personal del estudiante.
     * @param cop Correo personal del estudiante.
     */
    public void setCorreoPers(String cop){
        correoPers = cop;
    }
    
    /**
     * Accesa y asigna el número de celular del estudiante.
     * @param cel Número de celular del estudiante.
     */
    public void setCelular(long cel){
        celular = cel;
    }
    
    /**
     * Accesa y asigna el número fijo del estudiante.
     * @param tel Número de teléfono fijo del estudiante.
     */
    public void setFijo(long tel){
        fijo = tel;
    }
    
    /**
     * Accesa y asigna el programa al cual está inscrito el estudiante.
     * @param prog Programa al cual está inscrito el estudiante.
     */
    public void setPrograma(String prog){
        programa = prog;
    }
    
    /**
     * Accesa y obtiene los nombres del estudiante.
     * @return Retorna los nombres del estudiante.
     */
    public String getNombres(){
        return nombres;
    }
    
    /**
     * Accesa y obtiene los apellidos del estudiante.
     * @return Retorna los apellidos del estudiante.
     */
    public String getApellidos(){
        return apellidos;
    }
    
    /**
     * Accesa y obtiene la fecha de nacimiento del estudiante.
     * @return Retorna la fecha de nacimiento del estudiante.
     */
    public String getNacimiento(){
        return nacimiento;
    }
    
    /**
     * Accesa y obtiene el correo institucional del estudiante.
     * @return Retorna el correo institucional del estudiante.
     */
    public String getCorreoInst(){
        return correoInst;
    }
    
    /**
     * Accesa y obtiene el correo personal del estudiante.
     * @return Retorna el correo personal del estudiante.
     */
    public String getCorreoPers(){
        return correoPers;
    }
    
    /**
     * Accesa y obtiene el número celular del estudiante.
     * @return Retorna el número celular del estudiante.
     */
    public long getCelular(){
        return celular;
    }
    
    /**
     * Accesa y obtiene el número fijo del estudiante.
     * @return Retorna el número fijo del estudiante.
     */
    public long getFijo(){
        return fijo;
    }
    
    /**
     * Accesa y obtiene el programa a inscribir del estudiante.
     * @return Retorna el programa a inscribir del estudiante.
     */
    public String getPrograma(){
        return programa;
    }

    /**
     * Covierte a String el objeto Estudiante
     * @return Retorna el String del Estudiante.
     */
      @Override
    public String toString() {
        
        return "Nombres: " + this.nombres + "\n" +
               "Apellidos: " + this.apellidos + "\n" +
               "Fecha nacimiento: " + this.nacimiento + "\n" +
               "Correo institucional: " + this.correoInst + "\n" +
               "Correo personal: " + this.correoPers + "\n" +
               "Número de teléfono celular: " + this.celular + "\n" +
               "Número de teléfono fijo: " + this.fijo + "\n" +
               "Programa académico: " + this.programa + "\n";
    }
}
