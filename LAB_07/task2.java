import java.util.Scanner;
	class task2{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
			System.out.print("Find the occurence of letter A");
			String str = input.nextLine();
			int index = str.indexOf("a");
			System.out.println("Index of first a: " + index);
		}
	
}