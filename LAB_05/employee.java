class employee{
String name;
String ID;
int sal;

employee(String name, String ID, int sal){
this.name=name;
this.ID=ID;
this.sal=sal;
}
void displaydetails(){
System.out.println("Name of Employee: "+ name);
System.out.println( "ID " + ID);
System.out.println("Employee sal: "+ sal);
}
void incsal(int amount){
sal += amount;
System.out.println("Increased sal: "+ sal);
}
int annualsal(){
System.out.println("Annual sal: "+ sal*12);
return sal;
}

public static void main(String[] args){

employee e1 = new employee("Ayesha","A0082",50000);

e1.displaydetails();
e1.incsal(2000);
e1.annualsal();
}
}