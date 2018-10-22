/*
 * name: Brian Twitchell
 * CSCIE-55 HW 3
 * date: 10/16/2018
 */

package cscie55.hw4.zoo.animals;

import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

/**
* Seahorse class provides information about Seahorse Animals<p>
* currently provides no error checking

*/
public class Seahorse extends Animal{
    //Seahorse specific fields
    private String gender;

    private ArrayList<String> favoriteFoods;

    public Seahorse() { // when empty constructor called
        this(3); // we fill in first param and pass it to the second constructor
    }

    public Seahorse(int age){ // when second constructor is called, age only is given.
        this(age, "Mr Ed"); // We fill in default name and pass to third...
    }

    public Seahorse(int age, String name) { // when third constructor, use params 1 and 2
        this(age, name, new String[]{"plankton"}); // and add String[] food and call 4th constructor

    }

    // NOTE: Only NOW do I call super
    public Seahorse(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
        super(age, name, favoriteFoods);
    }

    /**
     * constructor, instantiates favaoriteFoods, age, and color<p>
     * current favoriteFoods List type is ArrayList
     */
//    public Seahorse(){
//        this(Calendar.getInstance(), "Fluffy", "purple and green",
//                new ArrayList<String>() {{
//        add("plankton");
//        add("copepods");
//                }},
//                "male");
//    }

    /**
     * constructor, allows setting date of birth, name, color, favorite foods, and gender
     * current favoriteFoods List type is ArrayList
     *
     * @param dob           date of birth
     * @param moniker       name
     * @param color         color
     * @param favoriteFoods List of Strings that are each a favorite food, do not use spaces in food names
     * @param gender        gender as a string
     */
//    Seahorse(Calendar dob, String moniker, String color, List<String> favoriteFoods, String gender) {
//        setDateOfBirth(dob);
//        setName(moniker);
//        setColor(color);
//        setFavoriteFoods(favoriteFoods);
//        this.gender = gender;
//
//        setEatingSound("Delicious!");
//        setPlayingSound("bubble bob bubble squee");
//        setSpeakingSound("blurb blurb");
//    }
}
