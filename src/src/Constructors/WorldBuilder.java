package src.Constructors;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

import src.Game.BattleUI;
import src.Game.Controller;
import src.Game.second;
public class WorldBuilder {
	
 static JFrame world = new JFrame();
 int x = 944;
 int y = 508;

public WorldBuilder() throws IOException {
	world.setSize(1920, 1080);
	world.setLayout(null);
	WorldBackground background = new WorldBackground();
	background.setBounds(0, 0, 1920, 1080);
	second player = new second();
	player.setBounds(0, 0, 1920, 1080);
	world.add(background);

	world.add(player);
	world.setVisible(true);

world.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void menu() {
	JPanel menu = new JPanel();
	menu.setLayout(new GridLayout(2, 3));
	JButton Party = new JButton("Team");
	JButton Pokedex = new JButton("Pokedex");
	JButton Bag = new JButton("Bag");
	JButton Profile = new JButton("Profile");
	JButton Save = new JButton("Save");
	JButton Settings = new JButton("Settings");
	menu.add(Party);
	menu.add(Pokedex);
	menu.add(Bag);
	menu.add(Profile);
	menu.add(Save);
	menu.add(Settings);
	menu.setBounds(1620, 0, 300, 500);
	System.out.println("I work");
	world.add(menu);

}
}
