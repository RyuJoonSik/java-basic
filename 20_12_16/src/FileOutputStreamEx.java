import java.io.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[] = { 7, 51, 3, 4, -1, 24 };

		try {
			FileOutputStream fout = new FileOutputStream("E:\\Study\\test.out");
			/*
			 * for (int i = 0; i < b.length; i++) fout.write(b[i]); fout.close();
			 */
			fout.write(b);
		} catch (IOException e) {
		}
		System.out.println("E:\\Study\\test.out을 저장하였습니다.");
	}

}
