public class test{
  public static void main(String[] args){
    
    ArrayList list = new ArrayList();
    list.add("kobutor");
    list.add("gadha");
    list.add("sup");
    list.add("gadha");
    list.add("kukur");
    System.out.println(list.size());
    
    list.shiftLeft(2);
    list.print();
  }
}