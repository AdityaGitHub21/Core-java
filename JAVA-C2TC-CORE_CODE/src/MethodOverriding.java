
public class MethodOverriding {

	public static void main(String[] args) {
		Tests t=new Tests();
		t.merry();
	}

}
class Parents{
	void property(){
		System.out.println("House Money Jwellery");
	}
	void merry() {
		System.out.println("shri Lata");   //DEFINATION
	}
}
class Tests extends Parents{
	void merry() {
		System.out.println("Katrina");  //NEW DEFINITION ...OVERRIDING
	}
}