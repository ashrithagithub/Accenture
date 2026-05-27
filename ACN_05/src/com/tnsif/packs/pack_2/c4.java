package com.tnsif.packs.pack_2;

import com.tnsif.packs.pack_1.c1;

public class c4 {
	
	public void test3() {
		
		c1 ob = new c1();
		//System.out.println(ob.a);       due to private Access Modifier
		//System.out.println(ob.b);       due to default AM
		//System.out.println(ob.c);       protected id accessed
		System.out.println(ob.d);
		
		//ob.show1();
		//ob.show2();
		//ob.show3();
		ob.show4();		
	}

}
