package patterns.behavioral.mediator;

public class MediatorExe {

    public static void main(String[] args) {
        System.out.println("***Mediator Pattern Demo***\n");
        ConcreteMediator m = new ConcreteMediator();

        Friend1 Amit = new Friend1(m, "Amit");

        Friend2 Sohel = new Friend2(m, "Sohel");

        Boss Raghu = new Boss(m, "Raghu");

        m.setFriend1(Amit);
        m.setFriend2(Sohel);
        m.setBoss(Raghu);

        Amit.Send("[Amit here]Good Morrning. Can we discuss the mediator pattern?");
        Sohel.Send("[Sohel here]Good Morning.Yes, we can discuss now.");
        Raghu.Send("\n[Raghu here]:Please get back to work quickly");

    }

}

/*
    GoF Definition: Define an object that encapsulates how a set of objects interacts. The mediator pattern
promotes loose coupling by keeping objects from referring to each other explicitly, and it lets you vary their
interaction independently.

    Concept
    A mediator is the one who takes the responsibility of communication among a group of objects. The
mediator acts as an intermediary who can track the communication between two objects. The other objects
in the system are also aware of this mediator and they know that if they need to communicate among
themselves, they need to go through the mediator. The advantage of using such a mediator is that we can
reduce the direct interconnections among the objects and thus lower the coupling.

    Real-Life Example
    In an airplane application, before taking off the flight undergoes a series of checks. These checks confirm
that all components/parts (which are dependent on each other) are in perfect condition.
Also, the pilot needs to communicate with the towers at the airport. In general, one pilot from one
airline will not communicate with another pilot from a different airline before taking off or landing
operations. Towers are acting as the mediator here.

    Computer World Example
    In a business application, in many cases we need to apply constraints (e.g., suppose we have a form for
which we need to supply a user id and then a password for that account). In the same form, we may need
to supply other mandatory information (e-mail id, communication address, age, etc.). Now suppose the
functions are implemented as follows: once a user supplies his user id, the form will check whether that user
id (supplied by user) is valid. If it is a valid id, then only the password field will be enabled. After supplying
these two fields, we may need to check whether the user has provided any e-mail id. Let’s assume here after
providing a user id with a valid e-mail and all other mandatory details, our submit button will be enabled
(i.e., the overall submit button will be enabled if we supply a valid user id, password, e-mail id, and other
mandatory details only). We must also ensure that the user id is an integer, so if the user by mistake provides
any character in that field, the submit button still will be in disabled mode. The mediator pattern becomes
handy in such a scenario.
    So, when a program consists of many classes and the logic is distributed among them, it becomes
harder to read and maintain. If we need to make some kind of change, it becomes a challenging task for us.
The mediator pattern is handy in such a scenario.
 */