import java.util.Scanner;
import cs1.SimpleURLReader;

/**
 *  
 * @author Ogulcan Unal
 * @version 04.03.2020
 */ 
public class TestMySimpleURLReader
{
  public static void main( String[] args)
  {
    Scanner scan = new Scanner( System.in);
    
    // variables
    String url;
    String pageContent;
    String name;
    MySimpleURLReader myUrl;
    myUrl = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt");
   
    // program code
    url = myUrl.getURL();
    System.out.println( "Test get url : " + url);
    pageContent = myUrl.getPageContents();
    System.out.println( "Test get Page Contents " + "\n" + pageContent);
    name = myUrl.getName();
    System.out.println( "Test get Name " + name);
    
    
  
  }
  
}
