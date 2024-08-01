package multiThreadingPractice;

public class ThreadDemo2 implements Runnable {
	
	public void run() {
		for(int i=0; i<10; i++) {
		 System.out.println("Running Thread :"+ i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 threadDemo2=new ThreadDemo2();
		Thread t1=new Thread(threadDemo2);
		t1.start();
		

	}

}
