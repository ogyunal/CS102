import cs1.SimpleURLReader;

/**
 *  
 * @author Ogulcan Unal
 * @version 04.03.2020
 */ 
public class TCMBCurrency {
  
  public static void main(String[] args) {
    String currentUSD;
    String currentEUR;
    HTMLFilteredReader tcmb;
    tcmb= new HTMLFilteredReader("https://www.tcmb.gov.tr/kurlar/today.xml");
    String contents = tcmb.getPageContents();
    
    currentEUR = contents.substring(330,340);
    currentUSD = contents.substring(40, 47);
    System.out.println("Current USD Forex Buying: "  + currentUSD);
    System.out.println("Current EUR Forex Buying: " + currentEUR);
  // System.out.println(contents);
  }
}