package ch14_codes;
import javax.swing.*;
public class MyFrameDemo {
	public static final int WIDTH = 500;
	public static final int HEIGHT = 350;
	public static void main(String[] args) {
		JFrame f = new JFrame("MyFrameDemo");
		f.setSize(WIDTH, HEIGHT);
		JLabel myLabel = new JLabel("Click the window close button (x)!");
		f.getContentPane().add(myLabel);
		
		
		WindowDestroyer wh = new WindowDestroyer();
		f.addWindowListener(wh);
		f.setVisible(true);
}
}
	