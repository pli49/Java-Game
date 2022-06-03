package main;
import java.util.Random;

/**
 * This class implements all methods and functions for a game.
 * The game is about self rescue in space.
 *
 * @author Pengcheng Liu.
 * @version 1, May 2019.
 */

public class GameManager {
	
	/**
	 * The name of the Space Ship.
	 */
	
	private String shipName;
	
	/**
	 * The amount of shield energy.
	 */
	private int shield = 100;
	/**
	 * The number of people in this group.
	 */
	private int people;
	/**
	 * The number of days they have left.
	 */
	private int days;
	/**
	 * The number of transporter part they are missing.
	 */
	private int pieces;
	/**
	 * Have they found any transporter part on one planet.
	 */
	private boolean boolPieces = false;
	/**
	 * Does player 3 exist.
	 */
	private boolean Player3 = true;
	/**
	 * Does player 4 exist.
	 */
	private boolean Player4 = true;
	/**
	 * Names for player 1, 2, 3, 4.
	 */
	private String name1 = "player 1", name2 = "player 2", name3 = "player 3", name4 = "player 4";
	/**
	 * Health for player 1, 2, 3, 4.
	 */
	private int health1, health2, health3, health4;
	/**
	 * Actions for player 1, 2, 3, 4.
	 */
	private int action1, action2, action3, action4;
	/**
	 * Hungriness for player 1, 2, 3, 4.
	 */
	private int hunger1, hunger2, hunger3, hunger4;
	/**
	 * Tiredness for player 1, 2, 3, 4.
	 */
	private int tiredness1, tiredness2, tiredness3, tiredness4;
	/**
	 * Repair ability for player 1, 2, 3, 4.
	 */
	private int repaire1, repaire2, repaire3, repaire4; 
	/**
	 * Sickness for player 1, 2, 3, 4.
	 */
	private boolean sick1 = false, sick2 = false, sick3 = false, sick4 = false;
	/**
	 * The amount of money the team have.
	 */
	private int money = 100;
	/**
	 * Notices in store.
	 */
	private String notice1, notice2;
	/**
	 * Number of all food items and medical items.
	 */
	private int bread, egg, milk, chickenWing, steak, feast, hotSoup, panadol, healPowder; 
	/**
	 * Random number generator.
	 */
	private Random rand = new Random();
	private Random rand1 = new Random();
	/**
	 * Generated random numbers.
	 */
	private int randomNum,randomNum1;
	/**
	 * Notices for random events.
	 */
	private String robbed, sick, belt;
	
	//random number
	/**
	 * Set up randomNum.
	 * 
	 */
	public void setRand() {
		randomNum = rand.nextInt(5);
	}
	/**
	 * @return the randomNum set up.
	 * 
	 */
	public int getRand() {
		return randomNum;
	}
	/**
	 * set up a random number for random event.
	 * 
	 */
	public void setRand1() {
		randomNum1 = rand1.nextInt(10);
	}
	/**
	 * @return the random number set up.
	 * 
	 */
	public int getRand1() {
		return randomNum1;
	}
	
