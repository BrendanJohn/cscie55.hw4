This is my solution for Homework #4: Threading, Refactoring using the .zip from bucket 8

I solved the active threading and refactoring problem by following the requirements to set the initial state of each class, then I adopted a pure test-driven development style versus writing any logic before. This was more or less a similar approach that I took with homework 2 and 3, however the unit tests in homework 4 are complex and required some design decisions up front. The first decision I made was on the type of collection I would use to capture the accounts in the bank implementation. Although the ArrayList collection is efficient, I found that it permits duplicates which does not satisfy the needs of the requirements indicating that there can not be duplicate accounts. With this in mind, I chose to store the accounts in a hash set which will not permit duplicates. By using this methodology and design decisions I completed the tasks while keeping the requirements in mind and believe I have accounted for each of them. To make evaluation easier I have called out the homework 4 requirements in the jsdocs of each class.

In addition to the homework 2 classes outlined below, I have also implemented the passenger class which is in line with the requirements.
The Passenger class represents a person to ride the Elevator.
The Elevator class represents an elevator in a building that can travel up and down, stopping on floors to disembark passengers or pick them up.
If a passenger tries to board a full elevator, the elevator throws an exception.
The Floor class represents a single floor that the elevator can visit, it can tell the elevator how many passengers are waiting and also call the elevator.
The Building class represents a building that keeps track of one elevator and multiple floors.
The ElevatorFullException class is an exception that is thrown when something out of the ordinary happens, such as a passenger trying to board a full elevator.

In order to run the unit tests, try the following:
1)unzip files
2)navigate to the directory where file: elevator-1.0-SNAPSHOT-tests.jar was saved
4)then run these commands to execute the unit tests:
java -jar elevator-1.0-SNAPSHOT-tests.jar cscie55.hw3.elevator.ElevatorTest
java -jar elevator-1.0-SNAPSHOT-tests.jar cscie55.hw3.zoo.animals.AnimalTes

Thanks, Brendan Murphy.
