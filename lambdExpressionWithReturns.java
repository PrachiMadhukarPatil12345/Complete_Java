package CompleteJava;

//FunctionalInterface
interface Ap
{
	int add(int i, int j);
}


public class lambdExpressionWithReturns {
    public static void main(String[] args) {
//    	
//   	A obj=new A()
//   	{
//   		public int add(int i, int j)
//   		{
//   			return i+j;
//   		}
//   	};
    	
    	Ap obj=(i,j) -> i+j;
   	
   	int result=obj.add(5, 4);
   	System.out.println(result);
    }
}