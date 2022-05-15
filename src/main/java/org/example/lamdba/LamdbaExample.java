package org.example.lamdba;

import org.example.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdbaExample {
      /*
    A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions
     are similar to methods,
     but they do not need a name and they can be implemented right in the body of a method.*/


     /* why we ues :
      to provide the implementation of functional interface
      less codeing */

   /*   Lambda is consisted of three components :
         -Argument list
         -Arrow token
         Body*/

    //Syntax ()->{}
  /*
    A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions
     are similar to methods,
     but they do not need a name and they can be implemented right in the body of a method.*/


     /* why we ues :
      to provide the implementation of functional interface
      less codeing */

   /*   Lambda is consisted of three components :
         -Argument list
         -Arrow token
         Body*/

    //Syntax Class name=()->{}
    public static void main(String[] args) {
        String name1 = "fergani";
        String role1 = "admin";
        int ab = 5;
        int bc = 5;


/*         Test add=()->{
           System.out.println(name);
         };
        add.AddUser();*/
//No Parameter
/*        Test role=()->{
            return "admin";
        };
        System.out.println(role.role());*/


// Multiple Parameters

/*        Test add=(name,role)->{
            return "hi ,"+name1+" your role is : "+role1;
        };
        System.out.println(add.AddUser(name1,role1));*/

/*        Test addnum=(a,b)->(a+b);
        System.out.println(addnum.add(ab,bc));*/

//Multiple Statements

/*        Test commenteUser = (commente) -> {
            String comm1 = "hi,Im Fergani";
            String comm2 = comm1 + commente;
            return comm2;
        };
        System.out.println(commenteUser.UserCommente(" Im admin"));*/

//Java Lambda: Foreach Loop

        List<String> list = new ArrayList<String>();
        list.add("ab");
        list.add("bc");
        list.add("cd");
        list.add("de");
        list.forEach(
                (n) -> System.out.println(n));

//Creating Thread
    Runnable thr1 = () -> {
        System.out.println("Thread 1 is running ..");
    };
    Thread t1 = new Thread(thr1);
    t1.start();

//Comparator && Filter Collection Data


        List<Product>listProduct=new ArrayList<Product>();
        listProduct.add(new Product(1,"PC HP",10000));
        listProduct.add(new Product(1,"PC DELL",20000));
        listProduct.add(new Product(1,"PC LENOVO",30000));
        listProduct.add(new Product(1,"PC MAC",40000));


        listProduct.sort((Product p1, Product p2)->{
           return p1.name.compareTo(p2.name);
        } );

        for (Product p:listProduct){
            System.out.println(p.name+" "+ p.price);
        }

        Stream<Product>filter_data=listProduct.stream().filter(p->p.price>2000);

        filter_data.forEach(
                product -> System.out.println(product.name)
        );






















    }
}


