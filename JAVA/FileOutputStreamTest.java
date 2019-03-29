import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileOutputStreamTest{
 	public static void main(String[] args) {
 		FileOutputStream fos = null;

 		try{
 			fos = new FileOutputStream("temp02.txt", true);
 			String msg = "HelloWorld!";
 			byte[] bytes = msg.getBytes();
 			fos.write(bytes);

 		}catch(Exception e){
 			e.printStackTrace();

 		}finally{
 			if (fos!=null) {
 				try{
 					fos.close();
 				}catch(Exception e){
 					e.printStackTrace();
 				}
 			}
 		}
 	}
 }