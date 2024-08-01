package multiThreadingPractice;

public class MultipleThreads implements Runnable {

	public void run() {

		for (int counter = 0; counter < 10; counter++) {
			System.out.println(Thread.currentThread().getName() + "Thread is running-->"+ counter);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleThreads obj1=new MultipleThreads();
		Thread t1=new Thread(obj1, "first");
		Thread t2=new Thread(obj1, "second");
		t1.start();
		t2.start();

	}

}
