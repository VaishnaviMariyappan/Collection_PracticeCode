package Map;


import java.util.*;
public class MapExampleDemo 
{
public static void main(String[] args)
{
HashMap hm = new HashMap();
hm.put(84,"Dhivya");
hm.put(85,"Sandhiya");
hm.put(86,"kiruthi");
hm.put(87,"Kalaivani");
hm.put(88,"kalai");
System.out.println(hm);
Set a1=hm.entrySet();
System.out.println(a1);
Collection a2=hm.values();
System.out.println(a2);
Set a3 = hm.keySet();
System.out.println(a3);
System.out.println(hm.get(88));
Iterator i=a1.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}
LinkedHashMap lhm = new LinkedHashMap();
lhm.putAll(hm);
System.out.println("After putAll:" +hm);
System.out.println(hm.remove(88,"kalai"));
System.out.println("After Remove:" +hm);
}
}
