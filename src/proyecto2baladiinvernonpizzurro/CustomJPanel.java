/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2baladiinvernonpizzurro;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author invernon
 */
public class CustomJPanel extends JPanel{
    
    Arbol arbol;

    public CustomJPanel(Arbol arbol) {
        this.arbol = arbol;
        //setLayout(null);
    }
     
    
    public void paint (Graphics g){
         
         g.setFont(new Font("Arial", Font.BOLD, 12));
		//g.drawString(String.valueOf(tree.root.data), this.getWidth()/2, 30);
		

			//DrawNode(g, tree.root,100, 50,2);

	Draw(g, 0, 1000, 0, 1000 / arbol.getheight(arbol.getNodoRaíz()), arbol.getNodoRaíz());
    
        
    }
   	
    public void Draw(Graphics g, int MinWidth, int MaxWidth, int MinHeight, int Level, NodoArbol node) {
        String data = String.valueOf(node.getData());
        g.setFont(new Font("Arial", Font.BOLD, 12));
        FontMetrics fm = g.getFontMetrics();
        int dataWidth = fm.stringWidth(data);
        g.setColor(Color.black);
        g.drawOval(((MinWidth + MaxWidth) / 2 - dataWidth / 2) -10, (MinHeight + Level / 2) - 35, dataWidth+20, dataWidth+20);
        g.drawString(data, (MinWidth + MaxWidth) / 2 - dataWidth / 2, MinHeight + Level / 2);

        if (node.getHijoIzquierdo()!= null)            
        	Draw(g, MinWidth, (MinWidth + MaxWidth) / 2, MinHeight + Level, Level, node.getHijoIzquierdo());
        
        if (node.getHijoDerecho()!= null)
        	Draw(g, (MinWidth + MaxWidth) / 2, MaxWidth, MinHeight + Level, Level, node.getHijoDerecho());
    }
}
