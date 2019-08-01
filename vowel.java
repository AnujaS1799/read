import java.util.*;
class vowel
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String alpha=sc.nextLine();
		char c=alpha.charAt(0);
		int val=c;
		if((val>=65 && val<=90)||(val>=97 && val<=122))
		{
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println("Vowel");
			}
			else
			{
				System.out.println("Consonant");
			}
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
