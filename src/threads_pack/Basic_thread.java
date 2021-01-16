package threads_pack;

class Task1 extends Thread{
	public void run() {
		
//		task1
		System.out.println("task1 started");
		for(int i=101;i<=200;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n task1 finished");
		
	}
}


class Task2 implements Runnable{

	@Override
	public void run() {

//		task2
		System.out.println("task2 started");
		for(int j=201;j<=300;j++) {
			System.out.print(j+" ");
		}
		System.out.println("\n task2 finished");
	}
	
}

public class Basic_thread {

	public static void main(String[] args) {
		System.out.println("task1 kicked off");
		Task1 t=new Task1();
		t.start();
		
		System.out.println("task2 kicked off");
		Task2 t2=new Task2();
		Thread task2_thread=new Thread(t2);
		task2_thread.start();
//		task3
		System.out.println("\ntask3 kicked off");
		System.out.println("task3 started");
		for(int i=301;i<=400;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n task3 finished");
		
		System.out.println("main finished");
		
		
	}

}
