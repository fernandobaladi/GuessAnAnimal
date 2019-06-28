/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2baladiinvernonpizzurro;

/**
 *
 * @author Fernando Baladi
 */
public class NodoÁrbol {
    private NodoÁrbol hijoIzquierdo;
    private NodoÁrbol hijoDerecho;
    private String data; //Objeto que se le pasa al árbol
    
    public NodoÁrbol(String data){
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        this.data = data;
    }

    public NodoÁrbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoÁrbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoÁrbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoÁrbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    //Metodo para validar si el nodo que se tiene es hoja
    public boolean esHoja(){
    
        if (this.hijoDerecho == null && this.hijoIzquierdo == null) {
            return true;
        }
        
        return false;
        
    }
    
}
