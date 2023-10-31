// Se importan las librerias necesarias
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Enumeration;

public class dictionary {

    public static void main(String[] args) {

        // Crea un Dictionary
        Dictionary<String, Integer> myDictionary = new Hashtable<>();


        // Metodo put()
        myDictionary.put("Valor 1", 1);
        myDictionary.put("Valor 2", 2);
        myDictionary.put("Valor 3", 3);


        // Metodo get()
        System.out.println(" Valor en posicion key1: " + myDictionary.get("Valor 1") );
        // output: "Valor en posicion key1: 1"


        // Metodo elements()
        Enumeration<Integer> enums = myDictionary.elements();
        while ( enums.hasMoreElements() ) {

            System.out.print(enums.nextElement() + " ");

        }
        // output: "3 2 1"
        System.out.println("");


        // Metodo isEmpty()
        System.out.println("El diccionario esta vacio? " + myDictionary.isEmpty());
        // output: "El diccionario esta vacio? false"


        // Metodo keys()
        Enumeration<String> enumsKeys = myDictionary.keys();
        while ( enumsKeys.hasMoreElements() ) {

            System.out.print(enumsKeys.nextElement() + " ");

        }
        // output: "Valor 3 Valor 2 Valor 1"
        System.out.println("");


        // Metodo remove()
        myDictionary.remove("Valor 3");

        
        // Metodo size()
        System.out.println("El tamano del diccionario es de " + myDictionary.size());
        // output: "El tamano del diccionario es de 2"

    }

}