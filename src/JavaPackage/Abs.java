package JavaPackage;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public interface Abs {
	// interface by default public & abstract.
	public abstract void m4();
	// abstract method is a incomplete method & is allow in a Interface.& here abstract keyword is not compulsory.
 /* public void m1()
  {
	  
  }*/
  // Non static method with only body is not allow in Interface.
  
  public static void m2()
  {
	  System.out.println("hi");
  }
  // Static method is allow in Interface.
/* public Abs()
 {
	 
 }*/
 // Constructor consept not allowed in a interface. 
 public static void main(String[] args)
 {
	
} 
 // main is allow in a Interface.
  
}
