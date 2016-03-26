import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GameObject {
	int x;
	int y;
	int width;
	int height;
	static Color c;
	GameObject(int x, int y, int width, int height, Color c) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
		this.c=c;
	}
	public void draw (Graphics g, Color c) {
		g.fillRect(x, y, width, height);
		g.setColor(c);
		//g.drawImage(image, x, y, width, height, null);
	}
}