package mobile;

public class Iphone implements MobileUse{
   Iphone(){
	   System.out.println("Object is created");
   }
   @Override
   public void spec() {
	   System.out.println("Iphone has more security");
   }
   
}
