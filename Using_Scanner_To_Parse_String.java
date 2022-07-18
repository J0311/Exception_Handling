
import java.util.*; 


public class Using_Scanner_To_Parse_String {

	public static void main(String[] args) {

		String flightRecord1 = "AA123,BWI,SFO,235,239.5";
		
		try (Scanner parse = new Scanner(flightRecord1)) {
			
// The Scanner object parse is instantiated using the constructor with a String argument, flightRecord1, 
// the String that we want to tokenize. Below, we call the useDelimiter() method to set the delimiter to 
// a comma.
			
			parse.useDelimiter(",");

// Below, we call the next, nextInt, and nextDouble methods to retrieve the five tokens of flightRecord1 
// and process them, echoing them to the console. Since we know the format of the String flightRecord1, 
// we can call the appropriate method based on the data type we expect to find at that position in the 
// String. Although these methods throw exceptions, these exceptions are unchecked exceptions and thus 
// the try and catch blocks are not mandatory. The nextInt, nextDouble, … methods will throw an 
// InputMismatchException if the token retrieved cannot be converted to the expected data type. They will 
// throw a NoSuchElementException if there are no more tokens to retrieve. Finally, they will throw an 
// IllegalStateException if the Scanner object has been closed. We catch all these exceptions, from the 
// most specific to the most general and in the order in which they are most likely to be thrown.
			
			System.out.println(parse.next()); // flight number
			System.out.println(parse.next()); // origin airport
			System.out.println(parse.next()); // destination airport
			System.out.println(parse.nextInt()); // number of passengers
			System.out.println(parse.nextDouble()); // average ticket price
			
		} 
		
		catch (InputMismatchException ime) {
			System.out.println("Error in data format");
		}
		
		catch (NoSuchElementException nse) {
			System.out.println("No more tokens");
		}
		
		catch (IllegalStateException ise) {
			ise.printStackTrace();
		}
		
		
// If we want to process all the tokens as Strings with a loop construct, we can call the hasNext method 
// to check if there are more tokens to process as in the following:

//	while ( parse.hasNext( ) ){
 //  System.out.println( parse.next( ) );
		//  }
		
// Eventually, when all tokens have been retrieved, the hasNext method returns false, which causes us to 
// exit the while loop.
	}
}
