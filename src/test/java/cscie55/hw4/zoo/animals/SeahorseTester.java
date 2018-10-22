package cscie55.hw4.zoo.animals;

import org.junit.Test;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SeahorseTester
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Seahorse(); // default constuctor
    Animal a2 = new Seahorse(getRandomBetween(25,30)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Seahorse(2,"mini horse"); // using constructor with age and name
    Animal a4 = new Seahorse(341, "Wise old horse", new String[]{"goats","cows","children", "algae"}); // using ALL params

    @Test
    public void testDefaultSeahorse(){
        assertEquals(3,a1.getAge());// should return default age
        assertEquals("Mr Ed" ,a1.getName());// should return default name
        assertEquals("plankton", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testSeahorseConstr2(){
        assertTrue(a2.getAge()>=25 && a2.getAge()<=30);// age should fit in this range, as passed to second constructor
        assertEquals("Mr Ed" ,a2.getName());// should return provided name
        assertEquals("plankton", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testSeahorseConstr3(){
        assertEquals(2,a3.getAge());// should return provided age
        assertEquals("mini horse" ,a3.getName());// should return provided name
        assertEquals("plankton", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testSeahorsetConstr4(){
        assertEquals(341,a4.getAge());// should return provided age
        assertEquals("Wise old horse" ,a4.getName());// should return provided name
        assertEquals("algae", a4.getFavoriteFoods().get(3));// should return the menu provided
    }

}
