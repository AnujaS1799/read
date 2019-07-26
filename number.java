import java.util.*;
class number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner();
		String no = sc.nextLine();
		int num = parseInteger(no);
		if(num==0)
		{
			System.out.println("Zero");
		}
		else if(num>0)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
	}
}
