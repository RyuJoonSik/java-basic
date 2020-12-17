import javax.swing.*;
import java.awt.*;

class TimerRunnable implements Runnable {
	JLabel timerLabel;

	public TimerRunnable(JLabel timerLabel) {
		// TODO Auto-generated constructor stub
		this.timerLabel = timerLabel;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = 0;
		while (true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}

public class RunnableTimerEx extends JFrame {

	public RunnableTimerEx() {
		// TODO Auto-generated constructor stub
		setTitle("Runnalbe을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);

		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);

		setSize(250, 150);
		setVisible(true);

		th.start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RunnableTimerEx();
	}

}
