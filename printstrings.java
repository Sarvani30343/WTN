package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class printstrings{

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("string1");
		list.add("string2");
		list.add("string3");
		list.add("string4");
		
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		
		while (it.hasNext())
			System.out.println(it.next());
	}
}