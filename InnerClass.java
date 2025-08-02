package CompleteJava;

class A5
{
	int age;
	
	public void show()
	{
		System.out.println("in show");
	}
	
//	class B
//	{
//		public void config()
//		{
//			System.out.println("in config");
//		}
//	}
	
	static class B5
	{
		public void config()
		{
			System.out.println("in config");
		}
	}
}


public class  InnerClass{
    public static void main(String[] args) {
    	A5 obj=new A5();
    	obj.show();
    	
//    	A.B obj1=obj.new B();
//    	obj1.config();
    	
    	A5.B5 obj1=new A5.B5();
    	obj1.config();

    }
}
