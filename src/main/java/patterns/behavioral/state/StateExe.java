package patterns.behavioral.state;

public class StateExe {
    public static void main(String[] args) {
        System.out.println();
        Off initState = new Off();
        TV tv = new TV(initState);
        tv.pressButton();
        tv.pressButton();
    }
}

/*

    GoF Definition: Allow an object to alter its behavior when its internal state changes. The object will appear to
change its class.

    Concept
    The concept is best described by the examples that follow.

    Real-Life Example
    Consider a network connection for the moment. Here the object (that is responsible for communication) can
be in various states (e.g., already a connection is established, a connection is closed, or the object is listening
through the connection). We can also think of a traffic signal in this context.

    Computer World Example
    The above example is applicable in the computer world also. Let us look at an additional example: We have a
job processing application where we can process only one job (or any certain number of jobs) at a time. Now
if a new job appears, either the application will process that job or it will signal that the new job cannot be
processed at this moment because the system is already processing the maximum number of jobs in it
(i.e., its number of job processing capabilities has reached the ceiling).

    Note
1. As human beings, we perform best when we are happy and free of tension and our
behavior can clearly reflect our mental state. It is obvious that when we are in a
happy and relaxed mode, we can perform better and we can talk to others in a
friendlier tone. But consider the reverse scenario: when we are full of tension. In
that scenario, in most cases, our efforts cannot produce a great result. That is why
it is always suggested that we should work in relaxed mode. You can relate this
simple philosophy with the foregoing illustration. If the TV is on, it can entertain
you; if it is off, it cannot—right? So, when we want to design similar kinds of
behavior changes of an object when its internal state changes, this pattern becomes
handy.
2. If the number of states increases significantly in the system, then it becomes
extremely hard to maintain that system.

 */