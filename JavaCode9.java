/*
/usr/local/Cellar/openjdk/21.0.2/bin/javac JavaCode9.java
/usr/local/Cellar/openjdk/21.0.2/bin/java JavaCode9
*/

// import
import java.util.*;
import java.util.HashSet;

public class JavaCode9 {

    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");

        System.out.println("Java Code 9");
        System.out.println("Java - HashSet");
        System.out.println("HashSet = No Duplicates");
        System.out.println("");

        // Top 25 Medieval Cities in Europe
        HashSet<String> the_Top_Medieval_Cities_in_Europe = new HashSet<String>();
        the_Top_Medieval_Cities_in_Europe.add("Prague");
        the_Top_Medieval_Cities_in_Europe.add("Carcassonne");
        the_Top_Medieval_Cities_in_Europe.add("Colmar");
        the_Top_Medieval_Cities_in_Europe.add("Tallinn");
        System.out.println(the_Top_Medieval_Cities_in_Europe);

        // how many items there are
        System.out.println("how many items there are = " + the_Top_Medieval_Cities_in_Europe.size());

        // Check If an Item Exists
        System.out.println(
                "Check If an Item Exists in HashSet = " + the_Top_Medieval_Cities_in_Europe.contains("Tallinn"));

        // Remove an Item
        the_Top_Medieval_Cities_in_Europe.remove("Tallinn");
        System.out.println("Check If an Item Exists in HashSet after removing = "
                + the_Top_Medieval_Cities_in_Europe.contains("Tallinn"));

        // Loop Through a HashSet
        System.out.println("Loop Through a HashSet = ");
        for (String cityName : the_Top_Medieval_Cities_in_Europe) {
            System.out.println(cityName);
        }

        // Convert HashSet to Array
        String[] medieval_cities_array = new String[the_Top_Medieval_Cities_in_Europe.size()];
        int i = 0;
        for (String cityName : the_Top_Medieval_Cities_in_Europe) {
            medieval_cities_array[i] = cityName;
            i++;
        }
        System.out.println("Convert HashSet to Array = " + (Arrays.toString(medieval_cities_array)));
    }
}