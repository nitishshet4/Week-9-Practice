public class Oddsum
  {
    public static void main(String args[])
    {
      int i=0,sum=0;
      while(i<=100)
        {
          if(i%2!=0)
          {
          sum=sum+i;
          }
          i++;
        }
       System.out.println("THE SUM OF ODD NUMBER FROM 1 TO 100 "+sum);
  }
  }