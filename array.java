import java.util.Arrays;

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

        
        
    }

}
