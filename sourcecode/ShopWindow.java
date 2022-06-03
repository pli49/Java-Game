package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class ShopWindow {

	private JFrame frame;
	private GameManager manager;
	private final JLabel label_1 = new JLabel("$30");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShopWindow window = new ShopWindow(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ShopWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	public void finishWindow() {
		manager.closeShopWindow(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1325, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYouHave = new JLabel("You have $" + manager.getMoney());
		lblYouHave.setBounds(20, 10, 158, 15);
		frame.getContentPane().add(lblYouHave);
		
		JLabel label = new JLabel("");
		label.setBounds(125, 17, 147, 38);
		frame.getContentPane().add(label);
		
		JLabel label_2 = new JLabel("$40");
		label_2.setBounds(167, 106, 29, 15);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("$100");
		label_3.setBounds(308, 106, 32, 15);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("$10");
		label_4.setBounds(26, 209, 28, 15);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("$20");
		label_5.setBounds(167, 209, 29, 15);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("$30");
		label_6.setBounds(306, 209, 54, 15);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("$40");
		label_7.setBounds(26, 304, 54, 15);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("$50");
		label_8.setBounds(169, 304, 54, 15);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("$100");
		label_9.setBounds(306, 304, 54, 15);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setBounds(743, 28, 410, 27);
		frame.getContentPane().add(label_10);
		
		JLabel lblShop = new JLabel("Shop");
		lblShop.setBounds(316, 17, 78, 38);
		frame.getContentPane().add(lblShop);
		
		JLabel lblInventory = new JLabel("Inventory");
		lblInventory.setBounds(513, 17, 117, 38);
		frame.getContentPane().add(lblInventory);
		
		JLabel lblYouHave_1 = new JLabel("You have " + manager.getHotSoup() + " hot soup, it heals one player for 10 points");
		lblYouHave_1.setBounds(519, 71, 481, 42);
		frame.getContentPane().add(lblYouHave_1);
		
		JLabel label_11 = new JLabel("You have " + manager.getPanadol() + " panadol, it heals one player for 20 points");
		label_11.setBounds(519, 115, 481, 42);
		frame.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("You have "+ manager.getHealPowder() + " healPowder, it heals space plague for all players");
		label_12.setBounds(519, 159, 481, 42);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("You have " + manager.getBread() + " bread, it feeds one player for 10 points");
		label_13.setBounds(519, 200, 481, 42);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("You have " + manager.getEgg() + " egg, it feeds one player for 20 points");
		label_14.setBounds(519, 242, 481, 42);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("You have " + manager.getMilk() + " milk, it feeds one player for 30 points");
		label_15.setBounds(519, 280, 481, 42);
		frame.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("You have " + manager.getChickenWing() + " chickenWing, it heals one player for 40 points");
		label_16.setBounds(519, 322, 481, 42);
		frame.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("You have " + manager.getSteak() + " steak, it feeds one player for 50 points");
		label_17.setBounds(519, 365, 481, 42);
		frame.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("You have " + manager.getFeast() + " feast, it feeds all players for 40 points");
		label_18.setBounds(519, 408, 481, 42);
		frame.getContentPane().add(label_18);
		
		
		JButton btnHealth = new JButton("hotSoup");
		btnHealth.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getMoney() >= 30) {
					manager.setMoney(-30);
					manager.buyHotSoup(1);
					lblYouHave_1.setText("You have " + manager.getHotSoup() + " hot soup, it heals one player for 10 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnHealth.setBounds(20, 134, 93, 23);
		frame.getContentPane().add(btnHealth);
		
		JButton btnHealth_1 = new JButton("panadol");
		btnHealth_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getMoney() >= 40) {
					manager.setMoney(-40);
					manager.buyPanadol(1);
					label_11.setText("You have " + manager.getPanadol() + " panadol, it heals one player for 20 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnHealth_1.setBounds(166, 134, 93, 23);
		frame.getContentPane().add(btnHealth_1);
		
		JButton btnHealth_2 = new JButton("heal powder");
		btnHealth_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getMoney() >= 100) {
					manager.setMoney(-100);
					manager.buyHealPowder(1);
					label_12.setText("You have "+ manager.getHealPowder() + " healPowder, it heals space plague for one player");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnHealth_2.setBounds(301, 134, 132, 23);
		frame.getContentPane().add(btnHealth_2);
		

		JButton btnFood = new JButton("bread");
		btnFood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (manager.getMoney() >= 10) {
					manager.setMoney(-10);
					manager.buyBread(1);
					label_13.setText("You have " + manager.getBread() + " bread, it feeds one player for 10 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnFood.setBounds(20, 237, 93, 23);
		frame.getContentPane().add(btnFood);
		
		JButton btnFood_1 = new JButton("egg");
		btnFood_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getMoney() >= 20) {
					manager.setMoney(-20);
					manager.buyEgg(1);
					label_14.setText("You have " + manager.getEgg() + " egg, it feeds one player for 20 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnFood_1.setBounds(166, 237, 93, 23);
		frame.getContentPane().add(btnFood_1);
		
		JButton btnFood_2 = new JButton("milk");
		btnFood_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (manager.getMoney() >= 20) {
					manager.setMoney(-30);
					manager.buyMilk(1);
					label_15.setText("You have " + manager.getMilk() + " milk, it feeds one player for 30 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnFood_2.setBounds(301, 237, 93, 23);
		frame.getContentPane().add(btnFood_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				manager.launchGameStartWindow();
			}
		});
		btnBack.setBounds(355, 468, 93, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnFood_3 = new JButton("chicken wing");
		btnFood_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getMoney() >= 40) {
					manager.setMoney(-40);
					manager.buyChickenWing(1);
					label_16.setText("You have " + manager.getChickenWing() + " chickenWing, it heals one player for 40 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnFood_3.setBounds(20, 332, 132, 23);
		frame.getContentPane().add(btnFood_3);
		
		JButton btnFood_4 = new JButton("steak");
		btnFood_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getMoney() >= 50) {
					manager.setMoney(-50);
					manager.buySteak(1);
					label_17.setText("You have " + manager.getSteak() + " steak, it feeds one player for 50 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				
				}else {
					label.setText("Not enough money");
				}
			}
		});
		btnFood_4.setBounds(166, 332, 93, 23);
		frame.getContentPane().add(btnFood_4);
		
		JButton btnFood_5 = new JButton("feast");
		btnFood_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getMoney() >= 100) {
					manager.setMoney(-100);
					manager.buyFeast(1);
					label_18.setText("You have " + manager.getFeast() + " feast, it feeds all players for 40 points");
					label.setText("purches Succeed");
					lblYouHave.setText("You have $" + manager.getMoney());
				}else {
					label.setText("Not enough money");
				}
				
			}
		});
		btnFood_5.setBounds(301, 332, 93, 23);
		frame.getContentPane().add(btnFood_5);
		label_1.setBounds(20, 97, 29, 33);
		frame.getContentPane().add(label_1);
		
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem(manager.getName1());
		comboBox.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox.addItem(manager.getName4());
		}
		comboBox.setBounds(1027, 80, 126, 24);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem(manager.getName1());
		comboBox_1.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox_1.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox_1.addItem(manager.getName4());
		}
		comboBox_1.setBounds(1027, 124, 126, 24);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.addItem(manager.getName1());
		comboBox_2.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox_2.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox_2.addItem(manager.getName4());
		}
		comboBox_2.setBounds(1027, 209, 126, 24);
		frame.getContentPane().add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addItem(manager.getName1());
		comboBox_3.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox_3.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox_3.addItem(manager.getName4());
		}
		comboBox_3.setBounds(1027, 251, 126, 24);
		frame.getContentPane().add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.addItem(manager.getName1());
		comboBox_4.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox_4.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox_4.addItem(manager.getName4());
		}
		comboBox_4.setBounds(1027, 289, 126, 24);
		frame.getContentPane().add(comboBox_4);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.addItem(manager.getName1());
		comboBox_5.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox_5.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox_5.addItem(manager.getName4());
		}
		comboBox_5.setBounds(1027, 331, 126, 24);
		frame.getContentPane().add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.addItem(manager.getName1());
		comboBox_6.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox_6.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox_6.addItem(manager.getName4());
		}
		comboBox_6.setBounds(1027, 374, 126, 24);
		frame.getContentPane().add(comboBox_6);
		
		
		
		JButton btnUse = new JButton("use");
		btnUse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getHotSoup()>0) {
						manager.eatHotSoup(1);
						manager.setHealth1(10);
						lblYouHave_1.setText("You have " + manager.getHotSoup() + " hot soup, it heals one player for 10 points");
					}else {
						label_10.setText("You don't have hot soup");
					}
				}else if(comboBox.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getHotSoup()>0) {
						manager.eatHotSoup(1);
						manager.setHealth2(10);
						lblYouHave_1.setText("You have " + manager.getHotSoup() + " hot soup, it heals one player for 10 points");
					}else {
						label_10.setText("You don't have hot soup");
					}
				}else if(comboBox.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getHotSoup()>0) {
						manager.eatHotSoup(1);
						manager.setHealth3(10);
						lblYouHave_1.setText("You have " + manager.getHotSoup() + " hot soup, it heals one player for 10 points");
					}else {
						label_10.setText("You don't have hot soup");
					}
				}else if(comboBox.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getHotSoup()>0) {
						manager.eatHotSoup(1);
						manager.setHealth4(10);
						lblYouHave_1.setText("You have " + manager.getHotSoup() + " hot soup, it heals one player for 10 points");
					}else {
						label_10.setText("You don't have hot soup");
					}
				}
			}
		});
		btnUse.setBounds(1167, 79, 113, 27);
		frame.getContentPane().add(btnUse);
		
		JButton button = new JButton("use");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getPanadol()>0) {
						manager.eatPanadol(1);
						manager.setHealth1(20);
						label_11.setText("You have " + manager.getPanadol() + " panadol, it heals one player for 20 points");
					}else {
						label_10.setText("You don't have panadol");
					}
				}else if(comboBox_1.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getPanadol()>0) {
						manager.eatPanadol(1);
						manager.setHealth2(20);
						label_11.setText("You have " + manager.getPanadol() + " panadol, it heals one player for 20 points");
					}else {
						label_10.setText("You don't have panadol");
					}
				}else if(comboBox_1.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getPanadol()>0) {
						manager.eatPanadol(1);
						manager.setHealth3(20);
						label_11.setText("You have " + manager.getPanadol() + " panadol, it heals one player for 20 points");
					}else {
						label_10.setText("You don't have panadol");
					}
				}else if(comboBox_1.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getPanadol()>0) {
						manager.eatPanadol(1);
						manager.setHealth4(20);
						label_11.setText("You have " + manager.getPanadol() + " panadol, it heals one player for 20 points");
					}else {
						label_10.setText("You don't have panadol");
					}
				}
			}
		});
		button.setBounds(1167, 123, 113, 27);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("use");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getHealPowder()>0) {
					label_12.setText("You have "+ manager.getHealPowder() + " healPowder, it heals space plague for all players");
					manager.eatHealPowder(1);
					manager.setSick1(false);
					manager.setSick2(false);
					if(manager.getPlayer3()) {
						manager.setSick3(false);
					}
					if(manager.getPlayer4()) {
						manager.setSick4(false);
					}
				}else {
					label_10.setText("You don't have healing powder");
				}
				
			}
		});
		button_1.setBounds(1167, 167, 113, 27);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("use");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_2.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getBread()>0) {
						manager.eatBread(1);
						manager.setHunger1(10);
						label_13.setText("You have " + manager.getBread() + " bread, it feeds one player for 10 points");
					}else {
						label_10.setText("You don't have Bread");
					}
				}else if(comboBox_2.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getBread()>0) {
						manager.eatBread(1);
						manager.setHunger2(10);
						label_13.setText("You have " + manager.getBread() + " bread, it feeds one player for 10 points");
					}else {
						label_10.setText("You don't have Bread");
					}
				}else if(comboBox_2.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getBread()>0) {
						manager.eatBread(1);
						manager.setHunger3(10);
						label_13.setText("You have " + manager.getBread() + " bread, it feeds one player for 10 points");
					}else {
						label_10.setText("You don't have Bread");
					}
				}else if(comboBox_2.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getBread()>0) {
						manager.eatBread(1);
						manager.setHunger4(10);
						label_13.setText("You have " + manager.getBread() + " bread, it feeds one player for 10 points");
					}else {
						label_10.setText("You don't have Bread");
					}
				}
			}
		});
		button_2.setBounds(1167, 208, 113, 27);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("use");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_3.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getEgg()>0) {
						manager.eatEgg(1);
						manager.setHunger1(20);
						label_14.setText("You have " + manager.getEgg() + " egg, it feeds one player for 20 points");
					}else {
						label_10.setText("You don't have egg");
					}
				}else if(comboBox_3.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getEgg()>0) {
						manager.eatEgg(1);
						manager.setHunger1(20);
						label_14.setText("You have " + manager.getEgg() + " egg, it feeds one player for 20 points");
					}else {
						label_10.setText("You don't have egg");
					}
				}else if(comboBox_3.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getEgg()>0) {
						manager.eatEgg(1);
						manager.setHunger1(20);
						label_14.setText("You have " + manager.getEgg() + " egg, it feeds one player for 20 points");
					}else {
						label_10.setText("You don't have egg");
					}
				}else if(comboBox_3.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getEgg()>0) {
						manager.eatEgg(1);
						manager.setHunger1(20);
						label_14.setText("You have " + manager.getEgg() + " egg, it feeds one player for 20 points");
					}else {
						label_10.setText("You don't have egg");
					}
				}
			}
		});
		button_3.setBounds(1167, 250, 113, 27);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("use");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_4.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getMilk()>0) {
						manager.eatMilk(1);
						manager.setHunger1(30);
						label_15.setText("You have " + manager.getMilk() + " milk, it feeds one player for 30 points");
					}else {
						label_10.setText("You don't have milk");
					}
				}else if(comboBox_4.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getMilk()>0) {
						manager.eatMilk(1);
						manager.setHunger1(30);
						label_15.setText("You have " + manager.getMilk() + " milk, it feeds one player for 30 points");
					}else {
						label_10.setText("You don't have milk");
					}
				}else if(comboBox_4.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getMilk()>0) {
						manager.eatMilk(1);
						manager.setHunger1(30);
						label_15.setText("You have " + manager.getMilk() + " milk, it feeds one player for 30 points");
					}else {
						label_10.setText("You don't have milk");
					}
				}else if(comboBox_4.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getMilk()>0) {
						manager.eatMilk(1);
						manager.setHunger1(30);
						label_15.setText("You have " + manager.getMilk() + " milk, it feeds one player for 30 points");
					}else {
						label_10.setText("You don't have milk");
					}
				}
			}
		});
		button_4.setBounds(1167, 288, 113, 27);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("use");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_5.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getChickenWing()>0) {
						manager.eatChickenWing(1);
						manager.setHunger1(40);
						label_16.setText("You have " + manager.getChickenWing() + " chickenWing, it heals one player for 40 points");
					}else {
						label_10.setText("You don't have chicken wing");
					}
				}else if(comboBox_5.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getChickenWing()>0) {
						manager.eatChickenWing(1);
						manager.setHunger2(40);
						label_16.setText("You have " + manager.getChickenWing() + " chickenWing, it heals one player for 40 points");
					}else {
						label_10.setText("You don't have chicken wing");
					}
				}else if(comboBox_5.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getChickenWing()>0) {
						manager.eatChickenWing(1);
						manager.setHunger3(40);
						label_16.setText("You have " + manager.getChickenWing() + " chickenWing, it heals one player for 40 points");
					}else {
						label_10.setText("You don't have chicken wing");
					}
				}else if(comboBox_5.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getChickenWing()>0) {
						manager.eatChickenWing(1);
						manager.setHunger3(40);
						label_16.setText("You have " + manager.getChickenWing() + " chickenWing, it heals one player for 40 points");
					}else {
						label_10.setText("You don't have chicken wing");
					}
				}
			}
		});
		button_5.setBounds(1167, 330, 113, 27);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("use");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_6.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getSteak()>0) {
						manager.eatSteak(1);
						manager.setHunger1(50);
						label_17.setText("You have " + manager.getSteak() + " steak, it feeds one player for 50 points");
					}else {
						label_10.setText("You don't have steak");
					}
				}else if(comboBox_6.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getSteak()>0) {
						manager.eatSteak(1);
						manager.setHunger2(50);
						label_17.setText("You have " + manager.getSteak() + " steak, it feeds one player for 50 points");
					}else {
						label_10.setText("You don't have ]steak");
					}
				}else if(comboBox_6.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getSteak()>0) {
						manager.eatSteak(1);
						manager.setHunger3(50);
						label_17.setText("You have " + manager.getSteak() + " steak, it feeds one player for 50 points");
					}else {
						label_10.setText("You don't have steak");
					}
				}else if(comboBox_6.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getSteak()>0) {
						manager.eatSteak(1);
						manager.setHunger4(50);
						label_17.setText("You have " + manager.getSteak() + " steak, it feeds one player for 50 points");
					}else {
						label_10.setText("You don't have steak");
					}
				}
			}
		});
		button_6.setBounds(1167, 373, 113, 27);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("use");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(manager.getFeast()>0) {
					manager.eatFeast(1);
					label_18.setText("You have " + manager.getFeast() + " feast, it feeds all players for 40 points");
					manager.setHunger1(40);
					manager.setHunger2(40);
					if(manager.getPlayer3()) {
						manager.setHunger3(40);
					}
					if(manager.getPlayer4()) {
						manager.setHunger4(40);
					}
				}
				else {
					label_10.setText("You don't have feast");
				}
				
			}
		});
		button_7.setBounds(1167, 416, 113, 27);
		frame.getContentPane().add(button_7);
		

		

	}
}
