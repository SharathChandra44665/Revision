package threads_pack;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mutliple_callable_any {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService execute_service = Executors.newFixedThreadPool(3);
		
		List<Do_task> tasks=List.of(new Do_task("sharath"),new Do_task("Sony"),new Do_task("Boat"));
		
		String value=execute_service.invokeAny(tasks);
		System.out.println(value);
		execute_service.shutdown();
	}

}
