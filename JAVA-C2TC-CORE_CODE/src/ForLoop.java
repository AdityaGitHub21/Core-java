/*
public class ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}
*/

public class ForLoop {
	public static void main(String[] args) {
		int number=9;
		boolean isPrime=true;
		for(int i=2;i<number/2;i++) {
			if(number % i ==0) {
				isPrime =false;
			}
		}	
		if(isPrime==true) {
			System.out.println("The number is a prime number");
		}
		else {
			System.out.println("The number is not a prime number");
		}	
	}
}


