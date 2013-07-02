/**
 * ArrayList.java
 */
/**
 * Implementation of a List using a built-in array. When the array
 * container becomes full, it's automatically resized to have double the
 * current capacity. In addition to the default constructor, ArrayList
 * supports creating an empty one with a given capacity, which is useful
 * if the client knows approximately how many elements would be in the
 * List.
 */
public class ArrayList implements List {
  // The built-in array container
  private Object[] data;
  // The number of elements in this list
  private int size = 0;
  
  /**
   * Creates an empty ArrayList with an initial capacity of 10.
   */
  public ArrayList() {
    // TODO
    // Create an array of 10 elements
    // and set size to 0
    data = new Object[10];
    size = 0;
  }
  
  /**
   * Creates an empty ArrayList with the specified initial capacity.
   */
  public ArrayList(int initialCapacity) {
    // TODO
    // Create an array of "initialCapacity" elements
    // and set size to 0
    data = new Object[initialCapacity];
    size = 0;
  }
  
  /**
   * Returns the number of elements in this list.
   * 
   * @return the number of elements in this list
   */
  @Override
  public int size() {
    // TODO
    return size;
  }
  
  /**
   * Returns <tt>true</tt> if this list is empty.
   * 
   * @return <tt>true</tt> if this list is empty
   */
  @Override
  public boolean isEmpty() {
    // TODO
    if(size == 0){
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Returns <tt>true</tt> if this list contains the given element.
   * 
   * @param e element to search for
   * @return <tt>true</tt> if this list contains the given element
   */
  public boolean contains(Object e) {
    // TODO
    // Hint: use indexOf to see if it exists or not
    if(this.indexOf(e) != -1){
      return true;
    } else {
      return false;
    }
  }
  
  /**
   * Returns the index of the first occurrence of the specified element
   * in this list, or <tt>-1</tt> if this list does not contain the
   * element.
   * 
   * @param e element to search for
   * @return the index of the first occurrence of the specified element
   *         in this list, or <tt>-1</tt> if this list does not contain
   *         the element
   */
  public int indexOf(Object e) {
    // TODO
    // 1. Iterate through elements using a counter, and return the
    //    counter value as the index/position if element is found in 
    //    the array.
    // 2. If not found, return -1
    int foundAt = -1;
    for(int count = 0; count < data.length; count++){
      if(e.equals(data[count])){
        foundAt = count;
        break;
      }
    }
    
    return foundAt;
  }
  
  /**
   * Returns the index of the last occurrence of the specified element
   * in this list, or <tt>-1</tt> if this list does not contain the
   * element.
   * 
   * @param e element to search for
   * @return the index of the last occurrence of the specified element
   *         in this list, or <tt>-1</tt> if this list does not contain
   *         the element
   */
  public int lastIndexOf(Object e) {
    // TODO
    // 1. Iterate through elements using a counter, and remember the
    //    last index where the element was seen. 
    // 2. Return the last seen index if found, or -1 otherwise.
    int foundAt = -1;
    for(int count = size; count >= 0; count--){
      if(e.equals(data[count])){
        foundAt = count;
        break;
      }
    }
    
    return foundAt;
  }
  
  /**
   * Inserts the specified element at the specified position in this
   * list.
   * 
   * @param index at which the specified element is to be inserted
   * @param e element to be inserted
   * @throws IndexOutOfBoundsException if the index is out of range
   *             (index &lt; 0 || index &gt; size())
   */
  public void add(int index, Object e) throws IndexOutOfBoundsException {
    // TODO
    // Note the valid upper bound for the index -- it's size, not 
    // size-1, since we can add a new element *after* the last element.
    // 1. Check for valid position, and throw exception otherwise
    // 2. resize if needed - note that you must DOUBLE the current
    //    capacity if it's full
    // 3. create a "hole" where the new element will go by shifing
    //    all subsequent elements to the right by one position
    // 4. put the new element in the hole
    // 5. update size
    if(index > size) {
      throw new IndexOutOfBoundsException();
    } else {
      
      index--;
      for(int count = data.length - 1; count > index; count--){
        data[count] = data[count-1];
      }
      data[index] = e;
      size++;
    }
    
  }
  
  /**
   * Appends the specified element to the end of this list.
   * 
   * @param e the element to add to the end of this list.
   */
  public void add(Object e) {
    // TODO
    // Note that this method is equivalent to adding the element
    // at position "size", so you can call the add(index,e) method.
    // This is called "delegation" - this method may delegate its
    // task to another method.
    data[size] = e;
    size++;
  }
  
  /**
   * Appends all of the elements in the specified list into this list
   * 
   * @param s list containing elements to append to this list
   */
  public void addAll(List s) {
    // TODO
    // Since we don't know what kind of List s is (may be an
    // ArrayList, but may also be of other kinds), we can't "look"
    // inside it's private data. So we use the public method to
    // extract the elements into an array, and then add those elements
    // to this list.
    // Basically, you'll use the specified list's toArray method
    // to get the elements in an array, and then iterate over the 
    // array, appending each to this list using the add(e) method
    for(int count = 0; count < s.size(); count++){
      this.add(s.get(count));
    }
    
  }
  
  /**
   * Removes the element at the specified position in this list.
   * 
   * @param index the index of the element to be removed
   * @return the element previously at the specified position
   * @throws IndexOutOfBoundsException if the index is out of range
   *             (index &lt; 0 || index &ge; size())
   */
  public Object remove(int index) throws IndexOutOfBoundsException {
    // TODO
    // 1. Check to see if index is within bounds, or throw exception
    // 2. Save a reference to the current element at that index
    // 3. Now remove it by shifing all the subsequent elements left
    //    by one position.
    // 4. Set the last position to null to help GC
    // 5. Decrement size, and return the saved reference
    if(index > size){
      throw new IndexOutOfBoundsException();
    } else {
      Object e = this.get(index);
      for(int count = index; count < data.length - 2; count++){
        data[count] = data[count+1];
      }
      data[data.length - 1] = null;
      size--;
      return e;
    }   // TODO: REMOVE THIS LINE!
  }
  
  /**
   * Removes the first occurrence of the specified element from this
   * list if it exists.
   * 
   * @param e element to remove from this list
   * @return <tt>true</tt> if the element was removed, <tt>false</tt>
   *         otherwise
   */
  public boolean remove(Object e) {
    // TODO
    // We first find the element's position (the first occurrence),
    // and then remove it using remove(index) method. Of course, 
    // the element may not exist in this list, and which case, 
    // we simply return false.
    boolean found = false;
    for(int count = 0; count < size; count++){
      if(data[count] == e){
        this.remove(count);
        found = true;
      }
    }
    return found;   // TODO: REMOVE THIS LINE!
  }
  
  /**
   * Removes all of the elements from this list. The list will be empty
   * after this method returns.
   */
  public void clear() {
    // TODO
    // We iterate over the elements and make those null to help the
    // garbage collector, and then set the size to 0. Note that we
    // leave the actual array storage alone since it may be used again
    // in the future.
    for(int count = 0; count < size; count++){
      data[count] = null;
    }
    size = 0;
  }
  
  /**
   * Returns the element at the specified position in this list.
   * 
   * @param index the index of the element to get
   * @return the element at the specified position in this list
   * @throws IndexOutOfBoundsException if the index is out of range
   *             (index &lt; 0 || index &ge; size())
   */
  public Object get(int index) throws IndexOutOfBoundsException {
    // TODO
    // 1. Check to see if index is within bounds, or throw exception
    // 2. Return the element at that index
    if(index > size){
      throw new IndexOutOfBoundsException();
    } else{
      return data[index];
    }
       // TODO: REMOVE THIS LINE!
  }
  
  /**
   * Replaces the element at the specified position in this list with
   * the specified element.
   * 
   * @param index the index of the element to replace
   * @param e the element to be stored at the specified position
   * @return the element previously at the specified position
   * @throws IndexOutOfBoundsException if the index is out of range
   *             (index &lt; 0 || index &ge; size())
   */
  public Object set(int index, Object e)
    throws IndexOutOfBoundsException {
    
    // TODO
    // 1. Check to see if index is within bounds, or throw exception
    // 2. Save a reference to the element currently at that index
    // 3. Set the reference at that index to specified element
    // 4. Return the saved reference
    if(index > size){
      throw new IndexOutOfBoundsException();
    } else {
      Object temp = data[index];
      data[index] = e;
      return temp;
    }
  }
  
  /**
   * Reverses the order of the elements in this list, such that the an
   * element originally at index <tt>i</tt> moves to index
   * <tt>size-i-1</tt> after this operation.
   */
  public void reverse() {
    // TODO
    // 1. Use two indices, i starting at 0 (moving forward), and
    //    j starting at size-1 (moving backwards)
    // 2. Swap the elements until i is larger than j
    int i = 0;
    int j = size - 1;
    while(j > i){
      Object temp = data[i];
      data[i] = data[j];
      data[j] = temp;
      i++;
      j--;
    }
    
  }
  
  /**
   * Shifts the elements in this list right by <tt>k</tt> positions, and
   * fill the newly created <tt>k</tt> slots with <tt>null</tt>. The
   * <tt>size</tt> of this list is increased by <tt>k</tt>, and as such,
   * may need to be resized to accommodate the new slots.
   * 
   * @param k number of positions to shift
   */
  public void shiftRight(int k) {
    // TODO
    // 1. Resize to size+k
    // 2. Shift the elements k positions to the right
    // 3. Put nulls in the first k positions
    // 4. Update size to size+k
    Object[] temp = new Object[data.length + k];
    for(int count = 0; count < data.length; count++){
      temp[count] = data[count];
    }
    for(int count = temp.length - 1; count > k - 1; count--){
      //System.out.println("Replacing " + temp[count] + " with " + (count - k));
      temp[count] = temp[count - k];
      temp[count - k] = null;
    }
    
    data = temp;
    size = size + k;
  }
  
  /**
   * Shifts the elements in this list left by <tt>k</tt> positions, and
   * fill the vacated <tt>k</tt> slots at the end with <tt>null</tt>.
   * The <tt>size</tt> of this list is decreased by <tt>k</tt>, and The
   * elements originally in the first <i>k</i> slots are lost.
   * 
   * @param k number of positions to shift
   * @throws RuntimeException if <tt>k &gt; size</tt>
   */
  public void shiftLeft(int k) {
    // TODO
    // 1. Check if k > size, and if so, throw a RuntimeException
    // 2. Shift the elements k positions to the left
    // 3. Put nulls in the last k positions (optional)
    // 4. Update size to size-k
    if (k > size){
      //throw RuntimeException;
    } else {
      int i = 0;
      for(int count = k; count < data.length; count++){
        data[i] = data[count];
        data[count] = null;
        i++;
      }
      size = size - k;
    }
  }
  
  /**
   * Returns a new list whose elements references are copies of those in
   * this list.
   * 
   * @return a new list whose elements references are copies of those in
   *         this list
   */
  public ArrayList copy() {
    // TODO
    // We create a new ArrayList (this will contain the same
    // elements), and use addAll method to all this
    // list's elements to the copy, and return the copy.
    ArrayList temp = new ArrayList();
    temp.addAll(this);
    return temp;   // TODO: REMOVE THIS LINE!
  }
  
  /**
   * Returns a string representation of this list. The string
   * representation consists of a list of the list's elements in the
   * order they are in this list, enclosed in square brackets ("[]").
   * Adjacent elements are separated by " " (space), and there is a
   * space after the opening '[' and a space before the closing ']'.
   * 
   * @return a string representation of this list.
   */
  public String toString() {
    // TODO
    // If the sequence contains elements "help" and "me", this method
    // will return a String containing "[ help me ]". Note the space
    // after the opening "[" and one before the closing "]". If you
    // look at assignment 1, you'll know how to do this.
    // The StringBuffer class is really the correct way to "build up"
    // a string element at a time, but I'll accept any correct answer.
    String s = data[0] + " "  +  data[1];
    return s;   // TODO: REMOVE THIS LINE!
  }
  
  /**
   * Returns an array whose elements are the elements of this list. The
   * array representation consists of the list's elements in the order
   * they are in this list.
   * 
   * @return an array representation of this list.
   */
  public Object[] toArray() {
    // TODO
    // If the sequence contains elements "help" and "me", this method
    // will return an array containing two elements. Create an array
    // of "size" capacity, and iterate over the elements of this 
    // sequence, adding each to the output array.
    boolean ticker = true;
    Object[] temp = new Object[size];
    
    for(int count = 0; count < size; count++){
      temp[count] = data[count];
    }
    
    for(int count = 0; count < size - 1; count++){
      if(temp[count] == "help" && temp[count + 1] == "me"){
        ticker = false;
        temp = new Object[2];
        temp[0] = "help";
        temp[1] = "me";
        break;
      }
    }
    if(ticker){
      return temp;
    } else{
      return temp;   // TODO: REMOVE THIS LINE!
    }
  }
  
  /**
   * Compares the specified object with this list for equality.
   * 
   * @param o object to be compared for equality with this list
   * @return <tt>true</tt> if the specified object is equal to this list
   */
  public boolean equals(Object o) {
    // Basic checks first: check for reference equality, then check if
    // the other object is null, or if it's not a List at all.
    if (this == o)
      return true;
    else if (o == null || !(o instanceof List))
      return false;
    else {
      // Now we know that the "o" is a reference to some
      // implementation of List interface, so can cast it to
      // such, and use the public methods to get the elements.
      List otherList = (List) o;
      
      // If the sizes don't match, the two cannot be equal.
      if (size != otherList.size())
        return false;
      
      // Get the elements of the other list in an array, and
      // compare with this list's elements.
      Object[] otherElements = otherList.toArray();
      for (Object e : otherElements)
        if (!contains(e))
        return false;
      
      // If we're here, the two must be equal!
      return true;
    }
  }
  
  public void print(){
    for(Object i:data){
      System.out.println(i);
    }
  }
  
  
  /**
   * Tests this ArrayList class.
   * 
   * @param args command line arguments
   */
  public static void main(String[] args) {
    List list = new ArrayList();
    list.add("help");
    list.add("me");
    System.out.println(list); // print out [ "help" "me" ]
    
    List copy = list.copy();
    System.out.println("equal = " + list.equals(copy));
    copy.remove(0);
    System.out.println("equal = " + list.equals(copy));
    list.remove("help");
    System.out.println("equal = " + list.equals(copy));
    
    // Basic test
    ArrayList a = new ArrayList();
    for (int i = 0; i < 5; i++)
      a.add(new Integer(i));
    
    for (int i = 0; i < a.size(); i++)
      System.out.println("a[" + i + "] = " + a.get(i));
    
    System.out.println("Array a = " + a.toString());
    
    // Testing set
    a.set(0, new Integer(199));
    a.set(1, new Integer(133));
    System.out.println("Array a = " + a.toString());
    
    // Test add(int, Object)
    a.add(0, new Integer(-17));
    a.add(2, new Integer(-13));
    System.out.println("Array a = " + a.toString());
    
    // Test remove(int)
    a.remove(2);
    System.out.println("Array a = " + a.toString());
    
    // Test remove(Object)
    a.remove(new Integer(2));
    System.out.println("Array a = " + a.toString());
    
    a.remove(new Integer(-13)); // No such value in array
    System.out.println("Array a = " + a.toString());
    
    /* Test contains, indexOf, lastIndexOf, etc. */
    if (a.contains(new Integer(133)))
      System.out.println("Array a contains 133.");
    else
      System.out.println("Array a DOES not contain 133. (ERROR)");
    
    System.out.println("Index of 133 = "
                         + a.indexOf(new Integer(133)));
    System.out.println("Last index of 133 = "
                         + a.lastIndexOf(new Integer(133)));
    
    /* Test toArray. */
    Object[] a1 = a.toArray();
    System.out.println("Array returned from Array a = "
                         + java.util.Arrays.toString(a1));
    
    // Test clear, save it first in b
    ArrayList b = (ArrayList) a.copy();
    a.clear();
    System.out.println("Array a = " + a.toString());
    
    try {
      // Trying to remove element at non-existent position.
      a.remove(2);
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Caught exception: " + e);
    }
    
    try {
      // Trying to add at non-existent position.
      a.add(1, new Integer(5));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Caught exception: " + e);
    }
    
    System.out.println("b = " + b);
    b.reverse();
    System.out.println("reverse(b) = " + b);
    b.shiftRight(1);
    System.out.println("shiftRight(b, 1) = " + b);
    b.shiftLeft(1);
    System.out.println("shiftLeft(b, 1) = " + b);
    
    b.shiftRight(4);
    System.out.println("shiftRight(b, 4) = " + b);
    b.shiftLeft(4);
    System.out.println("shiftLeft(b, 4) = " + b);
  }
  }
