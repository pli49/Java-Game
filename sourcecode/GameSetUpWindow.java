package main;
import java.awt.EventQueue;

import java.util.Arrays; 

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameSetUpWindow {

	private JFrame frame;
	private GameManager manager; 


	/**
	 * Create the application.
	 */
	public GameSetUpWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	public void finishWindow() {
		manager.closeGameSetUpWindow(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 545, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please choose how many days you want");
		lblNewLabel.setBounds(40, 28, 280, 52);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblYouNeedTo = new JLabel();
		//"You need to find " + Integer.parseInt(comboBox.getSelectedItem()) * 2 / 3 +" pieces"
		lblYouNeedTo.setBounds(436, 39, 223, 41);
		frame.getContentPane().add(lblYouNeedTo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().toString().equals("3")) {
					manager.setDays(3);
					manager.setPieces();
				}
				if(comboBox.getSelectedItem().toString().equals("4")) {
					manager.setDays(4);
					manager.setPieces();
				}
				if(comboBox.getSelectedItem().toString().equals("5")) {
					manager.setDays(5);
					manager.setPieces();
				}
				if(comboBox.getSelectedItem().toString().equals("6")) {
					manager.setDays(6);
					manager.setPieces();
				}
				if(comboBox.getSelectedItem().toString().equals("7")) {
					manager.setDays(7);
					manager.setPieces();
				}
				if(comboBox.getSelectedItem().toString().equals("8")) {
					manager.setDays(8);
					manager.setPieces();
				}
				
			}
		});

		comboBox.addItem(3);
		comboBox.addItem(4);
		comboBox.addItem(5);
		comboBox.addItem(6);
		comboBox.addItem(7);
		comboBox.addItem(8);
		comboBox.addItem(9);
		comboBox.addItem(10);
		comboBox.setBounds(330, 39, 54, 31);
		frame.getContentPane().add(comboBox);
		
		
		JLabel lblPleaseChooseHow = new JLabel("Please choose how many crew member you want");
		lblPleaseChooseHow.setBounds(40, 108, 264, 15);
		frame.getContentPane().add(lblPleaseChooseHow);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox_1.getSelectedItem().toString().equals("2")) {
					manager.setPeople(2);
				}
				if(comboBox_1.getSelectedItem().toString().equals("3")) {
					manager.setPeople(3);
				}
				if(comboBox_1.getSelectedItem().toString().equals("4")) {
					manager.setPeople(4);
				}
			}
		});
		comboBox_1.addItem(2);
		comboBox_1.addItem(3);
		comboBox_1.addItem(4);
		
		comboBox_1.setBounds(330, 105, 54, 31);
		frame.getContentPane().add(comboBox_1);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				

				closeWindow();
				finishWindow();
				
				
			}
		});
		btnNext.setBounds(212, 252, 93, 23);
		frame.getContentPane().add(btnNext);
		
		
		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameSetUpWindow window = new GameSetUpWindow(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
