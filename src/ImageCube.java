import java.awt.*;
import javax.swing.*;
public class ImageCube extends JFrame{
	private ImageIcon image1;
	private JLabel label1;
	private ImageIcon image2;
	private JLabel label2;
	
	public ImageCube() {
		setLayout(new FlowLayout());
		image1 = new ImageIcon(getClass().getResource("cube.gif"));
		
		label1 = new JLabel(image1);
		add(label1);
	}
	public static void main(String[] args) {
		ImageCube cube = new ImageCube();
		cube.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cube.setVisible(true);
		cube.pack();
		cube.setTitle("Rubiks Cube");
	}
}

