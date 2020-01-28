package javapractise;

import java.util.Arrays;

public class StringTest {
	public static void main(String[] args) 
	{
		String arr[]= {"one","two","three"};
		String arr1=Arrays.toString(arr);
		//System.out.print(arr1);
		String gom="gomathi"+4;
		String s=gom+"a"+"j";
		String str = "Geeks "
	             + "for"
	             + "Geeks"; 
		//str.replaceFirst(0, "a");
	
	int gomhash=	gom.hashCode();
	//System.out.println(gomhash);
	int shash=	s.hashCode();
	System.out.println(shash);
	StringBuilder ss= new StringBuilder(str);
	ss.reverse();
	//System.out.println(ss.replace(0, 1, "a"));
	System.out.println(str.compareTo(gom));
	System.out.println(str.equals(gom));
char[] c= {'z','l'};
String sw=new String(c);
Arrays.toString(c);


	
	}
}
