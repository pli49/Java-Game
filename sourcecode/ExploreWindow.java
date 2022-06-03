package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class ExploreWindow {

	private JFrame frame;
	private GameManager manager;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExploreWindow window = new ExploreWindow(null);
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
	public ExploreWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	public void finishWindow() {
		manager.closeExploreWindow(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 735, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(61, 286, 93, 23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				manager.launchGameStartWindow();
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnBack);
		
		JLabel lblExploreThePlanet = new JLabel("Explore the planet by :");
		lblExploreThePlanet.setBounds(80, 66, 195, 18);
		frame.getContentPane().add(lblExploreThePlanet);
		
		JLabel label = new JLabel("");
		label.setBounds(75, 117, 385, 18);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(14, 247, 666, 18);
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
		comboBox.setBounds(289, 63, 139, 24);
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
		comboBox_1.setBounds(51, 191, 139, 24);
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
		comboBox_2.setBounds(246, 189, 139, 24);
		frame.getContentPane().add(comboBox_2);
		
		JButton btnExplore = new JButton("Explore");
		btnExplore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().toString().equals(manager.getName1())) {
					if(manager.getAction1()>0) {
						manager.setAction1(-1);
						manager.setRand();
						if(manager.getRand() == 0 && manager.FoundPieces() == false) {
							manager.setPieces1(1);
							manager.explorePieces(true);
							label.setText("You've found one transporter part");
							if(manager.getPieces() == 0) {
								closeWindow();
								finishWindow();
								manager.launchWinWindow();
							}
						}
						else if(manager.getRand() == 0 && manager.FoundPieces() == true) {
							label.setText("You've already found one transporter part, try on the next planet");
						}
						else if(manager.getRand() == 1) {
							manager.buyFeast(1);
							label.setText("You've found one feast");
						}
						else if(manager.getRand() == 2) {
							manager.buyHealPowder(1);
							label.setText("You've found one healing powder");
						}
						else if(manager.getRand() == 3) {
							manager.setMoney(50);
							label.setText("You've found $50");
						}
						else {
							label.setText("You've found nothing");
						}
					}else {
						label.setText("You don't enough antion");
					}
				}
				if(comboBox.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getAction2()>0) {
						manager.setAction2(-1);
						manager.setRand();
						if(manager.getRand() == 0 && manager.FoundPieces() == false) {
							manager.setPieces1(1);
							manager.explorePieces(true);
							label.setText("You've found one transporter part");
							if(manager.getPieces() == 0) {
								closeWindow();
								finishWindow();
								manager.launchWinWindow();
							}
						}
						else if(manager.getRand() == 0 && manager.FoundPieces() == true) {
							label.setText("You've already found one transporter part, try on the next planet");
						}
						else if(manager.getRand() == 1) {
							manager.buyFeast(1);
							label.setText("You've found one feast");
						}
						else if(manager.getRand() == 2) {
							manager.buyHealPowder(1);
							label.setText("You've found one healing powder");
						}
						else if(manager.getRand() == 3) {
							manager.setMoney(50);
							label.setText("You've found $50");
						}
						else {
							label.setText("You've found nothing");
						}
					}else {
						label.setText("You don't enough antion");
					}
				}
				if(comboBox.getSelectedItem().toString().equals(manager.getName3()) && manager.getPlayer3()) {
					if(manager.getAction3()>0) {
						manager.setAction3(-1);
						manager.setRand();
						if(manager.getRand() == 0 && manager.FoundPieces() == false) {
							manager.setPieces1(1);
							manager.explorePieces(true);
							label.setText("You've found one transporter part");
							if(manager.getPieces() == 0) {
								closeWindow();
								finishWindow();
								manager.launchWinWindow();
							}
						}
						else if(manager.getRand() == 0 && manager.FoundPieces() == true) {
							label.setText("You've already found one transporter part, try on the next planet");
						}
						else if(manager.getRand() == 1) {
							manager.buyFeast(1);
							label.setText("You've found one feast");
						}
						else if(manager.getRand() == 2) {
							manager.buyHealPowder(1);
							label.setText("You've found one healing powder");
						}
						else if(manager.getRand() == 3) {
							manager.setMoney(50);
							label.setText("You've found $50");
						}
						else {
							label.setText("You've found nothing");
						}
					}else {
						label.setText("You don't enough antion");
					}
				}
				if(comboBox.getSelectedItem().toString().equals(manager.getName4()) && manager.getPlayer4()) {
					if(manager.getAction4()>0) {
						manager.setAction4(-1);
						manager.setRand();
						if(manager.getRand() == 0 && manager.FoundPieces() == false) {
							manager.setPieces1(1);
							manager.explorePieces(true);
							label.setText("You've found one transporter part");
							if(manager.getPieces() == 0) {
								closeWindow();
								finishWindow();
								manager.launchWinWindow();
							}
						}
						else if(manager.getRand() == 0 && manager.FoundPieces() == true) {
							label.setText("You've already found one transporter part, try on the next planet");
						}
						else if(manager.getRand() == 1) {
							manager.buyFeast(1);
							label.setText("You've found one feast");
						}
						else if(manager.getRand() == 2) {
							manager.buyHealPowder(1);
							label.setText("You've found one healing powder");
						}
						else if(manager.getRand() == 3) {
							manager.setMoney(50);
							label.setText("You've found $50");
						}
						else {
							label.setText("You've found nothing");
						}
					}else {
						label.setText("You don't enough antion");
					}
				}
			}
			
		});
		btnExplore.setBounds(446, 62, 113, 27);
		frame.getContentPane().add(btnExplore);
		
		JButton btnNextPlanet = new JButton("Next planet");
		btnNextPlanet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName1()) && comboBox_2.getSelectedItem().toString().equals(manager.getName2())) {
					if(manager.getAction1() < 1 || manager.getAction2() < 1) {
						label_1.setText("They don't have enough action left");
					}
					else {
						manager.setAction1(-1);
						manager.setAction2(-1);
						label_1.setText("Succeed, you've piled the ship on to the next planet");
						manager.explorePieces(false);
					}
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName2()) && comboBox_2.getSelectedItem().toString().equals(manager.getName3())) {
					if(manager.getAction2() < 1 || manager.getAction3() < 1) {
						label_1.setText("They don't have enough action left");
					}
					else {
						manager.setAction3(-1);
						manager.setAction2(-1);
						label_1.setText("Succeed, you've piled the ship on to the next planet");
						manager.explorePieces(false);
					}
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName3()) && comboBox_2.getSelectedItem().toString().equals(manager.getName4())) {
					if(manager.getAction3() < 1 || manager.getAction4() < 1) {
						label_1.setText("They don't have enough action left");
					}
					else {
						manager.setAction3(-1);
						manager.setAction4(-1);
						label_1.setText("Succeed, you've piled the ship on to the next planet");
						manager.explorePieces(false);
					}
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName1()) && comboBox_2.getSelectedItem().toString().equals(manager.getName4())) {
					if(manager.getAction4() < 1 || manager.getAction1() < 1) {
						label_1.setText("They don't have enough action left");
					}
					else {
						manager.setAction1(-1);
						manager.setAction4(-1);
						label_1.setText("Succeed, you've piled the ship on to the next planet");
						manager.explorePieces(false);
					}
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName1()) && comboBox_2.getSelectedItem().toString().equals(manager.getName3())) {
					if(manager.getAction1() < 1 || manager.getAction3() < 1) {
						label_1.setText("They don't have enough action left");
					}
					else {
						manager.setAction1(-1);
						manager.setAction3(-1);
						label_1.setText("Succeed, you've piled the ship on to the next planet");
						manager.explorePieces(false);
					}
				}
				if(comboBox_1.getSelectedItem().toString().equals(manager.getName2()) && comboBox_2.getSelectedItem().toString().equals(manager.getName4())) {
					if(manager.getAction2() < 1 || manager.getAction4() < 1) {
						label_1.setText("They don't have enough action left");
					}
					else {
						manager.setAction4(-1);
						manager.setAction2(-1);
						label_1.setText("Succeed, you've piled the ship on to the next planet");
						manager.explorePieces(false);
					}
				}
				if(comboBox_1.getSelectedItem().toString().equals(comboBox_2.getSelectedItem().toString())) {
					label_1.setText("You can't choose the same player twice");
				}

			}
		});
		btnNextPlanet.setBounds(446, 188, 155, 27);
		frame.getContentPane().add(btnNextPlanet);
		
		JLabel lblPleaseChooseTwo = new JLabel("Please choose two player with one action left to pile the ship to the next planet");
		lblPleaseChooseTwo.setBounds(14, 136, 666, 18);
		frame.getContentPane().add(lblPleaseChooseTwo);
		
		
		

		
		
	}
}
