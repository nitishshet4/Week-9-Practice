import java.util.*;

public  class Reverse{
  public static void main(String args[]){
    String s="hello hi good morning madam";
    StringTokenizer n=new StringTokenizer(s," ");
    //StringBuilder b=new StringBuilder();
    while(n.hasMoreTokens()){
       String c=n.nextToken();
      StringBuilder b=new StringBuilder(c);
      String rev=b.reverse().toString();
      System.out.print(rev +" ");
    
    if(c.equals(rev)){
      System.out.println(c);
    }
      
    }
    }
  }  
