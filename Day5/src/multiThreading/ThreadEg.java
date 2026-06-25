package multiThreading;

class Book extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("db updated");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Print extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("printed.....");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEg {
	public static void main(String[] args) throws InterruptedException {
		Book b1 = new Book();
		Print p1 = new Print();
		
		b1.start();
		b1.start();
		p1.start();
		
		if(b1.isAlive()) {
			System.out.println("thread is alive (b1)");
		}
		
		b1.join();
		p1.join();
		
		
		System.out.println("main end");
	}
}
