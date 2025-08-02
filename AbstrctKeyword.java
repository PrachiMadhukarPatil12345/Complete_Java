package CompleteJava;

abstract class Car
{
//	public void drive()
//	{
//
//	}
	
	public abstract void drive();
	public abstract void fly();
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

abstract class WagnoR extends Car
{
	/*
	 * public void fly() { System.out.println("Flying... from ab class"); }
	 */
	public void drive()
	{
		System.out.println("Driving...");
	}
}

class UpdateWagnoR extends WagnoR   //concrete class
{
	// it already inherits drive method from its parent , no need to implement again
	// so, it implements all abstract methods from base class
	// class remin btract abstract if it does not imlement all method.
	
	public void fly()
	{
		//super.fly();
		System.out.println("flying...");
	}
}

public class  AbstrctKeyword{
    public static void main(String[] args) {

 //  	Car obj=new Car();
  //  	Car obj=new WagnoR();
    	Car obj=new UpdateWagnoR();
    	obj.drive();
    	obj.playMusic();
    	obj.fly();
    }
}