# Low Level Design concepts

## SOLID PRINCIPLES
    - Single responsibility: A class should have only 1 reason to change.
    - Open/Closed principle: Open for extension but closed for modification
    - Liskov Substituition principle: If Class B is subtype of class A, then we should be able to replace object of A with B without breaking behaviour of the program (Subclass must extend the capability of parent class, not narrow it down)
    - Interface Segmented principle: Interfaces must be such that, client should not implement unnecessary functions that they do not need.
    - Dependency inversion principle: Class should depend on interfaces, rather than calling concrete classes.


## Strategy Design Pattern
It defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy design pattern lets the algorithm vary independently from the clients that use it.

## Observer Design Pattern
It defines a one-to-many dependency between objects so that when one object changes state, all of its dependents are notified and updated automatically(great example of loose coupling).