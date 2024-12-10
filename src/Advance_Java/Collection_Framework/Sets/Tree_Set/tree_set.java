package Advance_Java.Collection_Framework.Sets.Tree_Set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class tree_set {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(60);
        treeSet.add(10);
        System.out.println(treeSet);

        treeSet.remove(30);
        System.out.println(treeSet);

        System.out.println(treeSet.contains(50));
    }
}

/* does not contain duplicate elements , it stores data in sorted form (min -> max)
    * internally it runs binary search tree that's why it stores data in sorted form
    * HashSet create a hash value of every element which is a unique value
    that's why it does not contain duplicate value
 */
