package javapractise;

public class mergetwostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello";
		String s2="bye";
		String s3="";
		if ((s1!= null) && (s2!= null))
		{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
for(int i=1; i<=c1.length-1;i++)
{
	for(int j=i; j<=i;j++)
	{
		s3=s3+c1[i]+c2[j];
	}
}
		}
		System.out.print(s3);

	}

}
