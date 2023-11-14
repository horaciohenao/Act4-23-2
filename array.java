import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class array {

    public static void main(String[] args) {
        

        byte[] myArrByte = {10, 20, 30, 40, 50};
        short[] myArrShort = {100, 200, 300, 400, 500};
        int[] myArrInt = {1000, 2000, 3000, 4000, 5000};
        long[] myArrLong = {10000L, 20000L, 30000L, 40000L, 50000L};
    
        float[] myArrFloat = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        double[] myArrDouble = {1.111, 2.222, 3.333, 4.444, 5.555};
    
        char[] myArrChar = {'A', 'B', 'C', 'D', 'E'};
        String[] myArrString = {"Valor A", "Valor B", "Valor C", "Valor D", "Valor E"};
        
        Object[] myArrObject = {"Valor A", "Valor B", "Valor C", "Valor D", "Valor E"};


        // asList
        List<String> myArrLst = Arrays.asList(myArrString);


        // binarySearch para los distintos tipos de datos 
        int binSrchByte = Arrays.binarySearch(myArrByte, (byte) 30);
        System.out.println("El valor " +  (byte) 30 + " se encuntra en la posicion " + binSrchByte);
    
        int binSrchShort = Arrays.binarySearch(myArrShort, (short) 300 );
        System.out.println("El valor " +  (short) 300  + " se encuntra en la posicion " + binSrchShort);
    
        int binSrchInt = Arrays.binarySearch(myArrInt, 3000 );
        System.out.println("El valor " +  3000  + " se encuntra en la posicion " + binSrchInt);
    
        int binSrchLong = Arrays.binarySearch(myArrLong, 30000L);
        System.out.println("El valor " +  30000L + " se encuntra en la posicion " + binSrchLong);

    
        int binSrcFloat = Arrays.binarySearch(myArrFloat, (float) 5.5f );
        System.out.println("El valor " +  (float) 5.5f  + " se encuntra en la posicion " + binSrcFloat);
    
        int binSrcDouble = Arrays.binarySearch(myArrDouble, (double) 5.555 );
        System.out.println("El valor " +  (double) 5.555  + " se encuntra en la posicion " + binSrcDouble);
    
    
        int binSrcChar = Arrays.binarySearch(myArrChar, (char) 'E' );
        System.out.println("El valor " +  'E'  + " se encuntra en la posicion " + binSrcChar);
    
        int binSrcString = Arrays.binarySearch(myArrString, (String) "Valor E" );
        System.out.println("El valor " +  "Valor E"  + " se encuntra en la posicion " + binSrcString);


        // copyOf
        byte[] myArrCopyOfByte = Arrays.copyOf(myArrByte, 5);
        short[] myArrCopyOfShort = Arrays.copyOf(myArrShort, 5);
        int[] myArrCopyOfInt = Arrays.copyOf(myArrInt, 5);
        long[] myArrCopyOfLong = Arrays.copyOf(myArrLong, 5);
        float[] myArrCopyOfFloat = Arrays.copyOf(myArrFloat, 5);
        double[] myArrCopyOfDouble = Arrays.copyOf(myArrDouble, 5);
        char[] myArrCopyOfChar = Arrays.copyOf(myArrChar, 5);
        String[] myArrCopyOfString = Arrays.copyOf(myArrString, 5);


        // copyOfRange
        byte[] myArrCopyOfRangeByte = Arrays.copyOfRange(myArrByte, 2, 3);
        short[] myArrCopyORangefShort = Arrays.copyOfRange(myArrShort, 2, 3);
        int[] myArrCopyOfIRangent = Arrays.copyOfRange(myArrInt, 2, 3);
        long[] myArrCopyOfRangeLong = Arrays.copyOfRange(myArrLong, 2, 3);
        float[] myArrCopyORangefFloat = Arrays.copyOfRange(myArrFloat, 2, 3);
        double[] myArrCopyRangeOfDouble = Arrays.copyOfRange(myArrDouble, 2, 3);
        char[] myArrCopyOfRangeChar = Arrays.copyOfRange(myArrChar, 2, 3);
        String[] myArrCopyRangeOfString = Arrays.copyOfRange(myArrString, 2, 3);
        Object[] myArrCopyRangeOfObject = Arrays.copyOfRange(myArrObject, 2, 3);


        // deepEquals
        System.out.println(  "Son el array myArrByte y myArrCopyByte iguales (deepEquals)? " +   Arrays.deepEquals( myArrObject,   myArrCopyRangeOfObject) ); 


        // deepHashCode
        System.out.println("deepHashCode de myArrByte " + Arrays.deepHashCode(myArrObject));


        // deepToString
        System.out.println("Array myArrByte a deepstring : " + Arrays.deepToString(myArrObject));


        // equals
        System.out.println(  "Son el array myArrByte y myArrCopyByte iguales? " +  Arrays.equals(myArrByte, myArrCopyOfByte ) ); 
        System.out.println(  "Son el array myArrShort y myArrCopyShort iguales? " +  Arrays.equals(myArrShort, myArrCopyOfShort ) ); 
        System.out.println(  "Son el array myArrInt y myArrCopyInt iguales? " +  Arrays.equals(myArrInt, myArrCopyOfInt ) ); 
        System.out.println(  "Son el array myArrLong y myArrCopyLong iguales? " +  Arrays.equals(myArrLong, myArrCopyOfLong ) ); 
        System.out.println(  "Son el array myArrFloat y myArrCopyFloat iguales? " +  Arrays.equals(myArrFloat, myArrCopyOfFloat ) ); 
        System.out.println(  "Son el array myArrDouble y myArrCopyDouble iguales? " +  Arrays.equals(myArrDouble, myArrCopyOfDouble ) ); 
        System.out.println(  "Son el array myArrChar y myArrCopyChar iguales? " +  Arrays.equals(myArrChar, myArrCopyOfChar ) ); 
        System.out.println(  "Son el array myArrString y myArrCopyString iguales? " +  Arrays.equals(myArrString, myArrCopyOfString ) ); 
        // output: "Sonel array * y * iguales? false"


        // fill
        Arrays.fill(myArrByte, 1, 2, (byte) 0);
        Arrays.fill(myArrShort, 1, 2, (short) 0);
        Arrays.fill(myArrInt, 1, 2, 0);
        Arrays.fill(myArrLong, 1, 2, 0);

        Arrays.fill(myArrFloat, 1, 2, 0.2f);
        Arrays.fill(myArrDouble, 1, 2, 0.2 );

        Arrays.fill(myArrChar, 1, 2, 'x');
        Arrays.fill(myArrString, 1, 2, "Valor x");


        // hashcode
        System.out.println( "El hashcode de myArrByte es: " + myArrByte.hashCode());
        System.out.println( "El hashcode de myArrShort es: " + myArrShort.hashCode());
        System.out.println( "El hashcode de myArrInt es: " + myArrInt.hashCode());
        System.out.println( "El hashcode de myArrLong es: " + myArrLong.hashCode());
        System.out.println( "El hashcode de myArrFloat es: " + myArrFloat.hashCode());
        System.out.println( "El hashcode de myArrDouble es: " + myArrDouble.hashCode());
        System.out.println( "El hashcode de myArrChar es: " + myArrChar.hashCode());
        System.out.println( "El hashcode de myArrString es: " + myArrString.hashCode());


        // parallelProfix
        Arrays.parallelPrefix( myArrCopyOfInt, (x, y) -> x + y);
        Arrays.parallelPrefix( myArrCopyOfLong, (x, y) -> x + y);
        Arrays.parallelPrefix( myArrCopyOfDouble, (x, y) -> x + y);
        Arrays.parallelPrefix( myArrCopyOfString, (x, y) -> x + y);
        Arrays.parallelPrefix( myArrCopyOfDouble, (x, y) -> x + y);
        Arrays.parallelPrefix( myArrCopyOfString, (x, y) -> x + y);


        // parallelSetAll
        Arrays.parallelSetAll(myArrInt, i -> i * 1000); 
        Arrays.parallelSetAll(myArrLong, i -> i * 10000L); 
        Arrays.parallelSetAll(myArrDouble, i -> i * 1.111); 


        // parallelSort 
        Arrays.parallelSort(myArrByte); 
        Arrays.parallelSort(myArrShort); 
        Arrays.parallelSort(myArrInt); 
        Arrays.parallelSort(myArrLong); 
        Arrays.parallelSort(myArrFloat); 
        Arrays.parallelSort(myArrDouble); 


        // sort
        Arrays.sort(myArrByte);
        Arrays.sort(myArrShort);
        Arrays.sort(myArrInt);
        Arrays.sort(myArrLong);
        Arrays.sort(myArrFloat);
        Arrays.sort(myArrDouble);
        Arrays.sort(myArrChar);
        Arrays.sort(myArrString);


        // spliterator
        // Spliterator.OfInt spliteratorByte = Arrays.spliterator(myArrByte, 0, myArrByte.length); 
        // Spliterator.OfInt spliteratorShort = Arrays.spliterator(myArrShort, 0, myArrShort.length); 
        Spliterator.OfInt spliteratorInt = Arrays.spliterator(myArrInt, 0, myArrInt.length); // int
        Spliterator.OfLong spliteratorLong = Arrays.spliterator(myArrLong, 0, myArrLong.length); // long
        // Spliterator.OfFloat spliteratorFloat = Arrays.spliterator(myArrFloat, 0, myArrFloat.length); 
        Spliterator.OfDouble spliteratorDouble = Arrays.spliterator(myArrDouble, 0, myArrDouble.length); // double
        // Spliterator.OfInt spliteratorChar = Arrays.spliterator(myArrChar, 0, myArrChar.length); 
        Spliterator<String> spliteratorString = Arrays.spliterator(myArrString, 0, myArrString.length); // String


        // steam
        // IntStream streamByte = Arrays.stream(myArrByte).mapToInt(b -> b); 
        // IntStream streamShort = Arrays.stream(myArrShort).mapToInt(s -> s); 
        IntStream streamInt = Arrays.stream(myArrInt); 
        LongStream streamLong = Arrays.stream(myArrLong); 
        // DoubleStream streamFloat = Arrays.stream(myArrFloat); 
        DoubleStream streamDouble = Arrays.stream(myArrDouble); 
        IntStream streamChar = new String(myArrChar).chars(); 
        Stream<String> streamString = Arrays.stream(myArrString); 


        // toString
        System.out.println(Arrays.toString(myArrByte));
        System.out.println(Arrays.toString(myArrShort));
        System.out.println(Arrays.toString(myArrInt));
        System.out.println(Arrays.toString(myArrLong));
        System.out.println(Arrays.toString(myArrFloat));
        System.out.println(Arrays.toString(myArrDouble));

        
    }

}
