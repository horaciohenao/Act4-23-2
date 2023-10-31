// Se importan las librerias necesarias
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public class hashtable {

    public static void main(String[] args) {

        // Crea un HashTable
        Hashtable<String, Integer> myHashTable = new Hashtable();


        // Metodo put()
        myHashTable.put("Valor 1", 1);
        myHashTable.put("Valor 2", 2);
        myHashTable.put("Valor 3", 3);
        

        // Crea un Map
        Map myMap = new HashMap();

        // Agrega valores
        myMap.put("Valor 1", 1);
        myMap.put("Valor 2", 2);
        myMap.put("Valor 3", 3);

        // Crea otro HashTable
        Hashtable<String, Integer> myHashTable2 = new Hashtable();

        // Metodo putAll()
        myHashTable2.putAll(myMap);


        // Metodo putIfAbsent()
        myHashTable.putIfAbsent("Valor 1", 25);


        // Metodo get()
        System.out.println("Valor en posicion key1: " + myHashTable.get("Valor 1"));
        // output: "Valor en posicion key1: 1"


        // Metodo hashCode()
        System.out.println("HashCode de myHashTable: " + myHashTable.hashCode());
        // output: "HashCode de myHashTable: 1393304348"


        // Metodo getOrDefault()
        System.out.println("Valor en posicion key5: " + myHashTable.getOrDefault("Valor 5", 0));
        // output: "Valor en posicion key5: 1"


        // Metodo clone()
        Hashtable<String, Integer> myHashTableClone = new Hashtable();

        myHashTableClone = (Hashtable)myHashTable.clone();


        // Metodo compute()
        myHashTable.compute("Valor 2", (k, v) -> v * 2);

        
        // Metodo computeIfAbsent()
        myHashTable.computeIfAbsent("Valor 4", k -> 4);

        
        // Metodo computeIfPresent()
        myHashTable.computeIfPresent("Valor 4", (k, v) -> v * 4);


        // Metodo contains() 
        // * es lo mismo que containsValue()
        System.out.println("El hashtable contiene un valor 16? " + myHashTable.contains(16));
        System.out.println("El hashtable contiene un valor 16? " + myHashTable.containsValue(16));
        // output: "El hashtable contiene un valor 16? true"


        // Metodo containsKey
        System.out.println("El hashtable contiene una key \"Valor 3\"? " + myHashTable.containsKey("Valor 3"));
        // output: "El hashtable contiene una key "Valor 3"? true"


        // Metodo elements()
        Enumeration<Integer> enums = myHashTable.elements();
        while ( enums.hasMoreElements() ) {

            System.out.print(enums.nextElement() + " ");

        }
        // output: "16 3 4 1"
        System.out.println("");


        // Metodo entrySet()
        Set<Map.Entry<String, Integer>> Entries = myHashTable.entrySet();
        System.out.println("Valores en Entries: " + Entries);
        // output: "Valores en Entries: [Valor 4=16, Valor 3=3, Valor 2=4, Valor 1=1]"
        

        // Metodo keySet()
        Set keysEntries = myHashTable.keySet();
        System.out.println("Valores en keysEntries: " + keysEntries);
        // output: "Valores en keysEntries: [Valor 4, Valor 3, Valor 2, Valor 1]"
        

        // Metodo merge()
        myHashTable.merge("Valor 6", -10, (Valor1, SumaValor1) -> Valor1 + SumaValor1 );


        // ForEach()
        myHashTable2.forEach((k, v) -> {
            System.out.println("{" + k + "=" + v + "}");
        });
        // output:
        /*
            {Valor 1=1}
            {Valor 2=2}
            {Valor 3=3}
        */

        // Metodo equals()
        System.out.println("Es \"myHashTable\" igual a \"myHashTable2\"? " + myHashTable.equals(myHashTable2));
        // output: "Es "myHashTable" igual a "myHashTable2"?  false"


        // Metodo isEmpty()
        System.out.println("El hashtable esta vacio? " + myHashTable.isEmpty());
        // output: "El hashtable esta vacio? false"


        // Metodo keys()
        Enumeration<String> enumsKeys = myHashTable.keys();
        while ( enumsKeys.hasMoreElements() ) {

            System.out.print(enumsKeys.nextElement() + " ");

        }
        // output: "Valor 6 Valor 4 Valor 3 Valor 2 Valor 1"
        System.out.println("");


        // Metodo remove()
        myHashTable.remove("Valor 3");
        // ! Elimina la key si su valor es el declarado (3)
        myHashTable.remove("Valor 3", 3);


        // Metodo replace()
        myHashTable.replace("Valor 3", 30);
        // ! Reemplaza el valor la key si su valor es el declarado (3)
        myHashTable.replace("Valor 3", 3, 30);


        // Metodo replaceAll()
        myHashTable.replaceAll((k, v) -> v * 20);


        // Metodo toString()
        System.out.println("myHashTable: " + myHashTable.toString());
        

        // Metodo clear()
        myHashTable.clear();
        // output: "myHashTable: {Valor 6=-200, Valor 4=320, Valor 2=80, Valor 1=500}"

        
        // Metodo values()
        Collection<Integer> valuesCollection = myHashTable.values();

        
        // Metodo size()
        System.out.println("El tamano del hashtable es de " + myHashTable.size());
        // output: "El tamano del hashtable es de 0"

    }

}