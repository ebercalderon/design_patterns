# Design Patterns

Design Patterns are solutions to common software design problems that occur over and over in software development.

## Index
+ [Structural](#structural)
+ [Behavioral](#behavioral)
+ [Creational](#creational)


## Structural<a name="structural"></a>

### Adapter
An adapter helps to join two incompatible interfaces to work together. So, if you have an interface with implementing classes. If you were asked later to add additional sub class(es), but they have incompatible Interface, then, adapter pattern could be useful.

![Class Diagram](https://github.com/ebercalderon/design_patterns/blob/main/diagrams/adapter.png?raw=true)

## Behavioral<a name="behavioral"></a>
### Observer
Observer pattern is used such that if an object is changed, its dependents objects get notified of that change, Thus, there is 1:M Relationship. 

![Class Diagram](https://github.com/ebercalderon/design_patterns/blob/main/diagrams/observer.png?raw=true)

## Creational<a name="creational"></a>

### Factory 
This pattern defines a way for creating object(s) during run time. The main characteristics are:
- Doesn't expose instantiation or the creation logic
- Subclasses create the objects
- Common Abstract/Interface
- Framework, the client/ the implementation uses the factories

#### Disadvantages
- Complex
- Creation in Subclasses
- Refactoring

![Class Diagram](https://github.com/ebercalderon/design_patterns/blob/main/diagrams/factory.png?raw=true)

### Singleton
 The Singleton Pattern is a pattern that ensures that there is only ever one single instance of a class, And it provides a global way to get to that instance. The main characteristics are:
 - Static in nature
- Thread safe
- Private Constructor
- Private Instance of the Class
- No parameters to the Constructor

#### Disadvantages
- Overusage
- Unit testing
- Slow down
- Confused with factory design pattern (with arguments)

#### Classic
This is the basic implementation

![Class Diagram](https://github.com/ebercalderon/design_patterns/blob/main/diagrams/singleton.png?raw=true)
