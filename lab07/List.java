import junit.framework.TestCase;

/**
 * This class is about linkedlist
 * @author Oğulcan Ünal
 * @version 12.05.2020
 * */

public class List extends TestCase
{
 private Node head;
 
 public List() 
 {
  head = null;
 }

 /**
  * This method adds item from the head part
  * @param item String
  * */
 public void addToHead(String item) 
 {
  head = new Node(item, head);
 }
 
 /**
  * This method adds item from the tail part
  * @param item String
  * */
 public void addToTail(String item) 
 {
  this.tail().next = new Node(item, null); 
 }
 
 /**
  * This method removes item from the head part
  * @return removed node's data
  * */
 public String removeFromHead() 
 {
  if (head != null)
  {
   String data;
   data = head.data;
   head = head.next;
   return data;
  }
  return "";
 }
 
 /**
  * This method controls whether the list is empty or not
  * @return if empty true, else false
  * */
 public boolean isEmpty()
 {
  if (head == null)
   return true;
  return false;
 }
 
 /**
  * This method gets data from the given index
  * @param index int
  * @return data in the given index - String
  * */
 public String getData(int index)
 {
  Node tmp;
  String result;
  
  tmp = head;
  result = null;
  
  for (int i = 0; tmp != null && i <= index; i++)
  {
   if (i == index) 
   {
    result = tmp.data;
   }
   tmp = tmp.next;
  }
  return result;
 }
 
 /**
  * This method prints the list starting from head [iterative]
  * */
 public void print() 
 {
  System.out.println(this.toString());
 }
 
 /**
  * This method takes a node and provide a String from
  * connected datas [recursion]
  * @param n Node
  * @return Datas from nodes - String
  * */
 private String reverse (Node n)
 {
  if (n != null)
   return reverse(n.next) + " " + n.data;
  return "";
 }
 
 /**
  * This method prints list in the reverse order
  * */
 public void printReverse()
 {
  Node tmp;
  tmp = head;
  
  System.out.println("[" + this.reverse(tmp) + " ]");
 }
 
 /**
  * This method checks whether the list contains target, or not
  * @param target String
  * @return if contains true, else false
  * */
 public boolean contains(String target)
 {
  Node tmp;
  boolean found;
  
  found = false;
  tmp = head;
  
  while (tmp != null && !found)
  {
   if (tmp.data.equals(target))
    found = true;
   tmp = tmp.next;
  }
  return found;
 }
 
 /**
  * This method checks whether the list is in lexicographic
  * order or not
  * @return if ordered true, else false
  * */
 
 public boolean isOrdered()
 {
  Node prev;
  Node tmp;
  boolean order;
  
  order = true;
  tmp = head;
  
  if (tmp == null)
   order = false;
  
  while (tmp != null && order)
  {
   prev = tmp;
   tmp = tmp.next;
   
   if (tmp != null)
    if (tmp.data.compareTo(prev.data) < 0)
     order = false;
  }
  return order;
 }
 
 //hint
 
 /**
  * This method prints the list
  * @return String that contains datas from the list
  * */
 public String toString() 
 {
  String result;
  Node tmp;
  
  result = "[ ";
  tmp = head;
  while (tmp != null)
  {
   result += tmp.data + " ";
   tmp = tmp.next;
  }
  result += "]";
  return result;
 }
 
 //combining lists
 
 /**
  * This method creates List from String array
  * @param arr String[]
  * @return created list from String array
  * */
 public static List createFrom(String[] arr) 
 {
  List result;
  
  result = new List();
  
  result.addToHead(arr[0]);
  
  for (int i = 0; i < arr.length; i++)
  {
   result.addToTail(arr[i]);
  }
  
  return result;
 }
 
 /**
  * This method creates List from a String and its chars
  * @param str String
  * @return created list from a String
  * */
 public static List createFrom(String str)
 {
  List result;
  
  result = new List();
  
  result.addToHead(str.charAt(0) + "");
  
  for (int i = 1; i < str.length(); i++)
  {
   result.addToTail(str.charAt(i) + "");
  }
  
  return result;
 } 
 
 /**
  * This method creates List rely on two 
  * independent list with noncommon chars
  * 
  * @param a List, b List
  * @return created list from other Lists
  * */
 public static List merger(List a, List b)
 {
  List result;
  Node tmp1;
  Node tmp2;
  
  result = new List();
  tmp1 = a.head;
  tmp2 = b.head;
  
  while(tmp1 != null) 
  {
   if (!b.contains(tmp1.data)) {
    result.addToHead(tmp1.data);
   }
   tmp1 = tmp1.next;
  }
  
  while(tmp2 != null) 
  {
   if (!a.contains(tmp2.data))
    result.addToHead(tmp2.data);
   tmp2 = tmp2.next;
  }
  return result;
 }
 
 
 /**
  * This method returns next Node of the node n
  * @param n Node
  * @return next Node
  * */
 private Node next(Node n) 
 {
  if (n.next != null)
   return n.next;
  return null;
 }
 
 /**
  * This method gets the Node from the tail
  * @return Node in the tail
  * */
 private Node tail()
 {
  Node result;
  Node tmp;
  
  result = null;
  tmp = head;
  
  while (tmp != null)
  {
   result = tmp;
   tmp = tmp.next;
  }
  return result;
 }
 
 /**
  * This class takes String and next Node
  * @author Oğulcan Ünal
  * @version 08.05.2019
  * */
 private class Node
 {
  String data;
  Node next;
  
  public Node(String data, Node next)
  {
   this.data = data;
   this.next = next;
  }
 }
}