#include<stdio.h>
int number;
int main()
{
	scanf("%d",&number);
	if(number==0)
	{
		printf("Zero");
	}
	else if(number>0)
	{
		printf("Positive");
	}
	else
	{
		printf("Negative");
	}
	return 0;
}
