package multithreadingEg;

class CakeCounter {
	int cakeCount;

	public  void increment() {
		cakeCount++;
	}

}

public class SynchronizedEg {
	public static void main(String[] args) throws InterruptedException {
		CakeCounter count = new CakeCounter();
		Thread team1 = new Thread(new Runnable()
		{
			public void run() {
				for(int i=0 ; i<1000 ; i++) {
					count.increment();
				}
			}
		});
		
		Thread team2 = new Thread(new Runnable()
		{
			public void run() {
				for(int i=0 ; i<1000 ; i++) {
					count.increment();
				}
			}
		});
		
		
		team1.start();
		team2.start();
		team1.join();
		team2.join();
		System.out.println(count.cakeCount);
	}
}