	//random events
	/**
	 * @return the randomNum set up.
	 * 
	 */
	public void AlienPirates() {
		int alien = rand.nextInt(30);
		if(alien == 0 && getBread() > 0) {
			robbed = "One bread robbed";
			eatBread(1);
		}
		if(alien == 1 && getEgg() > 0) {
			robbed = "One egg robbed";
			eatEgg(1);
		}
		if(alien == 2 && getMilk() > 0) {
			robbed = "One milk robbed";
			eatMilk(1);
		}
		if(alien == 3 && getChickenWing() > 0) {
			robbed = "One chicken wing robbed";
			eatChickenWing(1);
		}
		if(alien == 4 && getSteak() > 0) {
			robbed = "One steak robbed";
			eatSteak(1);
		}
		if(alien == 5 && getFeast() > 0) {
			robbed = "One feast robbed";
			eatFeast(1);
		}
		if(alien == 6 && getHotSoup() > 0) {
			robbed = "One hot soup robbed";
			eatHotSoup(1);
		}
		if(alien == 7 && getPanadol() > 0) {
			robbed = "One panadol robbed";
			eatPanadol(1);
		}
		if(alien == 8 && getHealPowder() > 0) {
			robbed = "One healing powder robbed";
			eatHealPowder(1);
		}
		if(alien == 9) {
			robbed = "One transporter part robbed";
			setPieces1(-1);
		}
	}
	/**
	 * @return    function returns random events that occur as a message to the user that an item has been robbed involving your inventory supplies. 
	 * 
	 * 
	 */
	public String Robbed() {
		return robbed;
	}
	/**
	 * 
	 * @ return your crew members is sick on space plague when traveling on a new planet and it will bring a message letting the player know what happens.
	 * 
	 */
	public String Sick() {
		return sick;
	}
	/**
	 * 
	 *@ return  your ship is under critical conditions and needs repairs when landing on a new planet.
	 * 
	 */
	public String Belt() {
		return belt;
	}
	
	/**
	 * as you arrived on a new planet a random event such as space plague will get the players sick as a result will lose health gradually and will continued to decrease on the next day unless you
	 * heal them to avoid any more crew members from being sick.
	 * 
	 * 
	 */
	
	
	public void SpacePlague() {
		int plague = rand.nextInt(10);
		if(plague == 1) {
			setSick1(true);
			sick = "Player1 caught space plague";
		}
		if(plague == 2) {
			setSick2(true);
			sick = "Player2 caught space plague";
		}
		if(plague == 3 && getPlayer3()) {
			setSick3(true);
			sick = "Player3 caught space plague";
		}
		if(plague == 4 && getPlayer4()) {
			setSick4(true);
			sick = "Player4 caught space plague";
		}
		if(plague == 5) {
			setSick1(true);
			setSick2(true);
			setSick3(true);
			setSick4(true);
			sick = "Every player caught space plague";
		}
	}
	/**
	 * 
	 * Asteroid as the spaceship arrived in a new planet there will be asteroids shielding the planet as a result will affect your ships shields and will lose by a fixed amount by 10, 30,50.
	 * 
	 */
	
	public void AsteroidBelt() {
		int num = rand.nextInt(10);
		if(num == 1 && getShield() > 10) {
			setShield(-10);
			belt = "Shield level drop 10 points";
		}
		if(num == 3 && getShield() > 30) {
			setShield(-30);
			belt = "Shield level drop 50 points";
		}
		if(num == 5 && getShield() > 50) {
			setShield(-50);
			belt = "Shield level drop 50 points";
		}
			
		
	}
	
	
	
	//shop
	/**
	 * 
	 * this function gives players time to shop and to resupply  including food, if the user don't have enough bread to provide to the crew member 
	 * then it will give a message that you have run out of food. this function makes sure that your don't run out of bread.
	 * 
	 */
	
	public void setBread(int amount) {
		if(bread + amount > 0) {
			bread = bread + amount;
			notice2 = "";
		}else {
			notice2 = "You've run out of this item";
		}
	}
	/**
	 * money is the key to supply what you need and it would provide you with options what you can buy, this function would set your money earn and what you will buy from the shop would decrease your 
	 * money and would let the player know that you don't have enough money to speed on other items so remember to buy what you need for your crew for their survival.
	 * 
	 * 
	 */
	public void setMoney(int earntMoney) {
		if(money + earntMoney >= 0) {
			money = money + earntMoney;
			notice1 = "";
		}
		else {
			notice1 = "Not Enough Money!!!";
		}
	}
	
	/**
	 * 
	 * @return the amount of money you have left
	 * 
	 */
	
	public int getMoney() {
		return money;
	}
	/**
	 * 
	 * @ return the message that would let the user know what is going on that includes not enough money, or you dont have enough bread for your crew members
	 * 
	 */
	
