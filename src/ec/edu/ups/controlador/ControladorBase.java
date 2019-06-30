/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.excepciones.ValidarApellido;
import ec.edu.ups.excepciones.ValidarCedula;
import ec.edu.ups.excepciones.ValidarCelular;
import ec.edu.ups.excepciones.ValidarDosApellidos;
import ec.edu.ups.excepciones.ValidarDosNombres;
import ec.edu.ups.excepciones.ValidarEdad;
import ec.edu.ups.excepciones.ValidarFechaNac;
import ec.edu.ups.excepciones.ValidarNombre;
import ec.edu.ups.excepciones.ValidarSueldo;
import ec.edu.ups.modelo.Direccion;
import ec.edu.ups.modelo.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorBase {

    private BaseDatos miBaseDeDatos;

    public ControladorBase() {
        miBaseDeDatos = new BaseDatos();

    }

    public void createPer(Persona persona) {

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

    public void deletePer(Persona persona) {

    }

    public void updatePer() {

    }

    public Persona buscarPer(String cedula) {
        Persona per = new Persona();
        try {

            String sql = "SELECT * FROM \"PERSONA\"WHERE\"PER_CEDULA\"='" + cedula + "';";
            System.out.println("Base " + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                per.setCedula(cedula);
                per.setNombre(res.getString("PER_NOMBRE"));
                per.setApellido(res.getString("PER_APELLIDO"));
                per.setEdad(res.getInt("PER_EDAD"));
                per.setFechaNac(res.getDate("PER_FECHA"));
                per.setCelular(res.getString("PER_CELULAR"));
                per.setSueldo(res.getDouble("PER_SUELDO"));

            }
            res.close();
            sta.close();
            miBaseDeDatos.descanectar();

        } catch (SQLException error) {

            error.printStackTrace();

        } catch (ValidarCedula ex) {
            System.err.println("Error cedula " + ex);
        } catch (ValidarNombre ex) {
            System.err.println("Error nombre " + ex);
        } catch (ValidarDosNombres ex) {
            System.err.println("Error dos nombres " + ex);
        } catch (ValidarApellido ex) {
            System.err.println("Error Apellido " + ex);
        } catch (ValidarDosApellidos ex) {
            System.err.println("Error dos apellidos " + ex);
        } catch (ValidarEdad ex) {
            System.err.println("Error edad " + ex);
        } catch (ValidarFechaNac ex) {
            System.err.println("Error fecha " + ex);
        } catch (ValidarCelular ex) {
            System.err.println("Error celular " + ex);
        } catch (ValidarSueldo ex) {
            System.err.println("Error sueldo " + ex);
        }
        return per;

    }

    public Persona listarPer() {

        Persona per = new Persona();
        try {

            String sql = "SELECT * FROM \"PERSONA\"';";
            System.out.println("Base " + sql);

            miBaseDeDatos.conectar();
            Statement sta = miBaseDeDatos.getConexionBD().createStatement();
            ResultSet res = sta.executeQuery(sql);

            while (res.next()) {

                per.setCedula(res.getString("PER_CEDULA"));
                per.setNombre(res.getString("PER_NOMBRE"));
                per.setApellido(res.getString("PER_APELLIDO"));
                per.setEdad(res.getInt("PER_EDAD"));
                per.setFechaNac(res.getDate("PER_FECHA"));
                per.setCelular(res.getString("PER_CELULAR"));
                per.setSueldo(res.getDouble("PER_SUELDO"));

            }
            res.close();
            sta.close();
            miBaseDeDatos.descanectar();

        } catch (SQLException error) {

            error.printStackTrace();

        } catch (ValidarCedula ex) {
            System.err.println("Error cedula " + ex);
        } catch (ValidarNombre ex) {
            System.err.println("Error nombre " + ex);
        } catch (ValidarDosNombres ex) {
            System.err.println("Error dos nombres " + ex);
        } catch (ValidarApellido ex) {
            System.err.println("Error Apellido " + ex);
        } catch (ValidarDosApellidos ex) {
            System.err.println("Error dos apellidos " + ex);
        } catch (ValidarEdad ex) {
            System.err.println("Error edad " + ex);
        } catch (ValidarFechaNac ex) {
            System.err.println("Error fecha " + ex);
        } catch (ValidarCelular ex) {
            System.err.println("Error celular " + ex);
        } catch (ValidarSueldo ex) {
            System.err.println("Error sueldo " + ex);
        }
        return per;

    }
    
    public void createDir(Direccion direccion){
        
    }
}
