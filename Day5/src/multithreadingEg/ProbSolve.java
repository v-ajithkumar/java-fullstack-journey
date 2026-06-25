package multithreadingEg;

public class ProbSolve {
	public static void main(String[] args) throws InterruptedException {
		//Print numbers using two threads.
		Thread t1 = new Thread (new Runnable () {
			public void run() {
				for(int i=1 ; i<=5 ; i++) {
					System.out.println("thread 1: " + i);
				}
			}
		});
		Thread t2 = new Thread (new Runnable () {
			public void run() {
				for(int i=1 ; i<=5 ; i++) {
					System.out.println("thread 1: " + i);
				}
			}
		});
		
		t1.start();
		t2.start();
		
	}
}
