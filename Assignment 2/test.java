public class test{
  public static void main(String[] args){
    
    ArrayList list = new ArrayList();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    list.add("five");
    System.out.println(list.size());
    //list.shiftRight(2);
    list.print();
    list.add("six");
    list.print();
    
    Object[] temp = list.toArray();
    System.out.println();
    for(int count = 0; count < temp.length; count++){
      System.out.println(temp[count]);
    }
    System.out.println(list.get(2));
    System.out.println("-----");
    System.out.println(list.remove("four"));
    System.out.println();
    list.print();
    list.set(1, "twoo");
    list.print();
    System.out.println("==============");
    list.reverse();
    list.print();
    
    System.out.println("holud miya");
    ArrayList holud = list.copy();
    holud.print();
  }
}