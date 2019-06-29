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
public class Arbol {
    private NodoArbol nodoRaíz;
    private int númeroDeNodos;

    
    //Se instancia el árbol totalmente vacío
    public Arbol(){
        this.nodoRaíz = null;
        this.númeroDeNodos = 0;
    
    }
    
    
    //El método devuelve verdadero si está vacío el arbol
    public boolean esVacio(){
    
        if (númeroDeNodos == 0) {
            return true;
        }
        return false;
    
    }
    
    
    //Recorre en Inorden de forma recursiva
    public void recorrerInOrden(NodoArbol padre){
    
        if(padre!=null){
                recorrerInOrden(padre.getHijoIzquierdo());
                System.out.print(padre.getData()+" ");
                recorrerInOrden(padre.getHijoDerecho());
        }
   
    }
   
    
    //Recorre en Posorden de forma recursiva
    public void recorrerPosOrden(NodoArbol padre){
    
        if(padre!=null){
                recorrerPosOrden(padre.getHijoIzquierdo());
                recorrerPosOrden(padre.getHijoDerecho());
                System.out.print(padre.getData()+" ");
        }
        
    }
    
    
    
    //Recorre en Preorden de forma recursiva
    public void recorrerPreOrden(NodoArbol padre){
    
        if(padre!=null){
                System.out.print(padre.getData()+" ");
                recorrerPreOrden(padre.getHijoIzquierdo());
                recorrerPreOrden(padre.getHijoDerecho());
        }
        
    }
    
    
    //Busca desde la ráiz el nodo con el dato que se está buscando
    //NOTA IMPORTANTE: La primera vez que se llame este código se tiene que pasar por parámetro la raíz del árbol
    public NodoArbol Buscar(NodoArbol raiz, String clave){
        NodoArbol objetivo;
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
    /*NOTA IMPORTANTE: Para poder agregar información de esta manera primero debe instanciarse el nodo con la información y luego ingresarla al arbol*/
    public void InsertarNodo(NodoArbol padre, NodoArbol hijo){
        NodoArbol aux;
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
    
    
    
    /*HAY QUE PROBAR BIEN ESTOS 2 MÉTODOS DE INSERCIÓN PORQUE SE LE TIENE QUE 
    PASAR EL PADRE COMO TIPO NODO Y SU HIJO TAMBIÉN*/ 
    public void InsertarNodoALaDerecha(NodoArbol padre, NodoArbol hijo){
    
        padre.setHijoDerecho(hijo);
    
    
    }
    
    public void InsertarNodoALaIzquierda(NodoArbol padre, NodoArbol hijo){
    
        padre.setHijoIzquierdo(hijo);
    
    }
    
    public void InsertarNodoRaíz(NodoArbol raíz){
    
        this.nodoRaíz = raíz;
    
    
    }
    
    
    public String RecorrerPorPreguntas(String datoNodo, int respuesta){
    
        NodoArbol auxiliar = Buscar(this.nodoRaíz, datoNodo);
        if (respuesta == 0) {
            return auxiliar.getHijoIzquierdo().getData();
        }else{
            
            return auxiliar.getHijoDerecho().getData();
        
        }
    
    }
    
    
   //Con este método se poda todo el árbol, dejándolo vacío
    public void Limpiar(){
        
        this.nodoRaíz = null;
        this.númeroDeNodos = 0;
        
    }  

    
    public NodoArbol getNodoRaíz() {
        return nodoRaíz;
    }

    public void setNodoRaíz(NodoArbol nodoRaíz) {
        this.nodoRaíz = nodoRaíz;
    }

    public int getNúmeroDeNodos() {
        return númeroDeNodos;
    }

    public void setNúmeroDeNodos(int númeroDeNodos) {
        this.númeroDeNodos = númeroDeNodos;
    }
    
    
    
}
