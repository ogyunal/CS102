/**
 *  
 * @author Ogulcan Unal
 * @version 04.03.2020
 */ 

public class HTMLFilteredReader extends MySimpleURLReader
{
   // properties
   private String htmlUrl;
   
   // constructors
   public HTMLFilteredReader( String htmlUrl )
   {
      super(htmlUrl);//use parents constructor
      this.htmlUrl = htmlUrl;
   }
   
   // methods
   
   //getPageContents() method should return only the text, without the html
   public String getPageContents()
   {
      String unfilteredContents = super.getPageContents();
      Boolean html = false;
      String filteredContents = "";
      String check = "";
      
      for ( int i = 0; i < unfilteredContents.length(); i++)
      {
         check = "" + unfilteredContents.charAt( i);
         if ( check.equals(">"))
         {
            html = false;
         }
         
         if ( check.equals("<"))
         {
            html = true;
         }
         
         if ( !html && !check.equals(">"))
         {
            filteredContents = filteredContents + unfilteredContents.charAt( i);
         }
      }
      return filteredContents.replaceAll( "&quot;", "\"");
   }
   
   //getUnfilteredPageContents() can be called to return the original page complete with html codes. 
   public String getUnfilteredPageContents()
   {
      return super.getPageContents();
   }
}
