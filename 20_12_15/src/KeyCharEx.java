import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharEx extends JFrame {
	JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다.");

	KeyCharEx() {
		// TODO Auto-generated constructor stub
		super("KeyListener의 문자 키 입력 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		//this.setAutoRequestFocus(false);
		this.setFocusable(false);
		setSize(250, 150);
		setVisible(true);
		c.requestFocus();
	}

	class MyKeyListener implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);

			switch (e.getKeyChar()) {
			case '\n':
				la.setText("r = " + r + ", g = " + g + ", b = " + b);
				getContentPane().setBackground(new Color(r, g, b));
				break;
				
			case 'q':
				System.exit(0);
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCharEx();
	}
}
