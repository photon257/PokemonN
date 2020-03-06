package src.Constructors;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.*;

public class ball extends JPanel{
	boolean live;
	private static final long serialVersionUID = 5545952195000855231L;
	// size of the jpanel/card
	private int sizeH = 64;
	private int sizeW = 64;
	private String Name;
	final BufferedImage image;

	// sets size and throws exception
	ball(boolean player) throws IOException {
		setSize(sizeW, sizeH);
		live = player;
	

	

	// declares the beginning of the jpeg name for the naming scheme of the jpegs to
	// make reading them easier

	Random x = new Random();
	int shiny = x.nextInt(2);
	{
		
		String im = "\\\\dead";
		
		if(live == true) {
			im = "\\\\ball";
		}
		image = ImageIO.read(new File("H:\\git\\Sprites"+ im + ".png"));
		// renders picture of card into class and resizes it

		final BufferedImage resized = resize(image, sizeH, sizeW);
	}
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		// draws the picture onto the Sprite JPanel
		g2.drawImage(resize(image, sizeH, sizeW), 0, 0, null);
	}

	// resizes the BufferedImage
	private BufferedImage resize(BufferedImage img, int height, int width) {
		Image tmp = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
		BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2d = resized.createGraphics();
		g2d.drawImage(tmp, 0, 0, null);
		g2d.dispose();
		return resized;
	}
}


