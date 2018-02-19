package patterns.structural.facade;

 class RobotFacade {
     private RobotColor rcolor;
     private RobotMetal rmetal;
     private RobotBody rbody;

     public RobotFacade() {
          rcolor = new RobotColor();
          rmetal = new RobotMetal();
          rbody = new RobotBody();

     }

     public void constructRobot(String color, String metal) {


         System.out.println("\nCreation of the Robot Start");
         rcolor.setColor(color);
         rmetal.setMetal(metal);
         rbody.createBody();
         System.out.println(" \nRobot Creation End");
         System.out.println();

     }
 }
