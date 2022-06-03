package main;

public class CrewTypes extends Crew{
	public void maintenance() {
		super.setAction(1);
		super.setHealth(50);
		super.setHunger(50);
		super.setName("maintenance guy");
		super.setRepaire(100);
		super.setTiredness(50);
	}
	
	public void doctor() {
		super.setAction(1);
		super.setHealth(100);
		super.setHunger(70);
		super.setName("doctor");
		super.setRepaire(0);
		super.setTiredness(50);
	}
	
	public void dog() {
		super.setAction(1);
		super.setHealth(70);
		super.setHunger(30);
		super.setName("pathFinder");
		super.setRepaire(0);
		super.setTiredness(50);
		
	}
	
	public void meditator() {
		super.setAction(1);
		super.setHealth(50);
		super.setHunger(70);
		super.setName("monk");
		super.setRepaire(30);
		super.setTiredness(100);
	}
	
	public void magician() {
		super.setAction(1);
		super.setHealth(50);
		super.setHunger(100);
		super.setName("magician");
		super.setRepaire(30);
		super.setTiredness(50);
	}
	
	public void monkey() {
		super.setAction(3);
		super.setHealth(50);
		super.setHunger(50);
		super.setName("actor");
		super.setRepaire(0);
		super.setTiredness(50);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
