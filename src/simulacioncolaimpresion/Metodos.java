package simulacioncolaimpresion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Metodos {
    
    public static Cola<Item> cargarDatos(String archivo) throws FileNotFoundException, IOException{
        File file = new File(archivo);
        Cola<Item> miCola = new Cola<>();
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        String text="";
        int index = 0;
        while ((st = br.readLine()) != null){
            text=st;
            Item datos = new Item(""+index, st.split(",")[0], st.split(",")[1]);
            miCola.enqueue(datos);
            index++;
        }
        return miCola;
    }
    
}
