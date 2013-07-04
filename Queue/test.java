public class test{
  public static void main(String[] args){
    Queue list = new Queue();
    
    list.enqueue("Jyoti");
    list.enqueue("Naim");
    list.enqueue("Aqb");
    list.enqueue("Shuvo");
    list.enqueue("Nazia");
    
    for(int count = 0; count < 123; count++){
      list.enqueue(count);
    }
    
    
    //list.print();
    
    System.out.println();
    
    for(int count = 0; count < 50; count++){
      System.out.print(list.dequeue() + " ");
    }
    System.out.println();
    
    list.print();
    
    System.out.println();
    Object[] ulu = list.toArray();
    for(int count = 0; count < ulu.length; count++){
      System.out.println(ulu[count]);
    }
    
    System.out.println();
    System.out.println("sdfsfsdf " + list.dequeue());
  }
}
    