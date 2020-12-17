import javax.swing.*;

public class MyFrame extends JFrame {
	MyFrame() {
		setTitle("300X300 스윙 프레임 만들기");
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		/* 스윙 프레임이 생성될 때 자바 플랫폼은 이벤트 처리 스레드를 만들어
		 * 작동시키기 때문에 main()이 종료되어도 응용 프로그램을 종료시키지 않는다.*/
	}
}
