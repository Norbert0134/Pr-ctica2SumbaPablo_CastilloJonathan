/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.edu.ups.poo;

/**
 *
 * @author 59398
 */
public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void mostrarNombre(){
        System.out.println("hola, soy un alumno y se decir mi nombre ");
        
    }
   
}
