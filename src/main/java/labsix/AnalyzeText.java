package labsix;

import java.io.File;
import java.io.FileNotFoundException;
// TODO: import the remaining needed libraries

public class AnalyzeText {

  // the first number of lines that display book preamble information, such as
  // the author, the title, etc.
  static final int preambleLines = 5;
  // the name and path to the input file (book)
  static final String fileName = "input/Ulysses.txt";

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Add Your Name Here " + new Date());
    // declare the starting file and scanner
    File inputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      inputFile = new File(fileName);
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // TODO: Display information about the book (title, author, etc.)
    // 1.1. Open the input file and check where this information is located
    // 1.2. Modify the value assigned to the preambleLines variable on  line 12
    // 1.3. Use a while loop to start at index=0 and end at preambleLines value
    // 1.4. Inside the body of the loop, use Scanner's nextLine() method to print
    // information about the book (author, title, etc.)
    int index = 0;

    // TODO: count the words in a file

    // TODO: display the number of words in a file

    // TODO: ask the user to enter search keywords
    // TODO: Create a new Scanner object to read from the terminal
    // TODO: save the two user's keywords into String variables

    // Reinitialize scanner to read from the beginning of the file
    // Reconnect the scanner to the input file
    try {
      inputFile = new File("input/Ulysses.txt");
      scanner = new Scanner(inputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }

    // TODO: parse through the book again using a while loop
    // 1.1. Get the line from the AnalyzeText
    // 1.2. If one of the user's keywords occurs in the line
    // 1.3. Print the line and increment the occurrence count

    // TODO: print the number of times the user's keywords occurred in text

    // TODO: Display a final thank you message
  }
}
