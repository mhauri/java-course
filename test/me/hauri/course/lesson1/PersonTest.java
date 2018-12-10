package me.hauri.course.lesson1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld()
    {
        Person marcel = new Person();
        assertEquals("Hello World", marcel.helloWorld());
    }

    @Test
    public void shouldReturnMarcel()
    {
        Person marcel = new Person();
        assertEquals("Hello Marcel", marcel.hello("Marcel"));
    }

    @Test
    public void shouldReturnNumberOfPersons()
    {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        assertEquals(4, Person.NumberOfPersons());
    }
}
