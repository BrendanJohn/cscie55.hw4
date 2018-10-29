package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.Eatable;
import cscie55.hw4.zoo.iface.Playable;
import cscie55.hw4.zoo.iface.Speakable;

import java.util.ArrayList;

/**
 * Rabbit
 * Brendan Murphy 10/29/2018
 * HW 4
 */
public class Rabbit extends Animal implements Eatable, Speakable, Playable {
    /**
     * food fields
     */
    private ArrayList<String> favoriteFoods;

    public Rabbit() { // when empty constructor called
        this(3); // we fill in first param and pass it to the second constructor
    }

    public Rabbit(int age){ // when second constructor is called, age only is given.
        this(age, "Jack"); // We fill in default name and pass to third...
    }

    public Rabbit(int age, String name) { // when third constructor, use params 1 and 2
        this(age, name, new String[]{"Carrots"}); // and add String[] food and call 4th constructor

    }

    // NOTE: Only NOW do I call super
    public Rabbit(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
        super(age, name, favoriteFoods);
    }

//    /**
//     * default constructor
//     */
//    public Rabbit() {
//        super();
//        favoriteFoods = new ArrayList<>();
//        favoriteFoods.add("Carrot");
//    }

//    /**
//     * constructor
//     * @param color color
//     * @param age age
//     * @param name name
//     */
//    public Rabbit(String color, int age, String name) {
//        super(color,age,name);
//        favoriteFoods = new ArrayList<>();
//        favoriteFoods.add("Carrot");
//    }
//
    /**
     * return food list
     * @return string array of favorite food
     */
    @Override
    public String eat() {
        StringBuilder sb = new StringBuilder();
        for (String food: favoriteFoods) {
            sb.append("Yum! " + food + "\n");
        }
        return sb.toString();
    }

    /**
     * make sound
     * @return string sound
     */
    @Override
    public String speak() {
        return "Muttering!";
    }

    /**
     * animal plays
     * @return string play action
     */
    @Override
    public String play() {
        return "Rabbit is having fun!";
    }

}
