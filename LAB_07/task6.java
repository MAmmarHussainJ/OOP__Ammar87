import java.util.Scanner;
	class task6{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			String check= input.nextLine();
			if (check.contains("java")){
				System.out.print("String contains java");
			}
			else{
				System.out.print("String does not contains java");
			}
		}
	} 