import java.io.*;
import java.util.*;
public class RemoveElement {
    public static void main(String args[])
    {
        // Initialization of a Hashtable
        Map<Integer, String> ht
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put method
        ht.put(1, "Jio");
        ht.put(2, "VI");
        ht.put(3, "Bsnl");
        ht.put(4, "Airtel");

        // Initial HashMap
        System.out.println("Initial map : " + ht);

        // Remove the map entry with key 4
        ht.remove(4);

        // Final Hashtable
        System.out.println("Updated map : " + ht);
    }
}
