package CompleteJava;

class A71 extends Object
{
	int num= 1;
}

class B71 extends A71
{
	int num=2;
	public int getValue()
	{
		int num=3;
//		return this.num;
		return super.num;
		//return num();
	}
}


public class this_VSsuperKeyword
{
	public static void main(String a[]) 
	{
		B71 obj=new B71();
//		System.out.println(obj.num);
		System.out.println(obj.getValue());
	}
}