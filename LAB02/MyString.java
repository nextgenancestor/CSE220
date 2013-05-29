public class MyString{
 char[] array;
 //String str;

 MyString(){
 
 }

 MyString(char[] charSeq){
 
  array = charSeq;
 }

 MyString(String str){
 
  //this.str = str;
  array = str.toCharArray();
 }

 int length(){
 
  int count = 0;
  for(int i:array){
   count++;
  }

  return count;
 }

 char charAt(int n){

  return array[n];
 }

 boolean startsWith(MyString prefix){

  boolean matches = true;
  for(int i = 0; i < prefix.length(); i++){
   if(array[i] != prefix.array[i]){
    matches = false;
   }
  }
  return matches;
 }

 boolean startsWith(String prefix){

  char[] newData = prefix.toCharArray();
  boolean matches = true;
  for(int i = 0; i < newData.length; i++){
   if(array[i] != newData[i]){
    matches = false;
   }
  }
  return matches;
 }

 boolean endsWith(MyString suffix){

  boolean matches = true;
  int m = array.length - 1;
  int n = suffix.length() - 1;
  for(int i = 0; i < suffix.length(); i++){
   if(array[m] != suffix.array[n]){
    matches = false;
    m--;
    n--;
   }
  }
  return matches;
 }

 boolean endsWith(String suffix){

  char[] newData = suffix.toCharArray();
  boolean matches = true;
  int m = array.length - 1;
  int n = newData.length - 1;
  for(int i = 0; i < newData.length; i++){
   if(array[m] != newData[n]){
    matches = false;
    m--;
    n--;
   }
  }
  return matches;
 }

 MyString replaceFirst(char oldChar, char newChar){

  char[] newArray = new char[array.length];
  
  for(int i =0; i < array.length; i++){
   newArray[i] = array[i];
  }

  for(int i = 0; i < newArray.length; i++){
   if (oldChar == newArray[i]) {
    newArray[i] = newChar;
   }
  }
  MyString data = new MyString(newArray);
  return data;
 }




}