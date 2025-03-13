package mobile;
import java.util.*;
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Mobile name");
		 
		String s=sc.next();
		MobileUse m=MobileFactory.MobileName(s);
		if(m!=null) {
			m.spec();
		}
		else {
			System.out.println();
		}

	}

}
