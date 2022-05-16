package org.example.structures;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {

        String[]colors =new String[5];
        colors[0]="purple";
        colors[1]="black";
        colors[2]="red";
        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);

         //enhanced for loop
        for(String color:colors){
            System.out.println(color);
        }
        //use stream
        Arrays.stream(colors).forEach(System.out::println);
    }
}
