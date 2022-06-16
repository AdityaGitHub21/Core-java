
public class Outer {
	static int x=12;
	
		static class Inner{
			public void demo() {
				System.out.println("I am Inner Class");
				x=100;
			}
		}

	public static void main(String[] args) {
		Outer.Inner obj=new Outer.Inner();
		obj.demo();

	}

}
