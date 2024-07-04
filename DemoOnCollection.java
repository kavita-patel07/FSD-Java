package com.soe.mit;

import java.util.*;

public class DemoOnCollection {
    public static void main(String[] args) {
        //list is allocated using dynamic memory allocation
        //list can be implemented by ArrayList,Linked-list,Stack,Vector
        //list follow insertion order

        ArrayList<Integer> alist=new ArrayList<Integer>();
        alist.add(78);
        alist.add(90);
        alist.add(68);
        alist.add(50);
        alist.add(80);

//        alist.add("Tanay");
//        alist.add(2,"kavita");

//
        for(int i=0;i<alist.size();i++){
            System.out.println(alist.get(i));
        }
        Collections.sort(alist);
        System.out.println("after sorting");
        for(int i=0;i<alist.size();i++){
            System.out.println(alist.get(i));
        }

//        System.out.println("************************");
//
//        alist.remove(2);
//        for(int i=0;i<alist.size();i++){
//            System.out.println(alist.get(i));
//        }

//        LinkedList<String>llist=new LinkedList<String>();
//        llist.add("apple");
//        llist.add("banana");
//        llist.add("orange");
//        llist.add("mango");
//        llist.addFirst("Fruits");
//
//
//        for (String s:llist){
//            System.out.println(s);
//        }
//    }
//}

//        Stack<Integer> s = new Stack<Integer>();
//        s.push(56);
//        s.push(90);
//        s.push(45);
//        s.push(56);
//        for (Integer i : s) {
//            System.out.println(i);
//        }
//        System.out.println("popped element : "+s.pop());
    }
}