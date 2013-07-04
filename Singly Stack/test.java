public class test{
  public static void main(String[] args){
    
    myStack list = new myStack();
    list.push("Aqb");
    list.push("Jyoti");
    list.push("Dip");
    list.push("Tonny");
    list.push("SHuvo");
    System.out.println(list.remove("SHuvo"));
    list.print();
    
  }
}