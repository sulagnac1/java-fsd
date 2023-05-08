package demo;

public class String_convert {
	
	public static void main(String[] args) {
		
		String str = "Hi";
		
		//Creating StringBuffer 
		
		StringBuffer sb = new StringBuffer();
		
		// Converting String to StringBuffer
		
		sb.append(str);
		System.out.println(sb);
		
		// Converting String to StringBuffer using insert() method
	
		String str1 = "Hello";
		
		StringBuffer sb1 = new StringBuffer("  world");
		
		// Using insert() method
		
		sb1.insert(1,str1);
		System.out.println(sb1);
		
		// Converting String to StringBuilder
		// Creating string list
		
		String strs[] = {"I", "am", "Sulagna"};
		
		// Creating StringBuilder 
		
		StringBuilder sb2 = new StringBuilder();
		
		sb2.append(strs[0]);
		sb2.append(" " + strs[1]);
		sb2.append(" " +strs[2]);
		sb2.append(" " +strs[2]);

		System.out.println(sb2);
	}
}


