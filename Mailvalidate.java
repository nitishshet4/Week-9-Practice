//Write a program that prompts the user to enter an email address. The program should validate the email address based on the following criteria:
//The email address must contain the "@" symbol.
//The email address must contain a domain name (e.g., "example.com").
/*Write a java program that prompts the user to enter a URL. The program should validate the URL based on the following criteria:
The URL must start with "http://" or "https://".
The URL must contain a domain name (e.g., "example.com").*/


import java.util.*;
public class Mailvalidate{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
  System.out.println("Enter the email:");
  String str=s.nextLine();
  if(str.contains("@") && str.endsWith(".com") && str.contains("gmail")){
    System.out.println("Your EmailId "+str+" is valid");
    }
  else{
    System.out.println(" please enter the valid email address");
  }
    System.out.println("Enter a URL to validate");
    String url=s.nextLine();
    if(url.contains("http://") || (url.contains("https://"))){
      if(url.contains(".com")){
        System.out.println("Entered URL "+url+" is valid");
      }else{
        System.out.println(" please enter the valid  URL ");
      }
    }
    System.out.println("Enter a phone number:");
    String phn=s.next();
    boolean yes =false;
    if(phn.length()==10 ){
      char ch[]=phn.toCharArray();
      for(int i=0;i<phn.length();i++){
      if(ch[i]>='0' && ch[i]<='9'){
         yes=true;
        
      }
      }
      if(yes==true){
        System.out.println("Phone number is valid");
      }else{
        System.out.println(" please  enter the valid phone number");
      }
    }
  }
}
