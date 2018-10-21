# Overview

**Design Pattern** - a general, reusable solution to a commonly occurring problem within a given context in software design. It is a blueprint for how to solve a problem that can be used in many different situations. 

**All patterns have:**
 - name
 - the problem they solve (in context)
 - solution
 - consequences
 
### Usage of Design Pattern

**Common platform for developers**: Design patterns provide a standard terminology and are specific to particular scenario. 

**Best Practices**: Why reinvent the wheel when you can follow a field-tested blueprint for solving your not-so-unique problem?
 
### Types of patterns
Pattern | Description
------------ | -------------
**Creational** | These design patterns provide a way to create objects while hiding the creation logic, rather than instantiating objects directly using new operator.
**Structural** | These design patterns concern class and object composition to obtain new functionalities.
**Behavioral** | These design patterns are specifically concerned with communication between objects.

Many of the design patterns are in use today originate from the famous Gang of Four book: **"Design Patterns: Elements of Reusable Object-Oriented Software"** by Eric Gamma, Richard Helm, Ralph Johnson, and John Vlissides. 

# 1. Creational Design Patterns
## 1.1. Factory
- Defines an interface for creating an object
- Defers the actual creation to subclasses
- Localizes the knowledge of concrete instances


**Class diagram**

![factory](https://www.protechtraining.com/static/bookshelf/java_fundamentals_tutorial/images/450xNxFactoryMethodPattern.png.pagespeed.ic.-MneL23Mz0.webp)

**Implementation**: [Factory](http://github.com)

**When to use**

- When the implementation of an interface or an abstract class is expected to change frequently
- When the current implementation cannot comfortably accommodate new change
- When the initialization process is relatively simple, and the constructor only requires a handful of parameters

## 1.2. Abstract Factory
- Interface for creating family of related objects
- Clients are independent of how the objects are created, composed, and represented
- System is configured with one of multiple families of products

**Class diagram**

![abstract_factory](https://www.protechtraining.com/static/bookshelf/java_fundamentals_tutorial/images/450xNxAbstractFactoryPattern.png.pagespeed.ic.XabjB4iN_o.webp)

**Implementation**: [Abstract Factory](http://github.com)

## 1.3. Singleton
- Allows only one instance of a given class
  * The class holds a reference to its only instance
  * Lazy (on request) or static initialization (on load)
  * Private constructor to restrict external instantiation
- Provides global point of access to the instance

  ```public static ClassName getInstance()```
- Supports multiple instances in the future if the requirements change
  * Update getInstance to return multiple (possibly cached) instances if needed

**Class diagram**

![singleton](https://www.tutorialspoint.com/design_pattern/images/singleton_pattern_uml_diagram.jpg)
  
**Implementation**: [Singleton](http://github.com)

# 2. Structural Design Patterns
## 2.1. Decorator
- Attaches additional responsibilities to an object dynamically and transparently (run-time)
- An alternative to sub classing (compile-time)
- Removes responsibilities no longer needed

**Class diagram**

![decorator](https://www.protechtraining.com/static/bookshelf/java_fundamentals_tutorial/images/450xNxDecoratorPattern.png.pagespeed.ic.LI0WkJdZUd.webp)

**Implementation**: [Decorator](http://github.com)

## 2.2. Adapter
- Converts the interface of a class into another interface clients expect
- Allows classes to work together despite their incompatible interfaces
- Typically used in development to *glue* components together, especially if 3rd party libraries are used
- Also known as *wrapper*

**Class diagram**

![adapter](https://www.baeldung.com/wp-content/uploads/2017/09/Rpt_ER5p.jpg)

**Implementation**: [Adapter](http://github.com)

## 2.3. Composite
- Interface for creating family of related objects
- Clients are independent of how the objects are created, composed, and represented
- System is configured with one of multiple families of products

**Class diagram**

![composite](https://www.protechtraining.com/static/bookshelf/java_fundamentals_tutorial/images/450xNxCompositeDesignPattern.png.pagespeed.ic.c6d3fLxICJ.webp)

**Implementation**: [Composite](http://github.com)

# 3. Behavioral Design Patterns
## 3.1. Visitor


**Class diagram**

![visitor]()

**Implementation**: [Visitor](http://github.com)

## 3.2. Observer
- Defines a one-to-many dependency between objects
- When the observed object (subject) changes state, all dependents get notified and updated automatically


**Class diagram**

![observer]()

**Implementation**: [Observer](http://github.com)

## 3.3. Strategy
- Defines family of interchangeable and encapsulated algorithms
- Changes algorithms independently of clients that use them

**Class diagram**

![strategy]()

**Implementation**: [Strategy](http://github.com)
