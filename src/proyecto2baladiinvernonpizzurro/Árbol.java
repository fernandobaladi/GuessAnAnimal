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
public class Árbol {
    private NodoÁrbol nodoRaíz;
    private int númeroDeNodos;


    public boolean esVacio(){
    
        if (númeroDeNodos == 0) {
            return true;
        }
        return false;
    
    }
    
    public void recorrerInOrden(NodoÁrbol padre){
    
        if(padre!=null){
                recorrerInOrden(padre.getHijoIzquierdo());
                System.out.print(padre.getData()+" ");
                recorrerInOrden(padre.getHijoDerecho());
        }
        
    }
    
    public void recorrerPostOrden(NodoÁrbol padre){
    
        if(padre!=null){
                recorrerPostOrden(padre.getHijoIzquierdo());
                recorrerPostOrden(padre.getHijoDerecho());
                System.out.print(padre.getData()+" ");
        }
        
    }
    
    public void recorrerPreOrden(NodoÁrbol padre){
    
        if(padre!=null){
                System.out.print(padre.getData()+" ");
                recorrerPreOrden(padre.getHijoIzquierdo());
                recorrerPreOrden(padre.getHijoDerecho());
        }
        
    }
    
    public NodoÁrbol Buscar(NodoÁrbol raiz, String clave){
        NodoÁrbol objetivo;
        if(raiz!=null){
            if(raiz.getData().equals(clave)){
               objetivo=raiz;
            }else{
               objetivo=Buscar(raiz.getHijoIzquierdo(),clave);
               if(objetivo==null){
                  objetivo=Buscar(raiz.getHijoDerecho(),clave); 
               }
            }
        }else{
            objetivo=null; 
        }
        return objetivo;
    }
    
    public void Insertar(NodoÁrbol padre, NodoÁrbol hijo){
        NodoÁrbol aux;
        if (padre!=null){
            if(padre.getHijoIzquierdo()==null){
                padre.setHijoIzquierdo(hijo);
                this.setNúmeroDeNodos(this.getNúmeroDeNodos()+1);
            }else{
                aux=padre.getHijoIzquierdo();
                while(aux.getHijoDerecho()!=null){
                    aux=aux.getHijoDerecho();
                }
                aux.setHijoDerecho(hijo);
                this.setNúmeroDeNodos(this.getNúmeroDeNodos()+1);            
            }
        }else{
            if(this.esVacio()){
                this.nodoRaíz = hijo;
            }else{
                System.out.println("Posición de memoria no válida");
            }
        }


    
    }

    public NodoÁrbol getNodoRaíz() {
        return nodoRaíz;
    }

    public void setNodoRaíz(NodoÁrbol nodoRaíz) {
        this.nodoRaíz = nodoRaíz;
    }

    public int getNúmeroDeNodos() {
        return númeroDeNodos;
    }

    public void setNúmeroDeNodos(int númeroDeNodos) {
        this.númeroDeNodos = númeroDeNodos;
    }
    
    
    
}
