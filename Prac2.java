import java.util.Scanner;


public class Prac2{
  public static void main(String args[]){
    Scanner s=new Scanner (System.in);
    int len=5;
    int arr[]=new int [5];
    for(int i=0;i<len;i++){
      arr[i]=s.nextInt();
    }
    for(int i=0;i<len;i++){
      System.out.println(arr[i]);
    }
  }}