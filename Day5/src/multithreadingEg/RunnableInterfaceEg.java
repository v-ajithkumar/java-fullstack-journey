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
		
		t1.start();
		t1.setName("book1");
		System.out.println(t1.getName());
	}
}