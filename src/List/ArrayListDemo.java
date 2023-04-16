package List;

import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo
{
public static void main(String[] args)
{
ArrayList alist=new ArrayList();
alist.add("Vaishnavi");
alist.add(10);
alist.add(true);
alist.set(0,"Iswariya");
System.out.println(alist);
System.out.println(alist.size());
System.out.println(alist.contains(true));
}
}
