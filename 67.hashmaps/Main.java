import java.util.HashMap;

class Main {
    public static void main(String[] args) {

        // HashMap = A data structure that stores key-value pairs
        //           Keys are unique, but Values can be duplicated
        //           Does not maintain any order, but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.00);

        // keys must be unique, if you put different new value for same key, it overrides previous key value
        // map.put("orange", 1000000.00);

        // map.remove("apple");

        System.out.println(map);

        System.out.println(map.get("apple"));
        System.out.println(map.get("orange"));
        System.out.println(map.get("banana"));

        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("pineapple"));

        if (map.containsKey("apple")) {
            System.out.println(map.get("apple"));
        }
        else {
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(0.50));
        System.out.println(map.containsValue(1000000.00));

        System.out.println(map.size());

        for(String key : map.keySet()) {
            System.out.println(key + " : $" + map.get(key));
        }

        for(Double value : map.values()) {
            System.out.println("$" + value);
        }

        
        
    }
}
