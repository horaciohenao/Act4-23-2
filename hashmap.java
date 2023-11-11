import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class hashmap {

    public static void main(String[] args) {

        // declara varios hashmap
        HashMap<String, Integer> myHashMap = new HashMap<>();
        HashMap<String, Integer> myHashMap2 = new HashMap<>();

        // put
        myHashMap.put("Valor 1", 1);
        myHashMap.put("Valor 2", 2);
        myHashMap.put("Valor 3", 3);


        // get
        System.out.println("Valor de la key1: " + myHashMap.get("Valor 1"));


        // clone
        Object myHashMapclone = myHashMap.clone();


        // getOrDefault
        System.out.println("Valor en posicion key5: " + myHashMap.getOrDefault("Valor 5", 5));


        // compute
        myHashMap.compute("Valor 2", (k, v) -> v * 2);


        // computeIfAbsent
        myHashMap.computeIfAbsent("Valor 4", k -> 4);


        // computeIfPresent
        myHashMap.computeIfPresent("Valor 4", (k, v) -> v * 4);


        // containsKey
        System.out.println("El map contiene una key \"Valor 3\"? " + myHashMap.containsKey("Valor 3"));

        // containValue
        System.out.println("El map contiene un valor 2? " + myHashMap.containsValue(16));


        // entrySet
        Set<Map.Entry<String, Integer>> Entries = myHashMap.entrySet();
        System.out.println("Valores en Entries: " + Entries);


        // ForEach
        myHashMap.forEach((k, v) -> {
            System.out.println("{" + k + "=" + v + "}");
        });


        // keySet
        Set keysEntries = myHashMap.keySet();
        System.out.println("Valores en keysEntries: " + keysEntries);


        // merge
        myHashMap.merge("Valor 2", -10, (Valor1, SumaValor1) -> Valor1 + SumaValor1 );


        // putAll
        myHashMap2.putAll(myHashMap);


        // putIfAbsent
        myHashMap.putIfAbsent("Valor 1", 25);


        // isEmpty
        System.out.println("El map esta vacio? " + myHashMap.isEmpty());


        // size
        System.out.println("Tamaño del mapa: " + myHashMap.size());


        // remove
        myHashMap.remove("Valor 1");


        // replace
        myHashMap.replace("Valor 3", 30);


        // replaceAll
        myHashMap.replaceAll((k, v) -> v * 20);


        // values
        Collection<Integer> valuesCollection = myHashMap.values();


        // clear
        myHashMap.clear();

    }

}
