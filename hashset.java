import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

public class hashset {
    public static void main(String[] args) {

        // declaro un hashset
        HashSet<String> myHashSet = new HashSet<>();


        // add
        myHashSet.add("Valor 1");
        myHashSet.add("Valor 2");
        myHashSet.add("Valor 3");


        // size
        System.out.println("El tamaño del hashset es: " + myHashSet.size());


        // contains
        System.out.println("El hashset contiene Valor 2? " + myHashSet.contains("Valor 2"));


        // clone
        Object myHashSetClone = myHashSet.clone();


        // iterator
        Iterator<String> myIt = myHashSet.iterator();

        while (myIt.hasNext()) {

            System.out.println(myIt.next() + " ");

        }

        System.out.println("\n _");


        // remove
        myHashSet.remove("Valor 2");


        // isEmpty
        System.out.println("El hashset esta vacio? " + myHashSet.isEmpty());


        // spliterator
        Spliterator<String> mySpliterator = myHashSet.spliterator() ;


        // clear
        myHashSet.clear();

    }

}
