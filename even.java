import java.util.*;
class even
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String value=sc.nextLine();
		int num=Integer.parseInt(value);
		if(num>0)
		{
			if(num%2==0)
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("odd");
			}
		}
		else
		{
			System.out.println("invalid");
		}
	}
}
