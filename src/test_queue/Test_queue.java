/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_queue;
import java.util.*;

/**
 *
 * @author asmaa
 */
public class Test_queue {

    public static void main(String[] args) {
        Queue<String> pq = new LinkedList<String>();
  
        pq.add("A");
        pq.add("B");
        pq.add("C");
        System.out.println(pq);
         pq.add("D");
        System.out.println("After adding D ");
        System.out.println(pq);
         System.out.println("remove ");
        System.out.println(pq.remove());
                System.out.println(pq);

        System.out.println(pq.size());
        
        Queue<Integer> g = new LinkedList<Integer>();
        g.add(new Integer(10)); 
	  g.add(new Integer(20));
	  g.add(new Integer(30)); 
         Iterator k = pq.iterator();

        Iterator r = pq.iterator();

  int f=0;
        while (r.hasNext())
        {
            r.next() ;
            int x=g.remove();
            System.out.println("print output of remove");//10-20-30

             System.out.println(x);
                f=f+x;
        }
                System.out.println(f);

    }
    
}
