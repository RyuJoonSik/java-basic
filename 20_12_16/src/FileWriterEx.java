import java.io.*;

public class FileWriterEx {

	public FileWriterEx() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fout = null;
		int c;
		try {
			fout = new FileWriter("E:\\Study\\test.txt");

			while ((c = in.read()) != -1) {
				fout.write(c);
			}
			in.close();
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}

}
