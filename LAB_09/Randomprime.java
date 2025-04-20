public class Randomprime{






    public static void main(String[] args) {
        int min = 10;
        int max = 20;

        	System.out.println("Prime numbers between " + min + " and " + max + ":");
        	printPrimesInRange(min, max);
    	}

    
    		public static void printPrimesInRange(int min, int max) {
        	for (int i = min; i <= max; i++) {
            	if (isPrime(i)) {
                System.out.print(i + " ");
        }
        }
	}

    
    		public static boolean isPrime(int num) {
        	if (num <= 1) return false;

       		for (int i = 2; i <= Math.sqrt(num); i++) {
           	if (num % i == 0) return false;
        }

        	return true;
	}
	}
