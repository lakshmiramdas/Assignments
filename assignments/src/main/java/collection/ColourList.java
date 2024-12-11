package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColourList {

	public static void main(String[] args) {
		List<String> obj=new ArrayList<String>();
		obj.add("Red");
		obj.add("Orange");
		obj.add("Yellow");
		obj.add("Green");
		obj.add("Blue");
		obj.add("Indigo");
		obj.add("Violet");
		System.out.println(obj);
		obj.get(1);
		System.out.println(obj.get(1));
		Iterator<String> it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		obj.remove(2);
		System.out.println(obj);
		obj.contains("Indigo");
		System.out.println(obj.contains("Indigo"));
		// TODO Auto-generated method stub

	}

}
