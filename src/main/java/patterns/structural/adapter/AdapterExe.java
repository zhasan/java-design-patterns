package patterns.structural.adapter;

 class AdapterExe {
    public static void main(String[] args) {
        System.out.println();
        CalculatorAdapter cal = new CalculatorAdapter();
        Triangle t = new Triangle(20,10);
        System.out.println("\n Adapter Pattern Example\n");
        System.out.println("Area of Triangle is :" + cal.getArea(t));
    }
}
/*
GoF Definition: Convert the interface of a class into another interface that clients expect. The adapter
pattern lets classes work together that couldn’t otherwise because of incompatible interfaces.

Concept
The core concept is best described by the examples given below.

Real–Life Example
The most common example of this type can be found with mobile charging devices. If our charger is not
supported by a particular kind of switchboard, we need to use an adapter. Even the translator who is
translating language for one person is following this pattern in real life.

Computer World Example
In real-life development, in many cases, we cannot communicate between two interfaces directly. They
contain some kind of constraint within themselves. To deal with this kind of incompatibility between those
interfaces, we may need to introduce adapters.
A very common use of this pattern is illustrated below.
 */