package com.shiva.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	void add(int x,int y)
	{
		System.out.println("Addition of two numbers :"+(x+y));
	}
    public static void main( String[] args )
    {
    	App demo=new App();
    	demo.add(100,200);
        System.out.println( "Hello World!" );
    }
}
