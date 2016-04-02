import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject extends GameObject{
	BufferedImage image;
	public ImageObject(int x, int y, int width, int height, BufferedImage image) {
		super(x,y,width,height, c);
		this.image=image;
	}
	public void draw (Graphics g, Color c) {
		g.fillRect(x, y, width, height);
		g.setColor(c);
		g.drawImage(image, x, y, width, height, null);
	}
	
	public void update() {
		if(InputManager.LEFT_ARROW_KEY) {
			x--;
		}
		if(InputManager.RIGHT_ARROW_KEY) {
			x++;
		}
		if(InputManager.UP_ARROW_KEY) {
			y--;
		}
		if(InputManager.DOWN_ARROW_KEY) {
			y++;
		}
		if(InputManager.SPACEBAR) {
			width+=50;
			height+=50;
		}
		x=InputManager.xOfMouse;
		y=InputManager.yOfMouse;
	}
}
