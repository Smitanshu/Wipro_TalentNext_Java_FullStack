package multiThreadingPractice;

public class ThreadDemo1 implements Runnable {

	public void run() {
		System.out.println("Thread is Running :");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadDemo1 threadDemo1 = new ThreadDemo1();
		Thread t1 = new Thread(threadDemo1);
		t1.start();

	}

}
