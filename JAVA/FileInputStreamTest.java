import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamTest {

	private static final int SIZE = 4096;

	public static void main(String[] args) throws IOException {

		/*
		 * 将已有文件的数据读取出来
		 * 既然是读，使用InputStream
		 * 而且是要操作文件。FileInputStream
		 * 
		 */

		//为了确保文件一定在之前是存在的，将字符串路径封装成File对象
		File file = new File("temp01.txt");
		if(!file.exists()){
			throw new RuntimeException("要读取的文件不存在");
		}

		//创建文件字节读取流对象时，必须明确与之关联的数据源。
		FileInputStream fis = new FileInputStream(file);


		System.out.println(fis.read());
		//调用读取流对象的读取方法
		//1.read()返回的是读取到的字节
		//2.read(byte[] b)返回的是读取到的字节个数

		//1.
//		int by=0;
//		while((by=fis.read())!=-1){
//			System.out.println(by);
//		}

		//2.
//		byte[] buf = new byte[3];
//		int len = fis.read(buf);//len记录的是往字节数组里存储的字节个数
//		System.out.println(len+"...."+Arrays.toString(buf));//只是转成了字符串的表现形式
//		System.out.println(len+"...."+new String(buf,0,len));//转成字符串
//
//		int len1 = fis.read(buf);
//		System.out.println(len1+"...."+new String(buf,0,len1));

		//创建一个字节数组，定义len记录长度
		int len = 0;
		byte[] buf = new byte[SIZE];
		while((len=fis.read(buf))!=-1){
			System.out.println(new String(buf,0,len));
		}





		//关资源
		fis.close();
	}

}


