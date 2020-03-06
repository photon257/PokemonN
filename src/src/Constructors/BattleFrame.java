package src.Constructors;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import src.Libraries.Attackdex;

public class BattleFrame {
	 public static JFrame frame = new JFrame();
	 public static JPanel sprite;
	 public static JPanel esprite;
	 public static JPanel ball1;
	 public static JPanel ball2;
	 public static JPanel ball3;
	 public static JPanel ball4;
	 public static JPanel ball5;
	 public static JPanel ball6;
	 public static JPanel eball1;
	 public static JPanel eball2;
	 public static JPanel eball3;
	 public static JPanel eball4;
	 public static JPanel eball5;
	 public static JPanel eball6;
	 public static JButton attack1 = new JButton();
	 public static JButton attack2 = new JButton();
	 public static JButton attack3 = new JButton();
	 public static JButton attack4 = new JButton();
	 public static int ehp;
	 public static int hp;
	 public JLabel text = new JLabel();
	 public JLabel eText = new JLabel();
	 public JLabel attackText = new JLabel();
	 public static JLabel eAttackText = new JLabel();
	 public static Pokemon player;
	 public static Pokemon opponent;
	 public static JPanel background;
	 public static double damage;
	 public static int[]move = new int[24];
	 public static int[]eMove = new int[24];
	 public static Team pTeam = new Team();
	 public static Team eTeam = new Team();
	 static int ko = 0;
	 static int eko = 0;



	
public BattleFrame() throws IOException {
		this.player = pTeam.get(ko);
		this.opponent = eTeam.get(ko);
		frame.setSize(1920, 1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		System.out.println("1");
		
		ehp = opponent.getHP();
		
		hp = player.getHP();
		
		ball1 = new ball(true);
		ball2 = new ball(true);
		ball3 = new ball(true);
		ball4 = new ball(true);
		ball5 = new ball(true);
		ball6 = new ball(true);
		ball1.setBounds(100, 300, 64, 64);
		ball2.setBounds(169, 300, 64, 64);
		ball3.setBounds(238, 300, 64, 64);
		ball4.setBounds(307, 300, 64, 64);
		ball5.setBounds(376, 300, 64, 64);
		ball6.setBounds(445, 300, 64, 64);
		
		eball1 = new ball(true);
		eball2 = new ball(true);
		eball3 = new ball(true);
		eball4 = new ball(true);
		eball5 = new ball(true);
		eball6 = new ball(true);
		eball1.setBounds(1000, 300, 64, 64);
		eball2.setBounds(1069, 300, 64, 64);
		eball3.setBounds(1138, 300, 64, 64);
		eball4.setBounds(1207, 300, 64, 64);
		eball5.setBounds(1276, 300, 64, 64);
		eball6.setBounds(1345, 300, 64, 64);

		
		System.out.println("2");
		
		attack1.setBounds(700, 700, 100, 100);
		attack2.setBounds(800, 800, 100, 100);
		attack3.setBounds(700, 800, 100, 100);
		attack4.setBounds(800, 700, 100, 100);
		
		
		
		text.setText("HP:" + hp);
		text.setBounds(150, 860, 100, 100);
		
		
		
		eText.setText("HP:" + ehp);
		eText.setBounds(1200, 710, 100, 100);
		
		System.out.println("3");
		
		try {
			background = new Background();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		background.setBounds(0,0,1920,1080);
		
		System.out.println("4");
		
		try {
			sprite = player.getSprite(true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		sprite.setBounds(150, 600, 1000, 256);

		System.out.println("5");
		
		try {
			esprite = opponent.getSprite(false);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		esprite.setBounds(1200, 450, 1000, 256);
		
		System.out.println("6");
		
		attackText.setBounds(200, 750, 500, 200);
		eAttackText.setBounds(1250, 600, 500, 200);
		
		
		frame.add(ball1);
		frame.add(ball2);
		frame.add(ball3);
		frame.add(ball4);
		frame.add(ball5);
		frame.add(ball6);
		frame.add(eball1);
		frame.add(eball2);
		frame.add(eball3);
		frame.add(eball4);
		frame.add(eball5);
		frame.add(eball6);
		frame.add(sprite);
		frame.add(attackText);
		frame.add(eAttackText);
		frame.add(esprite);
		frame.add(attack1);
		frame.add(attack2);
		frame.add(attack3);
		frame.add(attack4);
		frame.add(text);
		frame.add(eText);
		frame.add(background);
		frame.setVisible(true);
		System.out.println("7");
	}

public int getPlayerAttack() {
	return player.getAttack();
}

public int getPlayerDefense() {
	return player.getDefense();
}

public int getOpponentAttack() {
	return opponent.getAttack();
}

public int getOpponentDefense() {
	return opponent.getDefense();
}

public JButton getAttack1() {
	return attack1;
}
public JButton getAttack2() {
	return attack2;
}
public JButton getAttack3() {
	return attack3;
}
public JButton getAttack4() {
	return attack4;
}

public JLabel getText() {
	return text;
}

public JLabel getEText() {
	return eText;
}

public void repaint() {
	frame.repaint();
}

public JLabel getAttackText(){
	return attackText;
}
public JLabel getEAttackText(){
	return eAttackText;
}


public static void battle(BattleFrame b) {
	attack1.setText(player.getMove1());
	attack2.setText(player.getMove2());
	attack3.setText(player.getMove3());
	attack4.setText(player.getMove4());

	System.out.println("8");
	
b.getAttack1().addActionListener(new ActionListener() { // move 1
		public void actionPerformed(ActionEvent arg0) {
			move = Attackdex.Identify(player.getMove1()); //sets the stats for the selected move
			Random x = new Random();
			int acc = x.nextInt(100)+1;
			if(acc<=move[4]) {
			damage  = ((((((2*50)/5)+2)*(move[3] * player.getAttack()/opponent.getDefense())/50)+2))*Attackdex.getMod(move); //calculates damage for said move
			ehp -= damage; //deals the damage
			
			b.getAttackText().setText(player.getName() + " used " + player.getMove1()); //displays text saying what move was used
			b.getEText().setText("HP:" + ehp); //updates opponents hp
			} else {
				b.getAttackText().setText(player.getName() + " missed! "); //displays text saying what move was used
			}
			getEmove();
			
			damage  = ((((((2*50)/5)+2)*(eMove[3] * opponent.getAttack()/player.getDefense())/50)+2))*Attackdex.getMod(eMove); //calculates damage for said move
			hp -= damage; //deals the damage
			
			b.getText().setText("HP:" + hp);
			try {
				checkKO(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			b.repaint();

	}});



b.getAttack2().addActionListener(new ActionListener() { // move 1
	public void actionPerformed(ActionEvent arg0) {
		move = Attackdex.Identify(player.getMove2());
		Random x = new Random();
		int acc = x.nextInt(100)+1;
		if(acc<=move[4]) {
		damage  = ((((((2*50)/5)+2)*(move[3] * player.getAttack()/opponent.getDefense())/50)+2))*Attackdex.getMod(move); //calculates damage for said move
		ehp -= damage; //deals the damage
		
		b.getAttackText().setText(player.getName() + " used " + player.getMove2()); //displays text saying what move was used
		b.getEText().setText("HP:" + ehp); //updates opponents hp
		} else {
			b.getAttackText().setText(player.getName() + " missed! "); //displays text saying what move was used
		}
		getEmove();
		damage  = ((((((2*50)/5)+2)*(eMove[3] * opponent.getAttack()/player.getDefense())/50)+2))*Attackdex.getMod(eMove); //calculates damage for said move
		hp -= damage; //deals the damage
		
		b.getText().setText("HP:" + hp);
		try {
			checkKO(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.repaint();

}});



b.getAttack3().addActionListener(new ActionListener() { // move 1
	
	public void actionPerformed(ActionEvent arg0) {
		move = Attackdex.Identify(player.getMove3());
		Random x = new Random();
		int acc = x.nextInt(100)+1;
		if(acc<=move[4]) {
		damage  = ((((((2*50)/5)+2)*(move[3] * player.getAttack()/opponent.getDefense())/50)+2))*Attackdex.getMod(move); //calculates damage for said move
		ehp -= damage; //deals the damage
		
		b.getAttackText().setText(player.getName() + " used " + player.getMove3()); //displays text saying what move was used
		b.getEText().setText("HP:" + ehp); //updates opponents hp
		} else {
			b.getAttackText().setText(player.getName() + " missed! "); //displays text saying what move was used
		}
		getEmove();
		damage  = ((((((2*50)/5)+2)*(eMove[3] * opponent.getAttack()/player.getDefense())/50)+2))*Attackdex.getMod(eMove); //calculates damage for said move
		hp -= damage; //deals the damage
		
		b.getText().setText("HP:" + hp);
		try {
			checkKO(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.repaint();


}});



b.getAttack4().addActionListener(new ActionListener() { // move 1

	public void actionPerformed(ActionEvent arg0) {
		move = Attackdex.Identify(player.getMove4());
		Random x = new Random();
		int acc = x.nextInt(100)+1;
		if(acc<=move[4]) {
		damage  = ((((((2*50)/5)+2)*(move[3] * player.getAttack()/opponent.getDefense())/50)+2))*Attackdex.getMod(move); //calculates damage for said move
		ehp -= damage; //deals the damage
		
		b.getAttackText().setText(player.getName() + " used " + player.getMove4()); //displays text saying what move was used
		b.getEText().setText("HP:" + ehp); //updates opponents hp
		} else {
			b.getAttackText().setText(player.getName() + " missed! "); //displays text saying what move was used
		}
		getEmove();
		damage  = ((((((2*50)/5)+2)*(eMove[3] * opponent.getAttack()/player.getDefense())/50)+2))*Attackdex.getMod(eMove); //calculates damage for said move
		hp -= damage; //deals the damage
		
		b.getText().setText("HP:" + hp);
		try {
			checkKO(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		b.repaint();


}});
System.out.println("9");
}

public static void checkKO(BattleFrame b) throws IOException {
	if(hp <= 0) {
		ko++;	
		if(ko == 6 || eko == 6) {
			frame.dispose();
		}
		player = pTeam.get(ko);
		frame.remove(sprite);
		try {
			sprite = player.getSprite(true);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		frame.add(sprite);
		sprite.setBounds(150, 600, 1000, 256);
		hp = player.getHP();
		b.getText().setText("HP:" + hp);
		attack1.setText(player.getMove1());
		attack2.setText(player.getMove2());
		attack3.setText(player.getMove3());
		attack4.setText(player.getMove4());
	}
	if(ehp <= 0) {
		
		eko++;
		if(ko == 6 || eko == 6) {
			frame.dispose();
		}
		opponent = eTeam.get(eko);
		frame.remove(esprite);
		try {
			esprite = opponent.getSprite(false);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		frame.add(esprite);
		esprite.setBounds(1200, 450, 1000, 256);
		ehp = opponent.getHP();
		b.getEText().setText("HP:" + ehp);
	}
	
	balls();
	frame.remove(background);
	frame.add(background);
	frame.repaint();

		
}
public static void faint() throws InterruptedException {
	for(int i = 200; i > 0; i--) {
		frame.remove(esprite);
		frame.repaint();
		esprite.setBounds(1200, i+250, 256, 256);
		frame.add(esprite);
		frame.repaint();
	}
	esprite.setBounds(1200, 250, 256, 256);
}

public static void getEmove() {
	Random x = new Random(); //opponent uses a random move of its 4
	int rand = x.nextInt(4)+1;
	if(rand == 1) {
		eMove = Attackdex.Identify(opponent.getMove1()); //sets the stats for the selected move
		eAttackText.setText(opponent.getName() + " used " + opponent.getMove1()); //displays text saying what move was used
	}else if(rand == 2) {
		eMove = Attackdex.Identify(opponent.getMove2()); //sets the stats for the selected move
		eAttackText.setText(opponent.getName() + " used " + opponent.getMove2()); //displays text saying what move was used
	}else if(rand == 3) {
		eMove = Attackdex.Identify(opponent.getMove3()); //sets the stats for the selected move
		eAttackText.setText(opponent.getName() + " used " + opponent.getMove3()); //displays text saying what move was used
	}else {
		eMove = Attackdex.Identify(opponent.getMove4()); //sets the stats for the selected move
		eAttackText.setText(opponent.getName() + " used " + opponent.getMove4()); //displays text saying what move was used
	}
}

public static void balls() throws IOException {
	frame.remove(ball1);
	frame.remove(ball2);
	frame.remove(ball3);
	frame.remove(ball4);
	frame.remove(ball5);
	frame.remove(ball6);
	if(ko == 1) {
		ball1 = new ball(false);
	}
	if(ko == 2) {
		ball2 = new ball(false);
	}
	if(ko == 3) {
		ball3 = new ball(false);
	}
	if(ko == 4) {
		ball4 = new ball(false);
	}
	if(ko == 5) {
		ball5 = new ball(false);
	}
	if(ko == 6) {
		ball6 = new ball(false);
	}
	ball1.setBounds(100, 300, 64, 64);
	ball2.setBounds(169, 300, 64, 64);
	ball3.setBounds(238, 300, 64, 64);
	ball4.setBounds(307, 300, 64, 64);
	ball5.setBounds(376, 300, 64, 64);
	ball6.setBounds(445, 300, 64, 64);
	frame.add(ball1);
	frame.add(ball2);
	frame.add(ball3);
	frame.add(ball4);
	frame.add(ball5);
	frame.add(ball6);
	
	frame.remove(eball1);
	frame.remove(eball2);
	frame.remove(eball3);
	frame.remove(eball4);
	frame.remove(eball5);
	frame.remove(eball6);
	if(eko == 1) {
		eball1 = new ball(false);
	}
	if(eko == 2) {
		eball2 = new ball(false);
	}
	if(eko == 3) {
		eball3 = new ball(false);
	}
	if(eko == 4) {
		eball4 = new ball(false);
	}
	if(eko == 5) {
		eball5 = new ball(false);
	}
	if(eko == 6) {
		eball6 = new ball(false);
	}
	eball1.setBounds(1000, 300, 64, 64);
	eball2.setBounds(1069, 300, 64, 64);
	eball3.setBounds(1138, 300, 64, 64);
	eball4.setBounds(1207, 300, 64, 64);
	eball5.setBounds(1276, 300, 64, 64);
	eball6.setBounds(1345, 300, 64, 64);
	frame.add(eball1);
	frame.add(eball2);
	frame.add(eball3);
	frame.add(eball4);
	frame.add(eball5);
	frame.add(eball6);
}

public class Background extends JPanel {
	// size of the jpanel/card
	private int sizeH = 1080;
	private int sizeW = 1920;
	private String Name;
	final BufferedImage image;

	// sets size and throws exception
	Background() throws IOException {
		setSize(sizeW, sizeH);
	}

	private static final long serialVersionUID = 5545952195000855231L;

	// declares the beginning of the jpeg name for the naming scheme of the jpegs to
	// make reading them easier

	Random x = new Random();
	int shiny = x.nextInt(2);
	{
		
			image = ImageIO.read(new File("H:\\Battle.png"));
	
		

		// renders picture of card into class and resizes it

		final BufferedImage resized = resize(image, sizeH, sizeW);
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
}

