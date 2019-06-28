/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Persona;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Domenica Cañizares
 */
public class ControladorPersona {

    private Set<Persona> lista;
    private int codigo;
    
    public Set<Persona> getLista(){
        return lista;                
    }
    public int getCodigo(){
        return codigo;
    }
    public ControladorPersona(){
        lista=new HashSet<>();
        codigo=1;
    }
    public void create(Persona per){
        per.setCodigo(codigo);
        codigo++;
        lista.add(per);
    }
    public Persona read(int codigo){
        for(Persona per: lista){
            if(per.getCodigo()==codigo){
                return per;
            }
        }
        return null;
    }
    public void update(Persona per){
        
            lista.remove(per);
            lista.add(per);
        
    }
    
    public void delete(int codigo){
        for (Persona per : lista) {
            if(per.getCodigo() == codigo){
                lista.remove(per);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Persona per : lista) {
            System.out.println(per.getNombre());
        }
    }

}
