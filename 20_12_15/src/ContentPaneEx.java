import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	ContentPaneEx() {
		setTitle("ContentPane과 JFrame 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* 프레임 윈도우를 닫으면 프로그램 종료 */
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());

		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cance"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("Ignore"));
		contentPane.add(new JButton("Ignore"));
		
		setSize(300,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ContentPaneEx();
	}
}
