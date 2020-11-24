import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//We are going to play with maps. Feel free to use the built-in methods where possible.
//
//        Create an empty map where the keys are integers and the values are characters
//
//        Print out whether the map is empty or not
//
//        Add the following key-value pairs to the map
//
//        Key	Value
//        97	a
//        98	b
//        99	c
//        65	A
//        66	B
//        67	C
//        Print all the keys
//
//        Print all the values
//
//        Add value D with the key 68
//
//        Print how many key-value pairs are in the map
//
//        Print the value that is associated with key 99
//
//        Remove the key-value pair where with key 97
//
//        Print whether there is an associated value with key 100 or not
//
//        Remove all the key-value pairs
public class MapIntroduction1 {
    public static void main(String[] args) {
        Map<Integer, String> test = new HashMap<>();
        System.out.println(test.isEmpty());
        test.put(97, "a");
        test.put(98, "b");
        test.put(99, "c");
        test.put(65, "A");
        test.put(66, "B");
        test.put(67, "C");

        System.out.println(test.keySet());
        System.out.println(test.values());

        test.put(68, "D");

        for (Integer key : test.keySet()) {
            String value = test.get(key);
            System.out.println(key + " " + value);
        }
        System.out.println(test.get(99));
        test.remove(97);
        System.out.println(test.containsKey(100));

        test.clear();
        System.out.println(test.isEmpty());

    }


}

