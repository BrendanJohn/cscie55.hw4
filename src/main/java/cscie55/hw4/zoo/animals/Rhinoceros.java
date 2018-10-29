package cscie55.hw4.zoo.animals;

import cscie55.hw4.zoo.iface.Playable;
import cscie55.hw4.zoo.iface.Speakable;

import java.util.ArrayList;

/**
 * Rhinoceros
 * Brendan Murphy 10/29/2018
 * HW 4
 */
public class Rhinoceros extends Animal implements Playable, Speakable {
    /**
     * food fields
     */
    private ArrayList<String> favoriteFoods;

    public Rhinoceros() { // when empty constructor called
        this(2); // we fill in first param and pass it to the second constructor
    }

    public Rhinoceros(int age){ // when second constructor is called, age only is given.
        this(age, "Daniel"); // We fill in default name and pass to third...
    }

    public Rhinoceros(int age, String name) { // when third constructor, use params 1 and 2
        this(age, name, new String[]{"Lettuce"}); // and add String[] food and call 4th constructor

    }

    // NOTE: Only NOW do I call super
    public Rhinoceros(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
        super(age, name, favoriteFoods);
    }

    /**
     * Constants for geneara of Rhinoceros.
     * toString overridden to print String version of the genera.
     */
    public enum Genera {
        WHITE ("White"),
        SUMATRAN ("Sumatran"),
        BLACK ("Black"),
        INDIAN ("Indian"),
        JAVAN ("Javan");

        private String genera;

        Genera(String genera) {
            this.genera = genera;
        }

        @Override
        public String toString() {
            return genera;
        }
    }

    /**
     * Genera of Rhinoceros.
     * Should be one of: white, sumatran, black, indian, or javan
     */
    private Genera genera;

    /**
     * Constructor for Rhinoceros
     * Favorite Foods set to - grass, fruit, and twigs
     * @param age   The age of the Rhinoceros
     * @param genera The genera of the Rhinoceros
     *                  Must be one of: white, sumatran, black, indian, or javan
     */
//    public Rhinoceros(int age, Genera genera) {
//        super(age);
//        this.genera = genera;
//        addFood("Grass");
//        addFood("Fruits");
//        addFood("Twigs");
//    }

    /**
     * No argument constructor.
     * Sets default values for Rhinoceros fields.
     * Age - 0 (newborn)
     * Genera - white
     */
//    public Rhinoceros() {
//        this(0, Genera.WHITE);
//    }

    /**
     * Returns the noise a Rhinoceros makes.
     * @return  String of the sound the Rhinoceros makes.
     */
    public String speak() {
        return "snort";
    }

    /**
     * Returns the noise an Rhinoceros makes when it's having fun.
     * @return  String of the sound the Rhinoceros makes.
     */
    public String play() {
        return "mmnnnggghhh";
    }

    /**
     * Get genera of Rhinoceros as string
     * @return  genera string
     */
    public String getGenera() {
        return genera.toString();
    }

    @Override
    public String toString() {
        StringBuilder favoriteFoods = new StringBuilder();

        for (String food : getFavoriteFoods() ) {
            favoriteFoods.append(food).append(", ");
        }
        // cut off superfluous last comma
        favoriteFoods = new StringBuilder(favoriteFoods.substring(0, favoriteFoods.length() - 2));

        return String.format(
                "Rhinoceros{ favoriteFoods = %s, age = %d, genera = \'%s\'}",
                favoriteFoods.toString(),
                getAge(),
                genera
        );
    }
}
