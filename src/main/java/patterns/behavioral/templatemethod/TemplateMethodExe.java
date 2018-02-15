package patterns.behavioral.templatemethod;

public class TemplateMethodExe {
    public static void main(String[] args) {

        System.out.println("Demo");
        BasicEnginering bs = new ComputerScience();
        System.out.println("Comp Sc Papers");
        bs.Papers();
        System.out.println();
        bs = new Electronics();
        System.out.println("Electr");
        bs.Papers();
    }
}
