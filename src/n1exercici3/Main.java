package n1exercici3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       String nameContestant = askingName();
      // quiz(shuffleCapitals(readingFile()));
        Map capitals = readingFile();
        List keysShuffled = shuffleKeys(capitals);



      




       

    }
    public static String askingName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nameContestant = sc.nextLine();
        return nameContestant;
    }

    public static List shuffleKeys (Map capitals){
        List keys = new ArrayList(capitals.keySet());
        Collections.shuffle(keys);
        return keys;
    }

    public static void quiz (LinkedHashMap capitalsShuffled) {
        Scanner sc = new Scanner (System.in);
        for (int i=0; i<10; i++) {
            System.out.println("Dime la capital de " + capitalsShuffled.get(i));
            String respuesta = sc.nextLine().toLowerCase();

        }

    }
    public static Map readingFile() {
        Map capitals = new HashMap();
        try(FileReader fr = new FileReader("D:/cursoespecializacionjava/tascaS103/src/n1exercici3/Countries.txt");) {
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line= br.readLine()) !=null) {
                String[] chain = line.split (" ");
                if (chain.length == 2)
                capitals.put(chain[0],chain[1]);
            }
            fr.close();
            System.out.println("Capitales importadas correctamente");
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error de E/S");
            e.printStackTrace();
        }
        return capitals;
    }
}
