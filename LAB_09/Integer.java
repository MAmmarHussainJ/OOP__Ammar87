import java.util.Random;
class Integer{






 	public static void main(String[] args){
 		Random r1 = new Random();
 		int count[] = new int[21];

 		for (int i=0; i<=100; i++){
 			int rand = r1.nextInt(21);
 			count[rand]++;
 	}

        	for (int i=0; i<=20; i++){
        	System.out.println("Number "+ i +": "+ count[i]+" times");
        }
 	}
 	}