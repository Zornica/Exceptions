package string;

import java.math.BigDecimal;


/**
 * Created by clouway on 3/23/15.
 */
public class StringCalculator {
  /**
   * Converts string to int and collect the numbers
   *
   * @param a is the first string
   * @param b is the second string
   */
  public BigDecimal sum(String a, String b) {
    BigDecimal s = new BigDecimal(a);
    BigDecimal t = new BigDecimal(b);
    s = s.add(t);
    return s;

  }


}


