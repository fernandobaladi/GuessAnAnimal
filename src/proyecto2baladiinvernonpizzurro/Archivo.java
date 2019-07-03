/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2baladiinvernonpizzurro;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Fernando Baladi
 */
public class Archivo {
    File archivo;
       String texto;
       String[] arreglo;

       FileInputStream entrada;
       FileOutputStream salida;
       PrintWriter escribir;


       public Archivo() {
       }

       public String loadGame(File archivo) {
           String contenido = "";
           try {
               entrada = new FileInputStream(archivo);
               int ascci;
               while ((ascci = entrada.read()) != -1) {
                   char caracter = (char) ascci;
                   contenido += caracter;
               }
           } catch (Exception e) {

           }
           return contenido;
       }   
}
