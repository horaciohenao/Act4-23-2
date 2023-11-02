import java.util.Enumeration;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Set;

public class property {

    public static void main(String[] args) {
        
        // declara un property
        Properties myProperties = new Properties();


        // metodo setProperty()
        myProperties.setProperty("Key 1", "Valor 1");
        myProperties.setProperty("Key 2", "Valor 2");
        myProperties.setProperty("Key 3", "Valor 3");
        

        // metodo getProperty()
        String myProperty = myProperties.getProperty("Key 1");
        System.out.println(myProperty);
        // output: "Valor 1"
        

        // metodo store()
        try {
            FileOutputStream writer = new FileOutputStream("keys.properties");
            myProperties.store(writer, "my comment");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        // exporta un archivo "keys.properties"
        

        // metodo storeToXML()
        try {
            FileOutputStream XMLwriter = new FileOutputStream("XMLkeys.xml");
            myProperties.storeToXML(XMLwriter, "my comment");
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        // exporta un archivo "XMLkeys.xml"


        // metodo stringPropertyNames()
        Set<String> mySet = myProperties.stringPropertyNames();
        System.out.println(mySet);
        // output: "[Key 1, Key 2, Key 3]"


        // metodo list()
        try {
            FileOutputStream myProps = new FileOutputStream("myProps.txt");
            PrintStream print = new PrintStream(myProps);
            myProperties.list(print);
            
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        // exporta un archivo: "myProps.txt"
        

        // metodo load()
        try {
            InputStream reader = new FileInputStream("keys.properties");
            myProperties.load(reader);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        // importa un archivo "keys.properties"
        

        // metodo loadFromXML()
        try {
            InputStream XMLreader = new FileInputStream("XMLkeys.xml");
            myProperties.loadFromXML(XMLreader);
        } catch (Exception e) {
            System.err.println("Error: " + e);
        }
        // importa un archivo "XMLkeys.xml"
        
        // Metodo elements()
        Enumeration<?> enums = myProperties.propertyNames();
        while ( enums.hasMoreElements() ) {
            
            System.out.print(enums.nextElement() + " ");
        }
        System.out.println("");
        // output: "Key 3 Key 2 Key 1"


    }
    
}
