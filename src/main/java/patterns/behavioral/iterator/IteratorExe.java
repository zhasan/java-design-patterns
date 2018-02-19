package patterns.behavioral.iterator;

class IteratorExe {
    public static void main(String[] args) {
        System.out.println("Demo");
        ISubject Sc_subject = new Science();
        ISubject Ar_subject = new Arts();

        IIterator Sc_iterator = Sc_subject.createIterator();
        IIterator Ar_iterator = Ar_subject.createIterator();

        System.out.println("Science");
        Print(Sc_iterator);

        System.out.println("Arts");
        Print(Ar_iterator);

    }

    private static void Print(IIterator iterator) {
        while (!iterator.IsDone()) {
            System.out.println(iterator.Next());
        }
    }
}

/*
    GoF Definition: Provide a way to access the elements of an aggregate object sequentially without exposing
its underlying representation.

    Concept
    Iterators are generally used to traverse a container to access its elements.

    Real-Life Example
    Suppose there are two companies: Company A and Company B. Company A stores its employee records
(name, etc.) in a linked list and Company B stores its employee data in a big array. One day the two
companies decide to work together. The iterator pattern is handy in such a situation. We need not write
codes from scratch. We’ll have a common interface through which we can access data for both companies.
We’ll simply call the same methods without rewriting the codes.

    Computer World Example
    Similarly, say, in a college, the arts department may use array data structure and the science department
may use linked list data structure to store their students’ records. The main administrative department will
access those data through the common methods—it doesn’t care which data structure is used by individual
departments.

    Note
    If you have gone through the above code, probably you now have a fair idea of the power of an iterator and
the significance of this pattern. We can support different variations for the traversal of an aggregate (the
interface to create an Iterator object), and above all, it simplifies the interface.
But we must be careful while traversing and any kind of modification during that traversal period can
cause damage to us. We can take a backup first to deal with this type of scenario, but it is obvious that taking
the backup and reexamining it at some later stage is also a costly operation.

*/