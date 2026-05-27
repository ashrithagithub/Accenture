package com.tnsif.packs.pack_1;

import com.tnsif.packs.pack_2.c3;
import com.tnsif.packs.pack_2.c4;

public class executes {

	public static void main(String[] args) {
		
		System.out.println("-----------c1");
		c1 ob = new c1();
		System.out.println(ob.b);
		System.out.println(ob.c);
		System.out.println(ob.d);
		
		//ob.show1();
		ob.show2();
		ob.show3();
		ob.show4();
		
		System.out.println("-----------c2");
		c2 ob1 = new c2();
		ob1.test1();
		
		System.out.println("-----------c3");
		c3 ob2 = new c3();
		ob2.test2();
		
		System.out.println("-----------c4");
		c4 ob3 = new c4();
		ob3.test3();

	}

}
