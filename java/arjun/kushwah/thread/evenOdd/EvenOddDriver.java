package arjun.kushwah.thread.evenOdd;

public class EvenOddDriver {

	public static void main(String[] args) {
		PrintEvenOdd peo=new PrintEvenOdd(1, 10);
		Thread even=new Thread(new PrintEven(peo));
		even.setName("even Thread		 :");
		Thread odd=new Thread(new PrintOdd(peo));
		odd.setName("odd thread   		 :");
		even.start();
		odd.start();

	}

}
