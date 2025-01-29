import java.util.Scanner;

public class task1{
	
	public static void main(String[]args){
	Scanner get = new Scanner(System.in);

	char const_arr[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
	
	while(true){
	System.out.println("  - Enter Any Consonant");
	char input = get.next().charAt(0);
	
	boolean isConst = false;
	for(int i=0; i<const_arr.length; i++){
		
		if(input == const_arr[i]){
			isConst = true;
			break;
		}
	}

	if (isConst){
		System.out.print("Constant");
	}

	else{
		System.out.print("Not Constant");
	}
	
	}
	
}
}