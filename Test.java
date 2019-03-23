import java.util.Scanner;

public class Test{

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("欢迎使用酒店管理系统");

		Hotel h = new Hotel();

		h.print();

		System.out.print("请输入预定房间的编号：");

		String no = s.next();

		h.order(no);
	}
}