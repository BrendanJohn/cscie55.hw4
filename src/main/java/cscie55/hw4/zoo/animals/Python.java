package cscie55.hw4.zoo.animals;


public class Python extends Animal {

	public Python() { // when empty constructor called
		this(1); // we fill in first param and pass it to the second constructor
	}

	public Python(int age){ // when second constructor is called, age only is given.
		this(age, "Kaa"); // We fill in default name and pass to third...
	}

	public Python(int age, String name) { // when third constructor, use params 1 and 2
		this(age, name, new String[]{"spaghetti"}); // and add String[] food and call 4th constructor

	}

	// NOTE: Only NOW do I call super
	public Python(int age, String name, String[] favoriteFoods) { // The ultimate constructor. Pass it ALL to super()
		super(age, name, favoriteFoods);
	}
//These methods	did not fit in with the the cascading model discussed in class so I have left them commented out
//    public Python() {
//        this("Kaa", Gender.MALE);
//    }
//
//    /**
//     * Creates a python
//     * @param name The python's name
//     * @param gender The python's gender
//     */
//    public Python(String name, Gender gender) {
//        super(name, gender, new ArrayList<>(Arrays.asList("Mouse", "Monkey", "Lizard")),true);
//    }
//    These methods no longer work appear in the animal superclass and do not work
//    @Override
//    public String eat() {
//        return String.format("%s, yessss!", getRandomFavoriteFood(favoriteFoods));
//    }
//
//    @Override
//    public String speak() {
//        return "Hiss!";
//    }
//
//    @Override
//    public String play() {
//        return "*slither*";
//    }

}