	public String getNotice1() {
		return notice1;
	}
	
	/**
	 * if a crew members eats a bread it will decrease
	 * 
	 * 
	 */
	
	public void eatBread(int num) {
		bread = bread - num;
	}
	/**
	 * if you buy bread it will increase the amount of what you have.
	 * 
	 * 
	 */
	
	public void buyBread(int num) {
		bread = bread + num;
	}
	/**
	 * @return it will return the amount of bread you will have 
	 * 
	 * 
	 */
	
	
	public int getBread() {
		return bread;
	}
	
	/**
	 * it will show the amount of eggs decreased
	 * 
	 * 
	 */
	public void eatEgg(int num) {
		egg = egg - num;
	}
	
	/**
	 * as you buy more eggs it would increase
	 * 
	 * 
	 */
	public void buyEgg(int num) {
		egg = egg + num;
	}
	/**
	 *@ return it will provide the user the amount of eggs they currently have.
	 * 
	 * 
	 */
	public int getEgg() {
		return egg;
	}
	
	/**
	 * decrease the amount of milk you have
	 * 
	 * 
	 */
	
	public void eatMilk(int num) {
		milk = milk - num;
	}
	
	/**
	 * increase amount of milk you have
	 * 
	 * 
	 */
	
	public void buyMilk(int num) {
		milk = milk + num;
	}
	
	/**
	 * @ returns amount of milk you currently have in your inventory
	 * 
	 * 
	 */
	
	public int getMilk() {
		return milk;
	}
	
	/**
	 * 
	 * decrease the amount of chicken your crew member is having and would decrease your inventory
	 * 
	 */
	
	public void eatChickenWing(int num) {
		chickenWing = chickenWing - num;
	}
	
	/**
	 * resupply what you have for chicken you get from the shop and would increase chicken inventory
	 * 
	 * 
	 */
	public void buyChickenWing(int num) {
		chickenWing = chickenWing + num;
	}
	
	/**
	 * @ return the amount of chicken you currently have in your supplies
	 * 
	 * 
	 */
	
	public int getChickenWing() {
		return chickenWing;
	}
	
	/**
	 * decrease the amount of steak your crew members are having 
	 * 
	 * 
	 */
	
	public void eatSteak(int num) {
		steak = steak - num;
	}
	
	/**
	 * 
	 * increase the amount of steak brought from your shop and increases your inventory stock of steak
	 * 
	 */
	
	public void buySteak(int num) {
		steak = steak + num;
	}
	
	/**
	 * @ return the current amount of steak you have in your inventory.
	 * 
	 * 
	 */
	
	public int getSteak() {
		return steak;
	}
	/**
	 * decrease amount of hotsoup eaten by your crew members when they get sick
	 * 
	 * 
	 */
	public void eatHotSoup(int num) {
		hotSoup = hotSoup - num;
	}
	/**
	 * 
	 * 
	 * @param increase amount of hotsoup your crew members brought from the shop to what you currently had
	 */
	
	public void buyHotSoup(int num) {
		hotSoup = hotSoup + num;
	}
	
	/**
	 * 
	 * @return the amount of hotsoup of what you currently have now 
	 * 
	 */
	
	public int getHotSoup() {
		return hotSoup;
	}
	
	/**
	 * 
	 * @param deceases the amount of Feast you currently have.
	 * 
	 */
	
	public void eatFeast(int num) {
		feast = feast - num;
	}
	/**
	 * 
	 * @param increases the feast by that amount and resupplying your inventory
	 * 
	 */
	
	public void buyFeast(int num) {
		feast = feast + num;
	}
	
	/**
	 * 
	 * @return feast amount you currently have
	 * 
	 */
	
