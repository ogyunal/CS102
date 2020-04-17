import java.util.Scanner;

/**
 * @author Ogulcan Unal
 * @version 04.03.2020
 */ 
public class TestHTMLFilteredReader
{
  
  public static void main(String[] args) 
  {
    
    HTMLFilteredReader h = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/%7Edavid/housman.htm");
    
    System.out.println( h.getUnfilteredPageContents());
    
    System.out.println();
    
    System.out.println("------------------------------------------------------");
    
    System.out.println( h.getPageContents());
    
    System.out.println( "Line count is: " + h.getLineCount());
    
    System.out.println();
    
    System.out.println("-------------------------------------------------------");
    
    
    //XHTML FILTER READER TEST BY NOW ON
    
    XHTMLFilteredReader a = new XHTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/index.html");
    
    System.out.println( "Links: " + a.getLinks());
    
    System.out.println( "Percentage is: %" +  a.getPercent());
    
    System.out.println();
    
    System.out.println("-------------------------------------------------------");
    
    System.out.println();
    
    
    
    
  }
}
