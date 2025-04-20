class Student{
String name;
String id;
double[] grades = new double[5];  

Student(String name, String id, double[] grades){
this.name=name;
this.id=id;
this.grades=grades;
} 
public void display_average(){
double sum = 0;
 for (double grad:grades){
  sum += grad;
}
double average = sum/grades.length;
System.out.println("The Average of: "+ name + average);
}
double calc_percentage(){
double sum=0;
for(double grad:grades){
sum += grad;
}
double percentage = sum/1000*100;
System.out.println("The Percentage of: "+ name + percentage);
return percentage;
}
String concat_id_name(){
System.out.println("Concatenated Name and Id:" +name+"_"+id);
return id+name;
}
public static void main(String[] args){

double[] grades1 = {180,190,199,185,195};
double[] grades2 = {193,195,196,192,191};

Student S1 = new Student("Ayesha","A0082",grades1);
Student S2 = new Student("Aqsa","A0083",grades2);

S1.display_average();
S1.calc_percentage();
S1.concat_id_name();
S2.display_average();
S2.calc_percentage();
S2.concat_id_name();

}
}