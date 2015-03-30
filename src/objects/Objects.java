package objects;

/**
 * Created by clouway on 3/30/15.
 */
public class Objects {
  private Object[] array;
  int index = 0;

  /**
   * Constructor
   */
  public Objects(Object[] arr) {
    array = arr;
  }

  /**
   * Adds new element in list
   *
   * @param obj is element which we add
   */
  public void add(Object obj) {
    if (index > array.length) {
      throw new ArrayIndexOutOfBoundsException("The list is full");
    } else {
      array[index] = obj;
      index++;

    }

  }

  /**
   * Removes element from list
   *
   * @return removed element
   */
  public void remove() {
    if (array[0] == null) {
      throw new RuntimeException("List is  underflow");
    } else {


      index--;
      array[index] = null;
    }
  }

  /**
   * Prints all element in list
   */
  public void printAllElement() {
    for (int i = 0; i < index; i++) {
      System.out.println(array[i] + " ");
    }
  }


}
