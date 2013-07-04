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
    Node n = null;
    
    //Approch 1
    for(n = header; n != null; n = n.next){
      if(n.element.equals(e)){
        toReturn = true;
        break;
      }
    }
    
    boolean notFirst = true;
    
    if(e.equals(header.element)){
      notFirst = false;
      this.pop();
    }
      
    if(toReturn && notFirst){
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
    for(Node n = header; n != null; n = n.next){
      System.out.println(n.element);
    }
  }
}
  
  