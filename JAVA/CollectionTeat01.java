import java.util.*;

public class CollectionTeat01{

	public static void main(String[] args){

		Collection c = new ArrayList();

		c.add(1);
		c.add(new Integer(100));

		Object o = new Object();
		c.add(o);

		Custonmer cus = new Custonmer("JACK", 20);
		c.add(cus);

		System.out.println(c.size());

		Object[] objs = c.toArray();
		for (int i=0; i< objs.length; i++ ) {
			System.out.println(objs[i]);
		}
	}
}

class Custonmer{
	String name;
	int age;
	Custonmer(String name, int age){
		this.name = name;
		this.age = age;
	}
}