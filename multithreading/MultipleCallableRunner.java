package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executorService = Executors.newFixedThreadPool(3);

   List<CallableTask> taskList = List.of(new CallableTask("TEST1"), new CallableTask("TEST2"), new CallableTask("TEST3"));

    List<Future<String>> results = executorService.invokeAll(taskList);

    results.forEach(result -> {
      try {
        System.out.println("RESULT   >>>>   " + result.get());
      } catch (Exception ignored) {}
    });

    String result = executorService.invokeAny(taskList);

    System.out.println("RESULT2   >>>> " + result);
    executorService.shutdown();
  }
}
