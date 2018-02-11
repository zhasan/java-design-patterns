package patterns.structural.bridge;

 class GreenColor implements IColor {

    public void fillWithColor(int border) {
        System.out.print("Green color with " +border+" inch border.");
    }
}
