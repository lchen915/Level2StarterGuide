
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{
	Timer timer1;
	GameObject object1;
	GameObject object2;
	int x;
	int y;
	int width;
	int height;
	Color c;
	int speedx;
	int speedy;
	
	GamePanel() {
		System.out.println("gamepanel");
		timer1 = new Timer(150, this);
		timer1.start();
		x=1;
		y=1;
		width=100;
		height=100;
		speedx=100;
		speedy=100;
		object1 = new GameObject(10,10,100,100,Color.BLUE);
		object2 = new GameObject(110,110,100,100,Color.RED);
	}
	
	public void paintComponent(Graphics g) {
		//g.fillRect(x, y, width, height);
		object1.draw(g, Color.BLUE);
		object2.draw(g, Color.RED);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("actionperformed");
		repaint();
		/*if (x>=300) {
			y=y+100;
			speedx=0;
		}
		if (y>=300) {
			x=x-100;
			speedy=0;
		}
		if (x<=0) {
			x=0;
			y=y-100;
			speedx=0;
		}
		if (y<=0) {
			y=0;
			speedy=0;
			speedx=100;
		}
		x=x+speedx;*/
		//y=y+speedy;
		/*if (x>=400) {
			speedx=-speedx;
		}
		if (x<=0) {
			speedx=-speedx;
		}
		x=x+speedx;
		if (y>=400) {
			speedy=-speedy;
		}
		if (y<=0) {
			speedy=-speedy;
		}
		y=y+speedy;*/
	}

}
