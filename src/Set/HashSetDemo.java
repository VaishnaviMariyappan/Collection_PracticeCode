package Set;

import java.util.*;
public class HashSetDemo 
{
public static void main(String[] args)
{
HashSet ll = new HashSet();
ll.add(23);
ll.add(990);
ll.add(234);
ll.add('c');
ll.add(234);
ll.add("Guptha");
ll.add("vaishnavi");
ll.add(9.0);
Object[] ob = ll.toArray();
for(Object o:ob)
{
System.out.println(o);
}
System.out.println(ll);
System.out.println("Total Size:"+ll.size());
LinkedHashSet lhs = new LinkedHashSet(ll);
System.out.println("After removing Duplicates:"+lhs);
}
}
//Notes
//To accept all the dataType by using------>Object[] object = ll.toArray();
 