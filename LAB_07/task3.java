import java.util.Scanner;
class task3{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
        String[] name = new String[5];
        for (int i=0; i<5; i++ ){
        name[i] = input.nextLine();
        System.out.print(name[i].toUpperCase());
      
      }
	}
}