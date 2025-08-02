package CompleteJava;

/**
//super()
class A70
{
	public A70() 
	{
		super();
		System.out.println("in A");
	}
	public A70(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B70 extends A70
{
	public B70()
	{
//		super();
		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
		super(n);
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
		B obj=new B();
//		B obj=new B(5);
	}
}
**/


//this() 
class A70
{
	public A70() 
	{
		super();
		System.out.println("in A");
	}
	public A70(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B70 extends A70
{
	public B70()
	{
		super();
		System.out.println("in B");
	}
	public B70(int n)
	{
		this();  //call constructor of same class
		System.out.println("in B int");
	}
}
public class SuperMethod {
	public static void main(String[] args) 
	{
		
//		B obj=new B();
		B70 obj=new B70(5);
	}
}
