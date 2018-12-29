
package laba2;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

=======
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import java.awt.FlowLayout;

		

		buttonCreate = new JButton("Ñîçäàòü ãðóçîâèê");
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
		buttonCreate = new JButton("Ñîçäàòü");
		buttonCreate.setBounds(10, 5, 92, 23);
		panel.add(buttonCreate);

		
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


		JButton button = new JButton("Ñîçäàòü ñàìîñâàë");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
				PanelDumpTruck.dumptruck = new Truck(rnd.Next(100, 300), rnd.Next(1000, 2000), Color.blue);

		buttonCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random rnd = new Random();
				PanelDumpTruck.dumptruck = new DumpTruck(rnd.Next(100, 300), rnd.Next(1000, 2000), Color.blue, Color.yellow);



		button.setBounds(153, 5, 133, 23);
		panel.add(button);	

	}
}
