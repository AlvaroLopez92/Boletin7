/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

/**
 *
 * @author alvar
 */
public class Libro {
    private String nombreAutor;
    private String nombreLibro;
    private int ejemplares;
    private int ejemplaresPrestados;

    public Libro() {
    }

    public Libro(String nomeAutor, String nomeLibro, int exemplares, int exempPrest) {
        this.nombreAutor = nombreAutor;
        this.nombreLibro = nombreLibro;
        this.ejemplares = ejemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nomeAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nomeLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int exemplares) {
        this.ejemplares = ejemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public String toString() {
        return "Libro{" + "nomeAutor=" + nombreAutor + ", nombreLibro=" + nombreLibro + ", ejemplares=" + ejemplares + ", exempPrest=" + ejemplaresPrestados + '}';
    }
    public boolean prestamo(int prestados){
        boolean pres=false;
        if(this.ejemplares<this.ejemplaresPrestados&&this.ejemplares>(prestados+this.ejemplaresPrestados)){
            this.ejemplaresPrestados=this.ejemplaresPrestados+prestados;
            pres=true;
        }
        return pres;
    }
    public boolean devolucion(int devueltos){
        boolean devolucion=false;
        if(this.ejemplaresPrestados>0&&this.ejemplaresPrestados>devueltos){
            this.ejemplaresPrestados=this.ejemplaresPrestados-devueltos;
            devolucion=true;
        }
        return devolucion;
    }
}