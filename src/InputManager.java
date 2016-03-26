import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class InputManager {
	public static boolean LEFT_ARROW_KEY = false;
	public static void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseDragged");
		
	}
	public static void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseMoved");
		
	}
	public static void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked");
		
	}
	public static void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mousePressed");
		
	}
	public static void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseReleased");
		
	}
	public static void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");
		
	}
	public static void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseExcited");
		
	}
	public static void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyTyped");
		
	}
	public static void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyPressed");
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT_ARROW_KEY = true;
		}
		
	}
	public static void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("keyReleased");
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT_ARROW_KEY = false;
		}
		
	}
}
