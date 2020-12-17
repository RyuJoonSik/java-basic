import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame {

	public ButtonImageEx() {
		// TODO Auto-generated constructor stub
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ImageIcon normalIcon = new ImageIcon("images/btn1.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/btn2.png");
		ImageIcon pressedIcon = new ImageIcon("images/btn3.png");

		JButton btn = new JButton("Call~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		c.add(btn);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonImageEx();
	}

}