	public int getFeast() {
		return feast;
	}
	/**
	 * panadol would be helpful if your crew gets sick 
	 * @param decrease the amount of panadol you have used
	 * 
	 * 
	 */
	public void eatPanadol(int num) {
		panadol = panadol - num;
	}
	
	/**
	 * @param increase the amount of panadol supplies you brought
	 * 
	 * 
	 */
	
	public void buyPanadol(int num) {
		panadol = panadol + num;
	}
	/**
	 * @return the amount of panadol you currently have.
	 * 
	 * 
	 */
	
	public int getPanadol() {
		return panadol;
	}
	
	/**
	 * @param decrease amount of healpowder when used by your crew member from space plague
	 * 
	 * 
	 */
	
	public void eatHealPowder(int num) {
		healPowder = healPowder - num;
	}
	
	/**
	 * @param increase amount of healPowder by this much as you buy more from the shop
	 * 
	 * 
	 */
	
	public void buyHealPowder(int num) {
		healPowder = healPowder + num;
	}
	/**
	 * @return the current amount of healpowder you currently now have
	 * 
	 * 
	 */
	public int getHealPowder() {
		return healPowder;
	}
	
	
	//set up ship
	/**
	 * @param increase sheild by this much inorder to comprehend the the asteroids
	 * 
	 * 
	 */
	public void setShield(int temp) {
		shield += temp;
	}
	
	/**
	 * 
	 * @return the amount of shield you currently have
	 * 
	 */
	public int getShield() {
		return shield;
	}
	
	/**
	 * 
	 * @param set the name of the ships name by the user
	 * 
	 */
	
	public void setShipName(String enteredName) {
		shipName = enteredName;
	}
	/**
	 * 
	 * @return the ships name
	 * 
	 */
	public String getShipName() {
		return shipName;
	}
	
	/**
	 * 
	 * @param sets the amount of crew memebers you have
	 * 
	 */
	
	
	
	public void setPeople(int ppl) {
		people = ppl;
	}
	
	/**
	 * 
	 * @return the amount of people you currently have
	 * 
	 */
	public int getPeople() {
		return people;
	}
	
	/**
	 * 
	 * @param it sets the choosen day you are currently on
	 * 
	 */
	
	public void setDays(int chosenDays) {
		days += chosenDays;
		
	}
	
	/**
	 * 
	 * @return days you are currently on
	 * 
	 */
	
	public int getDays() {
		return days;
	}
	
	/**
	 * 
	 * sets the pieces you have for within the days you were exploring
	 * 
	 */
	
	public void setPieces() {
		int numDays = getDays();
		pieces = numDays * 2 / 3;
	}
	
	/**
	 * 
	 * @param the amount of pieces decreases maybe it might have been stolen from pirates
	 * 
	 */
	
	public void setPieces1(int temp) {
		pieces -= temp;
	}
	
	/**
	 * 
	 * @param if the pieces are not found it would finding it again on the same planet which you a higher chance of finding it again.
	 * 
	 */
	
	public void explorePieces(boolean bool) {
		boolPieces = bool;
	}
	/**
	 * 
	 * @return the amount of pieces found
	 * 
	 */
	
	public boolean FoundPieces() {
		return boolPieces;
	}
	
	/**
	 * 
	 * @return the amount of pieces you have current in your procession.
	 * 
	 */
	
	public int getPieces() {
		return pieces;
	}
	
	//set up crew
	
	/**
	 * 
	 * set the player3 does not exist in the game if the user want to less players
	 */
	
	public void setPlayer3() {
		Player3 = false;
	}
	
	/**
	 * 
	 * @return player 3 as false it does not exist
	 * 
	 */
	public boolean getPlayer3() {
		return Player3;
	}
	/**
	 * 
	 * set the player4 does not exist in the game if the user want to less players 
	 * 
	 */
	
	public void setPlayer4() {
		Player4 = false;
	}
	
	/**
	 * 
	 * @return player 4 as false it does not exist 
	 * 
	 */
	
	
	public boolean getPlayer4() {
		return Player4;
	}
	

	
	//crew states
	
