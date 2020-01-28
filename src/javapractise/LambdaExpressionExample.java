package javapractise;


public class LambdaExpressionExample implements Drawable
{  
	
    int width=10;
    public static void main(String[] args)
    {  
    
  
//        //without lambda, Drawable implementation using anonymous class  
//        Drawable d =()->
//        {
//        		
//        		System.out.print(width);
//        
//        };
//    d.draw();
   }

	@Override
	public void draw() {
		System.out.print(width);
		
	}    
}  

interface Drawable  {


	public void draw();  


}

