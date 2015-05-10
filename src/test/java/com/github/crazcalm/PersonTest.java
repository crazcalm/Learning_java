package com.github.crazcalm;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by marcuswillock on 1/30/15.
 */
public class PersonTest {
    @Test
    public void ageTest() {
        int age = 17;
        Person person = new Person("hh", age);
        assertTrue(person.getAge() == age);
    }
}
