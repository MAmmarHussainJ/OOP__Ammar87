class circle{
double radius;
String color;

void calculatearea(){
double area =(3.14*radius*radius);
System.out.println("The area of a circle " + area);
}

public static void main(String[] args){

circle green_circle = new circle();
circle red_circle = new circle();

green_circle.color="Green";
green_circle.radius = 5.3;


red_circle.color="Red";
red_circle.radius= 2.5;

System.out.println( "The radius of red circle is " + red_circle.radius);
System.out.println("The radius of green circle is " + green_circle.radius);

red_circle.calculatearea();
green_circle.calculatearea();




}

}