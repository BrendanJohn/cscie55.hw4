This is my solution for Homework #4: Threading, Refactoring using the .zip from bucket 8

The purpose of this assignment is to experiment with synchronizing access to objects shared by multiple threads. I have written code that simulates a Bank, which manages a set of Accounts. Each Account has a balance. The only transaction processed by this Bank is the transfer of funds from one Account to another. Multiple threads will run these transfer operations simultaneously, so of course it is possible for the same Account to be accessed simultaneously by different threads.

I solved this assignment by following the requirements to set the initial state of each class, then I adopted a pure test-driven development style versus writing any logic before. This was more or less a similar approach to what I took with homework 2 and 3, however the unit tests in homework 4 are complex and required some design decisions up front. The first decision I made was on the type of collection I would use to capture the accounts in the bank implementation. Although the ArrayList collection is efficient, I found that it permits duplicates which does not satisfy the needs of the requirements. With this in mind I chose to store the accounts in a hash set which will not permit duplicates. By using this methodology and design decisions I completed the tasks while keeping the requirements in mind and believe I have accounted for each of them. To make evaluation easier I have called out the homework 4 requirements in the jsdocs of each class.

Some classed I crated to solve this assignment are AccountImpl and BankImpl. AccountImpl provides a concrete implementation of the abstract Account Interface. Similarly, BankImpl provides a concrete implementation of the abstract Bank Interface. The BankImpl class performs the majority of the work to efficiently and accurately transfer money between accounts in a multi-threaded environment. This is accomplished through the usage of synchronized blocks of code that restrict access to account and bank object to one thread execution at a time, all other threads are blocked until the the thread within the synchronized block has exited.

In order to run the unit tests, try the following:
1)unzip files
2)navigate to the directory location where unzipped
4)run these commands to execute the unit tests:
java -jar threads-1.0-SNAPSHOT-tests.jar cscie55.hw4.zoo.animals.AnacondaTest
java -jar threads-1.0-SNAPSHOT-tests.jar cscie55.hw4.bank.BankTest

Thanks, Brendan Murphy.
