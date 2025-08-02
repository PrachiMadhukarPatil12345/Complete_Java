package CompleteJava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Arraylist {
    public static void main(String[] args){   
    	
//    	Collection<Integer> nums= new ArrayList<Integer>();
//  	Collection nums=new ArrayList();
    	List<Integer> nums=new ArrayList<Integer>();
    	Set s1= new HashSet();
    	s1.add(60);
    	s1.add(60);
    	s1.add(60);
    	System.out.println("Set" + s1);
    	
    	nums.add(6);
    	nums.add(5);
    	nums.add(8);
    	nums.add(2);
    	//nums.add("5");
    	
    	System.out.println(nums.get(2));
    	
    	System.out.println(nums.indexOf(2));
    	
//    	for(int n:nums)
//    	{
//    		System.out.println(nums);	
//    	}
    	for(Object n:nums)
    	{
    		int num=(Integer)n;
    		System.out.println(nums);	
    	}
    }
}