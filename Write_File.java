//Program to write to a file.
//importing io package
import java.io.*; 
//importing the util package, Scanner class
import java.util.Scanner; 
public class Write_File //start of class
{
  public static void main(String args[]) //start of main()
  {
    String fname; //declaring variable
    Scanner scan = new Scanner(System.in); //taking input
    System.out.print("Enter File Name with Extension(like demo.txt): ");
    fname= scan.nextLine();    
    try //explicitly catching an error
    {
      //making an object of the FileWriter class
      FileWriter fileWriter = new FileWriter(fname);
      //wrapping FileWriter in BufferedWriter
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);      
      int len, i; //declaring variables
      String sentence;
      System.out.print("Enter no. of lines:");
      len = scan.nextInt(); 
      System.out.print("Enter "+len+" lines of sentences: ");
      for(i=0; i<len+1; i++)
      {
        sentence = scan.nextLine();
        bufferedWriter.write(sentence); //writing sentence to file
        bufferedWriter.newLine(); //moving cursor to next line
            }
      //taking input from user
      bufferedWriter.close(); //closing the file
    }
    catch(IOException ex) //explicitly handling any IO errors encountered
    {
      System.out.println("Error writing to file named '" +fname+ "'");
    }
  } //end of main()
} //end of class
/**VDT
Variable    Datatype               Description
 fname       String    stores the name of the file 
  len         int      stores the no. of lines to be entered
   i          int      loop control variable
sentence     String    stores a single line of the input
 */