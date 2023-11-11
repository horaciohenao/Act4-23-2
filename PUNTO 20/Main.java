import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        
        // Escribir una clase cualquiera y crear al menos 5 objetos y por cada un de las clase colecciones (List, Set, Map, Stack Queue) 
        List<Object> myList = new ArrayList<>();
        Set<Object> mySet = new HashSet<>();
        Map<Object, Integer> myMap = new HashMap<>();
        Stack<String> myStack = new Stack<>();
        Queue<String> myQueue = new LinkedList<>();

        // 1.Agregar objetos
        myList.add("Valor 1");
        myList.add("Valor 2");
        myList.add("Valor 3");
        myList.add("Valor 4");
        myList.add("Valor 5");
        
        mySet.add("Valor 1");
        mySet.add("Valor 2");
        mySet.add("Valor 3");
        mySet.add("Valor 4");
        mySet.add("Valor 5");
        
        myMap.put("Valor 1", 1);
        myMap.put("Valor 2", 2);
        myMap.put("Valor 3", 3);
        myMap.put("Valor 4", 4);
        myMap.put("Valor 5", 5);

        myStack.push("Valor 1");
        myStack.push("Valor 2");
        myStack.push("Valor 3");
        myStack.push("Valor 4");
        myStack.push("Valor 5");

        myQueue.add("Valor 1");
        myQueue.add("Valor 2");
        myQueue.add("Valor 3");
        myQueue.add("Valor 4");
        myQueue.add("Valor 5");


        // 2.Buscar objetos
        System.out.println("Valor1 esta en que posicion de la lista? " + myList.indexOf("Valor 1") );
        List<Object> myLstSet = new ArrayList<>(mySet);
        System.out.println("Valor1 esta en que posicion del set? " +  myLstSet.indexOf("Valor 1") );
        List<Object> myLstMap = new ArrayList<>(myMap.values());
        System.out.println("Valor1 esta en que posicion del map? " + myLstMap.indexOf("Valor 1") );
        List<Object> myLstStack = new ArrayList<>(myStack);
        System.out.println("Valor1 esta en que posicion del stack? " + myStack.indexOf("Valor 1") );
        List<Object> myLstQue = new ArrayList<>(myQueue);
        System.out.println("Valor1 esta en que posicion del queue? " + myLstQue.indexOf("Valor 1") );

        
        // 3.Insertar Objetos
        myList.add("Valor 6");
        mySet.add("Valor 6");
        myMap.put("Valor 6",6);
        myStack.push("Valor 6");
        myQueue.add("Valor 6");


        // 4.Eliminar objetos
        myList.remove("Valor 6");
        mySet.remove("Valor 6");
        myMap.remove("Valor 6",6);
        myStack.remove("Valor 6");
        myQueue.remove("Valor 6");


        // 5.Saber si un objeto existe 
        System.out.println("Valor1 existe en la lista? " + myList.contains("Valor 1") );
        System.out.println("Valor1 existe en el set? " + mySet.contains("Valor 1") );
        System.out.println("Valor1 existe en el map? " + myMap.containsKey("Valor 1") );
        System.out.println("Valor1 existe en el stack? " + myStack.search("Valor 1") );
        System.out.println("Valor1 existe en el queue? " + myQueue.contains("Valor 1") );


        // b.Recorrer un objeto de tipo List usando for traditional, foreach, while y do/while 
        System.out.println(" === BUCLE FOR === ");

        for (int i = 0; i < myList.size(); i++) {
            System.out.println("myList en la posicion  " + i + ": " + myList.get(i) );
        }


        System.out.println(" === BUCLE FOREACH 1 === ");
        int index = 0;
        for (Object objectValue : myList) {
            System.out.println("myList en la posicion " + index + ": " + objectValue );
            index++;
        }
        

        System.out.println(" === BUCLE FOREACH 2=== ");
        System.out.print("myList: ");
        myList.forEach( (k) ->  System.out.print(k + " ") );
        System.out.println("_");


        System.out.println(" === BUCLE WHILE=== ");
        System.out.print("myList: ");
        Iterator<Object> myItList = myList.iterator();
        while (myItList.hasNext()) {
            System.out.print(myItList.next() + " ");
        }
        System.out.println("_");


        System.out.println(" === BUCLE WHILE DO=== ");
        System.out.print("myList: ");
        Iterator<Object> myNewItList = myList.iterator();
        do {
            System.out.print(myNewItList.next() + " ");
        } while (myNewItList.hasNext());
        System.out.println("_");


        // c.Ordenar objetos en una lista 
        Comparator<Object> myComparator = Comparator.comparing(Object::toString);
        Collections.sort(myList, myComparator);


        // d.Recorrer un objeto de tipo Set usando for traditional, foreach, while y do/while
        System.out.println(" === BUCLE FOR === ");

        for (int i = 0; i < mySet.size(); i++) {
            System.out.println("mySet en la posicion  " + i + ": " + myLstSet.get(i) );
        }


        System.out.println(" === BUCLE FOREACH 1 === ");
        index = 0;
        for (Object objectValue : mySet) {
            System.out.println("mySet en la posicion " + index + ": " + objectValue );
            index++;
        }
        

        System.out.println(" === BUCLE FOREACH 2=== ");
        System.out.print("mySet: ");
        mySet.forEach( (k) ->  System.out.print(k + " ") );
        System.out.println("_");


        System.out.println(" === BUCLE WHILE=== ");
        System.out.print("myList: ");
        Iterator<Object> myItSet = mySet.iterator();
        while (myItSet.hasNext()) {
            System.out.print(myItSet.next() + " ");
        }
        System.out.println("_");


        System.out.println(" === BUCLE WHILE DO=== ");
        System.out.print("myList: ");
        Iterator<Object> myNewItSet = mySet.iterator();
        do {
            System.out.print(myNewItSet.next() + " ");
        } while (myNewItSet.hasNext());
        System.out.println("_");

        // e.Recorrer un objeto de tipo Map usando for traditional, foreach, while y do/while
        System.out.println(" === BUCLE FOR === ");

        for (int i = 0; i < myMap.size(); i++) {
            System.out.println("myMap en la posicion  " + i + ": " + myMap.get(i) );
        }


        System.out.println(" === BUCLE FOREACH 1 === ");
        index = 0;
        for (Map.Entry<Object, Integer> objectValue : myMap.entrySet()) {
            System.out.println("myMap en la posicion " + index + ": " + objectValue );
            index++;
        }
        

        System.out.println(" === BUCLE FOREACH 2=== ");
        System.out.print("myMap: ");
        myMap.forEach( (k, v) ->  System.out.print(k + ", " + v + "\n") );
        System.out.println("_");


        System.out.println(" === BUCLE WHILE=== ");
        System.out.print("myMap: ");
        Iterator<Map.Entry<Object, Integer>> myItMap = myMap.entrySet().iterator();
        while (myItMap.hasNext()) {
            System.out.print(myItMap.next() + " ");
        }
        System.out.println("_");


        System.out.println(" === BUCLE WHILE DO=== ");
        System.out.print("myMap: ");
        Iterator<Map.Entry<Object, Integer>> myNewItMap = myMap.entrySet().iterator();
        do {
            System.out.print(myNewItMap.next() + " ");
        } while (myNewItMap.hasNext());
        System.out.println("_");


        // f. Recorrer un objeto de tipo List usando stream
        myList.stream().forEach(element -> System.out.println(element));


        // g. Recorrer un objeto de tipo Set usando stream
        mySet.stream().forEach(element -> System.out.println(element));


        // h. Recorrer un objeto de tipo Map usando stream
        myMap.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        // i. Recorrer un objeto de tipo List usando una función flecha o función lambda
        myList.forEach(element -> System.out.println(element));


        // j. Recorrer un objeto de tipo Set usando una función flecha o función lambda
        mySet.forEach(element -> System.out.println(element));


        // k. Recorrer un objeto de tipo Map usando una función flecha o función lambda
        myMap.forEach((key, value) -> System.out.println(key + ": " + value));

        
        // l. Convertir un array en un objeto List
        String[] myArray = {"Valor 1", "Valor 2", "Valor 3"};
        List<String> myLstArr = Arrays.asList(myArray);


        // m. Convertir un objeto List a un array
        String[] myNewArray = new String[myLstArr.size()];
        myLstArr.toArray(myNewArray);


        // Crear dos listas para demostración
        List<String> list1 = Arrays.asList("1", "2", "3");
        List<String> list2 = Arrays.asList("4", "5", "6");


        // n. Dos formas de unir dos listas en una sola
        
        // addAll
        List<String> newList1 = new ArrayList<>();
        newList1.addAll(list1);
        newList1.addAll(list2);

        // for
        List<String> newList2 = new ArrayList<>();
        for (String elem : list1) {
            newList2.add(elem);
        }
        for (String elem : list2) {
            newList2.add(elem);
        }

        // o. Desordenar una Lista
        Collections.shuffle(myList);
        

    }
    
}
