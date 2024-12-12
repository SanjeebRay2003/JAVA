package Advance_Java.Collection_Framework.Stack;

import java.util.Stack;
/* stack works on LIFO ( last in first out )

 */
public class stack {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        animals.push("Dog");
        animals.push("Cat");
        animals.push("Cow");
        animals.push("Lion");
        animals.push("Tiger");

        System.out.println(animals);
        animals.pop();// it delete the last element of stack
        animals.pop();
        System.out.println(animals);
        System.out.println(animals.peek()); // check the which element is on peek

    }
}

/* when we push something it add in stack form
    when we pop , the last element of stack was deleted
 */
