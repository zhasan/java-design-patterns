package patterns.structural.composite;

import java.util.List;

class CompositeExe {
    public static void main(String[] args) {

        Teacher Principal = new Teacher("Dr.S.Som","Principal");
        Teacher hodMaths = new Teacher("Mrs.S.Das","Hod-Math");
        Teacher hodCompSc = new Teacher("Mr. V.Sarcar","Hod-ComputerSc.");
        Teacher mathTeacher1 = new Teacher("Math Teacher-1","MathsTeacher");
        Teacher mathTeacher2 = new Teacher("Math Teacher-2","MathsTeacher");
        Teacher cseTeacher1 = new Teacher("CSE Teacher-1","CSETeacher");
        Teacher cseTeacher2 = new Teacher("CSE Teacher-2","CSETeacher");
        Teacher cseTeacher3 = new Teacher("CSE Teacher-3","CSETeacher");

        //Principal is on top of college
        /*HOD -Maths and Comp. Sc. directly reports to him*/
        Principal.Add(hodMaths);
        Principal.Add(hodCompSc);
        /*Teachers of Mathematics directly reports to HOD-Maths*/
        hodMaths.Add(mathTeacher1);
        hodMaths.Add(mathTeacher2);
        /*Teachers of Computer Sc. directly reports to HOD-Comp.Sc.*/
        hodCompSc.Add(cseTeacher1);
        hodCompSc.Add(cseTeacher2);
        hodCompSc.Add(cseTeacher3);
        /*Leaf nodes. There is no department under Mathematics*/
        mathTeacher1.Add(null);
        mathTeacher2.Add(null);

        /*Leaf nodes. There is no department under CSE.*/
        cseTeacher1.Add(null);
        cseTeacher2.Add(null);
        cseTeacher3.Add(null);
        //Printing the details
        System.out.println("***COMPOSITE PATTERN DEMO ***");
        System.out.println("\nThe college has following structure\n");
        System.out.println(Principal.getDetails());
        List<ITeacher> hods=Principal.getControllingDepts();

        for (ITeacher hod : hods) {
            System.out.println("\t" + hod.getDetails());
        }
        List<ITeacher> mathTeachers=hodMaths.getControllingDepts();

        for (ITeacher mathTeacher : mathTeachers) {
            System.out.println("\t\t" + mathTeacher.getDetails());
        }
        List<ITeacher> cseTeachers=hodCompSc.getControllingDepts();

        for (ITeacher cseTeacher : cseTeachers) {
            System.out.println("\t\t" + cseTeacher.getDetails());
        }
        //One computer teacher is leaving
        hodCompSc.Remove(cseTeacher2);
        System.out.println("\n After CSE Teacher-2 leaving the organization- CSE department has following employees:");
        cseTeachers = hodCompSc.getControllingDepts();

        for (ITeacher cseTeacher : cseTeachers) {
            System.out.println("\t\t" + cseTeacher.getDetails());
        }
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