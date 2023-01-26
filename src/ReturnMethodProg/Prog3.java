package ReturnMethodProg;

public class Prog3 {
        
		// Static & non static return methods with parameter from same class.
		
	public static int m3(int a)
	{
		return a;
	}
	public int m4(int b)
	{
		return b;
	}
	
	public static void main(String[] args) {
		System.out.println(m3(30));
        Prog3 x=new Prog3();
        System.out.println(x.m4(40));
	} 

}
