public class test{
  public static void main(String[] args){
    
    LinkedList list = new LinkedList();
    list.add("L");
    list.add("I");
    list.add("S");
    list.add("T");
    
    list.print();
    System.out.println();
    System.out.println(list.size());
    
    list.printR();
    System.out.println();
    
//    list.set(4, "Y");
//    list.print();
//    System.out.println();
    
    list.reverse();
    list.print();
    
//    System.out.println(list.get(5));
    
//    list.remove(4);
//    list.print();
//    System.out.println();
//    
//    System.out.println(list.remove("I"));
//    list.print();
//    System.out.println();
//    
//    list.clear();
//    list.print();
//    System.out.println("Clear");
  }
}