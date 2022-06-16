
public class StaticDemos {
	String name;
	int roll;
	static String college="St John College";   //CLASS BOUND
	
	public StaticDemos(String name,int roll) {
		super ();
		this.roll=roll;
		this.name=name;
	}

	void display() {
		System.out.println(roll+"  "+name+"  "+college);
		
	}
	static void change() {
		college="Mumbai University";
	}
	

	public static void main(String[] args) {
		StaticDemos s=new StaticDemos("Alia",1);
		StaticDemos s1=new StaticDemos("Allisa",2);
		s.display();
		s1.display();
		change();
		StaticDemos.change();
		s.display();
		s1.display();
		
	}

}
