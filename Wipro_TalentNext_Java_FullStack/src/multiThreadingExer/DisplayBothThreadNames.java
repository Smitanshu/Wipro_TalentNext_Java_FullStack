package multiThreadingExer;

public class DisplayBothThreadNames implements Runnable {
	public void run() {
		System.out.println("Displaying Thread Name : ");

		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DisplayBothThreadNames displyaBothThreadNames = new DisplayBothThreadNames();
		Thread t1 = new Thread(displyaBothThreadNames, "Scooby");
		Thread t2 = new Thread(displyaBothThreadNames, "Shabby");
		t1.start();
		t2.start();

	}

}
