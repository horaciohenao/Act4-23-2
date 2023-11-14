import java.util.Spliterator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Vector;
import java.util.Set;

public class treeset {

    public static void main(String[] args) {


        // declara un treeset
        TreeSet<Integer> myTreeSet = new TreeSet<>();


        // add
        myTreeSet.add(1);
        myTreeSet.add(2);
        myTreeSet.add(3);
        myTreeSet.add(4);
        myTreeSet.add(5);


        // addAll
        Vector<Integer> myVector = new Vector<>();

        myVector.add(1);
        myVector.add(2);
        myVector.add(3);

        myTreeSet.addAll(myVector);


        // clone
        Object myTreeSetclone = myTreeSet.clone();


        // contains
        System.out.println("El hashset contiene Valor 2? " + myTreeSet.contains( 2));


        // comparator
        System.out.println("El sortedSet comparado es: " + myTreeSet.comparator());     


        // descendingIterator
        Iterator<Integer> myDscIt = myTreeSet.descendingIterator();

        while (myDscIt.hasNext()) {

            System.out.println(myDscIt.next() + " ");

        }

        System.out.println("\n _");


        // descendingSet
        Set<Integer> descendingSet = myTreeSet.descendingSet();


        // iterator
        Iterator<Integer> myIt = myTreeSet.iterator();

        while (myIt.hasNext()) {

            System.out.println(myIt.next() + " ");

        }

        System.out.println("\n _");


        // ceiling
        System.out.println("Elemento mayor o igual a 4 del treeset " + myTreeSet.ceiling(4));


        // floor
        System.out.println("Elemento menor o igual a 4 del treeset " + myTreeSet.floor(4));


        // higher
        System.out.println("Elemento mayor a 4 del treeset " + myTreeSet.higher(4));


        // headset
        System.out.println("Elemento menores a Valor 2: " + myTreeSet.headSet(4));


        // lower
        System.out.println("Elemento menor a 4 del treeset " + myTreeSet.lower(4));


        // first
        System.out.println("Elemento más bajo del treeset: " + myTreeSet.first());


        // last
        System.out.println("Elemento más alto del treeset: " + myTreeSet.last());


        // pollFirst
        myTreeSet.pollFirst();


        // pollLast
        myTreeSet.pollLast();


        // remove
        myTreeSet.remove(3);


        // size
        System.out.println("El amaño del treeset es: " + myTreeSet.size());


        // spliterator
        Spliterator<Integer> mySpliterator = myTreeSet.spliterator(); 


        // myTreeSet
        SortedSet<Integer> mySubsetTreeSet = myTreeSet.subSet(1, 3);


        // tailSet
        SortedSet<Integer> myTailSetTreeSet = myTreeSet.tailSet(5);


        // isEmpty
        System.out.println("Treeset esta vacio? " + myTreeSet.isEmpty());


        // clear
        myTreeSet.clear();

    }

}
