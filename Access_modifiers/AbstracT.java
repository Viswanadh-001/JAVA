package Access_modifiers;
  
abstract class AbstracT {      
     abstract void display();

}
class Display extends AbstracT{
	
	public void display() {
		System.out.println("Display method");
	}
	
	public static void main(String[] args) {
		Display d = new Display();
		d.display();
	}
	
}
//Illegal combinations of modifiers for methods

// abstract vs  -- final
//              -- static
//              -- syncronizied 
//              -- strictfp
//              -- native
//              -- private