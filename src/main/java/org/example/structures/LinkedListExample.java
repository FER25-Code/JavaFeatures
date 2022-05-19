package org.example.structures;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

    //  null<- head | next/prev | tail->null

    public static void main(String[] args) {
        LinkedList<QueueExample.Person> linkedList = new LinkedList<>();
        linkedList.add(new QueueExample.Person("X",20));
        linkedList.add(new QueueExample.Person("Y",30));
        linkedList.add(new QueueExample.Person("Z",40));
        linkedList.addFirst(new QueueExample.Person("A",40));
        linkedList.addLast(new QueueExample.Person("B",40));
        ListIterator<QueueExample.Person>personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println("------------------");
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }

    }


}
