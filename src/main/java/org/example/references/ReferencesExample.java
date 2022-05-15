package org.example.references;

import org.example.Test;

import java.util.function.BiFunction;

public class ReferencesExample {

  /*  Java provides a new feature called method reference in Java 8.
    Method reference is used to refer method of functional interface.
    It is compact and easy form of lambda expression.
    Each time when you are using lambda expression to just referring a method,
    you can replace your lambda expression with method reference.
    In this tutorial, we are explaining method reference concept in detail.*/


    public static void saySomething(){
        System.out.println("hello , this is static method");
    }
    public  void saySomething1(){
        System.out.println("hello , this is non-static method");
    }

    public int add(int a,int b){
        return a+b;
    }

    public ReferencesExample() {
    }

    ReferencesExample(String meg){
        System.out.println(meg);
    }
    public static void main(String[] args) {
//Reference to a Static Method

        // Referring static method
/*        Test test =ReferencesExample::saySomething;
        //calling interface method
        test.say();*/
//Reference to an Instance Method

        // Referring non-static method using anonymous object
   /*    Test test1 = new ReferencesExample()::saySomething1;
       test1.say();*/
       //using BiFunction interface
        BiFunction<Integer,Integer,Integer>adder = new ReferencesExample()::add;
        int result =adder.apply(100,200);
        System.out.println(result);
//Reference to a Constructor
        Test test =ReferencesExample::new;
        test.getReferencesExample("hello");


    }

}
