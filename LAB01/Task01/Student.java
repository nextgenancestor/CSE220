public class Student{
  private String name;
  private String id;
  private String address;
  private String cgpa;
  
  Student(String name, String id, String address, String cgpa){
    this.name = name;
    this.id = id;
    this.address = address;
    this.cgpa = cgpa;
  }
  
  public String getName(){
    return name;
  }
  
  public void setName(String name){
    this.name = name;
  }
  
  public void setId(String id){
    this.id = id;
  }
  
  public String getId(){
    return id;
  }
  
  public String getAddress(){
    return address;
  }
  
  public void setAddress(String ddress){
    this.address = address;
  } 
  
  public String getCgpa(){
    return cgpa;
  }
  
  public void setCgpa(String cgpa){
    this.cgpa = cgpa;
  }
}