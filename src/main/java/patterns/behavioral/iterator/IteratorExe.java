package patterns.behavioral.iterator;

public class IteratorExe {
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
