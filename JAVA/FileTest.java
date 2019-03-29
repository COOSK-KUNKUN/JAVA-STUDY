import java.util.*;
import java.io.*;

public class FileTest{
	public static void main(String[] args) {
		File f = new File("F:/libtcod-msvs-x64");
		method1(f);
	}

	public static void method1(File f){
		if (f.isFile()) {
			return;
		}
		File[] fs = f.listFiles();

		for (File subF:fs) {
			System.out.println(subF.getAbsolutePath());
			method1(subF);
		}
	}
}