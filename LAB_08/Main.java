class Main {
	public static void main(String[] args){
		// Animal myAnimal = new Animal();
		// Animal myDog = new Dog();
		// Animal myCat = new Cat();

		// myAnimal.makeSound();
		// myDog.makeSound();
		// myCat.makeSound();

		Bank sbi = new SBI();
        Bank icic = new ICIC();
        Bank hdfc = new HDFC();

        System.out.println("SBI interest: "+ sbi.getInterestRate());
        System.out.println("ICIC interest: "+ icic.getInterestRate());
        System.out.println("HDFC interest: "+ hdfc.getInterestRate());
	}
}