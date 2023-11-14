## Design Pattern Name: Strategy Pattern

### Introduction/ Definition:
1. **Strategy** is a behavioral design pattern.
2. This pattern lets you define a family of algorithms and put each of them in a separate classes and make their objects interchangeable.

### Advantages:
1. Strategy design pattern helps to swap algorithms inside an object at runtime easily. 
2. This pattern helps to isolate the implementation details of an algorithm from the code that uses it. 
3. **Open/ Closed Principle (OCP)**: This patterns helps to introduce new variants (i.e., new strategies) of objects without having to change the existing context.

### Disadvantages:
1. If the business logic only have a couple of algorithms and they rarely change, Then there is no real reason to overcomplicate the program with new classes and interfaces along with pattern.
2. Client must be aware of the differences between the strategies to be able to select and passes it to the Context object.

### Reference Article:

1. <a href="https://refactoring.guru/design-patterns/strategy" target="_blank">Strategy Pattern</a>


