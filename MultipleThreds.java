package CompleteJava;

/*
 * Threads:- Multiple threads run at same time in a code. This is known as
 * Multithreading.
 * 
 * - A thread is a smallest unit to work with. (individual task) - They can run
 * parallely. - Multiple threads can share resources.
 */

class A31 extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hi");
		}
	}
}

class B31 extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println("Hello");
		}
	}
}

public class MultipleThreds {
    public static void main(String[] args) throws NumberFormatException {   
    	
    	A31 obj1=new A31();
    	B31 obj2=new B31();
    	
//    	obj1.show();
//    	obj2.show();
    	
    	obj1.start();
    	obj2.start();
    }
    
}