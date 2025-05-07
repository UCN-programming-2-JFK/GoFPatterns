# GoFPatterns
 This repository contains four Java example implementations of Gang of Four Design Patterns: Singleton, Adapter, Strategy and Factory Method.

## Summary of Patterns

- **Singleton**: Ensures a class has only one instance and provides a global access point to it.  
- **Adapter**: Bridges incompatible interfaces by translating one interface into another expected by the client.  
- **Strategy**: Defines a family of interchangeable algorithms, letting the algorithm vary independently from the client.  
- **Factory Method**: Delegates the responsibility of instantiating objects to subclasses, promoting loose coupling.

 

## Singleton ([code](https://github.com/UCN-programming-2-JFK/GoFPatterns/tree/main/src/singletonpattern))
### The problem
You need to coordinate data or actions across your application, but every once in a while, other devs on your team mistakenly instantiate additional instances of the class that is supposed to be the coordinator or the authoritative version. This leads to your application getting out of sync.
### The solution
Code a class which can only be instantiated once.

![UML](https://github.com/user-attachments/assets/9334f6c4-5f19-485f-97d8-69a155a89055)

## Adapter ([code](https://github.com/UCN-programming-2-JFK/GoFPatterns/tree/main/src/adapterpattern))

### The problem
You need to interact with different pieces of code or services (the adaptees) which all provide the same functionality but vary in how they are interacted with (method names, parameter types, naming, etc.).
### The solution
Define an interface and code adapter classes which all implement this interface and individually bridge the gap to their respective adaptee.

![UML](https://github.com/user-attachments/assets/3bdcc4ab-d1b2-4dfe-9885-2d82d4345828)

## Strategy ([code](https://github.com/UCN-programming-2-JFK/GoFPatterns/tree/main/src/strategypattern))
### The problem
You need to perform a task that can be accomplished using different algorithms, and you want to be able to switch between these algorithms easily without cluttering your code with conditionals or rewriting logic.

### The solution
Define a common strategy interface and implement each algorithm in its own class. The context class then uses a strategy object to perform the task, making it easy to switch strategies at runtime.

![UML](https://github.com/user-attachments/assets/d013e3eb-ea00-45f5-9d2e-5a9eee306212)

## Factory method ([code](https://github.com/UCN-programming-2-JFK/GoFPatterns/tree/main/src/factorymethod))
### The problem
You need to instantiate objects from a family of related classes, but you want to avoid tightly coupling your code to specific concrete classes.
### The solution
Define a factory method in a creator class that returns objects via a common interface. Subclasses of the creator override the factory method to decide which concrete product gets instantiated.

![UML_simple](https://github.com/user-attachments/assets/f58db582-1508-47c1-9167-6a3ac5691bfa)




