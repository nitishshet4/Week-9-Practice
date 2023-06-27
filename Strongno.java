// Strong number

import java.util.Scanner;

class Strongno {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n, fact,sum=0,digit=0 ;

        System.out.println("Enter the number");
        n = s.nextInt();

        int temp=n;
        while (n!=0) {
            digit=n%10;
            fact=1;
            for(int i=digit;i>1;i--) {
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
        }

        if (temp == sum)
            System.out.println(temp + " is Strong number");
        else
            System.out.println(temp + " is not a Strong number");
    }
}