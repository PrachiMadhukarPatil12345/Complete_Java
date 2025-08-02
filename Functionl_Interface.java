package CompleteJava;

@FunctionalInterface
interface A8
{
	void show();
//	void run();
}
//class B implements A
//{
//	public void show()
//	{
//		System.out.println("in Show");
//	}
//}


public class Functionl_Interface {
    public static void main(String[] args) {
    	
    	A8 obj=new A8() // internally it is ->  Annonymous obj=new A8;
    	{    	
    		public void show()
    		{
    			System.out.println("in Show");
    		}
    	};
 //   	A obj=new A();
 //   	A obj=new B();
    	obj.show(); // objct of Annonymous intrnally
    }
}