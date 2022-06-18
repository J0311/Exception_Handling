// Although this example is for JavaFX, this shows how we can use the shows how we can use the 
// FileWriter and PrintWriter classes to write Strings and primitive data types 
// to a text file named ItalianFlag.txt. We write data for the Italian flag 
// that can later be read and drawn using the DrawAGIF example.

import java.io.*;

public class Write_Flag_To_File {

	private static final int HEIGHT = 10;
	
	public static void main(String[] args) {
		
		try {
			
// constructs a FileWriter object from a String representing the name of a file; if  
// mode is false, we will write to the file; if mode is true, we will append to the file
			
			FileWriter fw = new FileWriter("ItalianFlag.txt",false);
			
// Instantiates a PrintWriter object, which we will use to write to the file. 
// Using the PrintWriter object pw, we call the methods print and println, passing 
// various String and primitive data type arguments (int, char, and double) to be 
// written to the file. When we want a newline character appended to the output, we 
// call println, rather than print.
			
			PrintWriter pw = new PrintWriter(fw);
			pw.println(30); // WIDTH of GIF
			
//for loop to write HEIGHT lines of color and pixels data
			
			for (int i = 0; i < HEIGHT; i++) {
				pw.print(10); 	// 10 green pixels
				pw.print(' ');	// white space character
				pw.print(0.0);	// red color component
				pw.println("1.0 0.0"); // green and blue color components
				
				pw.println("10 1.0 1.0 1.0"); // 10 white pixels
				pw.println("10 1.0 0.0 0.0"); // 10 red pixels
			}
			
// Although calling the close method is optional when we are reading a file, it is 
// essential to call the close method when we are writing to a file. Closing the 
// file flushes any buffered data to the output file. If we omit calling the close 
// method, we may find that the file is empty when the program ends.
			
			pw.close();
			
			}
		
		catch(IOException ioe) {
			System.out.println(ioe.getMessage());
			
// After this program is executed, the file ItalianFlag.txt will contain the data.
// Because we wrote all the output to the file ItalianFlag.txt, there is no output 
// to the console.
		}
	}
	
}
