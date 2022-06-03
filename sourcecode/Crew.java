package main;

public class Crew {
	
	private String name;
	private int health;
	private int repaire;
	private int hunger;
	private int tiredness;
	private int action;
	private Crew player1, player2,player3, player4;
	
	
	public void setName(String tempName) {
		name = tempName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setHealth(int tempHealth) {
		health = tempHealth;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setRepaire(int tempRepaire) {
		repaire = tempRepaire;
	}
	
	public int getRepaire() {
		return repaire;
	}
	
	public void setHunger(int tempHunger) {
		hunger = tempHunger;
	}
	
	public int getHunger() {
		return hunger;
	}
	
	public void setTiredness(int tempTiredness) {
		tiredness = tempTiredness;
	}
	
	public int getTiredness() {
		return tiredness;
	}
	
	public void setAction(int tempAction) {
		action = tempAction;
	}
	
	public int getAction() {
		return action;
	}
	
	public void maintenance() {
		setAction(1);
		setHealth(50);
		setHunger(50);
		setName("maintenance guy");
		setRepaire(100);
		setTiredness(50);
	}
	
	public void doctor() {
		setAction(1);
		setHealth(100);
		setHunger(70);
		setName("doctor");
		setRepaire(30);
		setTiredness(50);
	}
	
	public void dog() {
		setAction(1);
		setHealth(70);
		setHunger(30);
		setName("pathFinder");
		setRepaire(0);
		setTiredness(50);
		
	}
	
	public void meditator() {
		setAction(1);
		setHealth(50);
		setHunger(70);
		setName("monk");
		setRepaire(30);
		setTiredness(100);
	}
	
	public void magician() {
		setAction(1);
		setHealth(50);
		setHunger(100);
		setName("magician");
		setRepaire(30);
		setTiredness(50);
	}
	
	public void monkey() {
		setAction(3);
		setHealth(50);
		setHunger(50);
		setName("actor");
		setRepaire(0);
		setTiredness(50);
	}
	
	
	////-----------------------------------------------------------------
	
	public void setCrewTypes1(String tempType) {
		if(tempType.equals("maintenance guy")) {
			player1.maintenance();
		}
		if(tempType.equals("doctor")) {
			player1.doctor();
		}
		if(tempType.equals("pathFinder")) {
			player1.dog();
		}
		if(tempType.equals("monk")) {
			player1.meditator();
		}
		if(tempType.equals("magician")) {
			player1.magician();
		}
		if(tempType.equals("actor")) {
			player1.monkey();
		}
		
	}
	
	public void setCrewTypes2(String tempType) {
		if(tempType.equals("maintenance guy")) {
			player2.maintenance();
		}
		if(tempType.equals("doctor")) {
			player2.doctor();
		}
		if(tempType.equals("pathFinder")) {
			player2.dog();
		}
		if(tempType.equals("monk")) {
			player2.meditator();
		}
		if(tempType.equals("magician")) {
			player2.magician();
		}
		if(tempType.equals("actor")) {
			player2.monkey();
		}
		
	}
	
	public void setCrewTypes3(String tempType) {
		if(tempType.equals("maintenance guy")) {
			player3.maintenance();
		}
		if(tempType.equals("doctor")) {
			player3.doctor();
		}
		if(tempType.equals("pathFinder")) {
			player3.dog();
		}
		if(tempType.equals("monk")) {
			player3.meditator();
		}
		if(tempType.equals("magician")) {
			player3.magician();
		}
		if(tempType.equals("actor")) {
			player3.monkey();
		}
		
	}
	
	public void setCrewTypes4(String tempType) {
		if(tempType.equals("maintenance guy")) {
			player4.maintenance();
		}
		if(tempType.equals("doctor")) {
			player4.doctor();
		}
		if(tempType.equals("pathFinder")) {
			player4.dog();
		}
		if(tempType.equals("monk")) {
			player4.meditator();
		}
		if(tempType.equals("magician")) {
			player4.magician();
		}
		if(tempType.equals("actor")) {
			player4.monkey();
		}
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
