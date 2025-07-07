# S3.01 - Patterns 1
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

### 🎯 Learning Objectives

Identify and build programs using design patterns. The use of patterns is
fundamental in building extensible and reusable software. The Java language, as
well as all software frameworks, are built according to the most important
software patterns.

## 📄 LVL 1: Builder
Develop a pizza order management system using the Builder design pattern 
in Java. The system should allow the creation of different types of 
pizzas with different size, dough, and ingredient configurations.

1. Define a Pizza class with the following attributes:
- size
- dough
- toppings

2. Create a PizzaBuilder interface with the methods needed to configure 
the size, dough, and ingredients of a pizza.

3. Implement one or more classes that act as specific builders 
(PizzaBuilder) for different types of pizzas. For example, you could 
have a builder for Hawaiian pizza, another for vegetarian pizza, and so on.
4. Develop a MestrePizzer class that receives a PizzaBuilder and allows 
you to build pizzas in a specific way.
5. In the main program (Main), create instances of PizzaBuilder and 
MestrePizzer, and use them to build pizzas with different configurations.

## 📄 LVL 2: Observer
Design a system in which a Stock Broker (Observable) notifies several 
Stock Brokers (Observers) of changes when the Stock Market goes up or down.

- It is necessary for the Observable object to maintain references to 
- the Observers.

## 📄 LVL 3: Callback
Simulate a payment gateway that receives an object encapsulating the payment 
method to be made: credit card, Paypal or bank account debit.

- The gateway will invoke the payment without knowing the form and 
returning control to the origin class.
- The class that invokes the payment gateway will be a shoe store.

## 💻 Technologies Used

| Package        | Version | Description                |
|----------------|--------|----------------------------|
| `java`         | ^1.8.0_441 | Principal project language |
| `Apache maven` | ^4.0.0 | Project management tool    |
| `java.util`    | ^1.8.0_441 | Java standard library      |


### REQUIREMENTS
Local environment: `IntelliJ or Eclipse`

###  INTELLIJ EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

### 🛠️ SCRIPTS

```bash
mvn compile          # Compile project
mvn package          # Package in .jar
```

## ▶️ How to Run Scripts

To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

## 📚 Additional Resources

- [Refactoring guru](https://refactoring.guru/es/design-patterns)
- [Java Design Patterns](https://www.tutorialspoint.com/design_pattern/index.htm)

[Back to top](#top)