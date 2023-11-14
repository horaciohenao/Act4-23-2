import java.util.LinkedList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Spliterator;

public class linkedlist {

    public static void main(String[] args) {


        // declara un linkedlist
        LinkedList<String> myLnkList = new LinkedList<>();



        // add
        myLnkList.add("Valor 1");
        myLnkList.add("Valor 3");
        myLnkList.add(1, "Valor 2");



        // addAll
        Collection<String> myNewLnkList = new LinkedList<>();
        myNewLnkList.add("Valor 1");
        myNewLnkList.add("Valor 2");
        myLnkList.addAll(myNewLnkList);



        // addFirst
        myLnkList.addFirst("Primer Valor");



        // addLast
        myLnkList.addLast("Ultimo Valor");


        // clear
        // myLnkList.clear(); 


        // clone
        Object myClonedLnkList = myLnkList.clone(); 
        

        // cointains
        System.out.println("La lista contiene \"Valor\"? " + myLnkList.contains("Valor") );


        // descendingIterator
        Iterator<String> myDescIt = myLnkList.descendingIterator(); 

        while (myDescIt.hasNext()) {

            System.out.print(myDescIt.next() + " ");

        }

        System.out.println("_\n");


        // element
        System.out.println("El primer elemento de la lista es " + myLnkList.element()); 


        // get
        System.out.println("El valor 3 en la lista es: " + myLnkList.get(3));


        // getFirst
        System.out.println("El primer valor en la lista es: " + myLnkList.getFirst());


        // getLast
        System.out.println("El ultimo valor en la lista es: " + myLnkList.getLast());


        // indexOf
        System.out.println("primera aparicion de Valor 1 en la lista: " + myLnkList.indexOf("Valor"));


        // lastIndexOf
        System.out.println("ultima aparicion de Valor 1 en la lista: " + myLnkList.lastIndexOf("Valor"));


        // listIterator
        ListIterator<String> myLnkLstIt = myLnkList.listIterator(2); 

        while (myLnkLstIt.hasNext()) {

            System.out.print(myLnkLstIt.next() + " ");

        }

        System.out.println("_\n");

        
        // offer
        myLnkList.offer("Nuevo Valor");
        

        // offerFirst
        myLnkList.offerFirst("Primer Valor");
        

        // offerLast
        myLnkList.offerLast("Ultimo Valor");


        // peek
        System.out.println( "Primer valor de la lista: " + myLnkList.peek() );
        
        
        // peekFirst
        System.out.println( "Primer valor de la lista: " + myLnkList.peekFirst() );
        
        
        // peekLast
        System.out.println( "Ultimo valor de la lista: " + myLnkList.peekLast() );
        
        
        // poll
        System.out.println( "Primer valor de la lista: " + myLnkList.poll() );
        
        
        // pollFirst
        System.out.println( "Primer valor de la lista: " + myLnkList.pollFirst() );
        
        
        // pollLast
        System.out.println( "Ultimo valor de la lista: " + myLnkList.pollLast() );
        
        
        // pop
        myLnkList.pop(); 


        // push
        myLnkList.push("Valor pusheado"); 


        // remove
        myLnkList.remove(); 


        // remove
        myLnkList.remove(2); 


        // removeFirst
        myLnkList.removeFirst(); 


        // removeFirstOccurrence
        myLnkList.removeFirstOccurrence("Valor"); 


        // removeLast
        myLnkList.removeLast(); 


        // removeLastOccurrence
        myLnkList.removeLastOccurrence("Valor"); 


        // set
        myLnkList.set(0, "Nuevo Valor"); 


        // size
        System.out.println("Cual es el tamaño de la lista? " + myLnkList.size());


        // spliterator
        Spliterator<String> spliterator = myLnkList.spliterator(); 


        // toArray
        String[] myArrString = new String[myLnkList.size()];
        myLnkList.toArray(myArrString);


    }
}
