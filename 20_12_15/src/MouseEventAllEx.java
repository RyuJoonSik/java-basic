import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEventAllEx extends JFrame {
	JLabel la = new JLabel("  Move Me");

	public MouseEventAllEx() {
		// TODO Auto-generated constructor stub
		setTitle("MouseListener와 MouseMotionListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();

		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);

		c.setLayout(null);
		la.setSize(80, 20);
		la.setLocation(100, 80);
		c.add(la);

		setSize(300, 200);
		setVisible(true);
	}

	class MyMouseListener implements MouseListener, MouseMotionListener {

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseDragged (" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseMoved (" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(), e.getY());
			setTitle("mousePressed(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			la.setLocation(e.getX(), e.getY());
			setTitle("mouseReleased(" + e.getX() + ", " + e.getY() + ")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			Component cmp = (Component) e.getSource();
			cmp.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			Component cmp = (Component) e.getSource();
			cmp.setBackground(Color.YELLOW);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventAllEx();
	}

}
