// Here we read a text file named movies.txt, which contains titles of classic 
// movies and the movies’ running times in minutes. Each movie occupies two 
// lines in the file: the title on one line and the running time on the 
// following line. 

// Each line in the file, including the last line, is terminated by a newline
// character. In this example, we simply read the movie titles and running
// times and echo them to the console. However, we could read this file to
// find the longest or shortest movie, or to instantiate Movie objects to be
// stored in an ArrayList or other data structure for further processing.

import java.util.Scanner;
import java.io.File;
import java.util.NoSuchElementException;
import java.io.FileNotFoundException;


public class Classic_Movies {

	public static void main(String[] args) {
		
	
// instead of the typical "System.in", we will use new File, passing file name as arg
		
//			SPECIAL NOTE ON FORMAT/SYNTAX:		
// The File object is used only as the argument of the Scanner constructor; it is not used 
// anywhere else in the program. In this case, instead of creating a File object reference, 
// many programmers prefer to use an anonymous File object as the argument of the Scanner constructor. 
// In other words, instead of writing the following two statements:

//File f = new File( "movies.txt" );
//Scanner file = new Scanner( f );
		
// INSTEAD, WE USE THE BELOW FORMAT:

//Scanner file = new Scanner( new File( "movies.txt" ) );
//It is a matter of preference as to which code we use.
		
	
		try(Scanner file = new Scanner(new File("movies.txt"))){
	
// hasNext( ) is a BOOLEAN method that returns true if there is another token in the input stream.			

			while (file.hasNext()) { // test for the end of the file		
// Given that exception handling results in additional processing overhead, our using the hasNextInt  
// method of the Scanner class to test whether the file format is valid makes the code more efficient.
	
		String movieTitle = file.nextLine();
		
// If the next token is an int, we read the running time using the nextInt method. At this point,
// it is worthwhile to discuss the difference between the nextLine method and the other Scanner next… 
// methods (such as next/nextInt/nextDouble, etc.). The nextLine method reads any part of the line that 
// has not already been read, including leading and trailing white space (spaces, tabs, and the newline 
// character) and moves the file pointer to the next line. The nextLine method does not include the newline 
// character in its returned String. 
		
// In contrast,the nextInt method and its next…. method counterparts skip leading white space, then read 
// the next token on the line, stopping when trailing white space is encountered. That means that after we 
// have read the running time using the nextInt method, the newline character is still in the input stream. 
// If we then attempt to read the next movie title using the nextLine method, the nextLine method would 
// instead read just the newline character that follows the running time and return an empty String. 
		
		if (! file.hasNextInt()) {
			System.out.println("Invalid file format");
			String invalidData = file.nextLine(); // skip the line
		}
		else {
			int runningTime = file.nextInt();
			
// we insert an additional call to the nextLine method to remove that newline character from the input stream.
			String newLine = file.nextLine(); // read newline character
			System.out.println(movieTitle + ", " + runningTime + " minutes");
		}
		}
}
		catch(FileNotFoundException fnfe) {
			System.out.println("Unable to find movies.txt, exiting");
		}
		catch(NoSuchElementException nsee) {
			System.out.println("Attempting to read past the end of this file");
			
		}
	}
}