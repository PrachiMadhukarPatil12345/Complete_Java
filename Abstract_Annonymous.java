package CompleteJava;

abstract class A7
{
	public abstract void show();
	public abstract void config();

}

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("in B show");
//	}
//}


public class  Abstract_Annonymous{
    public static void main(String[] args) {
    	
//    	A obj=new B();
    	
    	A7 obj=new A7()   // is eqivalent to [   A7 obj=new Annonumous();  ]
    	{
    		public void show()
    		{
    			System.out.println("in new show");
    		}

			@Override
			public void config() {
				
				System.out.println("in new config");
			}
    	};
    	obj.show();
    	obj.config();
    	
    }
}