package arjun.kushwah.thread.evenOdd;

public class PrintEvenOdd {
	int start,max;
	public PrintEvenOdd(int start,int max) {
		super();
		this.start=start;
		this.max=max;
	}

	public void printEven() {
		while(start<=max) {
			synchronized(this){
				if(start%2==0) {
					System.out.println(Thread.currentThread().getName()+start);	
					start++;
					this.notify();
				}else {
					try {
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}
	}

	public void printOdd() {
		while(start<=max) {
			synchronized(this){
				if(start%2!=0) {
					System.out.println(Thread.currentThread().getName()+start);	
					start++;
					this.notify();
				}else {
					try {
						wait();
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		}
	}
}
