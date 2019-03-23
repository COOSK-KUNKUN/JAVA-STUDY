public class Linked{
	Entry entry;

	Linked(){
		entry = new Entry(null, null);
	}

	static class Entry{
		Object data;
		Entry next;

		Entry(Object data, Entry next){
			this.data = data;
			this.next = next;
		}
	}
}