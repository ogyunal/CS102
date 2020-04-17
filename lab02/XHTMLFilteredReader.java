import cs1.SimpleURLReader;
import java.util.*;
/**
 *  
 * @author Ogulcan Unal
 * @version 04.03.2020
 */ 
public class XHTMLFilteredReader extends HTMLFilteredReader
{
   // properities
   ArrayList<String> arrayList;
   
   // constructor
   public XHTMLFilteredReader( String URL )
   {
      super( URL );
   }
   
   // methods
   public ArrayList getLinks()
   {
      String  content;
      String  findingHref;
      String  added;
      
      arrayList = new ArrayList<String>();
      content =   super.getUnfilteredPageContents();
      findingHref = "";
      added = "";
      
      for (int i = 0 ; i < content.length() - 6 ; i++)
      {
         findingHref = "";
         added  = "";
         for ( int j = i ; j < i + 5 ; j++)
         {
            findingHref = findingHref + content.charAt(j);
            if ( findingHref.equals( "href="))
            {
               for (int k = j + 2 ; !(content.charAt(k) == ('"')) ; k++ )
               {
                  added = added + content.charAt(k);
               }
               arrayList.add( added );
               i = i + 5;
            }
         }
      } 
      return arrayList;
   }
   
   //getPercent Method
   public double getPercent() {
   
      double unfiltered = ( super.getUnfilteredPageContents()).length() ;
      double filtered = ( super.getPageContents()).length() ;
      
      return 100 * (( unfiltered - filtered) / unfiltered); //computes percentagewise
   }
}