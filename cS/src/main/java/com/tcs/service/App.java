package com.tcs.service;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        App obj=new App();
        obj.hospitalBill(41, 74);
        obj.hospitalDetails("I love ","Doctors.");
        System.out.println(obj.hospitalBill(41, 74));
    }
    public int hospitalBill(int x, int y)
    {
    	return x+y;
    }
    
    public String hospitalDetails(String s,String s1)
    {
     String s2=new String(s);
      String hospitalDetails=s2.concat(s1);
       return hospitalDetails;
    		   
    	
    }
}
