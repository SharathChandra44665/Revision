package threads_pack;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor_service_runner {

	public static void main(String[] args) {
		ExecutorService execute_service=Executors.newSingleThreadExecutor();
		execute_service.execute(new Task01());
		execute_service.execute(new Thread(new Task02()));
		
		//task3
		System.out.println("task3 kicked off");
		for(int i=301;i<=400;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n task3 completed");
		System.out.println("main method completed");
		execute_service.shutdown();
		
	}

}
