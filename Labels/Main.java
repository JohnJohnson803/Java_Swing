import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main{
	public static void main(String[] args)
	{
		//JLabel = a GUI display area for a string of text, an image, or both

		JLabel label = new JLabel();
		label.setText("Bro, do you even code?"); //Set text of label

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1920,1080);
		frame.setVisible(true);
		frame.add(label);
	}

}
