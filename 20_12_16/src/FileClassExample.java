import java.io.File;

public class FileClassExample {

	public static void listDirectory(File dir) {
		System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");

		File[] subFiles = dir.listFiles();

		for (int i = 0; i < subFiles.length; i++) {
			File f = subFiles[i];
			long t = f.lastModified();
			System.out.print(f.getName());
			System.out.print("\t파일 크기 : " + f.length());
			System.out.printf("\t수정한 시간 : %tb %tb %ta %tT\n", t, t, t, t);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1 = new File("E:\\Study\\test.out");
		System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

		String res = "";
		if (f1.isFile())
			res = "파일";
		else if (f1.isDirectory())
			res = "디렉토리";
		System.out.println(f1.getPath() + "은 " + res + "입니다.");

		File f2 = new File("E:\\Study\\test");
		if (!f2.exists()) {
			f2.mkdir();
		}

		listDirectory(new File("E:\\Study"));
		f2.renameTo(new File("E:\\Study\\test2"));

		listDirectory(new File("E:\\Study"));

	}

}
