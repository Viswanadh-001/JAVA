package Interface;

class Carimp implements Car {

	public void lamborgini() {
		System.out.println("Lamborgini");
		System.out.println("");
	}

	public void Tata() {
		System.out.println("Tata");
		
	}
	
	public static void main(String[] args) {
		Carimp car = new Carimp();
		car.lamborgini();
		car.Tata();
	}
	
}