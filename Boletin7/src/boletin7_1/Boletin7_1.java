/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author alvar
 */
public class Boletin7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Libro lib=new Libro();
        lib.setNombreLibro(JOptionPane.showInputDialog("Introduce el nombre del libro"));
        lib.setNombreAutor(JOptionPane.showInputDialog("Introduce el nombre del autor"));
        lib.setEjemplares(Integer.parseInt(JOptionPane.showInputDialog("Introduce los ejemplares")));
        lib.setEjemplaresPrestados(Integer.parseInt(JOptionPane.showInputDialog("Introduce los ejemplares prestados")));
    }
    
}
