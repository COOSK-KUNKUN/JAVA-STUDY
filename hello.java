import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.*;
public class hello {
	public static void main(String[] args) throws Exception{
		char c1 = '\'';

		System.out.println(c1);

		System.out.println("Hello World!");

		long l1 = 1000L;

		int i1 = (int)l1;

		char c = 'D';

		int n =5;

		Student stu1 = new Student();

		switch(c){
			case 'A':
				System.out.println("及格");
				break;

			default:
				System.out.println("不及格");
		}

		int i = 100;
		int j = i/10;

		switch(i){
			case 10:
				System.out.println('6');
				break;

			default:
				System.out.println('9');

		}

		for (int i2 = 1;i2 <= 10 ;i2++ ) {
			for (int j1 = 1;j1 <= i2 ;j1++ ) {
				System.out.println(i2 + "*" + j1 + "=" + (i2*j1));
			}
			System.out.println();
		}

		hello.sumInt(40, 40);

		hello.println("NMSL");

		int reValue = hello.m1(10,10);
		System.out.println("计算结果是：" + reValue);

		A.m2();

		int result = method1(n);
		System.out.println(result);

		System.out.println("id=" + stu1.id);

		Customer e = new Customer();
		e.setAge(-10);
		System.out.println(e.getAge());

		User u1 = new User();
		User u2 = new User(20);
		User u3 = new User("学生",24);

		System.out.print(u3.name);
		System.out.println(u3.age);

		Employee f = new Employee();
		f.m1();

		MyDate t1 = new MyDate();
		System.out.println(t1.year +"年" + t1.month + "月" + t1.day + "日");

		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1 == s2);

		//继承
		Sub s = new Sub();
		s.m1();
		s.m3();

		DebitAccount da = new DebitAccount();
		da.setActno("001");
		System.out.println(da.getActno());

		Animal a1 = new Animal();
		a1.eat();

		Cat c2 = new Cat();
		c2.eat();

		Animal a2 = new Cat();
		a2.eat();

		//抽象
		A a3 = new B();

		//接口
		CustomerService cs = new CustomerServiceImpl(); //多态
		cs.logout();

		String q1 = new String("ABC");
		String q2 = new String("ABC");

		System.out.println(q1 == q2);
		System.out.println(q1.equals(q2));

		// throw NoSuchFieldException

/*
		Scanner x = new Scanner(System.in);
		String userInput = x.next();
		System.out.println("你输入了：" + userInput);
*/

		Integer i5 = 123;
		Integer i6 = 123;

		System.out.println(i5.equals(i6));

		//time
		Date nowTime = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
		String strTime = sdf.format(nowTime);
		System.out.println(strTime);

		Calendar c3 = Calendar.getInstance();
		int i7 = c3.get(Calendar.DAY_OF_WEEK);
		System.out.println(i7);
		System.out.println(c3.get(Calendar.DAY_OF_MONTH));

		//
		Random r = new Random();

		for (int i8 = 0; i8<5 ; i8++ ) {
			System.out.println(r.nextInt(101));


		//
		Random r1 = new Random();
		int[] a = new int[5];
		int index = 0;
		while(index<5){
			System.out.println("=========");
			int temp = r.nextInt(6);
			if (temp!=0 && !contains(a, temp)) {
				a[index++] = temp;
			}
		}
		for(int d = 0 ; d<a.length ; d++ ) {
			System.out.println(a[d]);
		}


		Collection q = new ArrayList();

		q.add(100);
		q.add(3.14);
		q.add(false);

/*
		for (Iterator it = q.Iterator(); it.hasNext() ; ) {
			Object o0 = it.next();
			System.out.println(o0);
		}

*/

		//
		List l = new ArrayList();

		l.add(1);
		l.add(2);
		l.add(3);

		Iterator it = l.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

		//


	}

}

	public static void sumInt(int a, int b){
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

	public static void println(String NMSL){
		System.out.println(NMSL);
	}

	public static int m1(int a, int b){
		int c = a + b;
		return c;
	}

	public static  int method1(int n){
		int sum = 0;
		for (int i = 1; i<n;i++ ) {
			sum += i;
		}
		return sum;

	}

	public static boolean contains(int[] a, int temp){

		for (int i9 = 0; i9<a.length ;i9++ ) {
			if (a[i9] == temp) {
				return true;
			}
		}

		return false;
	}

}

class A{
	public static void m2(){
		System.out.println("m2 method!");
	}

}

class Student{
    public static String id = "ID_001";

    public static String name = "zhang san";

    public static String grade = "3";

    public static String age = "12";

}

class Customer{
	public int age;

	public void setAge(int _age){
		if (_age<0 || _age>100) {
			System.out.println("Error");
			return;
		}
		age = _age;
	}

	public int getAge(){

		return age;
	}

	public abstract class A{
		A(){
			System.out.println("A....");
		}
	}


}

class User{

	String name;
	int age;

	User(){

		System.out.println("无效测试");
	}

	User(int _age){
		age = _age;
	}

	User(String _name){
		name = _name;
	}

	User(String _name, int _age){
		name = _name;
		age = _age;
	}
}

class Employee{
		public void  m1(){
		this.m2();
	}

	public void  m2(){
		System.out.println("测试m2");
	}
}

class MyDate{
	int year;
	int month;
	int day;

	MyDate(){
		this(1970, 1, 1);
	}

	MyDate(int _year, int _month, int _day){
		year =_year;
		month = _month;
		day = _day;
	}
}

class B extends A{

	B(){
		super();
		System.out.println("B....");
	}

}



//
/*k

*/