	/**
	 * 
	 * set the amount of tiredness to 20 in sleep1
	 * 
	 */
	public void sleep1() {
		setTiredness1(20);
	}
	
	/**
	 * 
	 * set the amount of tiredness to 20 in sleep2
	 * 
	 */
	
	public void sleep2() {
		setTiredness2(20);
	}
	
	/**
	 * 
	 * set the amount of tiredness to 20 in sleep3
	 * 
	 */
	
	public void sleep3() {
		setTiredness3(20);
	}
	
	/**
	 * 
	 * set the amount of tiredness to 20 in sleep4
	 * 
	 */
	
	public void sleep4() {
		setTiredness4(20);
	}
	/**
	 * 
	 * @param set sick1 as to a boolean, if it exist or not
	 * 
	 */
	public void setSick1(boolean bool) {
		sick1 = bool;
	}
	/**
	 * 
	 * @return set sick1 as to a boolean, if it exist or not
	 * 
	 */
	
	public boolean getSick1() {
		return sick1;
	}
	/**
	 * 
	 * @param set sick2 as to a boolean, if it exist or not
	 * 
	 */
	
	public void setSick2(boolean bool) {
		sick2 = bool;
	}
	/**
	 * 
	 * @return set sick2 as to a boolean, if it exist or not
	 * 
	 */
	
	public boolean getSick2() {
		return sick2;
	}
	/**
	 * 
	 * @param set sick3 as to a boolean, if it exist or not
	 * 
	 */
	
	public void setSick3(boolean bool) {
		sick3 = bool;
	}
	/**
	 * 
	 * @return set sick3 as to a boolean, if it exist or not
	 * 
	 */
	
	public boolean getSick3() {
		return sick3;
	}
	
	/**
	 * 
	 * @param set sick4 as to a boolean, if it exist or not
	 * 
	 */
	
	
	public void setSick4(boolean bool) {
		sick4 = bool;
	}
	
	/**
	 * 
	 * @return set sick3 as to a boolean, if it exist or not
	 * 
	 */
	
	public boolean getSick4() {
		return sick4;
	}
	
	/**
	 * 
	 * @param set your playersName as a string
	 * 
	 */
	
	public void setName1(String tempName) {
		name1 = tempName;
	}
	/**
	 * 
	 * @return return the players name as player1
	 * 
	 */
	
	public String getName1() {
		return name1;
	}
	/**
	 * 
	 * @param set your playersName2 as a string
	 * 
	 */
	
	public void setName2(String tempName) {
		name2 = tempName;
	}
	/**
	 * 
	 * @return return the players name as player2
	 * 
	 */
	
	public String getName2() {
		return name2;
	}
	/**
	 * 
	 * @param set your playersName3 as a string
	 * 
	 */
	
	public void setName3(String tempName) {
		name3 = tempName;
	}
	/**
	 * 
	 * @return return the players name as player3
	 * 
	 */
	
	
	public String getName3() {
		return name3;
	}
	/**
	 * 
	 * @param set your playersName4 as a string
	 * 
	 */
	
	
	public void setName4(String tempName) {
		name4 = tempName;
	}
	/**
	 * 
	 * @return return the players name as player3
	 * 
	 */
	
	
	public String getName4() {
		return name4;
	}
	
	/**
	 * 
	 * sets the amount of action that a player has for player1
	 * 
	 */
	public void setAction1(int tempAction) {
		action1 += tempAction;
	}
	/**
	 * 
	 * @return return the amount of action the player 1 has
	 * 
	 */
	
	public int getAction1() {
		return action1;
	}
	/**
	 * 
	 * sets the amount of action that a player has for player2
	 * 
	 */
	
	public void setAction2(int tempAction) {
		action2 += tempAction;
	}
	/**
	 * 
	 * @return return the amount of action the player 2 has
	 * 
	 */
	
