import cs1.*;

/**
 *  
 * @author Ogulcan Unal
 * @version 04.03.2020
 */ 
public class MySimpleURLReader extends SimpleURLReader {
  
  // properties
  private String url;
  private String content;

  // constructors
  public MySimpleURLReader(String url)
  {
    super(url); //reusing parent constructor  
    this.url = url; 
  }
  
  // methods
  
  // get url 
  public String getURL()
  {
    return url;
  }
  // fixing the null bug
  public String getPageContents() //override
  {
    content = super.getPageContents(); //invoking parent class' method
    return content.substring( 4 , content.length() - 1 );
  }
  // searches for the last / and substring
  public String getName()
  {
    int number;
    number = url.lastIndexOf("/") + 1 ; //returns the part of the url following the last '/' character 
    return url.substring( number );
  }
}
