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
      System.out.println("proccessing first item");
    } else {
      //if only 1 element
      cursor = gotoBeginning();
      if(cursor.next == cursor){
        cursor.next = newElement;
        newElement.next = cursor;
        System.out.println("processing second");
      } else {
        System.out.println("processing other items");
        cursor = gotoEnd();
        System.out.println("last item: " + cursor.element);
        if(cursor.element < newElement.element){
          System.out.println("I am here");
          Node q = cursor.next;
          cursor.next = newElement;
          newElement.next = q;
        } else {
          System.out.println("oi");
          
          Node n = cursor = gotoBeginning();
          
          for(Node h = cursor; h.next != cursor; h = h.next){
            if(newElement.element > h.element && newElement.element < h.next.element){
              
              Node q = h.next;
              h.next = newElement;
              newElement.next = q;
            }
          }
        }
        
      }
      
    }
  }
  
  Node retrieve(int searchKey){
    
    Node h = cursor;
    do{
      if(h.element == searchKey){
        cursor = h;
        break;
      }
      h = h.next;
    } while (h != cursor);
    
//    for(Node h = cursor; h.next != cursor; h = h.next){
//      if(h.element == searchKey){
//        cursor = h;
//        break;
//      }
//    }
    
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
    
        Node tail = cursor;
    Node h = cursor;
//    for(Node h = cursor; h.next != cursor; h = h.next){
//      if(tail.element < h.element){
//        tail = h;
//      }
//    }
    
    do{
        if(tail.element > h.element){
          tail = h;
        }
        h =  h.next;
      } while (h != cursor);
    
    cursor = tail;
    return cursor;
    
    
    
//    Node head = cursor;
//    for(Node h = cursor; h.next != cursor; h = h.next){
//      if(head.element > h.element){
//        head = h;
//      }
//    }
//    
//    cursor = head;
//    return cursor;
  }
  
  Node gotoEnd(){
    
    Node tail = cursor;
    Node h = cursor;
//    for(Node h = cursor; h.next != cursor; h = h.next){
//      if(tail.element < h.element){
//        tail = h;
//      }
//    }
    
    do{
        if(tail.element < h.element){
          tail = h;
        }
        h =  h.next;
      } while (h != cursor);
    
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

      
      do{
        System.out.println(h.element);
        h = h.next;
      } while (h != cursor);
    }
  }
}