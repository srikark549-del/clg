import java.util.*;
public class Hashingexp {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("C++");
        list.add("Java");
        list.add("Python");
        list.indexOf("Python");
        list.remove(0);
        System.out.println("After removing first element: " + list);
        System.out.println("Index of Python: " + list.indexOf("Python"));
        System.out.println("Does the list contain Java? " + list.contains("Java"));
        System.out.println("Final list: " + list);
        System.out.println("Size of the list: " + list.size());
        System.out.print("----------------------------------\n");
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Green");
        set.add("Blue");
        System.out.println("Contains Green? " + set.contains("Green"));
        System.out.println("HashSet: " + set);
        set.remove("Green");
        System.out.println("After removing Green: " + set);
        System.out.println("Is the HashSet empty? " + set.isEmpty());
        System.out.println("Size of the HashSet: " + set.size());
        System.out.print("----------------------------------\n");
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.println(map);
        System.out.println("Value for key 2: " + map.get(2));
        map.remove(1);
        System.out.println("After removing key 1: " + map);
        System.out.println("Does the map contain key 3? " + map.containsKey(3));
        System.out.println("Does the map contain value 'Two'? " + map.containsValue("Two"));
        System.out.println("Size of the HashMap: " + map.size());

    }
}
