import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame {

	public GraphicsDrawImageEx1() {
		// TODO Auto-generated constructor stub
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel3());

		setSize(300, 400);
		setVisible(true);
	}

	class MyPanel3 extends JPanel {
		ImageIcon icon = new ImageIcon("images/다운로드.jpg");
		Image img = icon.getImage();

		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawImage(img, 20, 20, this);
			//g.drawImage(img, 0, 0, getWidth(), getHeight(), this);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicsDrawImageEx1();
	}

}
