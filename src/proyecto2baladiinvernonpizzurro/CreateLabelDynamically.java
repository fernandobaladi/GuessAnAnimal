/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2baladiinvernonpizzurro;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Invernon
 */

public class CreateLabelDynamically extends JFrame {
    CustomJPanel Jpan;
    JScrollPane ScrollPane;
    Arbol arbol;
    
    //Creacion de un panel dinamico donde se mostrará el árbol
    public CreateLabelDynamically(Arbol arbol){
        
        this.arbol = arbol;
        Jpan = new CustomJPanel(arbol);
        ScrollPane = new JScrollPane (); //Permite que la pantalla tenga Scroll
        
        //Colocacion de las caracteristicas del Jpan y del ScrollPane
        Jpan.setPreferredSize(new Dimension (2000,2000));
        Jpan.setOpaque(true);
        Jpan.setBackground( Color.white);
        setBackground(Color.white);
        ScrollPane.setBounds(50, 50, 900, 900);
        
        //Activacison del ScrollBar vertical
        ScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener (){
        
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                repaint ();
            }
        });
        
        //Activacion del ScrollBar horizontal
        ScrollPane.getHorizontalScrollBar().addAdjustmentListener(new AdjustmentListener (){
        
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                repaint ();
            }
        });
        
        ScrollPane.setViewportView(Jpan);
        
        add(ScrollPane);
                
        
    }

}