public class MyOrderListTester{

 public static void main(String[] args){

  MyOrderList list = new MyOrderList();
  Node ek = new Node(-15);
  Node dui = new Node(8);
  Node dosh = new Node(6);
  Node tero = new Node(-13);
  //gotoBeginning works
  //gotoEnd works
  //insert works
  list.insert(ek);
  list.insert(dui);
  list.insert(dosh);
  list.insert(tero);
  
  //isEmpty works
  if(list.isEmpty()){
   System.out.println("faka");
  } else {
    System.out.println("faka noy");
    list.showList();
  }
  
  //retrieve works
  Node test = list.retrieve(24);
  System.out.println(test.element);
  
  //remove works
  //
  list.remove(8);
  list.showList();
  
  //gotoNext works
  //gotoPrior works
  list.gotoBeginning();
  System.out.println(list.cursor.element);
  list.gotoNext();
  System.out.println(list.cursor.element);
  list.gotoPrior();
  System.out.println(list.getCursor().element);
  
  
  //clear works
  System.out.println("whoah");
  list.clear();
  list.showList();
 }
}