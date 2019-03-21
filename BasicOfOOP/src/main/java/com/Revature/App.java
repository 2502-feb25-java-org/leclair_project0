package com.Revature; //User defined package
//import java.lang.*; --call to external or innternal prebuilt Java classes

public class App 
{
    public static void main( String[] args)
    {
        //System.out.println("Hello World!");

        //Greeter g1 = new Greeter("Jack");
        //String name = g1.getName();

        //String name = g1.getName();
        //System.out.println("Hello " + name + "!");

        /*Person p1 = new Person("Matt LeClair", "123453");
        p1.getDetails();
        System.out.println(p1.getDetails());*/

        //Person emp = new Employee("Carol Baxter", "1235"); //Downcasting
        //This object must be used to UPCASTING

        Employee e1 = new Employee("Steve", "123456", "85,000");
        e1.getDetails();
        System.out.println(e1.getDetails());
    }
}
