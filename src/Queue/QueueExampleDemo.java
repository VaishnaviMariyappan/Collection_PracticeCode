package Queue;


import java.util.*;
public class QueueExampleDemo
{
public static void main(String[] args)
{
Queue<Integer> iqueue = new LinkedList<>();
iqueue.add(3);
iqueue.add(34);
iqueue.add(89);
iqueue.add(null);
iqueue.add(50);
iqueue.add(334);
System.out.println(iqueue);
System.out.println(iqueue.size());
System.out.println("Head is:" +iqueue.peek());	
System.out.println("Removed is:" +iqueue.remove(34));
System.out.println(iqueue.poll());
}
}



