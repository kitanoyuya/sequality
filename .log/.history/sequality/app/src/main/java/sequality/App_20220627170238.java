/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sequality;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

    Calculate calculate = new Calculate();
    System.out.println("Sum of 2 and 3 is" + calculate.sum(2, 3) + "Average is " + calculate.ave(
        calculate.sum(2, 3),2));

    System.out
        .println("Sum of 1 and 10 is" + calculate.sum2(1, 10) + "Average is " + calculate.ave(calculate.sum2(1, 10),10));

    System.out
        .println("Sum of odd of 1 to 10 is" + calculate.sum3(1, 10) + ".");

    System.out
        .println("Sum of even of 1 to is" + calculate.sum4(1, 10) + ".");
  }
}
