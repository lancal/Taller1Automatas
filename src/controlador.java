
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanpierrecalderonsantibanez
 */
public class controlador {
    
    public static ArrayList leerArchivo(String nombreArchivo) throws  FileNotFoundException, IOException{
    
        BufferedReader buffer = new BufferedReader(new FileReader(nombreArchivo));
        ArrayList lista = new ArrayList();
        String linea;
       
        while((linea = buffer.readLine()) != null){
        
            
            lista.add(linea);
            
        }
        buffer.close();
        return lista;
    
    }

    
    
    
    
}
