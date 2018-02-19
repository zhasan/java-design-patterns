package patterns.structural.adapter;

 class Calculator {

    private Rect rectangle;

    public double getArea(Rect rectangle) {

        this.rectangle = rectangle;
        return rectangle.l*rectangle.w;
    }
}
