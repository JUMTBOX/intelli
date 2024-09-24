package concurrentPrac.singleton;

public class MockService {
  private int count = 0;

  /* Case 1 */
  synchronized public void doTask (int task, Thread currentThread) {
    System.out.println("======================= DO_TASK_"+ task + "_"+ currentThread + "=======================");
    System.out.println(" ");

    if(count < 99) {
      count++;
    } else {
      count = 0;
    }
    System.out.println("현재 count_ :  " + (count == 0 ? 100 : count) + "  " + Thread.currentThread() + "TASK: " +task);

    if(count==0) {
      try {
        System.out.println("스레드 쉬는 중 " + currentThread);
        Thread.sleep(1000);
      } catch (Exception ignored) {}
    }
  }

  /* Case 2 */
  public void doTask2 (int task, Thread currentThread) {
    System.out.println("======================= DO_TASK2_"+ task + "_"+ currentThread + "=======================");
    Singleton.getInstance().counter(task, currentThread);
  }
}

