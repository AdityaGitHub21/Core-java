
public class MethodOverloading {

	public static void main(String[] args) {
		Test t= new Test();
		t.m();
		t.m(56);
		t.m(3435.6);
		t.m('a');
		t.m(10l);
		t.m("fh");
	}
}
class Test{
	public void m() {
		System.out.println("No Arguments");
	}
	public void m(int i) {
		System.out.println("Integer Arguments");
	}
	public void m(double i) {
		System.out.println("Double Arguments");
	}
	public void m(String i) {
		System.out.println("String Arguments");
	}
}
