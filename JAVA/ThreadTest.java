public class ThreadTest{
	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();

		System.out.println(t.getName());
	}
}

class Processor implements Runnable{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
}