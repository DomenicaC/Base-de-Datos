/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import ec.edu.ups.excepciones.ValidarApellido;
import ec.edu.ups.excepciones.ValidarCedula;
import ec.edu.ups.excepciones.ValidarCelular;
import ec.edu.ups.excepciones.ValidarDosApellidos;
import ec.edu.ups.excepciones.ValidarDosNombres;
import ec.edu.ups.excepciones.ValidarEdad;
import ec.edu.ups.excepciones.ValidarFechaNac;
import ec.edu.ups.excepciones.ValidarNombre;
import ec.edu.ups.excepciones.ValidarSueldo;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Domenica Cañizares
 */
public class Persona {

    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    private String nombre;
    private String apellido;
    private String cedula;
    private Date fechaNac;
    private int edad;
    private String celular;
    private double sueldo;

    public Persona() {
    }

    public Persona(String cedula, String nombre, String apellido, int edad, Date fechaNac, String celular, double sueldo) {

        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNac = fechaNac;
        this.celular = celular;
        this.sueldo = sueldo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ValidarNombre, ValidarDosNombres {

        boolean v = true;

        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.charAt(i) < 60 || nombre.charAt(i) > 100 && nombre.charAt(i) < 97 || nombre.charAt(i) > 122) && nombre.charAt(i) != 32) {
                v = false;

            }
        }

        if (v) {

            if (nombre.contains(" ")) {

                this.nombre = nombre;

            } else {

                throw new ValidarDosNombres();

            }

        } else {

            throw new ValidarNombre();

        }

        System.out.println("Nombre " + nombre);

    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws ValidarApellido, ValidarDosApellidos {

        boolean v = true;

        for (int i = 0; i < apellido.length(); i++) {
            if ((apellido.charAt(i) < 60 || apellido.charAt(i) > 100 && apellido.charAt(i) < 97 || apellido.charAt(i) > 122) && apellido.charAt(i) != 32) {
                v = false;

            }
        }

        if (v) {

            if (apellido.contains(" ")) {

                this.apellido = apellido;

            } else {

                throw new ValidarDosApellidos();

            }

        } else {

            throw new ValidarApellido();

        }

        System.out.println("Apellido " + apellido);

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws ValidarCedula {

        if (cedula.length() == 10) {

            int pos = Integer.parseInt(cedula.substring(2, 3));
            if (pos <= 6) {

                int[] Validacion = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int cedu = Integer.parseInt(cedula.substring(9, 10));
                int a = 0;
                int d = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {

                    d = Integer.parseInt(cedula.substring(i, i + 1)) * Validacion[i];
                    a += ((d % 10) + (d / 10));

                }

                if ((a % 10 == 0) && (a % 10 == cedu)) {

                    this.cedula = cedula;

                } else if ((10 - (a % 10)) == cedu) {

                    this.cedula = cedula;

                } else {

                    throw new ValidarCedula();

                }
            } else {

                throw new ValidarCedula();

            }
        } else {

            throw new ValidarCedula();

        }

        System.out.println("Cedula " + cedula);

    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) throws ValidarCelular {

        if (celular.length() == 10) {

            this.celular = celular;
            /*if (Integer.parseInt(celular.substring(1)) == 0) {

             if (Integer.parseInt(celular.substring(2)) == 9) {

             this.celular = celular;

             }

             } else {

             throw new ValidarCelular();

             }*/
        } else {

            throw new ValidarCelular();

        }

        System.out.println("Celular " + celular);

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ValidarEdad {

        if (edad >= 0) {

            this.edad = edad;

        } else {

            throw new ValidarEdad();

        }

        System.out.println("Edad " + edad);

    }

    public Date getFechaNac() {

        return fechaNac;

    }

    public void setFechaNac(Date fechaNac) throws ValidarFechaNac {
        /*
         String resp = "/";
         boolean corr = false;

         //if (fechaNac.length() == 10) {
         this.fechaNac = fechaNac;
         /*if (fechaNac.substring(2).equals(resp) && fechaNac.substring(5).equals(resp)) {
         //dia
         if (Integer.parseInt(fechaNac.substring(0)) > 0 && Integer.parseInt(fechaNac.substring(0)) < 4) {
         if (Integer.parseInt(fechaNac.substring(1)) > 0 && Integer.parseInt(fechaNac.substring(1)) < 9) {
         //mes
         if (Integer.parseInt(fechaNac.substring(3)) == 1) {
         if (Integer.parseInt(fechaNac.substring(4)) > 0 && Integer.parseInt(fechaNac.substring(4)) < 3) {
         //año
         if (Integer.parseInt(fechaNac.substring(6)) > 0 && Integer.parseInt(fechaNac.substring(6)) < 3) {
         if (Integer.parseInt(fechaNac.substring(6)) == 1) {
         if (Integer.parseInt(fechaNac.substring(7)) >= 0 && Integer.parseInt(fechaNac.substring(7)) <= 9) {
         if (Integer.parseInt(fechaNac.substring(8)) >= 0 && Integer.parseInt(fechaNac.substring(8)) <= 9) {
         if (Integer.parseInt(fechaNac.substring(9)) >= 0 && Integer.parseInt(fechaNac.substring(9)) <= 9) {
         this.fechaNac = fechaNac;
         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }
         ///
         } else if (Integer.parseInt(fechaNac.substring(6)) == 2) {
         if (Integer.parseInt(fechaNac.substring(7)) == 0) {
         if (Integer.parseInt(fechaNac.substring(8)) >= 0 && Integer.parseInt(fechaNac.substring(8)) <= 9) {
         if (Integer.parseInt(fechaNac.substring(9)) >= 0 && Integer.parseInt(fechaNac.substring(9)) <= 9) {
         this.fechaNac = fechaNac;
         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }

         } else {
         throw new ValidarFechaNac();
         }

         } else {
         throw new ValidarFechaNac();
         }

         } else {
         throw new ValidarFechaNac();
         }

         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }
         } else {
         throw new ValidarFechaNac();
         }*/
        //}
        this.fechaNac = fechaNac;
        System.out.println("Fecha Nacimiento " + fechaNac);
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) throws ValidarSueldo {

        if (sueldo != 0) {

            this.sueldo = sueldo;

        } else {

            throw new ValidarSueldo();

        }

        System.out.println("Sueldo " + sueldo);

    }

    @Override
    public String toString() {
        return "Persona{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNac=" + fechaNac + ", edad=" + edad + ", celular=" + celular + ", sueldo=" + sueldo + '}';
    }

}
