package stack;


/**
 * Created by clouway on 3/23/15.
 */
public class Demo {

  public static void main(String[] args) {

    Stack stack = new Stack();

    System.out.println(" ");

    stack.add(" Ivan");
    stack.add(2);
    stack.add(3.9);
    stack.add("a b c");
    stack.add("39");
    stack.add(3.91561564);
    System.out.println(" ");
    System.out.println(" ");
    System.out.print("The element which we remove from stack is :  " + stack.remove());
    System.out.println(" ");
    System.out.println(" ");
    stack.add("Pena");
    stack.add(125);
    System.out.println(" ");
    System.out.println(" ");
    System.out.print(" The new stack has elements : ");
    stack.printAllElements();
    System.out.println(" ");
    System.out.println(" ");
    /*System.out.print("The element which we remove from stack is :  "+ stack.remove());*/
  }

}
