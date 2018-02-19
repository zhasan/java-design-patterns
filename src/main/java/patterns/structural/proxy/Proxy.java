package patterns.structural.proxy;

 class Proxy extends Subject{

    private ConcreteSubject cs;

    @Override
    public void doSomeWork() {

        System.out.println("Proxy call happening now");
        if (cs == null) {
            cs = new ConcreteSubject();
        }
        cs.doSomeWork();
    }
}
