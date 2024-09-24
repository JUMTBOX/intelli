package concurrentPrac.singleton;

import java.util.concurrent.atomic.AtomicInteger;

public class Singleton {
  private final AtomicInteger count = new AtomicInteger(0);

  /** BillPughSingleton Pattern */
  private Singleton() {}

  public static Singleton getInstance() {
    return SingletonHelper.instance;
  }

  synchronized public void counter (int task, Thread currentThread) {
    if(count.get() < 99) {
      count.addAndGet(1);
    } else {
      count.set(0);
    }
    System.out.println("현재 count_ :  " + (count.get() == 0 ? 100 : count.get()) + "  " + Thread.currentThread() + "TASK: " +task);

    if(count.get()==0) {
      try {
        System.out.println("스레드 쉬는 중 " + currentThread);
        Thread.sleep(1000);
      } catch (Exception ignored) {}
    }
  }

  private static class SingletonHelper {
    private static final Singleton instance = new Singleton();
  }
}
