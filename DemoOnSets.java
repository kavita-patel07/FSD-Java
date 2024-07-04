package com.soe.mit;
// sets do not follow insertion order
// sets cannot contain duplicates
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoOnSets {
    public static void main(String[] args) {
        TreeSet<Integer> hs=new TreeSet<Integer>();
        hs.add(90);
        hs.add(34);
        hs.add(45);
        hs.add(78);
        hs.add(45);


        for(Integer i:hs)
            System.out.println(i);

    }
}
