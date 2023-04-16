package List;

import java.util.*;
public class ArrayListBook
{
public static void main(String[] args)
{
ArrayList<String> alist = new ArrayList<>();
	alist.add("C-Programming");
	alist.add("JavaProgramming");
	alist.add("SE");
	alist.add("Operating System");
	alist.add("Oracle");
	Collections.sort(alist);
	for(String book:alist)
	{
	System.out.println("Sorting Strings into Ascending Order");
	System.out.println(book);
	
}
}
}

