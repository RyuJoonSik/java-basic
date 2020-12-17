import javax.swing.*;
import java.awt.*;

public class GraphicsFillEx extends JFrame {

	public GraphicsFillEx() {
		// TODO Auto-generated constructor stub
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel2());

		setSize(100, 350);
		setVisible(true);
	}

	class MyPanel2 extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50);
			g.setColor(Color.blue);
			g.fillOval(10, 70, 50, 50);
			g.setColor(Color.GREEN);
			g.fillRoundRect(10, 130, 50, 50, 20, 20);
			g.setColor(Color.magenta);
			g.fillArc(10, 190, 50, 50, 0, 270);
			g.setColor(Color.orange);
			int[] x = { 30, 10, 30, 60, 100 };
			int[] y = { 250, 275, 300, 275, 100 };
			g.fillPolygon(x, y, 5);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsFillEx();
	}

}
