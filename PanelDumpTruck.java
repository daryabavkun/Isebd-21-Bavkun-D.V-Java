
package laba2;

import javax.swing.JPanel;
import java.awt.Graphics;

public class PanelDumpTruck extends JPanel {
	public static ITransport dumptruck;

package laba1;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class PanelDumpTruck extends JPanel {
	public static DumpTruck dumptruck;

	public static boolean initialization = false;
	
	@Override 
	public void paint(Graphics g) { 
		super.paint(g); 
		if(initialization) {
			dumptruck.DrawDumpTruck(g);
		}
	}
	
	public void callRepaint() {
		this.repaint();
	}
}
}

