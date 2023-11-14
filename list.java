import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.Comparator;

public class list {

    public static void main(String[] args) {

        // Crear una lista
        List<String> myList = new ArrayList<>();


        // add
        myList.add("Valor 1");
        myList.add("Valor 3");
        myList.add(1, "Valor 2");


        // addAll
        List<String> myNewList = new ArrayList<>();
        myNewList.add("Valor 2.1");
        myNewList.add("Valor 2.2");
        myList.addAll(myNewList);


        // contains
        System.out.println("El valor 1 esta en la lista? " + myList.contains("Valor 1"));
        // 


        // containsAll
        List<String> myNewList2 = new ArrayList<>();
        myNewList2.add("Valor 1");
        myNewList2.add("Valor 2");
        System.out.println("La lista contienen los valores de myNewList2 ? " + myList.containsAll(myNewList2) );
        

        // equals
        System.out.println("Las listas son iguales? " + myList.equals(myNewList));


        // get
        System.out.println("Valor en pocision 1: " + myList.get(1));

        
        // hashcode
        System.out.println("Hashcode de la lista: " + myList.hashCode());


        // indexOf
        System.out.println("primera aparicion de Valor 1 en la lista: " + myList.indexOf("Valor 1"));


        // isEmpty
        System.out.println("La lista esta vacia? " + myList.isEmpty() );


        // iterator
        Iterator<String> myIt = myList.iterator();

        while (myIt.hasNext()) {

            System.out.print(myIt.next() + " ");

        }

        System.out.println("_\n");


        // metodo lastIndexOf
        System.out.println("ultima aparicion de 10 en la lista: " + myList.lastIndexOf(10));
        

        // listIterator
        ListIterator<String> myLstIt = myList.listIterator();

        while (myLstIt.hasNext()) {

            System.out.print(myLstIt.next() + " ");

        }

        System.out.println("_\n");


        // remove
        myList.remove(0);


        // remove
        myList.remove("Valor 2");


        // removeAll
        myList.removeAll(myNewList2);


        // replaceAll
        myList.replaceAll(s -> s.toUpperCase());


        // retainAll
        // myList.retainAll(myNewList2);


        // set
        myList.set(0, "Valor x");


        // size
        System.out.println("Cual es el tamaño de la lista? " + myList.size());


        // sort
        myList.sort(Comparator.reverseOrder());


        // spliterator
        Spliterator<String> spliterator = myList.spliterator();


        // subList
        System.out.println("subList de la lista desde 1 a 3: " + myList.subList(1,3));


        //toArray
        String[] myArray2 = new String[myList.size()];
        myList.toArray(myArray2);
        

        // clear
        myList.clear();
        

    }
    
}
