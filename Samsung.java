package mobile;

public class Samsung implements MobileUse{
	Samsung(){
		System.out.println("Samsung Object created");
	}
	@Override
	public void spec() {
		System.out.println("Samsung has good quality Screen");
	}

}
