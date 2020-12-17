class Point {
	private int x, y;

	public String toString() {
		return "Point(" + x + "," + y + ")";
	}

	public boolean equals(Point p) {
		if (x == p.x && y == p.y)
			return true;
		else
			return false;
	}

	Point() {
		this.x = this.y = 0;
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void set(int x, int y) {
		this.x = x;
		this.y = y;
	}

	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point {
	private String color;

	ColorPoint() {
	}

	ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	void setColor(String color) {
		this.color = color;
	}

	void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();

		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
