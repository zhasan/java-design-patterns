package patterns.behavioral.observer;

public interface ISubject {
    void register(IObserver observer);
    void unregister(IObserver observer);

    void notifyObservers(int i);

}
