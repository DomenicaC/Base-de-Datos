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
public class ValidarFechaNac extends Exception {

    public ValidarFechaNac() {

        super("La fecha de nacimiento es incorrecta no contiene 10 digitos o algun caracter esta mal ingresado");

    }

}
