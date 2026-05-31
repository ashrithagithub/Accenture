package com.tnsif.tasks;

//Library Book Tracking

class Book
{
	int bookId;
	String Name;
	
	Book(int bookId, String Name)
	{
		this.bookId = bookId;
		this.Name = Name;
	}
	
	void display() {
		System.out.println(bookId + " "+ Name);
	}
}

public class LibraryManage {

	public static void main(String[] args) {
		Book b = new Book(1, "Python");
		Book b1 = new Book(2, "Java");
		Book b2 = new Book(3, "HTML");
		Book b3 = new Book(4, "CSS");
		
		b.display();
		b1.display();
		b2.display();
		b3.display();

	}

}
