import java.util.Scanner;

public class Stringfirst {
	private static Scanner sc;
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
    int count=0;
		System.out.print("Enter String ");
		String Str=s.nextLine();
		System.out.print("Enter the Character  ");
	char	ch=s.next().charAt(0);
		for(int i=0;i <Str.length();i++)
		{
			if(Str.charAt(i)==ch) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println("no Character ");
		}
		else {
			System.out.format("The First Character Occurrence of position", 
					count);
		}
	}

}