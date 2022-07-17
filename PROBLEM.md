## Practice Statement - World of Vehicles 
 
**Lukxtech, a leading vehicle manufacturer, has organized a competition to help select the design of its next generation remote vehicle monitoring system. ​

The company manufactures a range of passenger cars based on different engines and transmission configurations. ​

To win the competition, participants must create a design that caters to all the different models of cars the company makes. As one of the competitors you need to create a proof-of-concept prototype to demonstrate the power of your design.**

The heart of a vehicle is an engine and Lukxtech has a competitive family of engines. Since these engines power a range of vehicles and different customers prefer different kinds of engines, Lukxtech has developed engines that use a variety  of propulsion technologies/fuels. The most prevalent engines are the internal combustion engines.
The internal combustion engines vary based on the fuel they use:
- Petrol engines
- Diesel engines
- Compressed Natural Gas (CNG) engines for the environmentally conscious customers
- Electric engines, recently launched for the customers who believe in zero emissions

***Table 1, shown below, lists the different various types of engines offered by Lukxtech along with their specifications.***
![No image](table1.png)

### Challenge - Part 1

**Tasks**

1. Analyze the family of car engines produced by Lukxtech and create an appropriate hierarchy of classes that can be used to model the various engines. Name the parent class in the family as **Engine**.
    - Determine the child classes in this family based on the description of the family of Lukxtech engines described above, and the information presented in Table 1.
    - Create appropriate constructors for each of the classes that you identify, so that the engine objects of various types can be instantiated as per the specifications mentioned in Table 1. The constructor should take an engine model number as a parameter “and initialize all the relevant specifications for that engine type as per the specifications given in Table 1.
    
2. Write a method named **showSpecs()** that can be invoked for any engine type to display the specifications of a particular engine object. The engine specifications should be displayed as follows: 

        Engine Type : Type of Engine
        Power Source : Fuel Type/Electric Battery
        Model Number : Engine Model 

