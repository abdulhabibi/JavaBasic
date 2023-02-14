package CollectionsPractice;
import java.util.ArrayList;
public class CollectionsPractice1 {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
		
		ArrayList<String> fn = new ArrayList<String>();
		ArrayList<String> ln = new ArrayList<String>();
		
		fn.add("Jack1");
		fn.add("Jack2");
		fn.add("Jack3");
		fn.add("Jack4");
		
		ln.add("Ma");
		
		
		data.add(fn);
		data.add(ln);
		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());
		data.add(new ArrayList<String>());
		
		
		
		
		
		data.get(3).add("example text");
		data.get(3).add("example text2");
		
		
		// remove jack3 data
		data.get(0).remove(2);
		
		
		// remove jack2 and add "jack 2.0" in that same location.
		// do it in one line
		//
		
//		data.get(0).set(1, "Jack 2.0");
		data.get(0).remove(1);
		data.get(0).add(1,"jack 20");
		
		System.out.println(data);
		
	}
	
	
}