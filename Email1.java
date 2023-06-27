import java.util.*;
public class Email1
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the email id :");
    String str=s.nextLine();
    if(str.endsWith("@gmail.com"))
    {
      System.out.println("Your Email Id "+str+" is valid");
    }
    else
    {
      System.out.println(" your Email Id  is Invalid!!!");
    }
    System.out.println("Enter a URL to validate");
    String url=s.nextLine();
    if(url.startsWith("http://") || (url.startsWith("https://")))
    {
      if(url.contains(".com"))
      {
        System.out.println("Entered URL "+url+" is valid");
      }
      else
      {
        System.out.println(" URL is Invalid");
      }
    }
      else
      {
        System.out.println(" URL is Invalid");
      }
    System.out.println("Enter a phone number:");
    String phn=s.next();
    boolean b =false;
    if(phn.length()==10 )
      {
      char ch[]=phn.toCharArray();
      {
      for(int i=0;i<phn.length();i++)
      {
      if(ch[i]>='0' && ch[i]<='9')
      {
      if(ch[0]>='6' && ch[0]<='9')
      {
         b=true;
      }
      }
      }
      }
      if(b==true)
      {
        System.out.println("Phone number is valid");
      }
      else
      {
        System.out.println(" phone number is Invalid");
      }
    }
  }
}