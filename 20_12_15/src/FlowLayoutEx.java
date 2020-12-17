import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	public FlowLayoutEx() {
		setTitle("FloaLayout 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = getContentPane();

		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 40));

		contentPane.add(new JButton("add"));
		contentPane.add(new JButton("sub"));
		contentPane.add(new JButton("mul"));
		contentPane.add(new JButton("div"));
		contentPane.add(new JButton("Calcylate"));

		setSize(300, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutEx();
	}
}
