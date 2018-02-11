package patterns.structural.composite;

public class CompositeExe {
    public static void main(String[] args) {

    }
}
/*
GoF Definition: Compose objects into tree structures to represent part-whole hierarchies. The composite
pattern lets clients treat individual objects and compositions of objects uniformly.

Concept
This pattern can show part-whole hierarchy among objects. A client can treat a composite object just like
a single object. In object-oriented programming, we make a composite object when we have many objects
with common functionalities. This relationship is also termed a “has-a” relationship among objects.

Real-Life Example
We can think of any organization that has many departments, and in turn each department has many
employees to serve. Please note that actually all are employees of the organization. Groupings of employees
create a department, and those departments ultimately can be grouped together to build the whole
organization.

Computer World Example
Any tree structure in computer science can follow a similar concept.
 */