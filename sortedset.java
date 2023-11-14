import java.util.SortedSet;
import java.util.TreeSet;

public class sortedset {

    public static void main(String[] args) {

        // declara un sortedset
        SortedSet<String> mySortedSet = new TreeSet<>();

        // agrega valores
        mySortedSet.add("Valor 1");
        mySortedSet.add("Valor 2");
        mySortedSet.add("Valor 3");


        // comparator
        System.out.println("El sortedSet comparado es: " + mySortedSet.comparator());     


        // first
        System.out.println("Primer elemento del sortedset: " + mySortedSet.first());


        // last
        System.out.println("Ultimo elemento del sortedset: " + mySortedSet.last());


        // headset
        System.out.println("Valores menores a Valor 2: " + mySortedSet.headSet("Valor 2"));


        // spliterator
        Spliterator<String> spliterator = mySortedSet.spliterator(); 


        // subset
        System.out.println("Valores menores a Valor 1 y Valor 3: " + mySortedSet.subSet("Valor 1", "Valor 3"));


        // tailset
        System.out.println("Valores mayores a Valor 2: " + mySortedSet.tailSet("Valor 2"));

    }

}
