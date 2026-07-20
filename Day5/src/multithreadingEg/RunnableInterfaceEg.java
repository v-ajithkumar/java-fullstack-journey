package multithreadingEg;

public class RunnableInterfaceEg {
	public static void main(String[] args) {
		Runnable book = () -> {
				for (int i = 0; i < 5; i++) {
					System.out.println("db updated");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			};
		
		Thread t1 = new Thread(book);
		Thread t2 = new Thread(book);
		t1.setName("book1");
		t2.setName("book2");
		t1.start();
		t2.start();
		System.out.println(t1.getName());
		System.out.println(t2.getName());
	}
}