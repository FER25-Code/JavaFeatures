package org.example.structures;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    // a collection that contains no duplicate element

    public static void main(String[] args) {
        Set<Ball> balls = new HashSet<>();
        //Set<Ball> ballss = new EnumSet<>();

        balls.add(new Ball("red"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("blue"));
        balls.add(new Ball("yellow"));
        balls.remove(new Ball("yellow"));
        System.out.println(balls.size());
        balls.forEach(System.out::println);
    }

    record  Ball (String color){}
}
