import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class VibratingFrame extends JFrame implements Runnable {
	Thread th;

	public VibratingFrame() {
		// TODO Auto-generated constructor stub
		setTitle("진동하는 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);

		setLocation(300, 300);
		setVisible(true);

		getContentPane().addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (!th.isAlive())
					return;
				th.interrupt();
			}
		});
		th = new Thread(this);
		th.start();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new VibratingFrame();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random r = new Random();
		while (true) {
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				return;
			}
			int x = getX() + r.nextInt() % 5;
			int y = getY() + r.nextInt() % 5;
			setLocation(x, y);
		}
	}

}