	public int getAction2() {
		return action2;
	}
	/**
	 * 
	 * sets the amount of action that a player has for player3
	 * 
	 */
	
	
	public void setAction3(int tempAction) {
		action3 += tempAction;
	}
	/**
	 * 
	 * @return return the amount of action the player 3 has
	 * 
	 */
	
	public int getAction3() {
		return action3;
	}
	/**
	 * 
	 * sets the amount of action that a player has for player4
	 * 
	 */
	
	public void setAction4(int tempAction) {
		action4 += tempAction;
	}
	/**
	 * 
	 * @return return the amount of action the player 4 has
	 * 
	 */
	
	public int getAction4() {
		return action4;
	}
	
	/**
	 * 
	 * @param increase the amount of hunger1 for user
	 * 
	 */
	
	public void setHunger1(int tempHunger) {
		hunger1 += tempHunger;
	}
	/**
	 * 
	 * @return the amount currently have for hunger
	 * 
	 */
	
	public int getHunger1() {
		return hunger1;
	}
	/**
	 * 
	 * @param increase the amount of hunger2 for user
	 * 
	 */
	
	
	public void setHunger2(int tempHunger) {
		hunger2 += tempHunger;
	}
	
	/**
	 * 
	 * @return the amount currently have for hunger2
	 * 
	 */
	
	
	public int getHunger2() {
		return hunger2;
	}
	/**
	 * 
	 * @param increase the amount of hunger3 for user
	 * 
	 */
	
	
	public void setHunger3(int tempHunger) {
		hunger3 += tempHunger;
	}
	
	/**
	 * 
	 * @return the amount currently have for hunger3
	 * 
	 */
	public int getHunger3() {
		return hunger3;
	}
	/**
	 * 
	 * @param increase the amount of hunger4 for user
	 * 
	 */
	
	public void setHunger4(int tempHunger) {
		hunger4 += tempHunger;
	}
	/**
	 * 
	 * @return the amount currently have for hunger4
	 * 
	 */
	
	public int getHunger4() {
		return hunger4;
	}
	/**
	 * 
	 * @param this is to set the amount for tiredness1
	 * 
	 */
	
	public void setTiredness1(int tempTiredness) {
		tiredness1 += tempTiredness;
	}
	/**
	 * 
	 * @return  this is to return the amount for tiredness1
	 * 
	 */
	
	public int getTiredness1() {
		return tiredness1;
	}
	/**
	 * 
	 * @param this is to set the amount for tiredness2
	 * 
	 */
	
	public void setTiredness2(int tempTiredness) {
		tiredness2 += tempTiredness;
	}
	
	/**
	 * 
	 * @return  this is to return the amount for tiredness2
	 * 
	 */
	
	public int getTiredness2() {
		return tiredness2;
	}
	/**
	 * 
	 * @param this is to set the amount for tiredness3
	 * 
	 */
	
	public void setTiredness3(int tempTiredness) {
		tiredness3 += tempTiredness;
	}
	/**
	 * 
	 * @return  this is to return the amount for tiredness3
	 * 
	 */
	
	public int getTiredness3() {
		return tiredness3;
	}
	/**
	 * 
	 * @param this is to set the amount for tiredness3
	 * 
	 */
	
	
	public void setTiredness4(int tempTiredness) {
		tiredness4 += tempTiredness;
	}
	/**
	 * 
	 * @return  this is to return the amount for tiredness4
	 * 
	 */
	
	public int getTiredness4() {
		return tiredness4;
	}
	/**
	 * 
	 * @param this is to set the amount for health1 for the players
	 * 
	 */
	public void setHealth1(int tempHealth) {
		health1 += tempHealth;
	}
	/**
	 * 
	 * @return the  amount for health1
	 * 
	 */
	public int getHealth1() {
		return health1;
	}
	/**
	 * 
	 * @param this is to set the amount for health2 for the players
	 * 
	 */
	
