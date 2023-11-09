import java.util.Random;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Deque;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.NavigableSet;

public class collection {
    
    public static void main(String[] args) {

        // collection
        
        // Crea una coleccion
        List<Integer> myVector = new Vector<>();


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
        System.out.println("_\n");
        // output: "1 0 9 1 2 3"




        // collections




        // crea varias coleciones
        Deque<String> myDeque = new LinkedList<String>();
  
        // agrega valores 
        myDeque.add("Valor A");
        myDeque.add("Valor B");
        myDeque.add("Valor C");

        // addAll
        Collections.addAll(myVector, 1, 2, 3); 


        // asLifoQueue
        Queue<String> myQueue = Collections.asLifoQueue(myDeque);


        // sort
        Collections.sort(myVector);

       iterator = myVector.iterator();
        while ( iterator.hasNext() ) {  

            System.out.print( iterator.next() + " ");  

        }  
        System.out.println("_\n");
        // output: "0 1 1 1 2 2 3 3 9"


        // binarySearch
        int binSrc = Collections.binarySearch(myVector, 2);
        System.out.println("El valor 2 esta en la posicion: " + binSrc);


        // checked
        Collection<String> myCollectionCollectionCheck = Collections.checkedCollection(myDeque,String.class); 

        Collection<Integer> myCollectionListCheck = Collections.checkedList(myArrayList, Integer.class); 
        
        Set<Integer> mySet = new HashSet<>();
        Set<Integer> mySetCheck = Collections.checkedSet(mySet, Integer.class); 

        Map<String, Integer> myMap = new HashMap<>();
        Map<String, Integer> myMapCheck= Collections.checkedMap(myMap, String.class, Integer.class); 

        NavigableMap<String, Integer> myNavigableMap = new TreeMap<>();
        NavigableMap<String, Integer> myNavigableMapCheck = Collections.checkedNavigableMap(myNavigableMap, String.class, Integer.class);

        NavigableSet<Integer> myNavigableSet = new TreeSet<>();
        NavigableSet<Integer> myNavigableSetCheck = Collections.checkedNavigableSet(myNavigableSet, Integer.class);


        // copy
        ArrayList<Integer> myArrayList2 = new ArrayList<>();
        Collections.copy(myArrayList, myArrayList );

        // empty
        Enumeration<String> myEmptyEnumeration               = Collections.emptyEnumeration();
        Iterator<String> myEmptyIterator                     = Collections.emptyIterator();
        List<String> myEmptyList                             = Collections.emptyList();
        ListIterator<String> myEmptyListIterator             = Collections.emptyListIterator();
        Map<String, Integer> myEmptyMap                      = Collections.emptyMap();
        NavigableMap<String, Integer> myEmptyNavigableMap    = Collections.emptyNavigableMap();
        NavigableSet<String> myEmptyNavigableSet             = Collections.emptyNavigableSet();
        Set<String> myEmptySet                               = Collections.emptySet();
        SortedMap<String, Integer> myEmptySortedMap          = Collections.emptySortedMap();
        SortedSet<String> myEmptySortedSet                   = Collections.emptySortedSet();



        // enumeration
        Enumeration<String> myEnum = Collections.enumeration(myQueue);  

        while(myEnum.hasMoreElements()){  

            System.out.print(myEnum.nextElement() + " ");  

        }     
        System.out.println("_\n");
        // output: " Valor A Valor B Valor C"


        // fill
        ArrayList<String> myArrayListStr = new ArrayList<String>();
        myArrayListStr.add("Valor 1");
        myArrayListStr.add("Valor 2");
        myArrayListStr.add("Valor 3");

        Collections.fill(myArrayListStr,"Valor x");  

        // frecuency
        System.out.println( "Cuantas veces aparece \"Valor 2\"? " + Collections.frequency(myArrayListStr, "Valor 2" ));
        // output: "Cuantas veces aparece "Valor 2"? 0"


        // indexOfSubList
        List<Integer> myArrayList3 = new ArrayList<>();
        myArrayList3.add(2);
        myArrayList3.add(3);

        System.out.println( "Posicion de sublista: " + Collections.indexOfSubList(myArrayList3, myArrayList) );
        // lastIndexOfSubList(List<?> source, List<?> target)
        // output: "Posicion de sublista: 0"


        // list
        List<String> listEnum = Collections.list(myEnum);

        Iterator<String> itrLst = listEnum.iterator();
        
        while (itrLst.hasNext()) {

            System.out.println(itrLst.next() + " ");
        }


        // max
        System.out.println("Valor maximo es: " + Collections.max(myVector));
        // max(Collection<? extends T> coll, Comparator<? super T> comp)
        // output: "Valor maximo es: 9"


        // min
        System.out.println("Valor minimo es: " + Collections.min(myVector));
        // min(Collection<? extends T> coll, Comparator<? super T> comp)
        // output: "Valor minimo es: 0"


        // nCopies
        List<String> lstCopies = Collections.nCopies(5, "Copia");
        System.out.println("Lista de copias : " + lstCopies);


        // newSetFromMap
        Map<String, Boolean> map = new HashMap<>();
        Set<String> myMapSet = Collections.newSetFromMap(map);


        // replaceAll
        Collections.replaceAll(myVector, 0, 6);
        System.out.println("Nuevos valores del vector : " + myVector);


        myArrayListStr.add("Valor 3");


        // reverse
        Collections.reverse(myArrayListStr);
        System.out.println("myArrayListStr invertida : " + myArrayListStr);


        // reverseOrder
        Comparator<String> reverseComparator = Collections.reverseOrder();


        // reverseOrder
        Comparator<Integer> customComparator = (a, b) -> b.compareTo(a);
        Comparator<Integer> reversedComparator = Collections.reverseOrder(customComparator);


        // rotate
        Collections.rotate(myArrayListStr, 2);
        System.out.println("myArrayListStr movido por 2 pasos: " + myArrayListStr);


        // shuffle
        Collections.shuffle(myArrayListStr);
        System.out.println("myArrayListStr desordenada: " + myArrayListStr);


        // shuffle
        Collections.shuffle(myArrayListStr, new Random());
        System.out.println("myArrayListStr con un Random : " + myArrayListStr);


        // singleton
        Set<String> singletonSet = Collections.singleton("Valor x");


        // singletonList
        List<Integer> singletonList = Collections.singletonList(0);


        // singletonMap
        Map<String, Integer> singletonMap = Collections.singletonMap("key", 0);


        // sort
        Collections.sort(myArrayList);
        System.out.println("myArrayList ordenada: " + myArrayList);
        // sort(List<T> list, Comparator<? super T> c)


        // swap
        Collections.swap(myArrayListStr, 1, 2);
        System.out.println("swap : " + myArrayListStr);


        // synched
        List<Integer> myNewCollection = new ArrayList<>();
        Set<String> myNewSet = new HashSet<>();
        Map<String, Integer> myNewMap = new HashMap<>();
        NavigableMap<String, Integer> myNewNavigableMap = new TreeMap<>();
        NavigableSet<String> myNewNavigableSet = new TreeSet<>();
        SortedMap<String, Integer> myNewSortedMap = new TreeMap<>();
        SortedSet<String> myNewSortedSet = new TreeSet<>();

        Collection<Integer> mySynchronizedCollection = Collections.synchronizedCollection(myNewCollection);
        List<String> mySynchronizedList = Collections.synchronizedList(new ArrayList<>(myNewSet));
        Map<String, Integer> mySynchronizedMap = Collections.synchronizedMap(myNewMap);
        NavigableMap<String, Integer> mySynchronizedNavigableMap = Collections.synchronizedNavigableMap(myNewNavigableMap);
        NavigableSet<String> mySynchronizedNavigableSet = Collections.synchronizedNavigableSet(myNewNavigableSet);
        SortedMap<String, Integer> mySynchronizedSortedMap = Collections.synchronizedSortedMap(myNewSortedMap);
        SortedSet<String> mySynchronizedSortedSet = Collections.synchronizedSortedSet(myNewSortedSet);

        // unmodifiable
        Collection<Integer> myUnmodifiableCollection = Collections.unmodifiableCollection(myNewCollection);
        List<String> myUnmodifiableList = Collections.unmodifiableList(new ArrayList<>(myNewSet));
        Map<String, Integer> myUnmodifiableMap = Collections.unmodifiableMap(myNewMap);
        NavigableMap<String, Integer> myUnmodifiableNavigableMap = Collections.unmodifiableNavigableMap(myNewNavigableMap);
        NavigableSet<String> myUnmodifiableNavigableSet = Collections.unmodifiableNavigableSet(myNewNavigableSet);
        SortedMap<String, Integer> myUnmodifiableSortedMap = Collections.unmodifiableSortedMap(myNewSortedMap);
        SortedSet<String> myUnmodifiableSortedSet = Collections.unmodifiableSortedSet(myNewSortedSet);

    }

}
