package patterns.structural.decorator;

class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println(" I am from Concrete Component-I am closed for modification.");
    }
}
