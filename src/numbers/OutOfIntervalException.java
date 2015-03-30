package numbers;

/**
 * Created by clouway on 3/30/15.
 */
public class OutOfIntervalException extends Exception {
  /**
   * Constructor with parameters
   *
   * @param message
   */
  public OutOfIntervalException(String message) {
    super(message);
  }
}
