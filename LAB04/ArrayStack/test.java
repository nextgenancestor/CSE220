import java.util.Scanner;
public class test{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    newStack start = new newStack();
    newStack end = new newStack();
    newStack map = new newStack();
    String data = in.nextLine();
    boolean fine = true;
    for(int count = 0; count < data.length(); count++){
      if(data.charAt(count) == '[' || data.charAt(count) == '{' || data.charAt(count) == '('){
        start.push(data.charAt(count));
      }      
      else if(data.charAt(count) == ']' || data.charAt(count) == '}' || data.charAt(count) == ')')
      {
        //System.out.println("comparing " + start.peek() + " " + data.charAt(count));
        
        if(checker(start.peek(),data.charAt(count)))
        {
          start.pop();
        } 
        else
        {
          fine = false;
          break;
        }
      }      
    }
    if(!start.isEmpty())
    {
      fine = false;
    }
    
    
    
    
    if(fine){
      System.out.println("The expression is correct");
    } else {
      System.out.println("The expression is NOT correct");
    }
    
    
    
  }
  public static boolean checker(Object a, Object b){
    if(a == '(' && b == ')'){
      return true;
    } else if(a == '{' && b == '}'){
      return true;
    } else if(a == '[' && b == ']'){
      return true;
    } else {
      return false;
    }
  }
}