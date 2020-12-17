import javax.swing.*;
import java.awt.*;

public class RadioButtonEx extends JFrame {

	public RadioButtonEx() {
		// TODO Auto-generated constructor stub
		setTitle("라디오버튼 만들기 예시");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		ButtonGroup g = new ButtonGroup();

		JRadioButton apple = new JRadioButton("사과");
		JRadioButton pear = new JRadioButton("배", true);
		JRadioButton cherry = new JRadioButton("체리");

		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);

		setSize(250, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonEx();
	}

}
