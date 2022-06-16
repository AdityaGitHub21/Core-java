
public class StaticDemo {

	public static void main(String[] args) {
		System.out.println("Executing main block");
		m();
	}
	static {
		System.out.println("Vande Mataram");
	}
	static {
		System.out.println("I Love India");
	}
	static {
		System.out.println("Jai Hind");
	}

	static void m() {
		System.out.println("Bharat");
	}
}