	public void setHealth2(int tempHealth) {
		health2 += tempHealth;
	}
	/**
	 * 
	 * @return the  amount for health2
	 * 
	 */
	
	public int getHealth2() {
		return health2;
	}
	/**
	 * 
	 * @param this is to set the amount for health3 for the players
	 * 
	 */
	
	public void setHealth3(int tempHealth) {
		health3 += tempHealth;
	}
	/**
	 * 
	 * @return the  amount for health3
	 * 
	 */
	
	public int getHealth3() {
		return health3;
	}
	/**
	 * 
	 * @param this is to set the amount for health4 for the players
	 * 
	 */
	
	public void setHealth4(int tempHealth) {
		health4 += tempHealth;
	}
	/**
	 * 
	 * @return the  amount for health4
	 * 
	 */
	
	public int getHealth4() {
		return health4;
	}
	/**
	 * 
	 * @param  set the amount for how much it would repair the ship
	 * 
	 */
	
	public void setRepaire1(int tempRepaire) {
		repaire1 = tempRepaire;
	}
	/**
	 * 
	 * @return the amount to repair your ship
	 * 
	 */
	
	public int getRepaire1() {
		return repaire1;
	}
	/**
	 * 
	 * @param  set the amount for how much it would repair the ship
	 * 
	 */
	
	public void setRepaire2(int tempRepaire) {
		repaire2 = tempRepaire;
	}
	/**
	 * 
	 * @return the amount to repair your ship
	 * 
	 */
	
	public int getRepaire2() {
		return repaire2;
	}
	/**
	 * 
	 * @param  set the amount for how much it would repair the ship
	 * 
	 */
	
	public void setRepaire3(int tempRepaire) {
		repaire3 = tempRepaire;
	}
	/**
	 * 
	 * @return the amount to repair your ship
	 * 
	 */
	
	public int getRepaire3() {
		return repaire3;
	}
	/**
	 * 
	 * @param  set the amount for how much it would repair the ship
	 * 
	 */
	public void setRepaire4(int tempRepaire) {
		repaire4 = tempRepaire;
	}
	/**
	 * 
	 * @return the amount to repair your ship
	 * 
	 */
	public int getRepaire4() {
		return repaire4;
	}
	
	/**
	 * 
	 * this function here when the user finishes playing the game he closes the window but might want to play again so every variables in the games for example the days and the pieces found
	 * will reset back to 0 or to its original default value
	 * 
	 */
	public void reset() {
		shipName = null;
		shield = 100;
		people = 0;
		days = 0;
		pieces = 0;
		boolPieces = false;
		
		Player3 = true;
		Player4 = true;
		name1 = "player 1";
		name2 = "player 2";
		name3 = "player 3";
		name4 = "player 4";
		health1 = 0;
		health2 = 0;
		health3 = 0;
		health4 = 0;
		action1 = 0;
		action2 = 0;
		action3 = 0;
		action4 = 0;
		hunger1 = 0;
		hunger2 = 0;
		hunger3 = 0;
		hunger4 = 0;
		
		tiredness1 = 0;
		tiredness2 = 0;
		tiredness3 = 0;
		tiredness4 = 0;
		repaire1 = 0;
		repaire2 = 0;
		repaire3 = 0;
		repaire4 = 0; 
		sick1 = false;
		sick2 = false;
		sick3 = false;
		sick4 = false;
		money = 1000;
		notice1 = null;
		notice2 = null;
		
		bread = 0;
		egg = 0;
		milk = 0;
		chickenWing = 0;
		steak = 0;
		feast = 0;
		hotSoup = 0;
		panadol = 0;
		healPowder = 0; 

		robbed = null;
		sick = null;
		belt = null;
		
	}
//window maker
	/**
	 * 
	 * this function setup the window application window gameSetup to open
	 * 
	 */
	public void launchGameSetUpWindow() {
		GameSetUpWindow gameSetUp = new GameSetUpWindow(this);
	}
	/**
	 * 
	 * this function closes the window application.
	 * 
	 */
	
