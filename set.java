import java.util.Set;
import java.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;

public class set {

    public static void main(String[] args) {

        // declarar un set
        Set<String> mySet = new HashSet<>();


        // add
        mySet.add("Valor 1");
        mySet.add("Valor 2");
        mySet.add("Valor 3");
        

        // addAll
        Set<String> myNewSet = new HashSet<>();
        myNewSet.add("Valor 5");
        myNewSet.add("Valor 6");
        mySet.addAll(myNewSet);


        // clear
        myNewSet.clear();


        // contains
        System.out.println("El set contiene \"Valor\"? " + mySet.contains("Valor") );

        
        // containsAll
        Set<String> mySet2 = new HashSet<>();
        mySet2.add("Valor 1");
        mySet2.add("Valor 2");
        System.out.println("El set contiene el set 2? " + mySet.containsAll(mySet2));


        // equals
        System.out.println("El set es igual al set2? " + mySet.equals(mySet2));


        // hashcode
        System.out.println("El hashcode del set es: " + mySet.hashCode() );


        // isEmpty
        System.out.println("¿El set está vacío? " + mySet.isEmpty());


        // iterator
        Iterator<String> myIt = mySet.iterator();

        while (myIt.hasNext()) {

            System.out.print(myIt.next() + " ");

        }

        System.out.println("_\n");


        // remove
        mySet.remove("Valor 2");


        // removeAll
        mySet.removeAll(mySet2);


        // retainAll
        mySet.retainAll(mySet2);


        // size
        System.out.println("¿Cuál es el tamaño del set? " + mySet.size());
        

        // spliterator
        Spliterator<String> spliterator = mySet.spliterator();


        // toArray
        String[] myArrString = new String[mySet.size()];
        mySet.toArray(myArrString);


    }

}
