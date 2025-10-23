abstract class vehical{
    abstract void start();
    void refuel(){
        System.out.println("vehical is refuled");

    }
}
class Car extends vehical{
   
    void start(){
        System.out.println("vehical is started");
    }
     void refual(){
          System.out.println("car is refuled");

     }
}
public class Main {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.refuel();
        c1.start();
        
    }
    
}
