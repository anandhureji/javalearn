import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args){
        Queue<Integer> queue = new java.util.PriorityQueue<>();
        System.out.println(queue.peek()); // retrieves first element from queue

        for(int i=10;i<=20;i++){
            queue.offer(i);
        }
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll()); // removes the head
        System.out.println(queue.remove()); // removes the head throws exception if no element is there
    }
}
