package CompleteJava;

public class StringBuffer1
{

	public static void main(String[] args)
	{
		StringBuffer sb= new StringBuffer("Prachi"); // thread Safe
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Ppatil");
		sb.deleteCharAt(6);
		sb.insert(9, "g");
		sb.ensureCapacity(50);
		System.out.println("ghbjgh");
		System.out.println(sb);
		
		System.out.println("capacity" +sb.capacity());
	}
	
	

}
