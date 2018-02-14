package patterns.structural.flyweight;

import java.util.Random;

public class FlyweightExe {

    public static void main(String[] args) throws Exception {

        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n***Flyweight Pattern Example Modified***\n");

        Robot shape;

        /*Here we are trying to get 3 king type robots*/
        for (int i = 0 ; i<3; i++) {
            shape = (Robot) myFactory.GetRobotFromFactory("King");
            shape.setColor(getRandomColor());
            shape.Print();
        }

        /*Here we are trying to get 3 queen type robots*/
        for (int i = 0 ; i<3; i++) {
            shape = (Robot) myFactory.GetRobotFromFactory("Queen");
            shape.setColor(getRandomColor());
            shape.Print();
        }

        int NumOfDistinctRobots = myFactory.TotalObjectsCreated();

        System.out.println("\n Finally no of Distinct Robot objects created: " + NumOfDistinctRobots);


    }

    static String getRandomColor() {

        Random r = new Random();
        /*You can supply any number of your choice in nextInt argument.
        * we are simply checking the random number generated is an even number
        * or an odd number. And based on that we are choosing the color. For simplicity, we'll use only two colors—red and green
        */

        int random = r.nextInt(20);
        if (random % 2 == 0) {
            return "red";
        } else {
            return "green";
        }
    }
}
