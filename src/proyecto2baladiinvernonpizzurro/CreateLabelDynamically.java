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
    //JScrollPane ScrollPane;
    Arbol arbol;
    
    
    public CreateLabelDynamically(Arbol arbol){
        
        this.arbol = arbol;
        Jpan = new CustomJPanel(arbol);
        //ScrollPane = new JScrollPane ();
        //setLayout(null);
        //Jpan.setLayout(null);
        //Jpan.setPreferredSize(new Dimension (1000,1000));
        //Jpan.setBounds(100, 100, 1500, 1000);
        Jpan.setOpaque(true);
        Jpan.setBackground( Color.white);
        //ScrollPane.setOpaque(true);
        setBackground(Color.white);
        //ScrollPane.setBackground(Color.white);
        //ScrollPane.setBounds(50, 50, 900, 900);
        
        //ScrollPane.setViewportView(Jpan);
        
        //add(ScrollPane);
        
        add(Jpan);
        
        
    }
    
//    public void PanelRepaint(){
//        Jpan.validate();
//        Jpan.repaint();
//        
//    }
    
//    public void PaintCity( JLabel label , int posX, int posY ){
//        label.setBounds(posX, posY, 54, 40);
//        Jpan.add(label);
//        
//        this.PanelRepaint();
//    }
     
    
}