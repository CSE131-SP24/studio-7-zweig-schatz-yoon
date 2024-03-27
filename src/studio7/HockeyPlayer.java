package studio7;

public class HockeyPlayer {
	private String name; 
	private int number; 
	private boolean handSide; //Right - true, left - false
	private boolean shootSide; //Right - true, left - false
	private int goals; 
	private int assists; 
	
	public HockeyPlayer(String name, int number, boolean domHand, boolean shootSide, int goals, int assists) {
		this.name = name; 
		this.number = number; 
		handSide = domHand; 
		this.shootSide = shootSide; 
		this.goals = goals; 
		this.assists = assists; 
	}
	
	public int goals() {
		return goals; 
	}
	
	public int assists() {
		return assists; 
	}
	
	public int gamePoints(int goals, int assists) {
		return goals+assists; 
	}
	
	public static void main(String[] args) {
		HockeyPlayer john = new HockeyPlayer("john", 3, true, true, 8, 9);		System.out.println(john);
		System.out.println(john.goals() + ", " + john.assists());
	}
}
