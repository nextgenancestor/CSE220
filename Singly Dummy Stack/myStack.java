public class myStack{
  Node header = new Node(null, null);
  
  void push(Object e){
    header.next = new Node(e, header.next);
  }
  
  Object pop(){
    Object toReturn = null;
    if(header.next == null){
      toReturn = null;
    } else {
      toReturn = header.next.element;
      Node second = header.next;
      header.next = second.next;
    }
    return toReturn;
    
  }
  
  boolean remove(Object e){
    boolean toReturn = false;
    Node n = null;
    
    //Approch 1
    for(n = header.next; n != null; n = n.next){
      if(n.element.equals(e)){
        toReturn = true;
        break;
      }
    }
    
    
    
    if(toReturn){
      Node prev;
      for(prev = header; prev.next != n; prev = prev.next){
      }
      if(n.next == null){
        prev.next = null;
      } else {
        prev.next = n.next;
      }
    }
    
    return toReturn;
  }

  
  void print(){
    for(Node n = header.next; n != null; n = n.next){
      System.out.println(n.element);
    }
  }
}