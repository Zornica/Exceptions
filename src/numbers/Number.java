package numbers;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by clouway on 3/23/15.
 */
public class Number {

  private final int from;
  private final int to;

  public Number(int from , int to ){

    this.from = from;
    this.to = to;
  }
  /**
   * Checks whether the elements are in the interval [0,100]
   */
  public void checkInterval(double num) throws OutOfIntervalException {

    if (num > to || num < from) {

      throw new OutOfIntervalException("This number is out of interval [" + from + ","+ to+"]");
    }


  }


}
