package arjun.kushwah.thread.evenOdd;

public class PrintOdd implements Runnable {
	PrintEvenOdd peo;

	public PrintOdd(PrintEvenOdd peo) {
		this.peo = peo;
	}

	public void run() {
		peo.printOdd();
	}

}
