package Queue;

import java.util.*;

public class reverseQueue {
    
    public static void printQ(Queue q){
        while (!q.isEmpty()){
            System.out.print( " " + q.peek());
            q.remove();
        }
        System.out.println();
    }

    public static void reverseQwithStack(Queue q){
        Stack<Integer> s = new Stack<>();

        while( !q.isEmpty()){
            //s.push(q.peek());
            s.add((Integer)q.remove());
            //q.remove();
        }

        while(!s.isEmpty()){
            q.add(s.peek());
            s.pop();
        }

        // print Q
        printQ(q);
    }

    // Main
    public static void main(String[] args){

        Queue<Integer> q = new LinkedList<>();

        q.add(3);
        q.add(6);
        q.add(9);
        q.add(2);
        q.add(8);

        System.out.println("Original Queue :");
        printQ(q);

        System.out.println("Revered Queue with Stack :");
        reverseQwithStack(q);
        
    }
}
