
package com.clases;

import java.text.NumberFormat;
import java.util.Locale;

/**Vercion:1.0;
 *Fecha:27/05/2019;
 * Copyringth:ITCA-FEPADE;
 * @author Alirio Diaz;
 */
public class Empleado {
    private int codigo;
    private String nombre;
    private String genero;
    private String cargo;
    private int edad;
    private String dui;
    private String nit;
    private double sueldo;
    private String intereses;
    private String telefono;

    public Empleado() {
    }
NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
    public Empleado(int codigo, String nombre, String genero, String cargo, int edad, String dui, String nit, double sueldo, String intereses, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.genero = genero;
        this.cargo = cargo;
        this.edad = edad;
        this.dui = dui;
        this.nit = nit;
        this.sueldo = sueldo;
        this.intereses = intereses;
        this.telefono = telefono;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getCargo() {
        return cargo;
    }

    public int getEdad() {
        return edad;
    }

    public String getDui() {
        return dui;
    }

    public String getNit() {
        return nit;
    }

    public double getSueldo() {
        return sueldo;
    }

    public String getIntereses() {
        return intereses;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public double calcularsalario(){
        double descuento=0.0;
        double afp =0.10;
        double renta=0.0675;
        double isss=0.0625;
        
        descuento= getSueldo()*afp +getSueldo()*renta +getSueldo()*isss;
        return sueldo-descuento;
                
    }
    
}
