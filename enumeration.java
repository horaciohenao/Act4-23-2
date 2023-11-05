import java.util.Enumeration;
import java.util.Vector;

public class enumeration {

    public static void main(String[] args) {
        
        Vector<Integer> myVector = new Vector<>();
        myVector.add(1);
        myVector.add(2);
        myVector.add(3);

        // Crea un enumerator
        Enumeration<Integer> myEnum = myVector.elements();
        
        // metodo hasMoreElements()
        while ( myEnum.hasMoreElements() ) {
            
            // metodo nextElement()
            int element = myEnum.nextElement();
            System.out.print( element + " ");
            
        }
        // output: "1 2 3"
        
    }

}