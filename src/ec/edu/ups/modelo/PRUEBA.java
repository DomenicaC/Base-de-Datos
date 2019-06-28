/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.controlador.ControladorBase;
import java.sql.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author Domenica Cañizares
 */
public class PRUEBA {

    public static void main(String[] args) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        Persona p = new Persona("0123456789", "johanna", "canizares", 30, new java.util.Date(), "0968741628", 201.3);

        ControladorBase contBase = new ControladorBase();
        contBase.create(p);

    }
}
