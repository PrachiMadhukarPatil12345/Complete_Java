package CompleteJava;

//Wrapper Classes

/*
int -> Integer
char -> Character
double -> Double
*/


public class WrapperClass {
    public static void main(String[] args){   
    	
    	int num=7;
//   	Integer num1=new Integer(8);
//    	Integer num1=8;
    	
//    	Integer num1=new Integer(num);     //boxing
    	Integer num1=num;                  // autoboxing
    	
    	int num2=num1.intValue();          // unboxing
    	
//    	System.out.println(num1);
    	System.out.println(num2);
    	
    	String str="12";
    	int num3=Integer.parseInt(str);
    	
    	// ways to convert int into String
    	
    	int ap=55;
    	String swString=Integer.toString(ap);
    	String s="PMP" + ap;
    	
    	System.out.println(ap);
    	System.out.println( num3+2);
    	System.out.println( s);
    }
}