package numbers;

import java.util.Scanner;

/**
 * Created by clouway on 3/23/15.
 */
public class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("N = ");
    int n = sc.nextInt();
    int from = 40;
    int to = 50;
    int br = 0;
    Number number = new Number(from , to);
    while (br <n) {
      System.out.println(" ");
      System.out.print("B = ");
      double b = sc.nextDouble();
      br++;

      try {
        System.out.println(" ");
        number.checkInterval(b);
      } catch (OutOfIntervalException ex) {
        System.out.println(ex.getMessage());
      }
    }
  }
}
