package CompleteJava;

//class Launch
//{
//	A obj=new A();
//	System.out.println(obj.marks);
//}




//package other;

 class AA{
	int marks=6;
//	protected marks=6;
	public void show()
	{
		
	}
}




 class BB
{
//	private int marks;
	int marks;
	
}




class CC extends AA
{
	public void abc()
	{
		System.out.println(marks);
	}
}

public class AccessModifiers{
	public static void main(String[] args) {
   
	AA obj=new AA();
	BB obj1=new BB();
	
	System.out.println(obj.marks);
	//obj.show();
	
	
	System.out.println(obj1.marks);
	
	}
}


