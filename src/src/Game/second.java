package src.Game;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import src.Constructors.BattleFrame;
import src.Constructors.Team;
import src.Constructors.WorldBuilder;

public class second extends JPanel implements ActionListener, KeyListener{
Timer t = new Timer(5, this);
public int x = 0;
int y = 0;
double velx = 0;
double vely = 0;
Graphics g;

public second() {
	t.start();
	addKeyListener(this);
	setFocusable(true);
	setFocusTraversalKeysEnabled(false);
}

public void paintComponent(Graphics g) {
	super.paintComponent(g);

	
	
	try {
		g.drawImage(ImageIO.read(new File("H:\\git\\Sprites\\bill.png")), x, y, null);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void actionPerformed(ActionEvent e) {
	repaint();
	x += velx;
	y += vely;
}
public void up() {
	vely = -5;
}
public void down() {
	vely = 5;
}
public void left() {
	velx = -5;
}
public void right() {
	velx = 5;
}
public void menu() {
	WorldBuilder.menu();
}

public void keyPressed(KeyEvent e){
	int code = e.getKeyCode();
	if (code == KeyEvent.VK_W){
		up();
	}
	if (code == KeyEvent.VK_S){
		down();
		if (x >= 100 && x <= 150) {
			BattleUI.play();
		}
	}
	if (code == KeyEvent.VK_A){
		left();
		if (x >= 100 && x <= 150) {
			BattleUI.play();
		}
	}
	if (code == KeyEvent.VK_D){
		right();
	}
	if (code == KeyEvent.VK_TAB){
		menu();
	}
}
public void keyTyped(KeyEvent e) {}
public void keyReleased(KeyEvent e) {
	velx = 0;
	vely = 0;
}
}
