/*Write a Java program that takes a string as input and prints its length using the length() method.

Implement a Java program that takes a string as input and converts it to uppercase using the toUpperCase() method.

Write a Java program that accepts two strings as input and concatenates them using the concat() method.

How can you check if a string contains a specific substring in Java using predefined methods?

Explain the difference between the substring() method and the split() method in Java.----->

Write a Java program that accepts a sentence as input and counts the number of words in the sentence using predefined methods.

How can you remove leading and trailing whitespace from a string in Java using predefined methods?

Implement a Java program that accepts a string as input and checks if it starts with a specific prefix using predefined methods.

Write a Java program that takes a string as input and converts it to lowercase using predefined methods.

How can you replace all occurrences of a specific character in a string with another character using predefined methods in Java?---->

Write a Java program that takes a string as input and checks if it ends with a specific suffix using predefined methods.

Implement a Java program that accepts two strings as input and checks if they are equal, ignoring case, using predefined methods.*/
import java.util.*;
public class Prac{
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the String 1 : ");
      String str=s.nextLine();
      System.out.println("Enter the String 2 :");
      String str1=s.nextLine();
      System.out.println("The length of the string is "+str +" is : "+(str.length()));//that takes a string as input and prints its length using the length() method.
      System.out.println("converting the string "+str +" to uppper case is : "+(str.toUpperCase()));//takes a string as input and converts it to uppercase using the toUpperCase() method.
      System.out.println("The string concatination is"+str +str1);//that accepts two strings as input and concatenates them using the concat() method.
      System.out.println("the substring  is :"+str.substring(0,2));//check if a string contains a specific substring in Java.
      String words[]=str.split(" ");//the split() method in Java.
      System.out.print("The split string is :");
      for(int i=0;i<words.length;i++)
        {
         System.out.println(words[i]);
        }
      
      System.out.println("Enter the letter to check for string startswith ");
      System.out.println("The string startss with "+str.startsWith(s.next()));
      System.out.println("CONVERTING STRI "+str +" TO LOWERCASE is : "+(str.toLowerCase()));//a string as input and converts it to lowercase 
      System.out.println("CHECK IF THE TWO STRINGS ARE EQUAL IGNORING THE CASES :"+str1.equalsIgnoreCase(str));//two strings as input and checks if they are equal, ignoring case,
      System.out.println("Enter the letter to check for string endswith ");
      System.out.println("THE STRING CHECK FOR STARTSWITH "+str1.endsWith(s.next()));//takes a string as input and checks if it ends with a specific suffix
      String r=str.replaceAll(str,"Beautiful");
      System.out.println("REPLACING THE STRING STR TO BEAUTIFUL :"+r);//replace all occurrences of a specific character in a string with another character 
      
    }
  }