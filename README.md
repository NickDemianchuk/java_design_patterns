# Overview

**Design Pattern** - a general, reusable solution to a commonly occurring problem within a given context. It is a blueprint for how to solve a problem that can be used in many different situations. 

**All patterns have:**
 - name
 - the problem they solve (in context)
 - solution
 - consequences
 
### Usage of Design Patterns:

**Common platform for developers**: Design patterns provide a standard terminology and are specific to particular scenario. 

**Best Practices**: Why reinvent the wheel when you can follow a field-tested blueprint for solving your not-so-unique problem?
 
### Types of patterns:
Pattern | Description
------------ | -------------
**Creational** | These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator.
**Structural** | These design patterns concern class and object composition to obtain new functionalities.
**Behavioral** | These design patterns are specifically concerned with communication between objects.

Many of the design patterns that are in use today originate from the famous Gang of Four book: **"Design Patterns: Elements of Reusable Object-Oriented Software"** by Eric Gamma, Richard Helm, Ralph Johnson, and John Vlissides. 

# 1. Creational Design Patterns
## 1.1. Factory Method

**Factory method** pattern is a creational design pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. 

**When to use:**
- When the implementation of an interface or an abstract class is expected to change frequently
- When the current implementation cannot comfortably accommodate new change
- When the initialization process is relatively simple, and the constructor only requires a handful of parameters


**Class diagram:**

![factory](https://www.researchgate.net/profile/Yann-Gael_Gueheneuc/publication/249885094/figure/fig13/AS:532128962433024@1503880839211/Factory-Method-design-pattern-UML-like-class-diagram.png)

**Implementation**: [Factory](http://github.com)


## 1.2. Abstract Factory
The **Abstract Factory** pattern provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes.

**When to use**
- When client should be independent of how the products are created and composed in the system
- When system consists of multiple families of products, and these families are designed to be used together

**Specifics:**
- We need a run-time value to construct a particular dependency


**Class diagram:**

![abstract_factory](https://www.tutorialspoint.com/design_pattern/images/abstractfactory_pattern_uml_diagram.jpg)

**Implementation**: [Abstract Factory](http://github.com)

## 1.3. Singleton
The **Singleton** pattern is a design pattern that restricts the instantiation of a class to one object.

**When to use:**
- For resources that are expensive to create (like database connection objects)
- For classes which provide access to configuration settings for the application
- For classes that contain resources that are accessed in shared mode


**Specifics:**
- Allows only one instance of a given class
  * The class holds a reference to its only instance
  * Lazy (on request) or static initialization (on load)
  * Private constructor to restrict external instantiation
- Provides global point of access to the instance

  ```public static ClassName getInstance()```
- Supports multiple instances in the future if the requirements change
  * Update getInstance to return multiple (possibly cached) instances if needed

**Class diagram**

![singleton](https://upload.wikimedia.org/wikipedia/commons/thumb/f/fb/Singleton_UML_class_diagram.svg/750px-Singleton_UML_class_diagram.svg.png)
  
**Implementation**: [Singleton](http://github.com)

# 2. Structural Design Patterns
## 2.1. Decorator
The **Decorator** pattern is a design pattern that allows behavior to be added to an individual object, dynamically, without affecting the behavior of other objects from the same class.

**When to use:**
- When we wish to add, enhance or even remove the behavior or state of objects
- When we just want to modify the functionality of a single object of class and leave others unchanged

**Specifics:**
- Attaches additional responsibilities to an object dynamically and transparently (run-time)
- An alternative to sub classing (compile-time)
- Removes responsibilities no longer needed

**Class diagram:**

![decorator](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e9/Decorator_UML_class_diagram.svg/400px-Decorator_UML_class_diagram.svg.png)

**Implementation**: [Decorator](http://github.com)

## 2.2. Adapter
The **Adapter** pattern is a design pattern (also known as wrapper, an alternative naming shared with the decorator pattern) that allows the interface of an existing class to be used as another interface.

**When to use:**
- When our application is not compatible with the interface that our client is expecting
- When we want to reuse legacy code in our application without making any modification in the original code

**Specifics:**
- Allows classes to work together despite their incompatible interfaces
- Typically used in development to *glue* components together, especially if 3rd party libraries are used
- Also known as *wrapper*
- Usually implemented once the application is designed

**Class diagram:**

![adapter](https://upload.wikimedia.org/wikipedia/commons/d/d7/ObjectAdapter.png)

**Implementation**: [Adapter](http://github.com)

## 2.3. Composite
**When to use:**
- When application has hierarchical structure and needs generic functionality across the structure
- When application needs to aggregate data across a hierarchy
- When application wants to treat composite and individual objects uniformly

**Specifics:**
- Clients are independent of how the objects are created, composed, and represented
- System is configured with one of multiple families of products

**Class diagram:**

![composite](https://upload.wikimedia.org/wikipedia/commons/thumb/5/5a/Composite_UML_class_diagram_%28fixed%29.svg/900px-Composite_UML_class_diagram_%28fixed%29.svg.png)

**Implementation**: [Composite](http://github.com)

# 3. Behavioral Design Patterns
## 3.1. Strategy
The **Strategy** pattern (also known as the policy pattern) is a behavioral software design pattern that enables selecting an algorithm at runtime.

**When to use:**
- If you want to change the behavior of an algorithm at runtime

**Specifics:**
- Defines family of interchangeable and encapsulated algorithms
- Changes algorithms independently of clients that use them

**Class diagram:**

![strategy](https://upload.wikimedia.org/wikipedia/commons/3/39/Strategy_Pattern_in_UML.png)

**Implementation**: [Strategy](http://github.com)

## 3.2. Visitor
The **Visitor** design pattern is a way of separating an algorithm from an object structure on which it operates. 

**When to use:**
- When you want to define a new operation without introducing the modifications to an existing object structure
- When the object’s structure is fixed – we either can’t change it, or we don’t plan to add new types of elements to the structure

**Specifics:**
-  We define a function which **accepts** the visitor class to each element of the structure. That way our components will allow the visitor implementation to **“visit”** them and perform any required action on that element.
-  We make a good use of the **Open/Closed principle** as we don't modify the code, but still are able to extend the functionality by providing a new Visitor implementation.

**Class diagram:**

![visitor](https://upload.wikimedia.org/wikipedia/en/thumb/e/eb/Visitor_design_pattern.svg/430px-Visitor_design_pattern.svg.png)

**Implementation**: [Visitor](http://github.com)

**Downsides:**
- Its usage makes it more difficult to maintain the code if we need to add new elements to the object’s structure
- The business logic related to one particular object gets spread over all visitor implementations

## 3.3. Observer
**When to use:**
- When multiple objects are dependent on the state of one object

**Specifics:**
- Defines a one-to-many dependency between objects
- When the observed object (subject) changes state, all dependents get notified and updated automatically


**Class diagram:**

![observer](https://upload.wikimedia.org/wikipedia/commons/thumb/a/a8/Observer_w_update.svg/1200px-Observer_w_update.svg.png)


**Implementation**: [Observer](http://github.com)

**Downsides:**
- Memory leaks caused by [Lapsed listener problem](https://en.wikipedia.org/wiki/Lapsed_listener_problem) because of explicit register and unregistering of observers