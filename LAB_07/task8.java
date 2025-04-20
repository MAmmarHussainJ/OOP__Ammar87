import java.util.Scanner;
class task8{

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		String check = input.nextLine();
		

		String[] words = check.split(" ");
		int wordcount = 0;
		for (String word:words){
			System.out.println(word);
			wordcount++;
			
		}
		System.out.println("Total words: "+wordcount);
	
      }
	} 
