package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class GameStartWindow {

	private JFrame frame;
	private GameManager manager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameStartWindow window = new GameStartWindow(null);
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
	public GameStartWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	public void finishWindow() {
		manager.closeGameStartWindow(this);
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 809, 559);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYouHave = new JLabel("");
		lblYouHave.setText("you have " + manager.getPieces() + " piece to find");
		lblYouHave.setBounds(31, 95, 163, 15);
		frame.getContentPane().add(lblYouHave);
		
		JLabel lblYouHave_1 = new JLabel("");
		lblYouHave_1.setText("you have " + manager.getDays() + " day left");
		lblYouHave_1.setBounds(31, 70, 163, 15);
		frame.getContentPane().add(lblYouHave_1);
		
		JLabel lblPlayerOnename = new JLabel("<html>name: " + manager.getName1() + "<br/>health: " + manager.getHealth1() + "<br/>tiredness: " + manager.getTiredness1() + "<br/>hunger: "+ manager.getHunger1() + "<br/>action: "+ manager.getAction1() + "<html>");
		lblPlayerOnename.setBounds(229, 16, 93, 114);
		frame.getContentPane().add(lblPlayerOnename);
		
		JLabel lblNewLabel = new JLabel("<html>name: " + manager.getName2() + "<br/>health: " + manager.getHealth2() + "<br/>tiredness: " + manager.getTiredness2() + "<br/>hunger: "+ manager.getHunger2() + "<br/>action: "+ manager.getAction2() + "<html>");
		lblNewLabel.setBounds(332, 18, 93, 114);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		if(manager.getPlayer3()) {
			lblNewLabel_1.setText("<html>name: " + manager.getName3() + "<br/>health: " + manager.getHealth3() + "<br/>tiredness: " + manager.getTiredness3() + "<br/>hunger: "+ manager.getHunger3() + "<br/>action: "+ manager.getAction3() + "<html>");
		}
		lblNewLabel_1.setBounds(455, 26, 105, 104);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		if(manager.getPlayer4()) {
			lblNewLabel_2.setText("<html>name: " + manager.getName4() + "<br/>health: " + manager.getHealth4() + "<br/>tiredness: " + manager.getTiredness4() + "<br/>hunger: "+ manager.getHunger4() + "<br/>action: "+ manager.getAction4() + "<html>");
		}
		lblNewLabel_2.setBounds(570, 26, 93, 104);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("");
		label.setBounds(31, 165, 518, 15);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(31, 190, 597, 15);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setBounds(31, 215, 597, 15);
		frame.getContentPane().add(label_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setText(manager.getShipName());
		lblNewLabel_3.setBounds(31, 38, 143, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel label_3 = new JLabel("");
		label_3.setText("Spaceship's shield have " + manager.getShield() + " points left");
		label_3.setBounds(31, 140, 258, 15);
		frame.getContentPane().add(label_3);
		
		JLabel lblCheesOnePlayer = new JLabel("Choose one player to go to sleep to increase tiredness");
		lblCheesOnePlayer.setBounds(34, 307, 328, 15);
		frame.getContentPane().add(lblCheesOnePlayer);
		
		JButton btnNextday = new JButton("NextDay");
		btnNextday.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				manager.setDays(-1);
				lblYouHave_1.setText("you have " + manager.getDays() + " day left");
				manager.AlienPirates();
				manager.AsteroidBelt();
				label_3.setText("Spaceship's shield have " + manager.getShield() + " points left");
				manager.SpacePlague();
				manager.setAction1(1);
				manager.setAction2(1);
				manager.setAction3(1);
				manager.setAction4(1);
				manager.setTiredness1(-20);
				manager.setTiredness2(-20);
				manager.setTiredness3(-20);
				manager.setTiredness4(-20);
				manager.setHunger1(-20);
				manager.setHunger2(-20);
				manager.setHunger3(-20);
				manager.setHunger4(-20);
				label.setText(manager.Sick());
				label_1.setText(manager.Belt());
				label_2.setText(manager.Robbed());
				if(manager.getSick1()) {
					manager.setHealth1(-20);
				}
				if(manager.getSick2()) {
					manager.setHealth2(-20);
				}
				if(manager.getSick3()) {
					manager.setHealth3(-20);
				}
				if(manager.getSick4()) {
					manager.setHealth4(-20);
				}
				lblPlayerOnename.setText("<html>name: " + manager.getName1() + "<br/>health: " + manager.getHealth1() + "<br/>tiredness: " + manager.getTiredness1() + "<br/>hunger: "+ manager.getHunger1() + "<br/>action: "+ manager.getAction1() + "<html>");
				lblNewLabel.setText("<html>name: " + manager.getName2() + "<br/>health: " + manager.getHealth2() + "<br/>tiredness: " + manager.getTiredness2() + "<br/>hunger: "+ manager.getHunger2() + "<br/>action: "+ manager.getAction2() + "<html>");
				if(manager.getPlayer3() ) {
					lblNewLabel_1.setText("<html>name: " + manager.getName3() + "<br/>health: " + manager.getHealth3() + "<br/>tiredness: " + manager.getTiredness3() + "<br/>hunger: "+ manager.getHunger3() + "<br/>action: "+ manager.getAction3() + "<html>");
				}
				if(manager.getPlayer4()) {
					lblNewLabel_2.setText("<html>name: " + manager.getName4() + "<br/>health: " + manager.getHealth4() + "<br/>tiredness: " + manager.getTiredness4() + "<br/>hunger: "+ manager.getHunger4() + "<br/>action: "+ manager.getAction4() + "<html>");
				}
				
				if(manager.getDays() == 0 || manager.getHealth1() <= 0 || manager.getHealth2() <= 0 ) {
					closeWindow();
					finishWindow();
					manager.launchGameOverWindow();
				}
				else if(manager.getShield() <= 0 || manager.getTiredness1() <= 0 || manager.getTiredness2() <= 0) {
					closeWindow();
					finishWindow();
					manager.launchGameOverWindow();
				}
				else if(manager.getHunger1() <= 0 || manager.getHunger2() <= 0) {
					closeWindow();
					finishWindow();
					manager.launchGameOverWindow();
				}
				else if(manager.getPlayer3()) {
					if(manager.getTiredness3() <= 0 ||  manager.getHunger3() <= 0 || manager.getHealth3() <= 0) {
						closeWindow();
						finishWindow();
						manager.launchGameOverWindow();
					}
				}
				else if(manager.getPlayer4()) {
					if(manager.getTiredness4() <= 0 ||  manager.getHunger4() <= 0 || manager.getHealth4() <= 0  ) {
						closeWindow();
						finishWindow();
						manager.launchGameOverWindow();
					}
				}
				
			}
		});
		btnNextday.setBounds(634, 441, 93, 23);
		frame.getContentPane().add(btnNextday);
		
		JButton btnShop = new JButton("Shop");
		btnShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				manager.launchShopWindow();
			}
		});
		btnShop.setBounds(348, 441, 93, 23);
		frame.getContentPane().add(btnShop);
		
		JButton btnExplore = new JButton("Explore");
		btnExplore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				manager.launchExploreWindow();
			}
		});
		btnExplore.setBounds(51, 441, 93, 23);
		frame.getContentPane().add(btnExplore);
		

		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem(manager.getName1());
		comboBox.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox.addItem(manager.getName4());
		}
		comboBox.setBounds(31, 342, 113, 21);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(31, 400, 258, 15);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setBounds(396, 400, 258, 15);
		frame.getContentPane().add(label_5);
		
		JButton btnSleep = new JButton("Sleep");
		btnSleep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getAction1() > 0) {
						manager.sleep1();
						manager.setAction1(-1);
						
						lblPlayerOnename.setText("<html>name: " + manager.getName1() + "<br/>health: " + manager.getHealth1() + "<br/>tiredness: " + manager.getTiredness1() + "<br/>hunger: "+ manager.getHunger1() + "<br/>action: "+ manager.getAction1() + "<html>");
					}
					else {
						lblNewLabel_4.setText("player1 don't have enough action");
					}
					
				}
				if(comboBox.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getAction2() > 0) {
						manager.sleep2();
						manager.setAction2(-1);
						lblNewLabel.setText("<html>name: " + manager.getName2() + "<br/>health: " + manager.getHealth2() + "<br/>tiredness: " + manager.getTiredness2() + "<br/>hunger: "+ manager.getHunger2() + "<br/>action: "+ manager.getAction2() + "<html>");
					}
					else {
						lblNewLabel_4.setText("player2 don't have enough action");
					}
					
				}
				if(comboBox.getSelectedItem().toString().equals(manager.getName3())) {
					if(manager.getAction3() > 0) {
						manager.sleep3();
						manager.setAction3(-1);
						if(manager.getPlayer3()) {
							lblNewLabel_1.setText("<html>name: " + manager.getName3() + "<br/>health: " + manager.getHealth3() + "<br/>tiredness: " + manager.getTiredness3() + "<br/>hunger: "+ manager.getHunger3() + "<br/>action: "+ manager.getAction3() + "<html>");
						}
					}
					else {
						lblNewLabel_4.setText("player2 don't have enough action");
					}
					
				}
				if(comboBox.getSelectedItem().toString().equals(manager.getName4())) {
					if(manager.getAction4() > 0) {
						manager.sleep4();
						manager.setAction4(-1);
						if(manager.getPlayer4()) {
							lblNewLabel_2.setText("<html>name: " + manager.getName4() + "<br/>health: " + manager.getHealth4() + "<br/>tiredness: " + manager.getTiredness4() + "<br/>hunger: "+ manager.getHunger4() + "<br/>action: "+ manager.getAction4() + "<html>");
						}
					}
					else {
						lblNewLabel_4.setText("player2 don't have enough action");
					}
					
				}
			}
		});
		btnSleep.setBounds(186, 341, 93, 23);
		frame.getContentPane().add(btnSleep);
		
		JLabel label_4 = new JLabel("Choose one player to go to fix shield");
		label_4.setBounds(396, 307, 328, 15);
		frame.getContentPane().add(label_4);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem(manager.getName1());
		comboBox_1.addItem(manager.getName2());
		if(manager.getPlayer3()) {
			comboBox_1.addItem(manager.getName3());
		}
		if(manager.getPlayer4()) {
			comboBox_1.addItem(manager.getName4());
		}
		comboBox_1.setBounds(396, 342, 113, 21);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnFix = new JButton("Fix");
		btnFix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getAction1() > 0) {
						manager.setShield(manager.getRepaire1());
						manager.setAction1(-1);
						label_3.setText("Spaceship's shield have " + manager.getShield() + " points left");
						label_5.setText("Charing Succeed");
						lblPlayerOnename.setText("<html>name: " + manager.getName1() + "<br/>health: " + manager.getHealth1() + "<br/>tiredness: " + manager.getTiredness1() + "<br/>hunger: "+ manager.getHunger1() + "<br/>action: "+ manager.getAction1() + "<html>");
					}
					else {
						label_5.setText("player1 don't have enough action");
					}
					
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getAction2() > 0) {
						manager.setShield(manager.getRepaire2());
						manager.setAction2(-1);
						label_3.setText("Spaceship's shield have " + manager.getShield() + " points left");
						label_5.setText("Charing Succeed");
						lblNewLabel.setText("<html>name: " + manager.getName2() + "<br/>health: " + manager.getHealth2() + "<br/>tiredness: " + manager.getTiredness2() + "<br/>hunger: "+ manager.getHunger2() + "<br/>action: "+ manager.getAction2() + "<html>");
					}
					else {
						label_5.setText("player2 don't have enough action");
					}
					
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName3())) {
					if(manager.getAction3() > 0) {
						manager.setShield(manager.getRepaire3());
						manager.setAction3(-1);
						
						if(manager.getPlayer3()) {
							label_3.setText("Spaceship's shield have " + manager.getShield() + " points left");
							label_5.setText("Charing Succeed");
							lblNewLabel_1.setText("<html>name: " + manager.getName3() + "<br/>health: " + manager.getHealth3() + "<br/>tiredness: " + manager.getTiredness3() + "<br/>hunger: "+ manager.getHunger3() + "<br/>action: "+ manager.getAction3() + "<html>");
						}
					}
					else {
						label_5.setText("player2 don't have enough action");
					}
					
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName4())) {
					if(manager.getAction4() > 0) {
						manager.setShield(manager.getRepaire4());
						manager.setAction4(-1);
						if(manager.getPlayer4()) {
							label_3.setText("Spaceship's shield have " + manager.getShield() + " points left");
							label_5.setText("Charing Succeed");
							lblNewLabel_2.setText("<html>name: " + manager.getName4() + "<br/>health: " + manager.getHealth4() + "<br/>tiredness: " + manager.getTiredness4() + "<br/>hunger: "+ manager.getHunger4() + "<br/>action: "+ manager.getAction4() + "<html>");
						}
					}
					else {
						label_5.setText("player2 don't have enough action");
					}
					
				}
			}
		});
		btnFix.setBounds(597, 341, 93, 23);
		frame.getContentPane().add(btnFix);
		

		

	}
}
