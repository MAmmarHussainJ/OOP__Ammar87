import java.util.Scanner;

public class task3{
	
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	
	int size, col;
	System.out.println("Enter Number Of Rows : ");
	size = input.nextInt();	
	System.out.println("Enter Number Of Colums : ");
	col = input.nextInt();	

	int[][] matrix1 = new int[size][col];
	System.out.println("Enter Values Of Matrix 1 : ");

	for(int i=0; i<size; i++){
		for(int j=0; j<col; j++){
			matrix1[i][j] = input.nextInt();
		}
	}
	
	int[][] matrix2 = new int[size][col];
	System.out.println("Enter Values Of Matrix 2 : ");
	
	for(int i=0; i<size; i++){
		for(int j=0; j<col; j++){
			matrix2[i][j] = input.nextInt();
		}
	}
		
	int[][] sum_matrix = new int[size][col];
	System.out.println("Total = ");
	for(int i=0; i<size; i++){
		for(int j=0; j<col; j++){
			sum_matrix[i][j] = matrix1[i][j] + matrix2[i][j];
			System.out.print(sum_matrix[i][j] + " ");
		}
			System.out.println();
	}
 
	


	
}
}