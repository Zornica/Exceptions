package stack;

/**
 * Created by clouway on 3/23/15.
 */
class Stack {
  java.util.Stack<Object> st = new java.util.Stack<Object>();

  /**
   * Constructor
   */
  Stack() {}

  /**
   * Adds new element in stack
   * @param obj is element which we add
   */
  public void add(Object obj) {
    if (4 < st.size()) {
      System.out.println("Stack is full");
      return;
    } else {
      st.push(obj);

    }
  }

  /**
   * Removes element from stack
   * @return removed element
   */
  public Object remove() {
    if (st.isEmpty()) {
      throw new RuntimeException("Stack underflow");
    } else {
      return st.pop();
    }
  }

  /**
   * Prints all element in stack
   */
  public void printAllElements() {
//
//    while (st.size() != 0) {
//      System.out.print(st.pop() + " , ");
//    }

    for (Object o: st) {
      System.out.println(o);
    }


  }
}

