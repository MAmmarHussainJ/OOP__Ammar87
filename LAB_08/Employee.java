class Employee{

	int calculateBonus(int salary){
		return (salary*10)/100;
	}

	int  calculateBonus(int salary, int extraHours){
		return (salary*10)/100+(extraHours*500);
	}

	public static void main (String[] args){

		Employee emp = new Employee();
	
	System.out.println(emp.calculateBonus(50000));
	System.out.println(emp.calculateBonus(50000,3));
}
}