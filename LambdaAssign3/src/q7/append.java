package q7;

import java.util.HashMap;
import java.util.Map;

public class append {
	static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map m=new HashMap();
		StringBuilder stb=new StringBuilder();

		m.put(1, "Pooja");
		m.put(2, "Varsha");
		m.put(3, "Shital");
		m.put(4, "Vaish");
		int l=m.size();
		s=m.toString();
		System.out.println(s);
		for(int i=0;i<l;i++)
		{
			stb.append(m.get(i+1));
		}
		System.out.println(stb);

		
	}

}
