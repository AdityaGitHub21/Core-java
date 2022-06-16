
public class AbstractDemo {

	public static void main(String[] args) {
		Scooty s=new Scooty();
		s.noofwheels();
	}

}

abstract class Vehicle{         //Partially implemented class
	
	abstract public void noofwheels();
}

class Scooty extends Vehicle{

	@Override
	public void noofwheels() {
		System.out.println("No of wheels in scooty:"+2);
	}
	
}