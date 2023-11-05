import java.util.Vector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collection {
    
    public static void main(String[] args) {
        
        // Crea una colacion
        Collection<Integer> myVector = new Vector<>();


        // add
        myVector.add(1);
        myVector.add(0);
        myVector.add(9);

        
        // addAll
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myVector.addAll(myArrayList);


        // clear
        myArrayList.clear();


        // contains
        System.out.println("El valor 1 esta en el vector? " + myVector.contains(1));
        // output: "El valor 1 esta en el vector? true"


        // containsAll
        System.err.println("El vector y el ArrayList contienen los mismos valores? " + myVector.containsAll(myArrayList) );
        // output: "El vector contine los mismos valores del ArrayList ? true"


        // equals
        System.out.println("El vector y el ArrayList son iguales? " + myVector.equals(myArrayList));
        // output: "El vector y el ArrayList son iguales? false"


        // hashcode
        System.out.println("Hashcode del vector: " + myVector.hashCode());
        // output: "Hashcode del vector: 916401977"


        // isEmpty
        System.out.println("El vector esta vacio? " + myVector.isEmpty() );
        // output: "El vector esta vacio? false"


        // iterator
        Iterator<Integer> iterator = myVector.iterator();
        while ( iterator.hasNext() ) {  

            System.out.print( iterator.next() + " ");  

        }  
        System.out.println("");
        // output: "1 0 9 1 2 3"

        // quede en parallel stream collection



    }

}
