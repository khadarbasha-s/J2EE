package mobile;

public class MobileFactory {
      static MobileUse MobileName(String name) {
    	   if(name.equalsIgnoreCase("Iphone")) {
    		   return new Iphone();
    	   }
    	   else if(name.equalsIgnoreCase("Samsung")) {
    		   return new Samsung();
    	   }
    	   else if(name.equalsIgnoreCase("Onepluse")) {
    		  return new Oneplus();
    	   }
    	   else {
    		   System.out.println("This mobile is not available in our store");
    		   return null;
    	   }
       }
}
