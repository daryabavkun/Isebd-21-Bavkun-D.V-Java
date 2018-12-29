package laba2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;


public class FormDumpTruck {

	private JFrame frame;
	private JPanel panel;
	private JButton buttonUp;
	private JButton buttonDown;
	private JButton buttonLeft;
	private JButton buttonRight;
	private JButton buttonCreate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormDumpTruck window = new FormDumpTruck();
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
	public FormDumpTruck() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new PanelDumpTruck();
		panel.setBounds(0, 0, 884, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		

		buttonCreate = new JButton("Создать грузовик");
		buttonCreate.setBounds(10, 5, 133, 23);
		panel.add(buttonCreate);
		buttonCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
				PanelDumpTruck.dumptruck = new DumpTruck(rnd.Next(100, 300), rnd.Next(1000, 2000), Color.blue, Color.yellow, true);
				PanelDumpTruck.initialization = true;
				PanelDumpTruck.dumptruck.SetPosition(rnd.Next(10, 100), rnd.Next(10, 100), panel.getWidth(), panel.getHeight());

				panel.updateUI();
			}
		});

		
		buttonRight = new JButton("");
		buttonRight.setBounds(824, 391, 50, 50);
		panel.add(buttonRight);
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PanelDumpTruck.initialization) {
					PanelDumpTruck.dumptruck.MoveTransport(Direction.Right);
				}
				panel.updateUI();
			}
		});
		buttonRight.setIcon(new ImageIcon("C:\\Windows\\Resources\\ArrowRight1.png"));
		
		buttonDown = new JButton("");
		buttonDown.setBounds(764, 391, 50, 50);
		panel.add(buttonDown);
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PanelDumpTruck.initialization) {
					PanelDumpTruck.dumptruck.MoveTransport(Direction.Down);
				}
				panel.updateUI();
			}
		});
		buttonDown.setIcon(new ImageIcon("C:\\Windows\\Resources\\ArrowDown1.png"));
		
		buttonLeft = new JButton("");
		buttonLeft.setBounds(704, 391, 50, 50);
		panel.add(buttonLeft);
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PanelDumpTruck.initialization) {
					PanelDumpTruck.dumptruck.MoveTransport(Direction.Left);
				}
				panel.updateUI();
			}
		});
		buttonLeft.setIcon(new ImageIcon("C:\\Windows\\Resources\\ArrowLeft1.png"));

		
		buttonUp = new JButton("");
		buttonUp.setBounds(764, 330, 50, 50);
		panel.add(buttonUp);
		buttonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(PanelDumpTruck.initialization) {
					PanelDumpTruck.dumptruck.MoveTransport(Direction.Up);
				}
				panel.updateUI();
			}
		});
		buttonUp.setIcon(new ImageIcon("C:\\Windows\\Resources\\ArrowUp1.png"));
		
		JButton button = new JButton("Создать самосвал");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
				PanelDumpTruck.dumptruck = new Truck(rnd.Next(100, 300), rnd.Next(1000, 2000), Color.blue);

				PanelDumpTruck.initialization = true;
				PanelDumpTruck.dumptruck.SetPosition(rnd.Next(10, 100), rnd.Next(10, 100), panel.getWidth(), panel.getHeight());

				panel.updateUI();
			}
		});

		button.setBounds(153, 5, 133, 23);
		panel.add(button);	
	}
}
