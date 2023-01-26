package ReturnMethodProg;

public class Prog4 {

	public static void main(String[] args) {
    
		// Static & non static return method with parameter call from diff class.
		
		System.out.println(Prog3.m3(5));
		Prog3 y=new Prog3();
		System.out.println(y.m4(55));
		
	}

}
