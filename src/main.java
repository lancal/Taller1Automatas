/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.io.*;
 import java.util.ArrayList;
/**
 *
 * @author alanpierrecalderonsantibanez
 */
public class main {
    
    public static void main(String[] args){
        ArrayList listaSimple = new ArrayList();
        try{
            controlador controlador = new controlador();
            System.out.println(System.getProperty("user.dir"));
            listaSimple = controlador.leerArchivo("src//files//prueba.nfa");
        }catch(IOException e){
            System.out.println("Error E/S: "+e);
        
        }
        
        System.out.println(listaSimple.toString());
        System.out.println(listaSimple.size());
        
        ArrayList[] arregloString1 = null;
        
        for(int i = 0 ; i < listaSimple.size(); i++){
            
            String nodo = (String) listaSimple.get(i);
            
        
             arregloString = nodo.split(",");
             
             
             
        }
        System.out.println(arregloString.length);
        
        for(int i=0 ; i < arregloString.length; i++){
        
            System.out.println(arregloString[i]);
            System.out.println(i);
        
        }
    
    }
    
}
