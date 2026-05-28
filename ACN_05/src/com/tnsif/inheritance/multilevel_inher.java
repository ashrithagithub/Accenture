package com.tnsif.inheritance;

class Software
{	
	void install()
	{
		System.out.println("Software is installing!");
	}
}

class Application extends Software
{
	void run() 
	{
		System.out.println("Apllication is running!");
	}
}

class MobileApp extends Application
{
	void platform()
	{
		System.out.println("App runs on the Mobile Platform.");
	}
}

public class multilevel_inher {

	public static void main(String[] args) {
		MobileApp m = new MobileApp();
		m.install();
		m.run();
		m.platform();

	}

}
