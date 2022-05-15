package org.example.stringJoiner;

import java.util.StringJoiner;

public class StringJoinerExample {


    public static void main(String[] args) {

     //   StringJoiner joinNames = new StringJoiner(",");
        //adding prefix and suffix
        StringJoiner joinNames = new StringJoiner(",","[","]");

        joinNames.add("Constantine");
        joinNames.add("Alger");
        joinNames.add("Annaba");
        joinNames.add("Oran");
        joinNames.add("Ouargla");
        System.out.println(joinNames);

//Merge Two StringJoiner
        StringJoiner joinNames2 = new StringJoiner(",","[","]");
        joinNames2.add("Biskra");
        joinNames2.add("Ghardaia");
        joinNames2.add("Collo");
        joinNames2.add("Setif");
        StringJoiner merge=joinNames.merge(joinNames2);
        System.out.println(merge);
//StringJoiner Methods
        joinNames.setEmptyValue("it is empty");
        // Returns length of StringJoiner
        int lenght=joinNames.length();
        // Returns StringJoiner as String type
        String str = joinNames.toString();
        System.out.println(str);

        // Now, we can apply String methods on it
        char ch = str.charAt(3);
        System.out.println("Character at index 3: "+ch);

    }
    }
