public class newStack{
  
  Object[] data = new Object[20];
  int size = 0;
  int size(){
    return data.length;
  }
  
  boolean isEmpty(){
    if(data[0] == null){
      return true;
    } else {
      return false;
    }
  }
  
  void push(Object o){
    if(size >= data.length){
      System.out.println("Oopds");
    } else {
      data[size] = o;
      size++;
    }
      
  }
  
  Object pop(){
    Object toReturn = null;
    if(size <= 0){
      
    } else {
      toReturn = data[size - 1];
      data[size - 1] = null;
      size--;
    }
    return toReturn;
  }
  
  Object peek(){
    Object toReturn = null;
    if(size <= 0){
    } else {
      toReturn = data[size - 1];
    }
    return toReturn;
  }
  
//  Object toString(){
//    return "hao";
//  }
//  
  Object[] toArray(){
    return null;
  }
  
  int search(Object o){
    return 0;
  }
}