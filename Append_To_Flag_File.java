// Appending text to a file is similar to writing text; the only difference  
// is that the second argument of the FileWriter constructor is true, 
// instead of false.
	
import java.io.*;
import java.util.*;
	 
	  public class Append_To_Flag_File {
		  
		  static final int PIXELS = 10;
		  
		 public static void main(String[] args) {
			
			 int lines = 0;
			 Scanner scan = new Scanner(System.in);
			 boolean goodInput = false;
			 
// We loop until the user inputs an integer whose value is between 20 and 50, inclusive. We use a boolean variable, 
// "goodInput", to monitor the validity of the value entered by the user. As long as goodInput is false, we keep 
// asking the user for a new value. If the user does not enter an integer, we execute the catch block and flush 
// the input stream. If we instead leave the invalid user input in the input stream, we would attempt to read that 
// invalid user input again at the next iteration of the loop. If the user enters an integer, we test that the value 
// is between 20 and 50. If the input is valid, we change goodInput to true and exit the loop.
			 
			 do {
				 try {	
					 // prompt for input; expect value is an int
					 
					 System.out.println("Enter a number of lines (20 to 50" + "to append >");
					 lines = scan.nextInt();
					 if(lines >= 20 && lines <=50) {
						 goodInput = true;
					 }
				 }
					// consume invalid data left in input stream
				 
					 catch(InputMismatchException ime) {
						 String garbage = scan.nextLine();
						 System.out.println("You did not enter an integer; \nplease enter an integer");
					 }
					 
					 }while(!goodInput);
					 
					 try {
						 
// The major difference is that when we instantiate the FileWriter object, the second argument is true, 
// which means that we will append to the file ItalianFlag.txt. If the file ItalianFlag.txt exists, we will 
// start writing at the end of its current contents, whereas if the file does not exist, it will be created. 
// In this program, we ask the user how many lines he or she wants to append to the file.
						 
						 FileWriter fw = new FileWriter("ItalianFlag.txt", true);
						 PrintWriter pw = new PrintWriter(fw);
						 
					// append lines of color and pixels data for this flag
						 
						 

						 
						 for(int i = 0; i < lines; i++) {
							 
							 pw.println( PIXELS + " 0.0 1.0 0.0" ); // PIXELS green pixels   
							          pw.println( PIXELS + " 1.0 1.0 1.0" ); // PIXELS white pixels
							          pw.println( PIXELS + " 1.0 0.0 0.0" ); // PIXELS red pixels
							       }
							        pw.close( );
							      }
							 
							      catch ( IOException ioe )
							      {
							        System.out.println( ioe.getMessage( ) );
						 }
					 
			 }		 
			 }
			 