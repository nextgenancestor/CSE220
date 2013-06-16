public class MyOrderListTester{

 public static void main(String[] args){

  MyOrderList list = new MyOrderList();
  Node ek = new Node(1);
  Node dui = new Node(2);
  Node dosh = new Node(10);
 
  
  list.insert(ek);
  list.insert(dui);
  list.insert(dosh);

  if(list.isEmpty()){
   System.out.println("faka");
  } else {
    System.out.println("faka noy");
    list.showList();
  }
  
  
 }
}