class Temperature{
	private double celsius;

	Temperature(double celsius){
		this.celsius=celsius;
	}

	void setCelsius(double c){
		celsius=c;
	}
	double getFahrenheit(){
		return celsius*9/5 +32;
	}

	public static void main (String[] args){

		Temperature temp = new Temperature(24.3);
		temp.setCelsius(25.0);
		System.out.println("Fahrenheit: "+ temp.getFahrenheit());
	}
}