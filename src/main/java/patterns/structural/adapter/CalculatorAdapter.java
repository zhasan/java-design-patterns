package patterns.structural.adapter;

 class CalculatorAdapter {

    Calculator calculator;
    Triangle triangle;

    public double getArea(Triangle triangle) {
        calculator = new Calculator();
        this.triangle = triangle;
        Rect r =new Rect();
        r.l = triangle.b;
        r.w  = 0.5*triangle.h;
        return calculator.getArea(r);
    }
}
