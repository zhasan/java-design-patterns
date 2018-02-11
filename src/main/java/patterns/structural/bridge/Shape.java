package patterns.structural.bridge;

 abstract class Shape {

     protected IColor color;

     protected Shape(IColor color) {

         this.color = color;
     }
    abstract void drawShape(int border) ;

    abstract void modifyBorder(int border, int increment) ;

}
