package patterns.structural.facade;

 class RobotColor {
     private String color;

     public void setColor(String color) {
         this.color = color;
         System.out.println("Color is set to : "+ this.color);
     }
 }
