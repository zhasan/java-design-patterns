package patterns.behavioral.strategy;

import java.util.Scanner;

public class StrategyExe {

    public static void main(String[] args) {
        System.out.println();
        Scanner in = new Scanner(System.in);
        IChoice ic = null;
        Context ctx = new Context();
        String input1, input2;

        try {
            for (int i = 1; i <= 1; i++) {
                System.out.println("Enter an integer:");
                input1 = in.nextLine();
                System.out.println("Enter another integer:");
                input2 = in.nextLine();
                System.out.println("Enter ur choice(1 or 2)");
                System.out.println("Press 1 for Addition, 2 for Concatenation");
                String c = in.nextLine();

                if (c.equals("1"))
                {
/*If user input is 1, create object of FirstChoice
(Strategy 1)*/
                    ic = new FirstChoice();
                }
                else
                {
/*If user input is 2, create object of SecondChoice
(Strategy 2)*/
                    ic = new SecondChoice();
                }
/*Associate the Strategy with Context*/
                ctx.SetChoice(ic);
                ctx.ShowChoice(input1,input2);
            }
        }
        finally
        {
            in.close();
        }
        System.out.println("End of Strategy pattern");
    }
}
/*
    GoF Definition: Define a family of algorithms, encapsulate each one, and make them interchangeable. The
strategy pattern lets the algorithm vary independently from client to client.

    Concept
    We can select the behavior of an algorithm dynamically at runtime.

    Real–Life Example
In a football match, at the last moment, in general, if Team A is leading Team B by a score of 1-0, instead of
attacking, Team A becomes defensive. On the other hand, Team B goes for an all-out attack to score.

    Computer World Example
The above concept is applicable to a computer football game also. Or, we can think of two dedicated
memories where upon fulfillment of one memory, we start storing the data in the second available memory.
So, a runtime check is necessary before the storing of data, and based on the situation, we’ll proceed.

    Note
What is the power behind the strategy pattern?
1. This pattern can provide dynamic behavior for us. It can help us to avoid dealing
with complex algorithm-specific data structures.
2. With this pattern, the same behavior can be expressed differently. So, users can
have a wide variety of choices.
What are the challenges associated with the strategy pattern?
1. The number of objects are increased in the system.
2. Additional overhead is needed due to communication between the strategies
and their contexts.
3. Users need to be fully aware of all kinds of possible behaviors to avoid confusion.
 */