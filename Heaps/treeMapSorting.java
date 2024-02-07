import java.util.*;
public class treeMapSorting {
    // Creating a TreeMap with reverse order comparator for keys
    public static void main(String[]args){
        TreeMap<String, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
        // Adding entries to the TreeMap
        treeMap.put("Alice", 25);
        treeMap.put("Bob", 30);
        treeMap.put("Charlie", 22);
        // Printing the TreeMap in reverse order based on keys
        System.out.println(treeMap); // Output: {Charlie=22, Bob=30, Alice=25}
    }
}
