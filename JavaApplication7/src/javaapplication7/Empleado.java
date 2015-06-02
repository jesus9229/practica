/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *clase empleado que hace parte de la logica del negocio, se utiliza para los atributos que posee un empleado
 * @author JESUS Rodriguez
 * @version 1.0
 * @since 1.0
 * fecha 23/04/2015
 */
public class Empleado {
    
    
    protected String nombre;
   
    protected String apellido;
   
    protected int edad;
   
    protected double salario_primario;
    int otro =0;
    int nuevo;
    
 
    /**
     * metodo getNombre para retornar el nombre del empleado
     * @return  retorna el nombre del empreado un String nombre
     * @version 1.0 
     * 
     */
    public String getNombre() {
        return nombre;
    }

   
    /**
     * metodo setNombre se utiliza para almacenar y modificar el nombre del empleado
     * @param nombre recibe n parametro de tipo String para almacenar el nombre empleado
     * @version 1.0 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
 
    /**
     * metodo getEdad que se utiliza para obtener la ead del empleado
     * @return edad retorna un valor de tipo int que es la edad del empleado
     * @version 1.0
     */
    public int getEdad() {
        return edad;
    }
 
    
    /**
     * metodo que se utiliza para almacenar la edad de la persona
     * @param edad parametro de tipo int que se utiliza para el regitro de la 
     * edad del empleado
     * @version 1.0
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
 
    
    
    /**
     * metodo getSalario que se utiliza para devolver un valor de tipo doble que 
     * el el salario del empleado
     * @return salario, devuelve el valor del salario del epleado
     * @version 1.0
     */
    public double getSalario() {
        return salario_primario;
    }
 
    /**
     * metodo plus que se utiliza para verificar que el empleao sea mayor que 40
     * y que se registre un nombre y no un dato vacio para el aumento del sueldo del empleado
     * @param sueldoPlus es un valor e tipo double que almacena el sueldo del empleado
     * @return retorn un dato boolean si el empleado puede tener un aumento
     */
    public boolean plus (double sueldoPlus){
        boolean aumento=false;
        if (edad>40 && compruebaNombre()){
            salario_primario+=sueldoPlus;
            aumento=true;
        }
        return aumento;
    }
 
    /**
     *  metodo qe se utiliza para comprobar que nombre no sea un campo vacion
     * @return retorna un dato de tipo booleano para verificar nombre del empleado
     * 
     * 
     */
    private boolean compruebaNombre(){
        if(nombre.equals("")){
            return false;
        }
        return true;
    }
 
    /**
     * constructor vacio de la clase     */
    public Empleado(){
        this ("", "", 0, 0);
        this.edad = 0;
    }
 
  /**
   * contructor parametrico de la clase empleado recibe los valores de los atributos
   * del empleado
   * @param nombre parametro para asignar el nombre del empleado
   * @param apellido parametro para asignar el apellido del empleado
   * @param edad  parametro para asignar la edad del empleado
   * @param salario parametro para asignar el salario del empleado
   */
    public Empleado(String nombre, String apellido, int edad, double salario){
        this.edad = 0;
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.salario_primario=salario;
    }
    
    
    
    
}
