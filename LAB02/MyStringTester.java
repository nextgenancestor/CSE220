public class MyStringTester {
  public static void main (String [] args) {
    
    
    MyString m1 = new MyString("Hello World");
    MyString m2 = new MyString("Aaa");
    
    MyString data = m1.substring(3, 8);
    
    System.out.println(m1.indexOf('o',5));
    
    
    
  }
}