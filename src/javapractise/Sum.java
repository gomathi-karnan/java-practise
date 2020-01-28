package javapractise;

import java.util.HashMap;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,5,-3,1,1};
HashMap map=new HashMap();
for(int i=0;i<=arr.length-1;i++)
	{
	for(int j=i+1;j<=arr.length-1;j++)
	{
		if(arr[i]+arr[j]==2)
		{
		map.put(arr[i],arr[j]);
		}
	}
	}
//System.out.println("the pair which makes sum of 2 are");
//System.out.println(map);
System.out.println(Math.random());
	}


}
