import java.util.Scanner;

public class task4{
	
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	String[] names = new String[6];
	for(int i=0; i<names.length; i++){
		System.out.println("Type Name for index " + i + " : ");
		names[i] = input.nextLine(); 
	}
		String name ="Ali";

	for(int i=0; i<names.length; i++){
		
		if(names[i].equals(name)){
			System.out.println("YES!");
		}
	}





}
}