package me.hauri.course.lesson1;

import me.hauri.course.lesson2.Name;

public class Person {

    private Name personName;

    private static int personCount;

    public Person()
    {
       personCount++;
    }

    public Person(Name personName)
    {
        this.personName = personName;
    }

    public String helloWorld() {
        return "Hello World";
    }

    public String hello(String name) {
        return "Hello " + name;
    }

    public static int NumberOfPersons() {
        return personCount;
    }
}
