package CompleteJava;

class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int a)
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class Encapsulation_getterSetter {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		Human obj1=new Human();
		
		obj.SetAge(30);
		obj.setName("Reddy");
		
		obj1.SetAge(11);
		obj1.setName("Navin");
		
		System.out.println(obj.getName()+" : "+obj.getAge());
		System.out.println(obj1.getName()+" : "+obj1.getAge());
	
	}
}