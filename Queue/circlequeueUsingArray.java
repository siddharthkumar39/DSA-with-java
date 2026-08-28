public class circlequeueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;

        //constructor intializing
        Queue(int n){ 
            arr= new int [n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1 && front==-1;
        }

        public static boolean isfull(){
            //if next element to the rear is front means queue is full
            return (rear+1)%size==front;
        }
        //add
        public static void  add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            //first element add kr rhe to front=-1 se 0 krke add krnge
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty Queue");
                return -1;
            }
            int result=arr[front];
            //last element deleting
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            return result; 
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String args[]){
        Queue q= new Queue(5); // yha par constructor call hua hoga
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
