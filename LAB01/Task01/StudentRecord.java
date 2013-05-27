import java.util.Scanner;
public class StudentRecord{
  Scanner in = new Scanner(System.in);
  Student[] StudentArray = new Student[10];
  static int numberOfStudents = 0;
  
  public void addRecord(String name,String id,String address,String cgpa){
    if(numberOfStudents == StudentArray.length){
      Student[] temp = new Student[numberOfStudents + 1];
      for(int count = 0; count < numberOfStudents; count++){
        temp[count] = StudentArray[count];
      }
      StudentArray = temp;
    }
    
    StudentArray[numberOfStudents] = new Student(name, id, address, cgpa);
    numberOfStudents++;
  }
  
  public void printRecord(){
    for(int i = 0; i < numberOfStudents - 1; i++){
      for(int j = i; j < numberOfStudents; j++){
        if(StudentArray[i].getName().compareTo(StudentArray[j].getName()) > 0){
          Student temp = StudentArray[i];
          StudentArray[i] = StudentArray[j];
          StudentArray[j] = temp;
        } else if (StudentArray[i].getName().compareTo(StudentArray[j].getName()) == 0){
            if(StudentArray[i].getId().compareTo(StudentArray[j].getId()) > 0){
              Student temp = StudentArray[i];
              StudentArray[i] = StudentArray[j];
              StudentArray[j] = temp;
            }
          }
      }
    }
    
    for(int i = 0; i < numberOfStudents; i++){
      System.out.println(StudentArray[i].getName());
      System.out.println(StudentArray[i].getId());
      System.out.println(StudentArray[i].getAddress());
      System.out.println(StudentArray[i].getCgpa());
    }  
  }
  
  public void deleteRecord(String id){
    for(int count = 0; count < numberOfStudents; count++){
      if(id.equals(StudentArray[count].getId())){
        for(int i = count; i < numberOfStudents - 1; i++){
          StudentArray[count] = StudentArray[count + 1];
        }
        numberOfStudents--;
        System.out.println("ID " + id + " is deleted");
        break;
      } else {
        System.out.println("ID " + id + " does not exist");
      }
    }
  }
    
  public void editRecord(String id){
    for(int count = 0; count < numberOfStudents; count++){
      if(id.equals(StudentArray[count].getId())){
        System.out.println("Please enter the details now");
          
        System.out.println("Previous name: " + StudentArray[count].getName());
        System.out.println("New name:");
        String temp = in.next();
        StudentArray[count].setName(temp);
          
        System.out.println("Previous ID: " + StudentArray[count].getId());
        System.out.println("New ID:");
        temp = in.next();
        StudentArray[count].setId(temp);
          
        System.out.println("Previous Address: " + StudentArray[count].getAddress());
        System.out.println("New Address:");
        temp = in.next();
        StudentArray[count].setAddress(temp);
          
        System.out.println("Previous cgpa: " + StudentArray[count].getCgpa());
        System.out.println("New CGPA:");
        temp = in.next();
        StudentArray[count].setCgpa(temp);
      }
   }
  }
    
}