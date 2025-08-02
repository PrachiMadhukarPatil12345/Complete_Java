package CompleteJava;

//class Computer
//{
//	
//}
//class Laptop extends Computer
//{

//}

class A3
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B3 extends A3
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C3 extends A3
{
	
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}


public class DynamicMethodDispatch{
	public static void main(String[] args) {
//		A obj=new B();
//		obj.show();
		
		A3 obj=new A3();
		obj.show();
		
		obj=new B3();
		obj.show();
		
		
		obj=new C3();
		obj.show();
		
//		obj=new D();
		
//		Laptop obj1=new Laptop();
//		Computer obj1=new Laptop();
	
	}
}


