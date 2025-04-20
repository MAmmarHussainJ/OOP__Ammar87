import java.util.Scanner;
	class task4{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			String check= input.nextLine();
			if (check.startsWith("hello")){
				System.out.print("String Starts with Hello");
			}
			else{
				System.out.print("String does not start with hello");
			}
		}
	}
