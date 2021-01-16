package threads_pack;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Do_task implements Callable<String>{
	private String name;
	Do_task(String name){
		this.name=name;
	}
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello "+ name;
	}
	
}
public class Callable_runner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService execute_service=Executors.newFixedThreadPool(1);
		
		Future<String> value=execute_service.submit(new Do_task("sharath"));
		System.out.println("callable task called");
		String name=value.get();
		System.out.println(name);
		System.out.println("main finished");
		execute_service.shutdown();
	}

}
