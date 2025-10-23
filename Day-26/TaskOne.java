class Car{
    private int speed=0; //This is the data we want to protect
    public void setspeed(int newspeed){
        if(newspeed>=0 && newspeed<=200){
            this.speed=newspeed;
            System.out.println("speed is set to :"+newspeed);
        }else{
            System.out.println("-> Error:invalid speed value:"+newspeed+"rejected.");


        }


    }
    //Getter-> controlled access to the data
    public int getspeed(){
        return this.speed;
    }
}
class A{
    String aa;
    int bb;
    public A(String aa,int bb){
        this.aa=aa;
        this.bb=bb;
    }
     public A(String aa){
        this(aa,0);
     }
     public void show(){
        System.out.println("aa:"+aa);
         System.out.println("bb:"+bb);
     }
}
public class TaskOne{
    public static void main(String[] args) {
        Car cc=new Car();
        cc.setspeed(10);
        System.out.println("speed:"+cc.getspeed());

        A obj=new A("hello");
        obj.show();
    }

}