package Queue;

//Queue with Array
public class Queue{

    int front, rear, size;
    int queue[];

    Queue(int s){
        front =0;
        rear =0;
        size = s;
        queue = new int[size];
    }

    void push(int val){
        if(rear == size){
            System.out.println("QueueStack is Full");
        }
        else{
            queue[rear] = val;
            rear++;
        }
    }

    void pop(){
        if(front == rear){
            System.out.println("QueueStack is Empty !");
        }
        else{
            System.out.println("Poped Element :"+ queue[front]);
            queue[front] = -1;
            front++;
            if (front == rear){ // return index to starting
                front = 0;
                rear = 0;
            }
        }
    }

    int Size(){
        return rear - front;
    }

    Boolean isEmpty(){
        if(front == rear){
            return true;
        }
        else {
            return false;
        }
    }

    int peek(){
        if(front == rear){
            System.out.println("QueueStack is Empty !");
            return -1;
        }
        else{
            return queue[front];
        }
    }

    void print(){
            for(int i:queue){
                System.out.println(i);
            }
    }

    void print1()
    {
        int i;
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
 
        for (i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }

        System.out.println();
        return;
    }

    //Main
    public static void main(String[] args) {
        Queue q = new Queue(6);

        System.out.println("is Stack Empty :" + q.isEmpty());
        System.out.println("Stack Size :" + q.Size());
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println("is Stack Empty :" + q.isEmpty());
        System.out.println("Stack Size :" + q.Size());
        System.out.println("Top Stack Element :" + q.peek());

        q.push(4);
        System.out.println("Stack Size :" + q.Size());
        System.out.println("Top Stack Element  :" + q.peek());
        q.print();


        q.pop();
        System.out.println("Stack Size :" + q.Size());
        System.out.println("Top Stack Element  :" + q.peek());
        q.print();

        System.out.println("-------------------------");
        q.print1();
    }
    
}