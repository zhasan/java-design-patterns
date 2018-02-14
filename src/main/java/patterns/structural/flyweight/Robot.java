package patterns.structural.flyweight;

 class Robot implements IRobot{

     String robotType;
     public String colorOfRobot;

     public Robot(String robotType) {

         this.robotType = robotType;
     }

     public void setColor(String colorOfRobot) {
         this.colorOfRobot = colorOfRobot;
     }

     public void Print() {
         System.out.println(" This is a " + robotType + " type robot with " + colorOfRobot + "color");
     }
 }
