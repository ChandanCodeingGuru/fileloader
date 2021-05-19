import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class CopyContent {
   public static void main(String[] args) throws IOException {
      //Instantiating a file class
      File file = new File("C:\\Users\\DELL\\eclipse-workspace\\filename.txt");
      //Instantiate an FileInputStream class
      FileInputStream inputStream = new FileInputStream(file);
      //Instantiating the Scanner class
      Scanner sc = new Scanner(inputStream);
      //StringBuffer to store the contents
      StringBuffer buffer = new StringBuffer();
      //Appending each line to the buffer
      while(sc.hasNext()) {
         buffer.append(" "+sc.nextLine());
      }
      System.out.println("Contents of the file: "+buffer);
      //Creating a File object to hold the destination file
      File dest = new File("C:\\Users\\DELL\\Desktop\\chandan.txt");
      //Instantiating an FileWriter object
      FileWriter writer = new FileWriter(dest);
      //Writing content to the destination
      writer.write(buffer.toString());
      writer.flush();
      System.out.println("File copied successfully.......");
   }
}