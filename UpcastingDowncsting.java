package CompleteJava;

class A4
{
	public void show1()
	{
		System.out.println("in A show");
	}
}
class B4 extends A4
{
	public void show2()
	{
		System.out.println("in show B");
	}
}

public class  UpcastingDowncsting{
    public static void main(String[] args) {

//    	double d=4.5;
//    	int i=(int)d;
//    	
//    	System.out.println(i);
    	
//    	A obj= new A();
//    	A obj=(A) new B();   //upcasting
//    	obj.show1();
    	
    	A4 obj=new B4();
    	obj.show1();
    	
    	B4 obj1=(B4)obj;
    	obj1.show2();
    }
}
