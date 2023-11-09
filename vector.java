import java.util.Collection;
import java.util.Vector;

public class vector {
    
    public static void main(String[] args) {

        // Crea un vector
        Vector<Integer> myVector = new Vector<>();


        // metodo add()
        myVector.add(1);
        myVector.add(0);
        myVector.add(0, 9);


        // metodo addAll()
        Collection<Integer> vectorCollection = new Vector<Integer>();
        vectorCollection.add(1);
        vectorCollection.add(2);
        vectorCollection.add(3);
        myVector.addAll(vectorCollection);
        
        
        // metodo addElement()
        myVector.addElement(10);


        // metodo capacity()
        System.out.println("La capacidad del vector es: " + myVector.capacity());
        // output: "La capacidad del vector es 10"


        // metodo clone()
        Vector<Integer> myVectorClone = (Vector<Integer>) myVector.clone();
        System.out.println("El clon del vector es: " + myVectorClone);
        // output: "El clon del vector es: [9, 1, 1, 1, 2, 3, 10]"


        // metodo clear()
        myVectorClone.clear();
        

        // metodo contains()
        System.out.println("El valor 1 esta en el vector? " + myVector.contains(1));
        // output: "El valor 1 esta en el vector? true"


        // metodo containsAll()
        System.out.println("Los vectores contienen los mismos valores? " + myVector.containsAll(myVectorClone) );
        // output: "Los vectores contienen los mismos valores? true"
        

        // metodo copyInto()
        Integer[] myArray = new Integer[myVector.size()];
        myVector.copyInto(myArray);


        // metodo equals()
        System.out.println("Los vectores son iguales? " + myVector.equals(myVectorClone));
        // output: "Los vectores son iguales? false"


        // metodo firstElement()
        System.out.println("Valor en pocision inicial (index 0): " + myVector.firstElement());
        // output: "Valor en pocision inicial (index 0): 9"


        // metodo elementAt()
        System.out.println("Valor en pocision 1: " + myVector.elementAt(1));
        // output: "Valor en pocision 1: 1"


        // metodo get()
        System.out.println("Valor en pocision 1: " + myVector.get(1));
        // output: "Valor en pocision 1: 1"

        
        // metodo hashcode()
        System.out.println("Hashcode del vector: " + myVector.hashCode());
        // output: "Hashcode del vector: 927532596"


        // metodo indexOf()
        System.out.println("primera aparicion de 10 en el vector: " + myVector.indexOf(10));
        // output: "primera aparicion de 10 en el vector: 6"


        // metodo insertElementAt
        myVector.insertElementAt(100, 2);


        // metodo isEmpty()
        System.out.println("El vector esta vacio? " + myVector.isEmpty() );
        // output: "El vector esta vacio? false"
        

        // metodo lastElement
        System.out.println("ultimo valor en el vector: " + myVector.lastElement());
        // output: "ultimo valor en el vector: 10"


        // metodo lastIndexOf
        System.out.println("ultima aparicion de 10 en el vector: " + myVector.lastIndexOf(10));
        System.out.println("ultima aparicion de 10 en el vector desde 3: " + myVector.lastIndexOf(10,3));
        // output: "ultima aparicion de 10 en el vector: 7"
        // output: "ultima aparicion de 10 en el vector desde 3: -1"

        // metodo remove
        myVector.remove(4);
        

        // metodo removeAll
        myVector.removeAll(myVectorClone);
        

        // metodo removeAllElements
        myVectorClone.removeAllElements();
        

        // metodo removeElement()
        myVector.removeElement(1);


        // metodo removeElementAt()
        myVector.removeElementAt(2);


        // metodo removeRange()
        // myVector.removeRange(1, 2);


        // metodo replaceAll
        myVector.replaceAll(value ->  value * 2);


        // metodo retainAll
        myVector.retainAll(myVector);


        // metodo set()
        myVector.set(1, 23);


        // metodo setElementAt()
        myVector.setElementAt(1, 0);


        // metodo setSize()
        myVector.setSize(myVector.size() + 2);


        // metodo size()
        System.out.println("Cual es el tamaño del vector " + myVector.size());
        // output: "Cual es el tamaño del vector 7"


        // metodo subList
        System.out.println("subList del vector desde 1 a 3: " + myVector.subList(1,3));
        // output: "subList del vector desde 1 a 3: [23, 4]"


        // metodo toArray()
        Integer[] myArray2 = new Integer[myVector.size()];
        myVector.toArray(myArray2);   


        // metodo toString()
        System.out.println(myVector.toString());
        // output: "[1, 23, 4, 6, 20, null, null]"


        // metodo trimToSize
        myVector.trimToSize();

    }

}
    