import java.util.Scanner;
class lab3task1{
public static void main(String[]args){
Scanner input= new Scanner(System.in);
System.out.println("Enter the start of Prime Numbers : ");
int start= input.nextInt();
System.out.println("Enter the end of Prime Numbers : ");
int end = input.nextInt();

	for(int num=start;num<=end;num++)
	{
	boolean isPrime=true;
		for(int i=2;i<start;i++)
		{
			if(num%i==0)
			{
			isPrime = false;
			break;
			}
		
		}
			if(isPrime)
			{
			System.out.println(num);
			}
		
		
	}
}}