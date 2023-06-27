import java.util.*;

public class Posneg{

  public static void main(String args[]){
   int a[]={1,2,-2,-1,5};
      int pos=0,neg=0;
    for(int i=0;i<a.length;i++){
      if(a[i]>=0){
        pos++;
      }
      else{
        neg++;
      }
    }
    System.out.println("positive count is" +pos);
    System.out.println("negative count is"+neg);
    }
  }
