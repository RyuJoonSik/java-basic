import javax.swing.*;
import java.awt.*;

public class GraphicDrawLineEx extends JFrame {

	public GraphicDrawLineEx() {
		// TODO Auto-generated constructor stub
		setTitle("drawLine 사용 예시");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());

		setSize(200, 150);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.drawLine(20, 20, 100, 100);
			g.drawOval(20, 20, 80, 80);
			g.drawRect(20, 20, 80, 80);
			g.drawRoundRect(20, 20, 120, 80, 40, 60);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicDrawLineEx();
	}

}
