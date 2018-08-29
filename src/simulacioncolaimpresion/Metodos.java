package simulacioncolaimpresion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Metodos {
    
    public static String cargarDatos(String archivo) throws FileNotFoundException, IOException{
        File file = new File(archivo);
        Cola<String> cola1 = new Cola<>();
        //cola1.enqueue("");
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        String text="";
        
        while ((st = br.readLine()) != null){
            text=st;
            System.out.println(Arrays.toString(text.split(",")));
        }
        return text;
    }
    
}
