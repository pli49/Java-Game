package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameManagerTest {

	@Test
	public void testsetBread() {
		GameManager testManager = new GameManager();
		testManager.setBread(1);
		assertEquals(1, testManager.getBread());
		
	}
	@Test
	public void testsetMoney1() {
		GameManager testManager = new GameManager();
		testManager.setMoney(1);
		assertEquals(101, testManager.getMoney());
		
	}
	@Test
	public void testsetMoney2() {
		GameManager testManager = new GameManager();
		testManager.setMoney(-101);
		assertEquals("Not Enough Money!!!", testManager.getNotice1());
		
	}
	@Test
	public void testsetMoney3() {
		GameManager testManager = new GameManager();
		testManager.setMoney(-101);
		assertEquals(100, testManager.getMoney());
		
	}
	@Test
	public void testeatBread() {
		GameManager testManager = new GameManager();
		testManager.buyBread(2);
		testManager.eatBread(1);
		assertEquals(1, testManager.getBread());
	}
	@Test
	public void testeatEgg() {
		GameManager testManager = new GameManager();
		testManager.buyEgg(2);
		testManager.eatEgg(1);
		assertEquals(1, testManager.getEgg());
	}
	@Test
	public void testeatMilk() {
		GameManager testManager = new GameManager();
		testManager.buyMilk(2);
		testManager.eatMilk(1);
		assertEquals(1, testManager.getMilk());
	}
	@Test
	public void testeatChickenWing() {
		GameManager testManager = new GameManager();
		testManager.buyChickenWing(2);
		testManager.eatChickenWing(1);
		assertEquals(1, testManager.getChickenWing());
	}
	@Test
	public void testeatSteak() {
		GameManager testManager = new GameManager();
		testManager.buySteak(2);
		testManager.eatSteak(1);
		assertEquals(1, testManager.getSteak());
	}
	@Test
	public void testeatFeast() {
		GameManager testManager = new GameManager();
		testManager.buyFeast(2);
		testManager.eatFeast(1);
		assertEquals(1, testManager.getFeast());
	}
	@Test
	public void testeatHotSoup() {
		GameManager testManager = new GameManager();
		testManager.buyHotSoup(2);
		testManager.eatHotSoup(1);
		assertEquals(1, testManager.getHotSoup());
	}
	@Test
	public void testeatPanadol() {
		GameManager testManager = new GameManager();
		testManager.buyPanadol(2);
		testManager.eatPanadol(1);
		assertEquals(1, testManager.getPanadol());
	}
	@Test
	public void testeatHealPowder() {
		GameManager testManager = new GameManager();
		testManager.buyHealPowder(2);
		testManager.eatHealPowder(1);
		assertEquals(1, testManager.getHealPowder());
	}
	@Test
	public void testsetShield() {
		GameManager testManager = new GameManager();
		testManager.setShield(100);
		assertEquals(200, testManager.getShield());
	}
	@Test
	public void testsetShipName() {
		GameManager testManager = new GameManager();
		testManager.setShipName("");
		assertEquals("", testManager.getShipName());
	}
	@Test
	public void testsetPeople() {
		GameManager testManager = new GameManager();
		testManager.setPeople(1);
		assertEquals(1, testManager.getPeople());
	}
	@Test
	public void testsetDays() {
		GameManager testManager = new GameManager();
		testManager.setDays(1);
		assertEquals(1, testManager.getDays());
	}
	@Test
	public void testsetPieces1() {
		GameManager testManager = new GameManager();
		testManager.setPieces1(3);
		assertEquals(-3, testManager.getPieces());
	}
	@Test
	public void testsetPieces() {
		GameManager testManager = new GameManager();
		testManager.setDays(3);
		testManager.setPieces();
		assertEquals(2, testManager.getPieces());
	}
	@Test
	public void testexplorePieces() {
		GameManager testManager = new GameManager();
		testManager.explorePieces(false);
		assertEquals(false, testManager.FoundPieces());
	}
	@Test
	public void testsleep1() {
		GameManager testManager = new GameManager();
		testManager.sleep1();
		assertEquals(20, testManager.getTiredness1());
	}
	@Test
	public void testsleep2() {
		GameManager testManager = new GameManager();
		testManager.sleep2();
		assertEquals(20, testManager.getTiredness2());
	}
	@Test
	public void testsleep3() {
		GameManager testManager = new GameManager();
		testManager.sleep3();
		assertEquals(20, testManager.getTiredness3());
	}
	@Test
	public void testsleep4() {
		GameManager testManager = new GameManager();
		testManager.sleep4();
		assertEquals(20, testManager.getTiredness4());
	}
	@Test
	public void testsetPlayer3() {
		GameManager testManager = new GameManager();
		testManager.setPlayer3();
		assertEquals(false, testManager.getPlayer3());
	}
	@Test
	public void testsetPlayer4() {
		GameManager testManager = new GameManager();
		testManager.setPlayer4();
		assertEquals(false, testManager.getPlayer4());
	}
	@Test
	public void testsetSick1() {
		GameManager testManager = new GameManager();
		testManager.setSick1(true);
		assertEquals(true, testManager.getSick1());
	}@Test
	public void testsetSick2() {
		GameManager testManager = new GameManager();
		testManager.setSick2(true);
		assertEquals(true, testManager.getSick2());
	}@Test
	public void testsetSick3() {
		GameManager testManager = new GameManager();
		testManager.setSick3(true);
		assertEquals(true, testManager.getSick3());
	}
	@Test
	public void testsetSick4() {
		GameManager testManager = new GameManager();
		testManager.setSick4(true);
		assertEquals(true, testManager.getSick4());
	}

}
