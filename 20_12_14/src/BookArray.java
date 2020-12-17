import java.util.Scanner;

class Book2 {
	String title;
	String author;

	public void show() {
		System.out.println(title + " " + author);
	}

	public Book2() {
		this("", "");
		System.out.println("생성자 호출됨");
	}

	public Book2(String t) {
		this(t, "작자미상");
	}

	public Book2(String t, String a) {
		this.title = t;
		this.author = a;
	}
}

public class BookArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Book[] book = new Book[2];

		for (int i = 0; i < book.length; i++) {
			System.out.println("제목>>");
			String title = scanner.nextLine();
			System.out.println("저자>>");
			String author = scanner.nextLine();
			book[i] = new Book(title, author);
		}

		for (int i = 0; i < book.length; i++)
			System.out.println("(" + book[i].title + ", " + book[i].author + ")");
	}
}
