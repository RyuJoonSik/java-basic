
public class Book {
	String title;
	String author;

	public void show() {
		System.out.println(title + " " + author);
	}

	public Book() {
		this("","");
		System.out.println("생성자 호출됨");
	}

	public Book(String t) {
		this(t, "작자미상");
	}

	public Book(String t, String a) {
		this.title = t;
		this.author = a;
	}

	public static void main(String[] args) {
		Book javabook = new Book("Java", "황기태");
		Book emptyBook = new Book();
		Book bible = new Book("Bible");

		bible.show();
	}
}
