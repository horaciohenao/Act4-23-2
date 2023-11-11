import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Comparator;
import java.util.Iterator;

public class arraylist {

    public static void main(String[] args) {

        // Crear un ArrayList 
        ArrayList<String> myArrList = new ArrayList<>();
        ArrayList<String> myArrListAdded = new ArrayList<>();


        // add
        myArrList.add("Valor 1");
        myArrList.add("Valor 3");
        myArrList.add(1, "Valor 2");


        // addAll
        myArrListAdded.addAll(myArrList);


        // clear
        myArrListAdded.clear();


        // clone
        Object myArrListClone = myArrList.clone();


        // contais
        System.out.println("¿La lista contiene Valor x? " + myArrList.contains("Valor x"));


        // ensureCapacity
        myArrList.ensureCapacity(5);


        // forEach
        myArrList.forEach((s) -> System.out.println(s));


        // indexOf
        System.out.println("primera aparicion de Valor 1 en la lista: " + myArrList.indexOf("Valor 1"));


        // iterator
        Iterator<String> myIt = myArrList.iterator();

        while (myIt.hasNext()) {

            System.out.print(myIt.next() + " ");

        }

        System.out.println("_\n");


        // indexOf
        System.out.println("primera aparicion de Valor 1 en la lista: " + myArrList.indexOf("Valor 1"));


        // listIterator
        ListIterator<String> myLstIt = myArrList.listIterator();

        while (myLstIt.hasNext()) {

            System.out.print(myIt.next() + " ");

        }

        System.out.println("_\n");


        // remove
        myArrList.remove("Valor 3");


        // removeAll
        myArrList.removeAll(myArrListAdded);


        // removeIf
        myArrList.removeIf(element -> element.contains("x"));


        // replaceAll
        myArrList.replaceAll(s -> s.toUpperCase());


        // set
        myArrList.set(0, "Valor x");


        // size
        System.out.println("Cual es el tamaño de la lista? " + myArrList.size());


        // isEmpty
        System.out.println("La lista esta vacia? " + myArrList.isEmpty());

        
        // get
        System.out.println("Elemento en la posicion 2: " + myArrList.get(2));


        // sort
        myArrList.sort(Comparator.reverseOrder());


        // spliterator
        Spliterator<String> spliterator = myArrList.spliterator();


        // sublist
        System.out.println("Sublista de 1 a 3: " + myArrList.subList(1, 3));


        // toArray
        String[] myArrString = new String[myArrList.size()];
        myArrList.toArray(myArrString);


        // trimtosize
        myArrList.trimToSize();


    }

}
