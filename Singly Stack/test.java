public class test{
  public static void main(String[] args){
    
    myStack list = new myStack();
    list.push("Aqb");
    list.push("Jyoti");
    list.push("Dip");
    list.push("Tonny");
    list.push("Munira");
    list.push("Tasu");
    
    System.out.println(list.remove("Dip"));
    System.out.println(list.moveToTop("Munira"));
    list.print();
    
  }
}