/**
 * Created by Olivi on 28-10-2016.
 */

import java.io.FileInputStream;
import java.util.Properties;

public class MyProperties {
    public static void main(String[] args) throws Exception {
        //Set up new properties object
        //From file "myProperties.txt"
        FileInputStream propFile = new FileInputStream("C:\\Users\\Olivi\\Documents\\KEA\\2_semester\\SWC\\Black_exercises\\Properties\\src\\myProperties.txt");
        Properties p = new Properties(System.getProperties());
        p.load(propFile);

        //Set the system properties
        System.setProperties(p);
        //Display new properties
        //System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("user.dir"));

    }
}
