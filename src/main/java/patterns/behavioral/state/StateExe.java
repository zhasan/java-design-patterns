package patterns.behavioral.state;

public class StateExe {
    public static void main(String[] args) {
        System.out.println();
        Off initState = new Off();
        TV tv = new TV(initState);
        tv.pressButton();
        tv.pressButton();
    }
}
