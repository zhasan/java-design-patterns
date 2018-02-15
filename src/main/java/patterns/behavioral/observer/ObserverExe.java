package patterns.behavioral.observer;

import java.util.Collections;

public class ObserverExe {
    public static void main(String[] args) {

        System.out.println();
        Subject sub = new Subject();
        Observer1 ob1 = new Observer1();
        Obsersver2 ob2 = new Obsersver2();

        sub.register(ob1);
        sub.register(ob2);

        sub.setMyValue(5);
        System.out.println();
        sub.setMyValue(25);
        System.out.println();

        sub.unregister(ob1);
        sub.setMyValue(100);
    }
}
