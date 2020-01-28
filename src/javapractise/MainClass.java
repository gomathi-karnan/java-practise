package javapractise;

interface A
{
    static void firstMethod() {
        System.out.println("first");

	}
 
}
 
 class B implements A
{
	 static void firstMethod() {
	        System.out.println("SECOND");

		}
}
public class MainClass 
{
     public static void main(String[] args)
    {
       B.firstMethod();
       A.firstMethod();
    }
}