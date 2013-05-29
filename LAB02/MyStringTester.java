public class MyStringTester {
  public static void main (String [] args) {

    char[] m = {'H', 'e'};
    char[] n = {'X', 'k'}; 
    char[] o = {'l', 'd'};
    MyString m1 = new MyString(n);
    MyString m2 = new MyString("Hello World");
    
    
    System.out.println(m2.length());
    System.out.println(m2.charAt(1));
    System.out.println(m2.startsWith("He"));
    System.out.println(m2.startsWith(m1));
    System.out.println(m2.endsWith(m1));
    
    
    
    
  }
}