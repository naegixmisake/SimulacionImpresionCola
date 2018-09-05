package simulacioncolaimpresion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Metodos {
    
    public static Cola<Item> cargarDatos(String archivo) throws FileNotFoundException, IOException{
        File file = new File(archivo);
        Cola<Item> miCola = new Cola<>();
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        int index = 0;
        while ((st = br.readLine()) != null){
            Item datos = new Item(""+index, st.split(",")[0], st.split(",")[1]);
            miCola.enqueue(datos);
            index++;
        }
        return miCola;
    }
    public static void subirLista(Cola<Item> Datos, JList<String> listDatos){
        Iterator<Item> it = Datos.iterator();
        DefaultListModel modelo = new DefaultListModel();
        int i = 0;
        while(it.hasNext()){
            Item datoActual = it.next();
            modelo.addElement(datoActual.getArchivo());
            i++;
        }
        listDatos.setModel(modelo);
    }
    
    
    
}
