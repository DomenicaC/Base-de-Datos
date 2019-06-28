/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author Domenica Cañizares
 */
public class ValidarEdad extends Exception{

    public ValidarEdad() {
        
        super("La edad es incorrecta \n la edad debe ser ente 20 y 35");
        
    }
    
}
