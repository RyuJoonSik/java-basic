import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboActionEx extends JFrame {
	String[] fruits = { "apple", "banana", "kiwi" };

	ImageIcon[] images = { new ImageIcon("images/btn1.jpg"), new ImageIcon("images/btn2.png"),
			new ImageIcon("images/btn3.png") };
	JLabel imgLabel = new JLabel(images[0]);

	public ComboActionEx() {
		// TODO Auto-generated constructor stub
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox combo = new JComboBox(fruits);
		c.add(combo);
		c.add(imgLabel);

		combo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox cb = (JComboBox) e.getSource();

				int index = cb.getSelectedIndex();

				imgLabel.setIcon(images[index]);
			}
		});

		setSize(300, 250);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboActionEx();
	}

}
