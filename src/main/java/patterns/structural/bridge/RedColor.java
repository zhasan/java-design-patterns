package patterns.structural.bridge;

 class RedColor implements IColor {

    public void fillWithColor(int border) {
         System.out.print("Red color with " +border+" inch border");

    }
}
