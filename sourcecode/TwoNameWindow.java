package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class TwoNameWindow {

	private JFrame frame;
	private JTextField txtPlayersName;
	private JTextField txtPlayersName_1;
	private GameManager manager;
	private JTextField txtYourShipsName;
	private JComboBox comboBox;
	private JComboBox comboBox_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TwoNameWindow window = new TwoNameWindow(null);
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
	public TwoNameWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	public void finishWindow() {
		manager.closeTwoNameWindow(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtPlayersName = new JTextField();
		txtPlayersName.setText("player1's name");
		txtPlayersName.setBounds(24, 74, 113, 21);
		frame.getContentPane().add(txtPlayersName);
		txtPlayersName.setColumns(10);
		
		txtPlayersName_1 = new JTextField();
		txtPlayersName_1.setText("player2's name");
		txtPlayersName_1.setBounds(24, 105, 113, 21);
		frame.getContentPane().add(txtPlayersName_1);
		txtPlayersName_1.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.setShipName(txtYourShipsName.getText());
				manager.setName1(txtPlayersName.getText());
				manager.setName2(txtPlayersName_1.getText());
				manager.setPlayer3();
				manager.setPlayer4();
				//manager2.setCrewTypes1(comboBox.getSelectedItem().toString());
				//manager2.setCrewTypes2(comboBox_1.getSelectedItem().toString());
				closeWindow();
				finishWindow();
			}
		});
		btnNext.setBounds(299, 186, 93, 23);
		frame.getContentPane().add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				manager.launchGameSetUpWindow();
			}
		});
		btnBack.setBounds(44, 186, 93, 23);
		frame.getContentPane().add(btnBack);
		
		txtYourShipsName = new JTextField();
		txtYourShipsName.setText("your ship's name");
		txtYourShipsName.setBounds(24, 43, 113, 21);
		frame.getContentPane().add(txtYourShipsName);
		txtYourShipsName.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedItem().toString().equals("engineer")) {
					manager.setHealth1(50);
					manager.setAction1(1);
					manager.setHunger1(50);
					//manager.setName1(txtPlayersName.getText());
					manager.setTiredness1(50);
					manager.setRepaire1(100);
				}
				if(comboBox.getSelectedItem().toString().equals("doctor")) {
					manager.setHealth1(100);
					manager.setAction1(1);
					manager.setHunger1(50);
					//manager.setName1(txtPlayersName.getText());
					manager.setTiredness1(70);
					manager.setRepaire1(30);
				}
				if(comboBox.getSelectedItem().toString().equals("pathFinder")) {
					manager.setHealth1(70);
					manager.setAction1(1);
					manager.setHunger1(100);
					//manager.setName1(txtPlayersName.getText());
					manager.setTiredness1(80);
					manager.setRepaire1(0);
				}
				if(comboBox.getSelectedItem().toString().equals("monk")) {
					manager.setHealth1(50);
					manager.setAction1(1);
					manager.setHunger1(70);
					//manager.setName1(txtPlayersName.getText());
					manager.setTiredness1(100);
					manager.setRepaire1(30);
				}
				if(comboBox.getSelectedItem().toString().equals("magician")) {
					manager.setHealth1(50);
					manager.setAction1(1);
					manager.setHunger1(100);
					//manager.setName1(txtPlayersName.getText());
					manager.setTiredness1(50);
					manager.setRepaire1(30);
				}
				if(comboBox.getSelectedItem().toString().equals("actor")) {
					manager.setHealth1(50);
					manager.setAction1(2);
					manager.setHunger1(50);
					//manager.setName1(txtPlayersName.getText());
					manager.setTiredness1(50);
					manager.setRepaire1(0);
				}
				//manager2.setCrewTypes1(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.addItem("engineer");
		comboBox.addItem("doctor");
		comboBox.addItem("pathFinder");
		comboBox.addItem("monk");
		comboBox.addItem("magician");
		comboBox.addItem("actor");
		comboBox.setBounds(173, 74, 127, 21);
		frame.getContentPane().add(comboBox);
		
		comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_1.getSelectedItem().toString().equals("engineer")) {
					manager.setHealth2(50);
					manager.setAction2(1);
					manager.setHunger2(50);
					//manager.setName2(txtPlayersName_1.getText());
					manager.setTiredness2(50);
					manager.setRepaire2(100);
				}
				if(comboBox_1.getSelectedItem().toString().equals("doctor")) {
					manager.setHealth2(100);
					manager.setAction2(1);
					manager.setHunger2(50);
					//manager.setName2(txtPlayersName_1.getText());
					manager.setTiredness2(70);
					manager.setRepaire2(30);
				}
				if(comboBox_1.getSelectedItem().toString().equals("pathFinder")) {
					manager.setHealth2(70);
					manager.setAction2(1);
					manager.setHunger2(100);
					//manager.setName2(txtPlayersName_1.getText());
					manager.setTiredness2(80);
					manager.setRepaire2(0);
				}
				if(comboBox_1.getSelectedItem().toString().equals("monk")) {
					manager.setHealth2(50);
					manager.setAction2(1);
					manager.setHunger2(70);
					//manager.setName2(txtPlayersName_1.getText());
					manager.setTiredness2(100);
					manager.setRepaire2(30);
				}
				if(comboBox_1.getSelectedItem().toString().equals("magician")) {
					manager.setHealth2(50);
					manager.setAction2(1);
					manager.setHunger2(100);
					//manager.setName2(txtPlayersName_1.getText());
					manager.setTiredness2(50);
					manager.setRepaire2(30);
				}
				if(comboBox_1.getSelectedItem().toString().equals("actor")) {
					manager.setHealth2(50);
					manager.setAction2(2);
					manager.setHunger2(50);
					//manager.setName2(txtPlayersName_1.getText());
					manager.setTiredness2(50);
					manager.setRepaire2(0);
				}
				//manager.setCrewTypes2(comboBox_1.getSelectedItem().toString());
			}
		});
		comboBox_1.addItem("engineer");
		comboBox_1.addItem("doctor");
		comboBox_1.addItem("pathFinder");
		comboBox_1.addItem("monk");
		comboBox_1.addItem("magician");
		comboBox_1.addItem("actor");
		comboBox_1.setBounds(173, 105, 127, 21);
		frame.getContentPane().add(comboBox_1);
	}

}
