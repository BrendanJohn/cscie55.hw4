package cscie55.hw4.zoo.animals;

import org.junit.Test;

import static cscie55.hw4.utils.NumUtil.getRandomBetween;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RabbitTester
{

    // here, I am using each of the 4 defined constructors
    Animal a1 = new Rabbit(); // default constructor
    Animal a2 = new Rabbit(getRandomBetween(25,30)); // using constructor that takes int for age w/ generated numb
    Animal a3 = new Rabbit(2,"bunny"); // using constructor with age and name
    Animal a4 = new Rabbit(341, "Wise old rabbit splinter", new String[]{"goats","cows","children", "sleeping adults"}); // using ALL params

    @Test
    public void testDefaultRabbit(){
        assertEquals(3,a1.getAge());// should return default age
        assertEquals("Jack" ,a1.getName());// should return default name
        assertEquals("Carrots", a1.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testRabbitConstr2(){
        assertTrue(a2.getAge()>=25 && a2.getAge()<=30);// age should fit in this range, as passed to second constructor
        assertEquals("Jack" ,a2.getName());// should return provided name
        assertEquals("Carrots", a2.getFavoriteFoods().get(0));// should return default menu
    }
    @Test
    public void testRabbitConstr3(){
        assertEquals(2,a3.getAge());// should return provided age
        assertEquals("bunny" ,a3.getName());// should return provided name
        assertEquals("Carrots", a3.getFavoriteFoods().get(0));// should return default menu
    }

    @Test
    public void testRabbitConstr4(){
        assertEquals(341,a4.getAge());// should return provided age
        assertEquals("Wise old rabbit splinter" ,a4.getName());// should return provided name
        assertEquals("goats", a4.getFavoriteFoods().get(0));// should return the menu provided
    }

}
