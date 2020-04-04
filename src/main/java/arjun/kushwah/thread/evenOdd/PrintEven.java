package arjun.kushwah.thread.evenOdd;

public class PrintEven implements Runnable {
	PrintEvenOdd peo;
	public PrintEven(PrintEvenOdd peo) {
		this.peo=peo;
	}

	public void run() {
		peo.printEven();
	}

}
