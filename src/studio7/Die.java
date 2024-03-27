package studio7;

public class Die {
	private int sides;
	
	public Die(int n) {
		sides = n; 
	}
	
	public int throwDie() {
		return (int)((Math.random()*(this.sides-1)) + 1);  
	}
	
	public static void main(String[] args) {
		Die bleh = new Die(7); 
		System.out.println(bleh.throwDie()); 
	}
	
}
