import junit.framework.TestCase;
/**
 * This class is a test of List class
 * @author Oğulcan Ünal
 * @version 12.05.2020
 * */

public class ListTest extends TestCase {

 public void testGetData() {
  List list = List.createFrom("ogulcan");
  assertEquals("u", list.getData(0));
 }
 
 public void testRemove() {
  String[] arr = {"ogulcan", "ogy", "unal"};
  List list = List.createFrom(arr);
  assertEquals("ogulcan", list.removeFromHead());
 }

 public void testEmpty() {
  String[] arr = {"ogulcansak", "lamia", "unal"};
  List list = List.createFrom(arr);
  assertEquals(false, list.isEmpty());
 }
 

 public void testContains() {
  String[] arr = {"ogulcan", "ogy", "unal"};
  List list = List.createFrom(arr);
  assertEquals(true, list.contains("unal"));
 }
 

 public void testOrder() {
  String[] arr = {"ogulcan", "ogy", "unal"};
  List list = List.createFrom(arr);
  assertEquals(false, list.isOrdered());
 }
}