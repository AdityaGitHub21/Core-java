
interface A{
	public abstract void Adisplay(); //Declaration //public abstract by-default
}
interface B{
	void Bdisplay(); //Declaration
}
class Mtb implements A,B{
	@Override
	public void Bdisplay() {
		System.out.println("I Am B Interface");
	}
	

	@Override
	public void Adisplay() {
		System.out.println("I Am A Interface");
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Mtb m=new Mtb();
		m.Adisplay();
		m.Bdisplay();
	}

}
