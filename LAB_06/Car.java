class Car extends Vehicle{
	int numDoors;

	Car(String brand, double speed, int numDoors){
		super(brand,speed);
     this.numDoors=numDoors;
	}
	void showDetails(){
	System.out.println("\t~~ Car Details ~~");
    System.out.println("Brand: "+super.brand+"\tSpeed: "+super.speed+"\tNumdoors: "+numDoors);

	}
}