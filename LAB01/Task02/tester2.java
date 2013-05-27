import java.util.Scanner;
import java.io.*;

public class tester2{
  public static void main(String[] args){
    StudentRecord ro = new StudentRecord();
    
    try{
      FileInputStream fstream = new FileInputStream("E:\\repos\\CSE220\\LAB01\\Task02\\Students.txt");
      DataInputStream in = new DataInputStream(fstream);
      BufferedReader br = new BufferedReader(new InputStreamReader(in));
      
      String strLine;
      
      while((strLine = br.readLine()) != null){
        String[] student = strLine.split("-");
        
        String name = student[0];
        String id = student[1];
        String address = student[2];
        String cgpa = student[3];
        
        ro.addRecord(name, id, address, cgpa);
      }
      
      in.close();
    } catch (Exception e){
      System.out.println("Err: :P " + e.getMessage());
    } finally{
      ro.printRecord();
    }
    
  }
}
