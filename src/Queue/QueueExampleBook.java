package Queue;


	import java.util.*;  
	class Book
	{  
	int id;  
	String name,author,publisher;  
	public Book(int id, String name, String author, String publisher)
	{  
	this.id = id;  
	this.name = name;  
	this.author = author;  
	this.publisher = publisher;    
	}  
	}
	public class QueueExampleBook
	{
	public static void main(String[] args) 
	{  
	Queue<Book> queue=new LinkedList<Book>();  
	Book b1=new Book(121,"C","Yashwant Kanetkar","BPB");  
	Book b2=new Book(233,"Operating System","Galvin","Wiley");  
	Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill");  
	queue.add(b1);  
	queue.add(b2);  
	queue.add(b3);  
	System.out.println("Traversing the queue elements:");  
	for(Book b:queue)
	{  
	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" ");  
	}  
	queue.remove();  
	System.out.println("After removing one book record:");  
	for(Book b:queue)
	{  
	System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" ");  
	}  
	}  
}

