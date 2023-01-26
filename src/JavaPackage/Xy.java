package JavaPackage;

public class Xy {              // reverse string
	
	public static void main(String[] args) {
		
		  String str="I am graduate";
		  String str1=" ";
				  for(int i=str.length()-1;i>=0;i--)
				  { 
				  	char ch=str.charAt(i);
				  	str1=str1+ch;
				  }
				  System.out.println(str1);

		
	}
	

}
