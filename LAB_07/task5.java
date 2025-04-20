import java.util.Scanner;
	class task5{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			String check= input.nextLine();
			if (check.endsWith("world")){
				System.out.print("String Ends with World");
			}
			else{
				System.out.print("String does not Ends with World");
			}
		}
	}