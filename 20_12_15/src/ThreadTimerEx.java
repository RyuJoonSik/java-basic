import java.awt.*;
import javax.swing.*;

class TimerThread extends Thread {
	JLabel timerLabel;

	public TimerThread(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}

	public void run() {
		int n = 0;
		while (true) {
			this.timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class ThreadTimerEx extends JFrame {

	public ThreadTimerEx() {
		// TODO Auto-generated constructor stub
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);

		TimerThread th = new TimerThread(timerLabel);

		setSize(250, 150);
		setVisible(true);

		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerEx();
	}
	
}
