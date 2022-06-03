package main;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WinWindow {

	private JFrame frame;
	private GameManager manager;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinWindow window = new WinWindow(null);
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
	public WinWindow(GameManager incomingManager) {
		manager = incomingManager;
		initialize();
		frame.setVisible(true);
	}
	
	public void closeWindow() {
		frame.dispose();
	}
	
	public void finishWindow() {
		manager.closeWinWindow(this);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				finishWindow();
				manager.reset();
				manager.launchGameSetUpWindow();
			}
		});
		btnRestart.setBounds(50, 194, 93, 23);
		frame.getContentPane().add(btnRestart);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				closeWindow();
				finishWindow();
			}
		});
		btnQuit.setBounds(282, 194, 93, 23);
		frame.getContentPane().add(btnQuit);
		
		JLabel lblCongradulationsYouveWon = new JLabel("Congradulations!!! You've won!!!");
		lblCongradulationsYouveWon.setFont(new Font("ËÎÌו", Font.PLAIN, 18));
		lblCongradulationsYouveWon.setForeground(Color.BLUE);
		lblCongradulationsYouveWon.setHorizontalAlignment(SwingConstants.CENTER);
		lblCongradulationsYouveWon.setBounds(63, 72, 311, 72);
		frame.getContentPane().add(lblCongradulationsYouveWon);
	}

}
