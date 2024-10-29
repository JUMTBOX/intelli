package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {
  private String name;
  CallableTask (String name) {
    this.name = name;
  }
  @Override
  public String call() throws Exception {
    Thread.sleep(1000);
    return "Hello " + name;
  }
}
public class CallableRunner {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    ExecutorService executorService = Executors.newFixedThreadPool(1);

    Future<String> promise = executorService.submit(new CallableTask("YANG"));

    System.out.println("\n new CallableTask Executed");

    System.out.println("RETURN >>>> " + promise.get());

    System.out.println("\n Main Completed");

    executorService.shutdown();
  }
}
