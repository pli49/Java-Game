package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class FourNameWindow {

	private JFrame frame;
	private JTextField txtShips;
	private JTextField txtPlayer;
	private JTextField txtPlayer_1;
	private JTextField txtPlayer_2;
	private GameManager manager;
	private JTextField txtPlayer_3;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FourNameWindow window = new FourNameWindow(null);
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
	public FourNameWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	
	public void finishWindow() {
		manager.closeFourNameWindow(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtShips = new JTextField();
		txtShips.setText("ship's");
		txtShips.setBounds(26, 22, 66, 21);
		frame.getContentPane().add(txtShips);
		txtShips.setColumns(10);
		
		txtPlayer = new JTextField();
		txtPlayer.setText("player1");
		txtPlayer.setBounds(26, 49, 66, 21);
		frame.getContentPane().add(txtPlayer);
		txtPlayer.setColumns(10);
		
		txtPlayer_1 = new JTextField();
		txtPlayer_1.setText("player2");
		txtPlayer_1.setBounds(26, 80, 66, 21);
		frame.getContentPane().add(txtPlayer_1);
		txtPlayer_1.setColumns(10);
		
		txtPlayer_2 = new JTextField();
		txtPlayer_2.setText("player3");
		txtPlayer_2.setBounds(26, 111, 66, 21);
		frame.getContentPane().add(txtPlayer_2);
		txtPlayer_2.setColumns(10);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				manager.launchGameSetUpWindow();
			}
		});
		btnBack.setBounds(26, 200, 93, 23);
		frame.getContentPane().add(btnBack);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				manager.setShipName(txtShips.getText());
				manager.setName1(txtPlayer.getText());
				manager.setName2(txtPlayer_1.getText());
				manager.setName3(txtPlayer_2.getText());
				manager.setName4(txtPlayer_3.getText());
				closeWindow();
				finishWindow();
			}
		});
		btnNext.setBounds(288, 200, 93, 23);
		frame.getContentPane().add(btnNext);
		
		txtPlayer_3 = new JTextField();
		txtPlayer_3.setText("player4");
		txtPlayer_3.setBounds(26, 142, 66, 21);
		frame.getContentPane().add(txtPlayer_3);
		txtPlayer_3.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
				//manager.setCrewTypes1(comboBox.getSelectedItem().toString());
			}
		});
		comboBox.addItem("engineer");
		comboBox.addItem("doctor");
		comboBox.addItem("pathFinder");
		comboBox.addItem("monk");
		comboBox.addItem("magician");
		comboBox.addItem("actor");
		comboBox.setBounds(124, 49, 116, 21);
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
		comboBox_1.setBounds(124, 80, 116, 21);
		frame.getContentPane().add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_2.getSelectedItem().toString().equals("engineer")) {
					manager.setHealth3(50);
					manager.setAction3(1);
					manager.setHunger3(50);
					//manager.setName3(txtPlayersName_1.getText());
					manager.setTiredness3(50);
					manager.setRepaire3(100);
				}
				if(comboBox_2.getSelectedItem().toString().equals("doctor")) {
					manager.setHealth3(100);
					manager.setAction3(1);
					manager.setHunger3(50);
					//manager.setName3(txtPlayersName_1.getText());
					manager.setTiredness3(70);
					manager.setRepaire3(30);
				}
				if(comboBox_2.getSelectedItem().toString().equals("pathFinder")) {
					manager.setHealth3(70);
					manager.setAction3(1);
					manager.setHunger3(100);
					//manager.setName3(txtPlayersName_1.getText());
					manager.setTiredness3(80);
					manager.setRepaire3(0);
				}
				if(comboBox_2.getSelectedItem().toString().equals("monk")) {
					manager.setHealth3(50);
					manager.setAction3(1);
					manager.setHunger3(70);
					//manager.setName3(txtPlayersName_1.getText());
					manager.setTiredness3(100);
					manager.setRepaire3(30);
				}
				if(comboBox_2.getSelectedItem().toString().equals("magician")) {
					manager.setHealth3(50);
					manager.setAction3(1);
					manager.setHunger3(100);
					//manager.setName3(txtPlayersName_1.getText());
					manager.setTiredness3(50);
					manager.setRepaire3(30);
				}
				if(comboBox_2.getSelectedItem().toString().equals("actor")) {
					manager.setHealth3(50);
					manager.setAction3(2);
					manager.setHunger3(50);
					//manager.setName3(txtPlayersName_1.getText());
					manager.setTiredness3(50);
					manager.setRepaire3(0);
				}
				//manager.setCrewTypes3(comboBox_2.getSelectedItem().toString());
			}
		});
		comboBox_2.addItem("engineer");
		comboBox_2.addItem("doctor");
		comboBox_2.addItem("pathFinder");
		comboBox_2.addItem("monk");
		comboBox_2.addItem("magician");
		comboBox_2.addItem("actor");
		comboBox_2.setBounds(124, 111, 116, 21);
		frame.getContentPane().add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox_3.getSelectedItem().toString().equals("engineer")) {
					manager.setHealth4(50);
					manager.setAction4(1);
					manager.setHunger4(50);
					//manager.setName4(txtPlayersName_1.getText());
					manager.setTiredness4(50);
					manager.setRepaire4(100);
				}
				if(comboBox_3.getSelectedItem().toString().equals("doctor")) {
					manager.setHealth4(100);
					manager.setAction4(1);
					manager.setHunger4(50);
					//manager.setName4(txtPlayersName_1.getText());
					manager.setTiredness4(70);
					manager.setRepaire4(30);
				}
				if(comboBox_3.getSelectedItem().toString().equals("pathFinder")) {
					manager.setHealth4(70);
					manager.setAction4(1);
					manager.setHunger4(100);
					//manager.setName4(txtPlayersName_1.getText());
					manager.setTiredness4(80);
					manager.setRepaire4(0);
				}
				if(comboBox_3.getSelectedItem().toString().equals("monk")) {
					manager.setHealth4(50);
					manager.setAction4(1);
					manager.setHunger4(70);
					//manager.setName4(txtPlayersName_1.getText());
					manager.setTiredness4(100);
					manager.setRepaire4(30);
				}
				if(comboBox_3.getSelectedItem().toString().equals("magician")) {
					manager.setHealth4(50);
					manager.setAction4(1);
					manager.setHunger4(100);
					//manager.setName4(txtPlayersName_1.getText());
					manager.setTiredness4(50);
					manager.setRepaire4(30);
				}
				if(comboBox_3.getSelectedItem().toString().equals("actor")) {
					manager.setHealth4(50);
					manager.setAction4(2);
					manager.setHunger4(50);
					//manager.setName4(txtPlayersName_1.getText());
					manager.setTiredness4(50);
					manager.setRepaire4(0);
				}
				//manager.setCrewTypes4(comboBox_3.getSelectedItem().toString());
			}
		});
		comboBox_3.addItem("engineer");
		comboBox_3.addItem("doctor");
		comboBox_3.addItem("pathFinder");
		comboBox_3.addItem("monk");
		comboBox_3.addItem("magician");
		comboBox_3.addItem("actor");
		comboBox_3.setBounds(124, 142, 116, 21);
		frame.getContentPane().add(comboBox_3);
	}

}