	public void closeGameSetUpWindow(GameSetUpWindow gameSetUp) {
		gameSetUp.closeWindow();
		//System.out.println(getPeople());
		if (getPeople() == 2) {
			launchTwoNameWindow();
		}
		if(getPeople() == 3) {
			launchThreeNameWindow();
		}
		if(getPeople() == 4) {
			launchFourNameWindow();
		}

	}
	/**
	 * 
	 * this function will launch the two Name windows to open
	 * 
	 */
	
	public void launchTwoNameWindow() {
		TwoNameWindow twoName = new TwoNameWindow(this);
	}
	/**
	 * 
	 * this function will close the two name window in order for the window to launch
	 * 
	 */
	public void closeTwoNameWindow(TwoNameWindow twoName) {
		twoName.closeWindow();
		launchGameStartWindow();
	}
	/**
	 * 
	 * this function will launch the three name window to open
	 * 
	 */
	
	
	public void launchThreeNameWindow() {
		ThreeNameWindow threeName = new ThreeNameWindow(this);
	}
	/**
	 * 
	 * @param this function will close the three Name window in order for the window to launch
	 * 
	 */
	
	public void closeThreeNameWindow(ThreeNameWindow threeName) {
		threeName.closeWindow();
		launchGameStartWindow();
	}
	
	/**
	 * 
	 * this function will launch the window four name to open
	 * 
	 */
	
	public void launchFourNameWindow() {
		FourNameWindow fourName = new FourNameWindow(this);
	}
	
	/**
	 * 
	 * @param this function will close the four names window and in order for the window to launch
	 * 
	 */
	
	public void closeFourNameWindow(FourNameWindow fourName) {
		fourName.closeWindow();
		launchGameStartWindow();
	}
	
	/**
	 * 
	 * this function will launch the game start window to open
	 * 
	 */
	
	public void launchGameStartWindow() {
		GameStartWindow gameStart = new GameStartWindow(this);
	}
	/**
	 * 
	 * @param this function will close the game start window 
	 * 
	 */
	
	public void closeGameStartWindow(GameStartWindow gameStart) {
		gameStart.closeWindow();
	}
	/**
	 * 
	 * this function will launch the shop window to open
	 * 
	 */
	
	public void launchShopWindow() {
		ShopWindow shop = new ShopWindow(this);
	}
	/**
	 * 
	 * @param this function will close the shop window 
	 * 
	 */
	
	public void closeShopWindow(ShopWindow shop) {
		shop.closeWindow();
	}
	/**
	 * 
	 * this function will launch the windows to open for the explore window
	 * 
	 */
	
	
	public void launchExploreWindow() {
		ExploreWindow explore = new ExploreWindow(this);
	}
	
	/**
	 * 
	 * @param this function will close the explore window 
	 * 
	 */
	
	public void closeExploreWindow(ExploreWindow explore) {
		explore.closeWindow();
	}
	/**
	 * 
	 * this function will launch the windows to open for the game over window
	 * 
	 */
	
	public void launchGameOverWindow() {
		GameOverWindow over = new GameOverWindow(this);
	}
	/**
	 * 
	 * @param this function will close the gameOver window 
	 * 
	 */
	
	public void closeGameOverWindow(GameOverWindow game) {
		game.closeWindow();
	}
	/**
	 * 
	 * this function will launch the windows to open for the Winning window
	 * 
	 */
	
	public void launchWinWindow() {
		WinWindow win = new WinWindow(this);
	}
	
	/**
	 * 
	 * @param this function will close the Winning window 
	 * 
	 */
	
	
	public void closeWinWindow(WinWindow win) {
		win.closeWindow();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameManager manager = new GameManager();
		manager.launchGameSetUpWindow();
	}

}
