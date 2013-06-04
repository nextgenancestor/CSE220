public class MyString{
 char[] array;
 
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
    break;
   }
  }
  MyString data = new MyString(newArray);
  return data;
 }

 MyString replaceAll(char oldChar, char newChar){
  
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

 MyString replaceLast(char oldChar, char newChar){

  char[] newArray = new char[array.length];
  
  for(int i =0; i < array.length; i++){
   newArray[i] = array[i];
  }

  for(int i = newArray.length - 1; i >= 0; i--){
   if (oldChar == newArray[i]) {
    newArray[i] = newChar;
    break;
   }
  }
  MyString data = new MyString(newArray);
  return data;
 }

MyString toLowerCase(){

  char[] newArray = new char[array.length];
  
  for(int i =0; i < array.length; i++){
   newArray[i] = array[i];
  }

  for(int i = 0; i < newArray.length; i++){
    if((int)newArray[i] >= 65 && (int)newArray[i] <= 90){
      int temp = (int) newArray[i] + 32;
      newArray[i] = (char)temp;
    }
  }

  MyString data = new MyString(newArray);
  return data;
}

MyString toUpperCase(){

  char[] newArray = new char[array.length];
  
  for(int i =0; i < array.length; i++){
   newArray[i] = array[i];
  }

  for(int i = 0; i < newArray.length; i++){
    if((int)newArray[i] >= 97 && (int)newArray[i] <= 122){
      int temp = (int) newArray[i] - 32;
      newArray[i] = (char)temp;
    }
  }

  MyString data = new MyString(newArray);
  return data;
}

boolean equals(MyString rightStr){

  boolean msg = true;
  if(array.length != rightStr.array.length){
    msg = false;
  }
  if(msg){
    for(int i = 0; i < array.length; i++){
      if(array[i] != rightStr.array[i]){
        msg = false;
        break;
      }
    }
  }

  return msg;
  
}

boolean equalsIgnoreCase (MyString rightString){

  MyString a = new MyString(array);
  MyString b = a.toLowerCase();
  rightString = rightString.toLowerCase();

  boolean msg = true;
  if(b.array.length != rightString.array.length){
    msg = false;
    
  }
  if(msg){
    for(int i = 0; i < array.length; i++){
      if(b.array[i] != rightString.array[i]){
        msg = false;
        break;
      }
    }
  }

  return msg;
}

int compareTo(String str){

  MyString a = new MyString(array);
  MyString b = new MyString(str);
  
  int msg = 0;
  for(int i = 0; i < a.length(); i++){
    if((int)a.array[i] > (int)b.array[i]){
      msg = -1;
      break;
    } else if((int)a.array[i] == (int)b.array[i]){
      msg = 0;
      
    } else {
      msg = 1;
      break;
    }
  }
  return msg;
}

int compareToIgnoreCase(MyString str){
  
  
  MyString a = new MyString(array);
  a = a.toLowerCase();
  MyString b = str.toLowerCase();
  
  int msg = 0;
  for(int i = 0; i < a.length(); i++){
    if((int)a.array[i] > (int)b.array[i]){
      msg = -1;
      break;
    } else if((int)a.array[i] == (int)b.array[i]){
      msg = 0;
      
    } else {
      msg = 1;
      break;
    }
  }
  return msg;

}

int compareToIgnoreCase(String str){

  MyString temp = new MyString(str);
  return compareToIgnoreCase(temp);

}

MyString substring (int start){

  String a = "";
  for(int i = start; i < array.length; i++){
    a += array[i];
  }
  MyString temp = new MyString(a);
  return temp;
}

MyString substring (int start, int end){

  String a = "";
  for(int i = start; i <= end; i++){
    a += array[i];
  }
  MyString temp = new MyString(a);
  return temp;
}

int indexOf (char ch){

  int msg = -1;
  for(int i = 0; i < array.length; i++){
    if(array[i] == ch){
      msg = i;
      break;
    }
  }
  return msg;
}

int lastIndexOf (char ch){

  int msg = -1;
  for(int i = array.length - 1; i >= 0; i--){
    if(array[i] == ch){
      msg = i;
      break;
    }
  }
  return msg;
}

int indexOf (char ch, int start){

  int msg = -1;
  for(int i = start; i < array.length; i++){
    if(array[i] == ch){
      msg = i;
      break;
    }
  }
  return msg;
}

int lastIndexOf (char ch, int start){
  
  int msg = -1;
  for(int i = array.length - 1; i >= 0; i--){
    if(array[i] == ch){
      msg = i;
      break;
    }
  }
  return msg;
}

int indexOf(MyString str){

  int msg = -1;
  for(int i = 0; i <= array.length - str.array.length; i++){

    if(array[i] == str.array[i]){
      int temp = 0;
      int startPoint = i;
      for(int j = i; j < i + (str.array.length - 1); i++){

        if(array[j] != str.array[temp]){
          break;
        } else if (j == str.array.length - 1){
          msg = startPoint;
        }
      }
    }
  }

  return msg;
}

int lastIndexOf (String str){

  MyString temp1 = new MyString(str);
  int msg = -1;
  for(int i = 0; i <= array.length - temp1.array.length; i++){

    if(array[i] == temp1.array[i]){
      int temp = 0;
      int startPoint = i;
      for(int j = i; j < i + (temp1.array.length - 1); i++){

        if(array[j] != temp1.array[temp]){
          break;
        } else if (j == temp1.array.length - 1){
          msg = startPoint;
        }
      }
    }
  }

  return msg;

}

MyString concat(MyString str){

  char[] temp = new char[array.length + str.array.length];
  for(int i = 0; i < array.length; i++){
    temp[i] = array[i];
  }
  
  int j = 0;
  for(int i = array.length; i < temp.length; i++){
    temp[i] = str.array[j];
    j++;
  }
  
  MyString data = new MyString(temp);
  return data;
}

MyString concat(char[ ] charSeq){
  
  MyString temp = new MyString(charSeq);
  return concat(temp);
}

MyString concat(String str){
  
  MyString temp = new MyString(str);
  return concat(temp);
}
}