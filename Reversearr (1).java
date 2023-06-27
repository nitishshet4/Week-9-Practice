import java.util.Scanner;

public class Reversearr{

  public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    System.out.println("enter the length of the  array:");
    int n=s.nextInt();
    int arr[]=new int [n];
    System.out.println("enter the  array elements:");
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    
    }
    System.out.println("the reverse array ");
     for(int i=0;i<n;i++){
      int reverse=0;
     while(arr[i]>=1){
       reverse=reverse*10+arr[i]%10;
       arr[i]=arr[i]/10;
     }
      arr[i]=reverse;
     }
    for(int i=0;i<n;i++){
      System.out.print(arr[i] +" ");
    }
    }
  }
