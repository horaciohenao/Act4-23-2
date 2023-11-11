import java.util.TreeMap;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Set;

public class treemap {

    public static void main(String[] args) {


        // declarar un treemap
        TreeMap<Integer, String> myTreeMap = new TreeMap<>();


        // put
        myTreeMap.put(1, "Uno");
        myTreeMap.put(2, "Dos");
        myTreeMap.put(3, "Tres");
        myTreeMap.put(4, "Cuatro");


        // ceilingEntry
        System.out.println("Entry más cercana a 3 en el treemap: " + myTreeMap.ceilingEntry(3));


        // ceilingKey
        System.out.println(" ceilingKey(3): " + myTreeMap.ceilingKey(3));


        // clear
        myTreeMap.clear();


        // clone
        TreeMap<Integer, String> clonedMap = (TreeMap<Integer, String>) myTreeMap.clone();


        // containsKey
        System.out.println("El treemap contiene una key \"Valor 3\"? " + myTreeMap.containsKey("Valor 3"));
        

        // containValue
        System.out.println("El treemap contiene un valor 2? " + myTreeMap.containsValue(2));


        // comparator
        Comparator<? super Integer> comparator = myTreeMap.comparator();


        // descendingKeySet
        Set keysEntries = myTreeMap.descendingKeySet();


        // descendingMap
        Map<Integer, String> myMap = myTreeMap.descendingMap();


        // entrySet
        Set<Map.Entry<Integer, String>> Entries = myTreeMap.entrySet();


        // firstEntry
        System.out.println("La primera entry del treemap es: " +  myTreeMap.firstEntry());


        // firstKey
        System.out.println("La primera key del treemap es: " +  myTreeMap.firstKey());


        // floorEntry
        System.out.println("Entry menos cercana o igual a 3 en el TreeMap: " + myTreeMap.floorEntry(3));


        // floorKey
        System.out.println("La clave menor o igual a 3 es: " + myTreeMap.floorKey(3));


        // forEach
        myTreeMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));


        // get
        System.out.println("Valor en la key 2: " + myTreeMap.get(2));


        // headMap
        System.out.println("Headmap desde el inicio hasta la key 3 : " + myTreeMap.headMap(3));


        // higherEntry
        System.out.println("Entry mayor a la key 2: " + myTreeMap.higherEntry(2));


        // higherKey
        System.out.println("La key mayor o igual a 2 es: " + myTreeMap.higherKey(2));


        // keySet
        Set<Integer> keySet = myTreeMap.keySet();


        // lastEntry
        System.out.println("La ultima entry del treemap es: " + myTreeMap.lastEntry());


        // lastKey
        System.out.println("La ultima key del treemap es: " + myTreeMap.lastKey());


        // lowerEntry
        System.out.println("Entry menor a la key 3: " + myTreeMap.lowerEntry(3));

        // lowerKey
        System.out.println("La key menor o igual a 3: " + myTreeMap.lowerKey(3));


        // navigableKeySet
        NavigableSet<Integer> navigableKeySet = myTreeMap.navigableKeySet();


        // pollFirstEntry
        myTreeMap.pollFirstEntry();


        // pollLastEntry
        myTreeMap.pollLastEntry();


        // putAll
        HashMap<Integer, String> myMap2 = new HashMap<>();

        myMap2.put(5, "Cinco");
        myMap2.put(6, "Seis");

        myTreeMap.putAll(myMap2);


        // remove
        myTreeMap.remove(2);
        

        // replace
        myTreeMap.replace(1, "X");
        

        // replaceAll
        myTreeMap.replaceAll((key, value) -> value.toUpperCase());
        

        // size
        System.out.println("El tamaño del treemap es: " + myTreeMap.size());


        // subMap
        Map<Integer, String> mySubMap = myTreeMap.subMap(1, 3 );


        // tailMap
        Map<Integer, String> myTailMap = myTreeMap.tailMap(2);
        

        // values
        Collection<String> values = myTreeMap.values();
        System.out.println("Values del treemap: " + values);
        

        // clear
        myTreeMap.clear();

    }

}
