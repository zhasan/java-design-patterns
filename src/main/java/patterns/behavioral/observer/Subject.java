package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {

    private int myValue;

    private List<IObserver> observerList = new ArrayList<>();

    void setMyValue(int myValue) {
        this.myValue = myValue;
        notifyObservers(myValue);
    }


    @Override
    public void register(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers(int updateValue) {
        for (IObserver anObserverList : observerList) {
            anObserverList.update(updateValue);
        }
    }

    public int getMyValue() {
        return myValue;
    }
}
