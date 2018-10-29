package cscie55.hw4.zoo.animals;

/**
 * Platypus
 * Brendan Murphy 10/29/2018
 * HW 4
 */
public class Platypus extends Animal {

	public Platypus() { // when empty constructor called
		this(200); // we fill in first param and pass it to the second constructor
	}

	public Platypus(int age){ // when second constructor is called, age only is given.
		this(age, "Platsky"); // We fill in default name and pass to third...
	}

	public Platypus(int age, String name) { // when third constructor, use params 1 and 2
		this(age, name, new String[]{"shrimp"}); // and add String[] food and call 4th constructor

	}

	// NOTE: Only NOW do I call super
	public Platypus(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
		super(age, name, favoriteFoods);
	}
//These methods	did not fit in with the the cascading model discussed in class so I have left them commented out
//    private Platypus() {
//        super();
//        super.setFavoriteFoods(new String[]{"worms", "shrimp"});
//        super.setSound("Meeek!");
//        super.setFavoriteActivity("Swimming for fitness");
//    }
//
//    /**
//     * Instantiates a Platypus
//     *
//     * @param name the animal's name
//     * @param age  the animal's age
//     */
//    public Platypus(String name, int age) {
//        this();
//        super.setName(name);
//        super.setAge(age);
//    }
}
