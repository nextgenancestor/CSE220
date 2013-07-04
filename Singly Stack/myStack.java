public class myStack{
  
  Node header = null;
  
  void push(Object e){
    header = new Node(e, header);
  }
  
  Object pop(){
    Object toReturn = null;
    if(header == null){
      return null;
    } else {
      toReturn = header.element;
    }
    header = header.next;
    return toReturn;
  }
  
  boolean remove(Object e){
    boolean toReturn = false;
    Node toDelete = null;
    
    Node n = null;
    for(n = header; n != null; n = n.next){
      if(n.next.element.equals(e)){
         toDelete = n.next;
         toReturn = true;
         break;
      }
    }
    
    n.next = toDelete.next;
    toDelete = null;
      
    return toReturn;
  }
  
  void print(){
    for(Node n = header; n != null; n = n.next){
      System.out.println(n.element);
    }
  }
}
  
  