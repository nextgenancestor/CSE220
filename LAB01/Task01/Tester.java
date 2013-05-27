import java.util.Scanner;

public class Tester{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    StudentRecord ro = new StudentRecord();
    
    
    
    while(true){
      System.out.println("Enter 1 to Add a Record\nEnter 2 to Print the Records\nEnter 3 to Delete a Record\nEnter 4 to Edit a Record");
    
      int input = in.nextInt();
      
      if(input == 1){
        
        String name = in.next();
        String id = in.next();
        String address = in.next();
        String cgpa = in.next();
        
        ro.addRecord(name, id, address, cgpa);
      }
      
      if(input == 24){
        break;
      }
      
      if(input == 2){
        ro.printRecord();
      }
      
      if(input == 3){
        String id = in.next();
        ro.deleteRecord(id);
      }
      
      if(input == 4){
        String id = in.next();
        ro.editRecord(id);
      }
    }
  }
}
