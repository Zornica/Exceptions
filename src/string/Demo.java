package string;

import java.util.Scanner;

/**
 * Created by clouway on 3/23/15.
 */
public class Demo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();

    String b = sc.nextLine();


    StringCalculator str = new StringCalculator();
    try {
      System.out.println("Sum is: " + str.sum(a, b));
    } catch (NumberFormatException ex) {
      System.err.println("Illegal input");
    }
  }
}
