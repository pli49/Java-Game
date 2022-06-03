package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameOverWindow {

	private JFrame frame;
	private GameManager manager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameOverWindow window = new GameOverWindow(null);
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
	public GameOverWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	public void finishWindow() {
		manager.closeGameOverWindow(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblGameover = new JLabel("Gameover !!! Please try again");
		lblGameover.setHorizontalAlignment(SwingConstants.CENTER);
		lblGameover.setForeground(Color.RED);
		lblGameover.setFont(new Font("ËÎÌו", Font.PLAIN, 16));
		lblGameover.setBounds(47, 47, 332, 77);
		frame.getContentPane().add(lblGameover);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				closeWindow();
				finishWindow();
				manager.reset();
				manager.launchGameSetUpWindow();
			}
		});
		btnRestart.setBounds(47, 204, 93, 23);
		frame.getContentPane().add(btnRestart);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				finishWindow();
			}
		});
		btnQuit.setBounds(274, 204, 93, 23);
		frame.getContentPane().add(btnQuit);
	}
}
