package org.example.structures;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

//head :take here ->| | |<- Taill :insert here
    //FIFO
/*
which are a new kind of type declaration. Like an enum, a record is a restricted form of a class.
 It’s ideal for "plain data carriers," classes that contain data not meant to be altered
 and only the most fundamental methods such as constructors and accessors.
*/
      record Person(String name,int age){}

    public static void main(String[] args) {

        Queue<Person> queue=new LinkedList<>();
        queue.add(new Person("fer",20));
        queue.add(new Person("ramy",30));
        queue.add(new Person("dia",40));
        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.peek());


    }

}
