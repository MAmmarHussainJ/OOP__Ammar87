import java.util.Scanner;
class task7{

  public static void main(String[] args){

Scanner obj1 = new Scanner(System.in);
Scanner obj2 = new Scanner(System.in);
   double radius;
   double height;
  

   System.out.println("Enter RADIUS");
   radius = obj1.nextDouble();
   System.out.println("Enter HEIGHT");
   height = obj2.nextDouble();

   System.out.println(" VALUE IS = " + (3.14*(radius*radius)*height));

}}