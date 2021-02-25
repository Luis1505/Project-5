class Main {
  public static void main(String[] args) {
    rocketLaunch(5);
    endingLine(1);
  }
// this is the rocket countdown that counts down until its ready to blast off 
  public static void rocketLaunch(int n) {
    if (n == 0) {
      System.out.println("Blast off");
    } else {
      System.out.println(n);
      n--;
      rocketLaunch(n);
   }
  } //This is the process of the rocket launching out of earth and to mars. 
  public static void endingLine(int j){
    if (j==0){
      System.out.println("The lands at mars");
    }else{
      System.out.println("The rocket is leaves the mesosphere.");
      System.out.println("The rocket leaves earth and is in space.");
      System.out.println("The rocket comes across mars ");
      System.out.println("Will the rocket land perfectly on the martian surface?");
      System.out.println("The lands in Mars untouched!");
      j--;
      endingLine(j);
    }
  }
}