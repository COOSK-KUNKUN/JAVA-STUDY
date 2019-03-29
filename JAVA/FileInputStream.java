import java.io.*;

public class FileInputStreamTest{
	public static void main(String[] args) throws Exception{

		FileInputStream fis = new FileInputStream("temp01");

		while(true){
			int temp = fis.read();
			if (temp == -1)break;
			System.out.println(temp);

		}
		fis.close();
	}
}