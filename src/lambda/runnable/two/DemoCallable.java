package lambda.runnable.two;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DemoCallable 
{
	public static void main(String[] args) 
	{
		Callable callable = () -> {
			for(int i=0;i<=10;i++)
			{
				System.out.println(i);
			}
		return null;
	};
	
	ExecutorService exService = Executors.newFixedThreadPool(1);
	exService.submit(callable);
	
	}

}
