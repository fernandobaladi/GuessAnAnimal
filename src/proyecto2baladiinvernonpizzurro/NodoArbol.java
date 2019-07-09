/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2baladiinvernonpizzurro;

/**
 *
 * @author edwardpizzurro
 */
public class NodoArbol {
    
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;
    private String data; //Objeto que se le pasa al árbol
    
    
    //Aquí se instancia el constructor
    public NodoArbol(String data){
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
        this.data = data;
    }

    
    //Getters y Setters de los nodos
    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
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
