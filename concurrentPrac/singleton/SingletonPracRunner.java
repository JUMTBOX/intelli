package concurrentPrac.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class SingletonPracRunner {
  private static final ExecutorService executorService = Executors.newFixedThreadPool(100);

  public static void main(String[] args) {
    MockService mockService = new MockService();
    long startTime = System.currentTimeMillis();

    IntStream.range(1,1001).forEach((task) -> {
      executorService.submit(() -> {
        /* case 1 */
        mockService.doTask(task, Thread.currentThread());

        /* case 2 */
        mockService.doTask2(task, Thread.currentThread());
      });
    });

    executorService.shutdown();

    while (!executorService.isTerminated()) {}

    long endTime = System.currentTimeMillis();
    System.out.println("========= 종료  =========  | 소요 시간 | " + (endTime - startTime)/1000.0 + "초 |");
  }

}
