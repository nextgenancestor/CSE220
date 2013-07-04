public class test{
  public static void main(String[] args){
    
    myStack list = new myStack();
    list.push("Aqb");
    list.push("Jyoti");
    list.push("Dip");
    System.out.println(list.remove("Jyoti"));
    list.print();
    
  }
}