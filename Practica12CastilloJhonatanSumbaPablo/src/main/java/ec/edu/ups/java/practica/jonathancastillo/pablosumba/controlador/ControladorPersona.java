/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.java.practica.jonathancastillo.pablosumba.controlador;

import ec.edu.ups.java.practica.jonathancastillo.pablosumba.clases.Cancion;
import ec.edu.ups.java.practica.jonathancastillo.pablosumba.clases.Cantante;
import ec.edu.ups.java.practica.jonathancastillo.pablosumba.clases.Compositor;
import ec.edu.ups.java.practica.jonathancastillo.pablosumba.clases.Disco;
import ec.edu.ups.java.practica.jonathancastillo.pablosumba.clases.Persona;
import static ec.edu.ups.java.practica.jonathancastillo.pablosumba.controlador.IControlador.MAX_OBJECTS;
import java.util.List;
import java.util.Objects;


/**
 *
 * @author 59398
 */
public class ControladorPersona {
    
    private List<Persona> personas;
    
    public ControladorPersona() {
      
   
}

    /**
     *
     */
    public void imprimir() {
        // Implementar lógica para imprimir la información de todas las personas
    }

    public void buscarPorNombreDeDisco(String valor) {
        // Implementar lógica para buscar una persona por nombre de disco
    }

    public void buscarPorTituloDeCancion(String valor) {
        // Implementar lógica para buscar una persona por título de canción
    }
    public ControladorPersona(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.personas);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ControladorPersona other = (ControladorPersona) obj;
        return Objects.equals(this.personas, other.personas);
    }
     // Método para imprimir la información de todas las personas
   //variables
    // Método para buscar una persona por nombre de disco
    

    // Método para buscar una persona por título de canción


    @Override
    public String toString() {
        return "ControladorPersona{" + "personas=" + personas + '}';
    }

    public void create(Compositor cantante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void create(Cantante cantante) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

