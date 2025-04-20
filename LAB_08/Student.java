class Student{
	private String name;
	private int rollNumber;
	private String grade;

	Student (String name , int rollNumber, String grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
	}

	void setName(String name){
		this.name=name;
	}
	String getName(){
		return name;
	}
	void setRollNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}
	int getRollNumber(){
		return rollNumber;
	}
	void setGrade(String grade){
		this.grade=grade;
	}
	String getGrade(){
		return grade;
	}
	void displayInfo(){
		System.out.println("Name: "+name);
		System.out.println("Roll Number: "+rollNumber);
		System.out.println("Grade: "+grade);
	}

	public static void main(String[] args){
		Student student = new Student("Atika",90,"A");
		student.setName("Ayesha");
		student.setRollNumber(82);
		student.setGrade("A");
		student.displayInfo();


	}




}