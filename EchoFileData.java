// @author Joseph Walker

// example on using try/catch block methods:
// .getMessage()	.toString()		.printStackTrace()
// We demonstrate these three methods, as well as how to use try and catch blocks to detect and handle an
// exception if it occurs When we want to read data from a file, we first must open the file for reading.   

//of Example 11.1 when there is no file named data.txt in the current folder. As we can see, the only 
//difference between the return values from the getMessage and toString methods is that the toString method 
//		returns the exception class name, as well as the message. The output of the printStackTrace method may 
//		look familiar. It is similar to a message that the JVM prints when an ArithmeticException, 
//		StringIndexOutOfBoundsException, or ArrayIndexOutOfBoundsException occurs when we do not have 
//		try and catch blocks.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class EchoFileData {
	
	public static void main(String[] args) {
		
		try {
			
// Here we declare and instantiate a File object for a file named data.txt located in the current folder.
// Next we declare and instantiate a Scanner object so we can read from the input stream represented by that File object.
			
			File inputFile = new File("data.txt");
			
// The Scanner constructor, whose API is shown below, throws a FileNotFoundException if the file is not found.
// The FileNotFoundException is a checked exception. Thus, we need to place the code that can generate that exception 
// inside a try block.
			
			Scanner file = new Scanner(inputFile);
			
			while(file.hasNextInt()) {
				int number = file.nextInt();
				System.out.println(number);
			}
			
		}
		
// Here we use a catch block to handle the exception if it occurs. Note that there are other exceptions that can be thrown
// in this program. The File constructor, as well the hasNextInt and nextInt methods of the Scanner class, can throw
// exceptions; however, all those exceptions are unchecked exceptions and don't require the use of try/catch blocks.

		catch( FileNotFoundException fnfe) {
			
// When the program runs, if there is no file named data.txt in the current folder, the try block stops executing 
// Next, the catch block is executed, and we print the values from the getMessage, toString, and printStackTrace methods 
// of the FileNotFoundException class.
			
			System.out.println("Message: " + fnfe.getMessage());
			System.out.println("\ntoString():" + fnfe + "\n");
			fnfe.printStackTrace();
			
// As we can see, the only difference between the return values from the getMessage and toString methods is that 
// the toString method returns the exception class name, as well as the message. The output of the printStackTrace 
// method may look familiar. It is similar to a message that the JVM prints when an ArithmeticException, 
// StringIndexOutOfBoundsException, or ArrayIndexOutOfBoundsException occurs when we do not have try and catch blocks.

		}
	}

}
