package Advance_Java.Collection_Framework.Sets.Hash_Set;

import java.util.HashSet;
import java.util.Set;

public class Hash_set {
    public static void main(String[] args) {

        Set<Integer> hash = new HashSet<>();

        hash.add(10);
        hash.add(20);
        hash.add(30);
        hash.add(40);
        hash.add(50);
        hash.add(10);
        System.out.println(hash);

        hash.remove(30);
        System.out.println(hash);

        System.out.println(hash.contains(50));

    }
}

/* set does not contain duplicate elements , it stores data in Random order
    HashSet create a hash value of every element which is a unique value
    that's why it does not contain duplicate value
 */
