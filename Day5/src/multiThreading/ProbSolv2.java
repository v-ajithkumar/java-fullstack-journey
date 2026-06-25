package multiThreading;

class OddEven implements Runnable{
	@Override
	public synchronized void run() {
		for(int i=1 ;i<=10;i++) {
			if(i%2==0) {
				System.out.println(i + " is even");
			}else {
				System.out.println(i+ " is odd");
			}
		}
	}
}
public class ProbSolv2 {
     public static void main(String[] args) throws InterruptedException {
    	OddEven o1 = new OddEven();
		Thread t1 = new Thread(o1);
	
		t1.start();
		t1.join();
		System.out.println("main end");
	}
}
