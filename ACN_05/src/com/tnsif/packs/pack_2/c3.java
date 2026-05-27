package com.tnsif.packs.pack_2;

//this package is imported by default as we are using different package 
import com.tnsif.packs.pack_1.c1;

//to access protected in another package we need to use extends
public class c3 extends c1{

//method to test
	public void test2()
	{
		c3 ob2 = new c3();
		//System.out.println(ob2.a);       due to private Access Modifier, can't access private AM in diff class
		//System.out.println(ob2.b);       due to default AM, can't access default AM in diff package
		System.out.println(ob2.c);
		System.out.println(ob2.d);
		
		//ob2.show1();
		//ob2.show2();
		ob2.show3();
		ob2.show4();
		
	}
	

}
