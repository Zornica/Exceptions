package objects;

/**
 * Created by clouway on 3/30/15.
 */
public class Demo {
  public static void main(String[] args) {
    //int n = 5;
    Object[] arr = new Object[5];
    Objects list = new Objects(arr);

        list.add(1000);
    list.add(678);
    list.remove();

    list.printAllElement();



//    list.add(1000);
//    list.add("Pena");
//    list.add(1.678);
//    list.add("dnmeiodm");
//    list.add("Stoqn");
//
//
//    list.printAllElement();
//    System.out.println("------------------------");
//    try {
//      list.remove();
//
//    } catch (RuntimeException ex) {
//      System.out.println("List is  underflow");
//    }
//    System.out.println("------------------------");
//    list.printAllElement();
//    System.out.println("------------------------");
//    list.add(100055);
//    list.printAllElement();
//    System.out.println("---------------");
//
//    try {
//      list.add("Stoqn");
//
//    } catch (ArrayIndexOutOfBoundsException ex) {
//      System.out.println("The list is full");
//    }

  }
}
