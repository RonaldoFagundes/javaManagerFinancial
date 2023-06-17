package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.Label;

public class HomeStream extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomeStream frame = new HomeStream();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomeStream() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setVgap(80);
		flowLayout.setHgap(80);
		flowLayout.setAlignOnBaseline(true);
		
		panel.setBackground(Color.CYAN);
		contentPane.add(panel, BorderLayout.NORTH);
		
		Label label = new Label("Home");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("Dialog", Font.BOLD, 18));
		label.setAlignment(Label.CENTER);
		panel.add(label);
	}	
		

}
