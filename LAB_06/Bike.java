class Bike extends Vehicle{
	String helmetType;

	Bike(String brand, double speed, String helmetType){
		super(brand,speed);
     this.helmetType=helmetType;
 }
 void showDetails(){
 	System.out.println("\t~~ Bike Details ~~");
 	System.out.println("Brand: "+super.brand+"\tSpeed: "+super.speed+"\tHelmetType: "+helmetType);
 }
}
