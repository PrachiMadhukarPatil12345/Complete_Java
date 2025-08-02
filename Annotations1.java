package CompleteJava;

@Deprecated
class Ab
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in show A");
	}
}

class Ba extends Ab
{
	@Override
//	public void showTheDataWhichBelongToThisClass()
	public void showTheDataWhichBelongsToThisClass()

	{
		System.out.println("in show B");
	}
}

public class Annotations1 {
    public static void main(String[] args) {
    	
    	Ba obj=new Ba();
    	obj.showTheDataWhichBelongsToThisClass();
    	
    }
}
