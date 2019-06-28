/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorBase {

    private BaseDatos miBaseDeDatos;

    public ControladorBase() {
        miBaseDeDatos = new BaseDatos();

    }

    public void create(Persona persona) {

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fechaBD = formato.format(persona.getFechaNac());
        String sql = "INSERT INTO \"PERSONA\" VALUES('" + persona.getCedula() + "','"
                + persona.getNombre() + "','"
                + persona.getApellido() + "',"
                + persona.getEdad() + ",'"
                + fechaBD + "','"
                + persona.getCelular() + "',"
                + persona.getSueldo() + ");";

        System.out.println("Base de datos " + sql);
        miBaseDeDatos.conectar();
        try {

            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDeDatos.descanectar();

        } catch (SQLException error) {

            error.printStackTrace();

        }
    }

    public void delete(Persona persona) {

    }

}
