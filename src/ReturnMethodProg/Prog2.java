package ReturnMethodProg;

public class Prog2 {
	
	// Static & non static return methods call from diff class.
	
	public static void main(String[]args)
	{
		System.out.println(Prog1.m1());
		Prog1 b=new Prog1();
		System.out.println(b.m2());
	}

}
