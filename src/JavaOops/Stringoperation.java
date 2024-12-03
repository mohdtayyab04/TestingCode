package JavaOops;

public class Stringoperation {

	public static void main(String[] args) {
		String s ="Hello java"; // H=0; e=1, l=2 l=3 o=4
		String a ="Hello phyton";
		String c = new String ("Hello Ruby");
		
		//ChartAt Method
		
		System.out.println(s.charAt(0));
		System.out.println(s.toCharArray());
		System.out.println(s.length());
		//to Lowercase
		System.out.println(s.toLowerCase());
		// to Upper Case
		System.out.println(s.toUpperCase());                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
		// replace method
		System.out.println(s.replace('a', 'i'));
		// replace sequence
		System.out.println(s.replace("java", "python"));
		//index of
		System.out.println(s.indexOf('j'));
		//substring
		System.out.println(s.substring(6));
		System.out.println(s.equals(s));
		System.out.println(s==a);
		System.out.println(s==c);
		System.out.println(s.concat("hello"));
		System.out.println(s.trim());
		//String[]b =a.split(s);
		//System.out.println(s(0));
		//System.out.println(s(1));
		System.out.println(s.isEmpty());
		s="";
		System.out.println(s.isEmpty());
		
	}

}
