/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.BaseDatos;

/**
 *
 * @author Domenica Cañizares
 */
public class BaseDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BaseDatos BD = new BaseDatos();
        
        System.out.println("Conectando a la base de datos");
        BD.conectar();
        
        System.out.println("Descanectando la base de datos");
        BD.descanectar();
        
    }
    
}
