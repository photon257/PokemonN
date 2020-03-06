package src.Constructors;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class WorldBackground extends JPanel{

	public WorldBackground() {
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		System.out.println("10");
try {
		g.drawImage(ImageIO.read(new File("H:\\git\\Sprites\\Routes\\Route 15.png")), 0, 0, null);
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
System.out.println("11");
	}
}