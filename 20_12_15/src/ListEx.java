import javax.swing.*;
import java.awt.*;

public class ListEx extends JFrame {
	String[] fruits = { "apple", "banana", "kiwi", "mango", "pear", "peach", "berry", "strawberry", "blackberry" };

	ImageIcon[] images = { new ImageIcon("images/btn1.jpg"), new ImageIcon("images/btn2.png"),
			new ImageIcon("images/btn3.png"), new ImageIcon("images/btn1.png"), };

	public ListEx() {
		// TODO Auto-generated constructor stub
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JList imageList = new JList(fruits);
		imageList.setListData(images);
		c.add(imageList);

		JList scrollList = new JList(fruits);
		c.add(new JScrollPane(scrollList));

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListEx();
	}

}
