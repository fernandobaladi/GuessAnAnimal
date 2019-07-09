/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2baladiinvernonpizzurro;

import javax.swing.JFrame;

/**
 *
 * @author Fernando Baladi
 */
public class Proyecto2BaladiInvernonPizzurro {

    
    public static void main(String[] args) {
        //Aquí se instancia la vista para que se pueda correr la aplicación
        Vista v = new Vista();
        v.setVisible(true);
        v.setResizable(false);
        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        v.setLocationRelativeTo(null);
    }
    
}
