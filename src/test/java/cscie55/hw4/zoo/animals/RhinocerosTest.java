package cscie55.hw4.zoo.animals;

import org.junit.Test;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RhinocerosTest
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Rhinoceros(); // default constructor
    Animal a2 = new Rhinoceros(getRandomBetween(25,30)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Rhinoceros(2,"BabyRhino"); // using constructor with age and name
    Animal a4 = new Rhinoceros(140, "theOldestRhino", new String[]{"goats","cows","fish", "frogs"}); // using ALL params

    @Test
    public void testDefaultRhino(){
        assertEquals(2,a1.getAge());// should return default age
        assertEquals("Daniel" ,a1.getName());// should return default name
        assertEquals("Lettuce", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testPlatyConstr2(){
        assertTrue(a2.getAge()>=25 && a2.getAge()<=30);// age should fit in this range, as passed to second constructor
        assertEquals("Daniel" ,a2.getName());// should return provided name
        assertEquals("Lettuce", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testPlatyConstr3(){
        assertEquals(2,a3.getAge());// should return provided age
        assertEquals("BabyRhino" ,a3.getName());// should return provided name
        assertEquals("Lettuce", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testPlatyConstr4(){
        assertEquals(140,a4.getAge());// should return provided age
        assertEquals("theOldestRhino" ,a4.getName());// should return provided name
        assertEquals("frogs", a4.getFavoriteFoods().get(3));// should return the menu provided
    }
}
