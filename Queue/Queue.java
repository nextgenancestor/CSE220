public class Queue{
  static final int DEF_CAP = 100;
  private Object[] queue;
  private int front;
  private int size;
  public Queue(){
    queue = new Object[DEF_CAP];
    size = 0;
    front = 0;
  }
  
  public void enqueue(Object el){
    for(int count = 0; count < queue.length; count++){
      if(queue[count] == null){
        queue[count] = el;
        size++;
        break;
      }
    }
    
    if(size == DEF_CAP){
      
      Object[] array = new Object[queue.length * 2];
      for(int count = 0; count < queue.length; count++){
        array[count] = queue[count];
      }
      queue = array;
      
    }
    
  }
  
  boolean moveToFront(Object e){
    
  }
    
  
  public Object dequeue(){
    Object toReturn = queue[front];
    queue[front] = null;
    front++;
    return toReturn;
  }
  
  public Object[] toArray(){
    int temp = front;
    Object[] array = new Object[size-front];
    for(int count = 0; count < array.length; count++){
      array[count] = queue[temp];
      temp++;
    }
    return array;
  }
  
  void print(){
    for(int count = 0; count < queue.length; count++){
      System.out.print(queue[count] + " ");
    }
  }
}
  
  
  