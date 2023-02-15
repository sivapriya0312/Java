import java.util.*;
public class Stack {
    public static void main(String args[]){
        java.util.Stack<Integer> sc = new java.util.Stack<Integer>();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);
        System.out.println(sc);

        System.out.println(sc.peek());

        System.out.println(sc.pop());

        System.out.println(sc.empty());

        System.out.println(sc.capacity());

        System.out.println(sc.contains(10));

    }
}
