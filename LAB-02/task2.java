import java.util.Scanner;

public class task2{
	
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	int[] num = new int[10];

	for(int i=0; i<10; i++){
		System.out.println("Type Input for index " + i + " : ");
		num[i] = input.nextInt(); 	
	}
	
	int sum = 0;

	for(int i=0; i<num.length; i++){
		
		if(num[i]%4 == 0){
			sum += num[i];
		}
	}
	System.out.println("____________________");
	System.out.print(sum);
	
	






}
}