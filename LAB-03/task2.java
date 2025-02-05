import java.util.Scanner;
class lab3task2{
public static void main(String[]args)
{
Scanner input= new Scanner(System.in);
System.out.println("Enter any String : ");
String user= input.nextLine();

String rev="";
for(int i=user.length()-1;i>=0;i--)
{
rev=rev+user.charAt(i);
}

if(user.equals(rev))
{
System.out.println("Yes this is Palindrome:) ");
}
else
{
System.out.println("Sorry this is not Palindrome:( ");
}


}}