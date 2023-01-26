package ReturnMethodProg;

public class Prog1 {
	 
	// Static & non static return method call from same class.
	
	public static int m1()         // return method mde apn void cha use nhi kru shakt cz void cant return anything.
	{                              // ani void delete klyanantr tithe data type dyaycha (return method mde jya type chi value ghetliye tya type cha)
		return 10;
	}
	public int m2()
	{
		return 20;
	}

	public static void main(String[] args) {
        System.out.println(m1());
        Prog1 a=new Prog1();
        System.out.println(a.m2());
        		
	}

}
