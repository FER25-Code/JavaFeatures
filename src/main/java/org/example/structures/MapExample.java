package org.example.structures;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("fer"));
        map.put(2, new Person("Dia el eddine"));
        map.put(3, new Person("ramy"));
        System.out.println(map);
        System.out.println("the size");
        System.out.println(map.size());
        System.out.println("the get 1");
        System.out.println(map.get(1));
        System.out.println("the containskey 4 :");
        System.out.println(map.containsKey(4));
        System.out.println("the key set");
        System.out.println(map.keySet());
        System.out.println("the entryset");
        System.out.println(map.entrySet());
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
        System.out.println("the second for each");

        map.forEach((key, person) -> {
            System.out.println(key + " -" + person);
        });


    }
    //record is  a new kind of type declaration  class
    record Person(String name) {
    }
}
