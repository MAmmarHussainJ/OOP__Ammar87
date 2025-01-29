import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = {6,54,69,45,78,90,15,67};
        int large = array[0];
         int small = array[0];
        for (int i = 0 ; i<array.length ; i++){
            if (large <= array[i]){
                large = array[i];
            }
            else if(small >= array[i]){
                small = array[i];
            }
        }
        System.out.println("Largest Number: " + large);
        System.out.println("Smallest Number : " + small);
        if (large %2==0){
            System.out.println("Largest number is Divisible by 2 "+ large );
        }
        else{
            System.out.println("Largest number is not Divisible by 2 "+ large);
        }
    }
}
