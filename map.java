import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;

public class map {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        Map<String, Integer> myMap2 = new HashMap<>();


        // put
        myMap.put("Valor 1", 1);
        myMap.put("Valor 2", 2);
        myMap.put("Valor 3", 3);


        // get
        System.out.println("Valor de la key1: " + myMap.get("Valor 1"));


        // getOrDefault
        System.out.println("Valor en posicion key5: " + myMap.getOrDefault("Valor 5", 5));


        // hashCode
        System.out.println("HashCode del map: " + myMap.hashCode());


        // compute
        myMap.compute("Valor 2", (k, v) -> v * 2);

        
        // computeIfAbsent
        myMap.computeIfAbsent("Valor 4", k -> 4);

        
        // computeIfPresent
        myMap.computeIfPresent("Valor 4", (k, v) -> v * 4);


        // containsKey
        System.out.println("El map contiene una key \"Valor 3\"? " + myMap.containsKey("Valor 3"));
        

        // containValue
        System.out.println("El map contiene un valor 2? " + myMap.containsValue(2));


        // entrySet
        Set<Map.Entry<String, Integer>> Entries = myMap.entrySet();
        System.out.println("Valores en Entries: " + Entries);


        // equals
        System.out.println("Es \"myamp\" igual a \"mymap2\"? " + myMap.equals(myMap2));


        // ForEach
        myMap.forEach((k, v) -> {
            System.out.println("{" + k + "=" + v + "}");
        });


        // keySet
        Set keysEntries = myMap.keySet();
        System.out.println("Valores en keysEntries: " + keysEntries);
        

        // merge
        myMap.merge("Valor 2", -10, (Valor1, SumaValor1) -> Valor1 + SumaValor1 );


        // putAll
        myMap2.putAll(myMap);


        // putIfAbsent
        myMap.putIfAbsent("Valor 1", 25);


        // isEmpty
        System.out.println("El map esta vacio? " + myMap.isEmpty());


        // containsKey
        System.out.println("El map contiene la key Valor 2? " + myMap.containsKey("Valor 2"));


        // containsValue
        System.out.println("El map contiene el valor 3? " + myMap.containsValue(3));


        // size
        System.out.println("Tamaño del mapa: " + myMap.size());


        // remove
        myMap.remove("Valor 1");


        // replace
        myMap.replace("Valor 3", 30);


        // replaceAll
        myMap.replaceAll((k, v) -> v * 20);

        
        // values
        Collection<Integer> valuesCollection = myMap.values();


        // clear
        myMap.clear();
        

    }

}
