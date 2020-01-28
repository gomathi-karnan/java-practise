package javapractise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

interface Ainterface 
{

    //private int j=10;

}

 abstract class Binterface {

    public static final int i=20;

}


 class Demo2
 {
    public double myMethod(int num1, int num2)
    {
       System.out.println("First myMethod of class Demo");
       return num1+num2;
    }
    public int myMethod(float var1, int var2)
    {
       System.out.println("Second myMethod of class Demo");
       return var1-var2;
    }
 }
public class demo  
{
	 public  int j=30;   

	public static void main(String[] args) 
	{

//		Ainterface A=new demo();
//		        System.out.println(A.j);
//		        int b[]= {2,3,7,6};
//		  for(int a:b)
//		  {
//			  
//		  }
		
				  
		 List<String> list = new ArrayList<>();
		 list.add("Go");
		 list.add("mathi");
		 list.add("Anj");
		 
		 list.forEach(new Consumer<String>(){

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				if(t.equalsIgnoreCase("go")) {
					int index = list.indexOf(t);
					list.remove(index);
				}
			}
			 
		 });
		 System.out.println(list);

}
	
}
