import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Point;

public class GraphicsDrawOvalMouseEx extends JFrame {

	public GraphicsDrawOvalMouseEx() {
		// TODO Auto-generated constructor stub
		setTitle("마우스 드래깅으로 타원 그리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel4());
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawOvalMouseEx();
	}

	class MyPanel4 extends JPanel {
		Point start = null;
		Point end = null;

		public MyPanel4() {
			MyMouseListener listener = new MyMouseListener();

			addMouseListener(listener);
			addMouseMotionListener(listener);
		}

		class MyMouseListener extends MouseAdapter {
			public void mousePressed(MouseEvent e) {
				start = e.getPoint();
			}

			public void mouseDragged(MouseEvent e) {
				end = e.getPoint();
				repaint();
			}
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if (start == null)
				return;

			g.setColor(Color.blue);
			int x = Math.min(start.x, end.y);
			int y = Math.min(start.y, end.x);
			int width = Math.abs(start.x - end.x);
			int height = Math.abs(start.y - end.y);
			g.drawOval(x, y, width, height);
		}
	}
}
