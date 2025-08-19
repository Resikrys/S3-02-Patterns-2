# S3.02 - Patterns 2
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
Design a system in which a Stock Exchange Agencies (Observable) notifies several 
Stock Brokers (Observers) of changes when the Stock Market goes up or down.

- It is necessary for the Observable object to maintain references to 
the Observers.

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
| `JUnit`        | ^5.10.0     | Unit testing framework              |
| `Mockito`      | ^5.12.0     | Mocking framework for unit testing  |
| `SLF4J`        | ^2.0.13     | Simple Logging Facade for Java      |
| `Logback`      | ^1.5.6      | Logging backend implementation      |


### REQUIREMENTS
Local environment: `IntelliJ or Eclipse`

###  INTELLIJ EXECUTION
To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

### 🛠️ SCRIPTS

```bash
# 🔹 Basic scripts:
mvn clean                  # Limpia los archivos compilados previos
mvn compile                # Compila el proyecto
mvn test                   # Ejecuta los tests con JUnit/Mockito
mvn package                # Empaqueta el proyecto en un .jar
mvn install                # Instala el .jar en el repositorio local

# 🔹 Running each subproject using Maven
# (requires configuration of exec-maven-plugin in pom.xml)

mvn exec:java -Dexec.mainClass="com.s3.patterns2.builder.Main"
mvn exec:java -Dexec.mainClass="com.s3.patterns2.callback.Main"
mvn exec:java -Dexec.mainClass="com.s3.patterns2.observer.Main"

# With command line arguments
mvn exec:java -Dexec.mainClass="com.s3.patterns2.builder.Main" -Dexec.args="usuario1 1234 modo_debug"

# 🔹 Alternative: Run the generated .jar files directly
java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.builder.Main
java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.callback.Main
java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.observer.Main

# With arguments
java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.builder.Main usuario1 1234 modo_debug
```

## ▶️ How to Run Scripts

To Run code, press `Ctrl F5` or click the `play` icon in the gutter.

Each subproject has its own `Main.java`. They can be run with **Maven** (`exec-maven-plugin`) or directly with the generated **.jar**.

| Subproyecto | Clase Main                                   | Ejecutar con Maven                                                                                  | Ejecutar con .jar                                                                                                  |
|-------------|----------------------------------------------|------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------|
| Builder     | `com.s3.patterns2.builder.Main`              | `mvn compile exec:java -Dexec.mainClass="com.s3.patterns2.builder.Main"`                            | `java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.builder.Main`                                   |
| Callback    | `com.s3.patterns2.callback.Main`             | `mvn compile exec:java -Dexec.mainClass="com.s3.patterns2.callback.Main"`                           | `java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.callback.Main`                                  |
| Observer    | `com.s3.patterns2.observer.Main`             | `mvn compile exec:java -Dexec.mainClass="com.s3.patterns2.observer.Main"`                           | `java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.observer.Main`                                  |

### 🔹 Examples with arguments

```bash
# Using Maven (Builder with arguments)
mvn compile exec:java -Dexec.mainClass="com.s3.patterns2.builder.Main" -Dexec.args="usuario1 1234 modo_debug"

# Using .jar (Callback with arguments)
java -cp target/S3_02_Patterns2-1.0-SNAPSHOT.jar com.s3.patterns2.callback.Main usuario1 1234 modo_debug
```

## 📚 Additional Resources

- [Refactoring guru](https://refactoring.guru/es/design-patterns)
- [Java Design Patterns](https://www.tutorialspoint.com/design_pattern/index.htm)

[Back to top](#top)