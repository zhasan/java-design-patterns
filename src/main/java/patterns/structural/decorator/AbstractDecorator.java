package patterns.structural.decorator;

abstract class AbstractDecorator extends Component{
    private Component component;

    @Override
    public void doJob() {
        if (component != null) {
            component.doJob();
        }

    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
