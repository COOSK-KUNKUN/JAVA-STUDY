import java.util.*;


public class SetTest{
	public static void main(String[] args) {
		Set s = new HashSet();

		s.add(1);
		s.add(1);
		s.add(100);
		s.add(85);
		s.add(88);

		Iterator it = s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}


