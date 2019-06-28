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

    
    //Se instancia el árbol totalmente vacío
    public Árbol(){
        this.nodoRaíz = null;
        this.númeroDeNodos = 0;
    
    }
    
    
    //El método devuelve verdadero si está vacío el árbol
    public boolean esVacio(){
    
        if (númeroDeNodos == 0) {
            return true;
        }
        return false;
    
    }
    
    
    //Recorre en Inorden de forma recursiva
    public void recorrerInOrden(NodoÁrbol padre){
    
        if(padre!=null){
                recorrerInOrden(padre.getHijoIzquierdo());
                System.out.print(padre.getData()+" ");
                recorrerInOrden(padre.getHijoDerecho());
        }
   
    }
   
    
    //Recorre en Posorden de forma recursiva
    public void recorrerPosOrden(NodoÁrbol padre){
    
        if(padre!=null){
                recorrerPosOrden(padre.getHijoIzquierdo());
                recorrerPosOrden(padre.getHijoDerecho());
                System.out.print(padre.getData()+" ");
        }
        
    }
    
    
    
    //Recorre en Preorden de forma recursiva
    public void recorrerPreOrden(NodoÁrbol padre){
    
        if(padre!=null){
                System.out.print(padre.getData()+" ");
                recorrerPreOrden(padre.getHijoIzquierdo());
                recorrerPreOrden(padre.getHijoDerecho());
        }
        
    }
    
    
    //Busca desde la ráiz el nodo con el dato que se está buscando
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
    
    
    //Inserta un nodo hijo en el padre que se le pase.
    /*NOTA IMPORTANTE: Para poder agregar información de esta manera primero debe instanciarse el nodo con la información y luego ingresarla al árbol*/
    public void InsertarNodo(NodoÁrbol padre, NodoÁrbol hijo){
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
    
   //Con este método se poda todo el árbol, dejándolo vacío
    public void Limpiar(){
        
        this.nodoRaíz = null;
        this.númeroDeNodos = 0;
        
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
