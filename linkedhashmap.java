import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmap {

    public static void main(String[] args) {

        // declarar un linkedhashmap
        LinkedHashMap<String, Integer> myLinkedHashMap = new LinkedHashMap<>();


        // put
        myLinkedHashMap.put("Uno", 1);
        myLinkedHashMap.put("Dos", 2);
        myLinkedHashMap.put("Tres", 3);
        myLinkedHashMap.put("Cuatro", 4);


        // containsValue
        System.out.println("El lhm contiene el valor 3? " + myLinkedHashMap.containsValue(3));


        // entrySet
        Set<Map.Entry<String, Integer>> entrySet = myLinkedHashMap.entrySet();


        // forEach
        myLinkedHashMap.forEach((key, value) -> System.out.println("Clave: " + key + ", Valor: " + value));


        // get
        System.out.println("Valor en la key \"Cinco\": " + myLinkedHashMap.get("Cinco"));


        // getOrDefault
        System.out.println("Valor en posicion \"Seis\": " + myLinkedHashMap.getOrDefault("Seis", 6));


        // keySet
        Set<String> keySet = myLinkedHashMap.keySet();


        // values
        Collection<Integer> values = myLinkedHashMap.values();
        

        // replaceAll 
        myLinkedHashMap.replaceAll((key, value) -> value + 10);


        // removeEldestEntry
        myLinkedHashMap.put("Cuatro", 14);


        // clear
        myLinkedHashMap.clear();


    }

}
