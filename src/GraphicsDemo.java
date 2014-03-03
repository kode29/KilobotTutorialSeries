import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;

public class GraphicsDemo extends JFrame {

	// The constructor follows:
	public GraphicsDemo() {
		setTitle("GraphicsDemo with Kilobolt");
		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// All classes need a main method, so we create that here too!
	public static void main(String[] args) {
		// We will create a GraphicsDemo object in the main method like so:
		// This should be familiar, similiar to the Random objects
		GraphicsDemo demo = new GraphicsDemo();
	}

	public void paint(Graphics g) {
		// set the color of g as White (necessary? Yes, we are declaring the current drawing color)
		g.setColor(Color.WHITE);

		// The first statement creates the background rectangle on which the
		// others are drawn.
		g.fillRect(0, 0, 800, 480); // from the TOP LEFT
		
		//This sets g to Blue
		g.setColor(Color.BLUE);

		// This will draw the outline of a Blue Rectangle, as the color of g
		// when this is called
		g.drawRect(60, 200, 100, 250);

		// This sets the color of g as Black
		g.setColor(Color.BLACK);

		// This will display a black string
		g.drawString("My name is James", 200, 400); // from the TOP LEFT
	}
}
