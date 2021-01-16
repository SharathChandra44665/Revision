package threads_pack;
class Task01 extends Thread{

	public void run() {
		System.out.println("task1 started");
		for(int i=1;i<=100;i++) {
			System.out.print(i+" ");
		}
		Thread.yield();//release cpu incase not required, its a just request
		System.out.println("\ntask1 finished");
	}
}

class Task02 implements Runnable{

	@Override
	public void run() {
		System.out.println("task2 started");
		for(int i=101;i<=200;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\ntask2 finished");
		
	}
	
}
public class Thread_execute_preferred_task {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("task1 kickedoff");
		Task01 t1=new Task01();
		t1.setPriority(1);
		t1.start();
		
		System.out.println("task2 kickedoff");
		Task02 t2=new Task02();
		Thread t2_thread=new Thread(t2);
		t2_thread.setPriority(10);
		t2_thread.start();
		t1.join();
		t2_thread.join();
		
		//task3
		System.out.println("task3 kickedoff");
		System.out.println("task3 started");
		for(int i=201;i<=300;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\ntask3 finished");
		
		System.out.println("main is finished");
		
		
	}

}
