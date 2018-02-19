package patterns.structural.facade;

class FacadeExe {
    public static void main(String[] args) {
        System.out.println("***Facade Pattern Demo***");
        RobotFacade robotFacade1 = new RobotFacade();
        robotFacade1.constructRobot("Green", "Iron");
        RobotFacade robotFacade2 = new RobotFacade();
        robotFacade2.constructRobot("Blue", "Steel");
    }
}
/*
GoF Definition: Provide a unified interface to a set of interfaces in a system. Facade defines a higher-level
interface that makes the subsystem easier to use.

Concept
It is one of those patterns that supports loose coupling. Here we emphasize the abstraction and hide the
complex details by exposing a simple interface.

Real-Life Example
Suppose you are going to organize a birthday party and you have invited 100 people. Nowadays, you can go
to any party organizer and let him/her know the minimum information— (party type, date and time of the
party, number of attendees, etc.). The organizer will do the rest for you. You do not even think about how
he/she will decorate the party room, whether people will take food from self-help counter or will be served
by a caterer, and so on.

Computer World Example
We can think about a case where we use a method from a library. The user doesn’t care how the method is
implemented in the library. He/she just calls the method to serve his/her easy purpose. The pattern can be
best described by the example that follows.
 */