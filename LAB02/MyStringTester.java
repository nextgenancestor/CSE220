public class MyStringTester {
  public static void main (String [] args) {
    
    
    MyString m1 = new MyString("Hello ");
    char[] k = {'w','o','r','l','d'};
    MyString m2 = new MyString(k);
    
    MyString m3 = m1.concat("Jyoti");
    System.out.println(m3.array);
    
    
    
  }
}