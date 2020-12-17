
public class SynchronizedEx {

	public SynchronizedEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharePrinter p = new SharePrinter();
		String[] engText = { "Wise men say,", "only folls rush in", "But I can't help" };
		String[] korText = { "동해물과 백두산이 마르고 닳도록,", "하느님이 보우하사 우리 나라 만세", "무궁화 삼천리 화려강산" };

		Thread th1 = new WorkerThread(p, engText);
		Thread th2 = new WorkerThread(p, korText);
		th1.start();
		th2.start();
	}

}

class SharePrinter {
	synchronized void print(String text) {
		for (int i = 0; i < text.length(); i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
}

class WorkerThread extends Thread {
	SharePrinter p;
	String[] text;

	WorkerThread(SharePrinter p, String[] text) {
		this.p = p;
		this.text = text;
	}

	public void run() {
		for (int i = 0; i < text.length; i++)
			p.print(text[i]);
	}
}