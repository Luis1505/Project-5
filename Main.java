  import java.util.scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("How much time is there left until the rocket launch");
    scanner.scan = nextInt();
    minutesWasted();
    addedTime();
  }
  public static void minutesWasted(int timePassed) {
    if (timePassed == 0) {
      System.out.println("Blast off!");
    } else {
      System.out.println(timePassed);
      timePassed--;
      minutesWasted(timePassed);
    }
  }
  public static int addedTime(int timeAdded) {
    if (timeAdded == 10) {
      System.out.println("There is a 10 minute delay.");
    } else {
      return timeAdded + 1;

    }
  }
} 