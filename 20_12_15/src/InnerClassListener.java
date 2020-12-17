import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InnerClassListener extends JFrame {
	InnerClassListener() {
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener2());
		c.add(btn);

		setSize(250, 120);
		setVisible(true);

	}

	private class MyActionListener2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JButton b = (JButton) e.getSource();
			if (b.getText().equals("Action")) {
				b.setText("액션");
			} else {
				b.setText("Action");
			}
			setTitle(b.getText());
		}
	}

	public static void main(String[] args) {
		new InnerClassListener();
	}
}
