package patterns.structural.proxy;

 class ConcreteSubject extends Subject {
    @Override
    public void doSomeWork() {
        System.out.print("I am from concrete subject");
    }
}
