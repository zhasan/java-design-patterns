package patterns.structural.bridge;

public class BridgeExe {

    public static void main(String[] args) {
        System.out.println("*****BRIDGE PATTERN*****");
        //Coloring Green to Triangle
        System.out.println("\nColoring Triangle:");
        IColor green = new GreenColor();
        Shape triangle = new Triangle(green);
        triangle.drawShape(20);
        triangle.modifyBorder(20, 3);

        //Coloring Red to Rectangle
        System.out.println("\n\nColoring Rectangle :");

        IColor redColor = new RedColor();
        Shape rectangle = new Rectangle(redColor);
        rectangle.drawShape(50);
        rectangle.modifyBorder(50, 2);

    }
}

/*
GoF Definition: Decouple an abstraction from its implementation so that the two can vary independently.

Concept
In this pattern, the abstract class is separated from the implementation class and we provide a bridge
interface between them. This interface helps us to make concrete class functionalities independent from the
interface implementer class. We can alter these different kind of classes structurally without affecting each
other.

Real-Life Example
In a software product development company, the development team and technical support team both play
a crucial role. A change in the operational strategy of one team should not have a direct impact on the other
team. Here the technical support team plays the role of a bridge between the clients and the development
team that implements the product.

Computer World Example
This pattern is used in a GUI framework. It separates Window abstraction from Window implementation in
Linux/Mac OSs. The following illustration is a classical example in the software development field.
 */