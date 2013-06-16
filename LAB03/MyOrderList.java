class MyOrderList{
  
  Node cursor;
  
  MyOrderList(){
    
    cursor = null;
  }
  
  /*This method inserts newElement in its appropriate position within 
   a list. If an element with the same key as newElement already exists
   in the list, then it concludes the key already exists and do not insert 
   the key.
   */
  
  void insert(Node newElement){
    
    //if list is empty
    if(cursor == null){
      cursor = newElement;
      cursor.next = cursor;
    } else {
      //if only 1 element
      if(cursor.next == cursor){
        cursor.next = newElement;
        cursor.next.next = cursor;
      } else {
        //if multiple elements!
        Node h = null;
        cursor = gotoBeginning();
        boolean awesome = false;
        for(h = cursor; h.next != cursor && h.element > newElement.element; h = h.next){
          System.out.println("ore baba " + h.element + "   " + newElement.element);
          awesome = true;
          
        }
        if (awesome){
          Node temp = h.next;
          System.out.println("Tempur val " + temp.element);
          h.next = newElement;
          h.next.next = temp;
        } else {
          cursor = gotoEnd();
          cursor.next = newElement;
          cursor.next.next = gotoBeginning();
        }
        
      }
    }
  }
  
  Node retrieve(int searchKey){
    
    for(Node h = cursor; h.next != cursor; h = h.next){
      if(h.element == searchKey){
        cursor = h;
        break;
      }
    }
    
    return cursor;
  }
  
  Node remove(){
    
    Node h = null;
    for(h = cursor; h.next != cursor; h = h.next){
      
    }
    
    h.next = cursor.next;
    cursor = cursor.next;
    return cursor;
  }
  
  Node remove(int deleteKey){
    
    cursor = retrieve(deleteKey);
    return remove();
  }
  
  void clear(){
    
    Node temp = null;
    for(Node h = cursor; h.next != cursor; h = h.next){
      temp = remove();
    }
    
    cursor = null;
  }
  
  boolean isEmpty(){
    
    boolean val = false;
    if (cursor == null){
      val = true;
    }
    
    return val;
  }
  
  Node gotoBeginning(){
    
    Node head = cursor;
    for(Node h = cursor; h.next != cursor; h = h.next){
      if(head.element > h.element){
        head = h;
      }
    }
    
    cursor = head;
    return cursor;
  }
  
  Node gotoEnd(){
    
    Node tail = cursor;
    for(Node h = cursor; h.next != cursor; h = h.next){
      if(tail.element < h.element){
        tail = h;
      }
    }
    
    cursor = tail;
    return cursor;
  }
  
  Node gotoNext(){
    
    cursor = cursor.next;
    return cursor;
  }
  
  Node gotoPrior(){
    
    Node h = null;
    for(h = cursor; h.next != cursor; h = h.next){
      
    }
    cursor = h;
    return cursor;
  }
  
  Node getCursor(){
    
    return cursor;
  }
  
  void showList(){
    
    if(isEmpty()){
      System.out.println("Empty list");
    } else {
      cursor = gotoBeginning();
      Node h = cursor;
      System.out.println("shuru");
      System.out.println(h.element);
      System.out.println(h.next.element);
      System.out.println(h.next.next.element);
      System.out.println(h.next.next.next.element);
      //System.out.println(h.next.next.next.element);
      
//   for(h = cursor; h.next != cursor; h = h.next){
//
//    System.out.println(h.element);
//   }
    }
  }
}