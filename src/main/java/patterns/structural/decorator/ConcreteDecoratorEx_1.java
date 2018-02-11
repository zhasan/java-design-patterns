package patterns.structural.decorator;

 class ConcreteDecoratorEx_1 extends AbstractDecorator{

     @Override
     public void doJob() {
         super.doJob();
         //Add additional thing if necessary
         System.out.println("I am explicitly from Ex_1");
     }
 }
