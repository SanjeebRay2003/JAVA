package Advance_Java.Collection_Framework.Sets.Linked_Hash_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class linked_hash_set {
    public static void main(String[] args) {

        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(10);
        linkedHashSet.add(50);
        linkedHashSet.add(30);
        linkedHashSet.add(20);
        linkedHashSet.add(60);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet);

        linkedHashSet.remove(30);
        System.out.println(linkedHashSet);

        System.out.println(linkedHashSet.contains(50));

        // Iterator = use for access all the elements of set
//        Iterator<Integer> it = linkedHashSet.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}

/* does not contain duplicate elements , it stores data in sequential form (LinkedList form)
 HashSet create a hash value of every element which is a unique value
    that's why it does not contain duplicate value
 */
