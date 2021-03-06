import junit.framework.TestCase;

/**
 * This class is a test of List class
 * @author Oğulcan Ünal
 * @version 12.05.2020
 * */
public class TestMain 
{
 public static void main(String[] args)
 {
  String strTest1 = "AHCJDS";
  String strTest2 = "ABCFSC";
  
  List a = List.createFrom(strTest1);
  List b = List.createFrom(strTest2);
  
  List c = List.merger(a, b);
  System.out.println(a);
  System.out.println(b);
  System.out.println(c);
  c.removeFromHead();
  System.out.println(c);
  System.out.println(c.isEmpty());
  List d  = new List();
  System.out.println(d);
  System.out.println(d.removeFromHead());
  System.out.println(d.isEmpty());
  a.print();
  a.printReverse();
  List order = List.createFrom("ABCDabcd");
  System.out.println(order.isOrdered());
 }
}