package ch14_codes;
import javax.swing.*;
public class FirstWindow extends JFrame{
	public static final int WIDTH = 300;
	public static final int HEIGHT = 200;
	public FirstWindow()
	{
		super();
		setSize(WIDTH,HEIGHT);
		JLabel myLabel = new JLabel("Please dont click button!");
		getContentPane().add(myLabel);
		WindowDestroyer listener = new WindowDestroyer();
		addWindowListener(listener);
	}
}
