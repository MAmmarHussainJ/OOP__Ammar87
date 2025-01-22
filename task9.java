import java.util.Scanner;
 
 class task9{
public static void main (String[] args){


Scanner obj1 = new Scanner(System.in);
Scanner obj2 = new Scanner(System.in);
Scanner obj3 = new Scanner(System.in);
double number1;
double number2;
char op;
double result;
  

   System.out.println("Enter Number 1");
   number1 = obj1.nextInt();
System.out.println("Enter OPERATION");
   op = obj2.next().charAt(0);
System.out.println("Enter Number 2");
   number2 = obj3.nextInt();
switch (op) {

      case '+':
        result = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + result);
        break;

      case '-':
        result = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + result);
        break;

      case '*':
        result = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + result);
        break;

      case '/':
        result = number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + result);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    
  }
}
 