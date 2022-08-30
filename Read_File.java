//Program to read and display a file's contents
//importing io package
import java.io.*; 
//importing the util package, Scanner class
import java.util.Scanner; 
public class Read_File //start of class
{
  public static void main(String args[]) //start of main()
  {
    String fname; //declaring variable
    Scanner scan = new Scanner(System.in);  //taking input
    System.out.print("Enter File Name with Extension(like demo.txt): ");
    fname= scan.nextLine();    
    //declaring and initializing variable
    String line = null; 
    try //explicitly catching an error
    {
      //making an object of the FileReader class
      FileReader fileReader = new FileReader(fname);
      //wrapping FileWriter in BufferedWriter
      BufferedReader bufferedReader = new BufferedReader(fileReader);      
      //diplaying file contents
      while((line = bufferedReader.readLine()) != null)
      {
        System.out.println(line);
      }            
      bufferedReader.close(); //closing the file
    }
    catch(IOException ex) //explicitly handling any IO errors encountered
    {
      System.out.println("Error reading file named '" + fname + "'");
    }
  } //end of main()
} //end of class
/**VDT
Variable   Datatype               Description
 fname      String         stores the name of the file 
 line       String    stores a single line of the file content
 */