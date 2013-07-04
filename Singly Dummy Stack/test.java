public class test{
  public static void main(String[] args){
    
    myStack list = new myStack();
    list.push("Aqb");
    list.push("Nazia");
    
    
    System.out.println(list.remove("Nazia"));
    //System.out.println(list.remove("Nazia"));
    
    System.out.println("");
    list.print();
    
  }
}