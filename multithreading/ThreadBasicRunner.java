package multithreading;

// extends Thread
// implements Runnable

class Task extends Thread {
  private int taskNum;
  Task (int taskNum) {
    this.taskNum = taskNum;
  }

  public void run() {
      for(int i=taskNum*100; i <= taskNum*100 + 99; i++) {
        System.out.print(i + " ");
      }

      System.out.println("\n Task"+ taskNum +"Done");

  }
}

class Task1 extends Thread {
  public void run() { // SIGNATURE
    for(int i=101; i <= 199; i++) {
      System.out.print(i + " ");
    }

//    Thread.yield();

    System.out.println("\n Task1 Done");
  }
}

class Task2 implements Runnable {
  @Override
  public void run () {
    for(int i=201; i <= 299; i++) {
      System.out.println(i + " ");
    }
    System.out.println("\n Task2 Done");
  }
}

public class ThreadBasicRunner {

  public static void main(String[] args) throws InterruptedException {
    //Task1
    Task1 task1 = new Task1();
    task1.setPriority(1); // 스레드에 우선 순위 부여 - 반드시 지켜지는 것은 아님
    task1.start();
    
    //Task2
    Task2 task2 = new Task2();
    Thread thread = new Thread(task2);
    thread.setPriority(10);
    thread.start();

    task1.join();
    thread.join();

    //Task3
    for(int i=301; i <= 399; i++) {
      System.out.println(i + " ");
    }
    System.out.println("\n Task3 Done");

    System.out.println("\n Main Done");
  }
}
