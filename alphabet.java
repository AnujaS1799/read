import java.util.*;
class alphabet
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String al=sc.nextLine();
		char c=al.charAt(0);
		int val=c;
		if((val>=65 && val<=90)||(val>=97 && val<=122))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("No");
		}
	}
}
