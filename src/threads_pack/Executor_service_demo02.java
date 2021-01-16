package threads_pack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
	private int number;
	public Task(int number) {
		this.number=number;
	}
	
	public void run() {
		System.out.println("Task"+number+" kicked off");
		System.out.println("Task"+number+" started");
		for(int i=number*100;i<=(number*100+100);i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n Task"+number+"completed");
	}
}
public class Executor_service_demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService execute_service= Executors.newFixedThreadPool(2);
//		new Task(3).start();
		
		execute_service.execute(new Task(1));
		execute_service.execute(new Task(2));
		execute_service.execute(new Task(3));
		execute_service.execute(new Task(4));
		execute_service.execute(new Task(5));
		execute_service.execute(new Task(6));
		execute_service.execute(new Task(7));
		execute_service.shutdown();
		
	}

}
