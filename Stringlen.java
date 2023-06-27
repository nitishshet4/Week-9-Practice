import java.util.*;

public  class Stringlen{

  public static void main(String args[]){
    String str="nitish";
    int len=0;
    //char ch[100];
    for(char ch: str.toCharArray()){
      len++;
    }
    System.out.println("lenght of the string "+len);
  }
}


//String s="nitish";
