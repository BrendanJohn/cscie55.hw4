package cscie55.hw4.zoo.animals;

import org.junit.Test;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PythonTester
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Python(); // default constuctor
    Animal a2 = new Python(getRandomBetween(25,30)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Python(2,"BabyPython"); // using constructor with age and name
    Animal a4 = new Python(140, "theOldestPython", new String[]{"goats","cows","children", "sleeping adults"}); // using ALL params

    @Test
    public void testDefaultPython(){
        assertEquals(1,a1.getAge());// should return default age
        assertEquals("Kaa" ,a1.getName());// should return default name
        assertEquals("spaghetti", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testPythonConstr2(){
        assertTrue(a2.getAge()>=25 && a2.getAge()<=30);// age should fit in this range, as passed to second constructor
        assertEquals("Kaa" ,a2.getName());// should return provided name
        assertEquals("spaghetti", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testPlatyConstr3(){
        assertEquals(2,a3.getAge());// should return provided age
        assertEquals("BabyPython" ,a3.getName());// should return provided name
        assertEquals("spaghetti", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testPlatyConstr4(){
        assertEquals(140,a4.getAge());// should return provided age
        assertEquals("theOldestPython" ,a4.getName());// should return provided name
        assertEquals("sleeping adults", a4.getFavoriteFoods().get(3));// should return the menu provided
    }
}
