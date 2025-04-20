class circle2{
double radius;
String color;

circle2(String color , double radius){
this.radius = radius;
this.color = color;
}

double calculatearea(){
double area =(3.14*radius*radius);
System.out.println("The area of a circle " + area);
return area;
}

public static void main(String[] args){

circle2 green_circle = new circle2("green",5.3);
circle2 red_circle = new circle2("red", 2.5);


System.out.println( "The radius of red circle is " + red_circle.radius);
System.out.println("The radius of green circle is " + green_circle.radius);

red_circle.calculatearea();
green_circle.calculatearea();


}

}