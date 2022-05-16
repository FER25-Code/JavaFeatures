package org.example.optionals;

import java.util.Optional;

public class OptionalsExample {

//sout
//psvm
    public static void main(String[] args) {
/*        Optional<String> hello =Optional.ofNullable("hello");

        System.out.println(hello.isPresent());
        System.out.println(hello.isEmpty());
   *//*     String x=hello.map(String::toUpperCase).orElseGet(()->{
           return "world";
        });*//*
        hello.ifPresent(word->{
            System.out.println(word);
        });
      hello.ifPresentOrElse(System.out::println,()-> System.out.println("word"));*/

      Person person = new Person("fergani","fer@gamil.com");
      Person person2 = new Person("fergani","FER@GMAIL.COM");
       String email= person
               .getEmail()
               .map(String::toUpperCase)
               .orElse("email not find");
        System.out.println(email);

        if (person2.getEmail().isPresent()){
            String email2= person.getEmail().get();
            System.out.println(email2.toLowerCase());
        }else {
            System.out.println("emial not find");
        }


    }

}

 class Person{
    private final String name;
    private final String email;

       Person(String name, String email) {
           this.name = name;
           this.email = email;
       }

     public String getName() {
         return name;
     }

     public Optional<String> getEmail() {
         return Optional.ofNullable(email);
     }
 }