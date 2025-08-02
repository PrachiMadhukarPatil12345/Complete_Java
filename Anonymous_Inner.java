package CompleteJava;

class A6
{
	public void show() 
	{
		System.out.println("in A show");
	}
}
//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B Show");
//	}
//}

public class  Anonymous_Inner
{
    public static void main(String[] args)
    {
    	
    	//A obj=new B();
    	
    	A6 obj=new A6() 
    	
    	{
    		public void show()
    		{
    			System.out.println("in A new  show");
    		}
    	};
    	obj.show();
    }
}

// Behind the scenes, this:

/*
 * A6 obj = new A6() { public void show() { System.out.println("in A new show");
 * } };
 * 
 * is equivalent to:
 * 
 * class AnonymousSubClass extends A6 { public void show() {
 * System.out.println("in A new show"); } }
 */

/*
 * A6 obj = new AnonymousSubClass();
 * 
 * So when you call:
 * 
 * obj.show();
 * 
 * Java uses runtime polymorphism (dynamic method dispatch) to call the show()
 * method of the anonymous inner class, not the original A6 method.
 * 
 * 
 * ---
 * 
 * ✅ Output:
 * 
 * in A new show
 * 
 * 
 * ---
 * 
 * 📌 Summary:
 * 
 * obj is declared as A6 type.
 * 
 * But it points to an object of an anonymous subclass of A6.
 * 
 * Java calls the overridden method from the actual object’s class at runtime.
 * 
 * This is how anonymous inner classes + polymorphism work together.
 * 
 * 
 */