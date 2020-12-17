
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.*;

public class MenuEx extends JFrame {

	public MenuEx() {
		// TODO Auto-generated constructor stub
		setTitle("Menu 만들기 예제");
		createMenu();
		/*
		 * setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); Container c =
		 * getContentPane(); c.setLayout(new FlowLayout());
		 */
		setSize(250, 200);
		setVisible(true);
	}

	private void createMenu() {
		// TODO Auto-generated method stub
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");

		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));

		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));

		setJMenuBar(mb);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
