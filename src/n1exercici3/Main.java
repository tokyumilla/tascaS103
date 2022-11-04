package n1exercici3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       readingFile();
       

    }

    public static void readingFile() {
        Map capitals = new HashMap();
        try {
            FileReader fr = new FileReader("D:/cursoespecializacionjava/tascaS103/src/n1exercici3/Countries.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            do {
                line =  br.readLine();
                if (line!="") {
                    String[] chain = line.split(" ");
                    capitals.put(chain[0], chain[1]);
                }
            }  while (line!=null && line!="");
            fr.close();
            System.out.println("Capitales importadas correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error de E/S");
            e.printStackTrace();
        }
    }
}
