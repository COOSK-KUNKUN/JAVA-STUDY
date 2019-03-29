public class OuterClass{

	private static String s1 = "A";//

	private String s2 = "B";

	private static void m1(){
		System.out.println("static m1");
	}

	private static void m2(){
		System.out.println("m2 method ");
	}

	static class InnerClass{

		public static void m3(){
			System.out.println(s1);//
			m1();

		}

		public void m4(){
			System.out.println(s1);
			m1();

		}
	}

	public static void main(String[] args) {
		OuterClass.InnerClass.m3();

		InnerClass inner = new OuterClass.InnerClass();
		inner.m4();

	}

}