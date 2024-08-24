import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MyFrame extends JFrame{
		
	MyFrame()
	{
		this.setTitle("JFrame title goes here");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(800,600);
		this.setVisible(true);

		ImageIcon image = new ImageIcon("Java-Logo.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(123,50,250));
	}
}
