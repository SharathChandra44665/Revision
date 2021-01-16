package threads_pack;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Multiple_callable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService execute_service=Executors.newFixedThreadPool(3);
		
		List<Do_task> all_tasks=List.of(new Do_task("sharath"), new Do_task("Apple"), new Do_task("Google"));
		List<Future<String>> all_task_list=execute_service.invokeAll(all_tasks);
		
		for(Future<String> value: all_task_list) {
			System.out.println(value.get());
		}
		execute_service.shutdown();
	}

}
