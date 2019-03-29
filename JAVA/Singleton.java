
public class Singleton{ //饥饿单例

	private static Singleton s;

	private Singleton(){}

	public static Singleton getInstance(){

		if (s == null) {
			s = new Singleton();
		}
		return s;
	}

}
