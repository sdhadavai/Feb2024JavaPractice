package javasessions;

public class Book {
	
	String title;
	String author;
	int pageCount;
	

	public static void main(String[] args) {
		
		int totalBooks=0;
		
		Book b1 = new Book();
		b1.title="Softwate Testing";
		b1.author="Peter";
		b1.pageCount=100;
		totalBooks++;
		
		Book b2 = new Book();
		b2.title="Java";
		b2.author="Sun Micro";
		b2.pageCount=400;
		totalBooks++;
		
		Book b3 = new Book();
		b3.title="Git";
		b3.author="Sai";
		b3.pageCount=300;
		totalBooks++;
		
		System.out.println("Book Name: " + b1.title + " ; " + "Book Author: "+ b1.author + " ; " + "Page Count is: " + b1.pageCount);
		System.out.println("Book Name: " + b2.title + " ; " + "Book Author: "+ b2.author + " ; " + "Page Count is: " + b2.pageCount);
		System.out.println("Book Name: " + b3.title + " ; " + "Book Author: "+ b3.author + " ; " + "Page Count is: " + b3.pageCount);
		System.out.println("Total No of Books:" + totalBooks);
		b1.pageCount=200;
		System.out.println("-------Updated details-------");
		System.out.println("Book Name: " + b2.title + " ; " + "Book Author: "+ b2.author + " ; " + "Page Count is: " + b2.pageCount);
		
		Book b4 = new Book();
		b4.title=".Net";
		b4.author="Sri";
		b4.pageCount=300;
		totalBooks++;
		
		System.out.println("-------New book details-------");
		System.out.println("Book Name: " + b4.title + " ; " + "Book Author: "+ b4.author + " ; " + "Page Count is: " + b4.pageCount);
		System.out.println("Total No of Books:" + totalBooks);
		
		
		

	}

}
