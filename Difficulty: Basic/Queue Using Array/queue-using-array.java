class myQueue {
    int arr[];
    int front=-1;
    int rear=-1;
    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        arr=new int[n];
        front=-1;
        rear=-1;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return front==-1 && rear==-1;
     }

    public boolean isFull() {
        // Check if queue is full
        return rear==arr.length-1;
    }

    public void enqueue(int x) {
        // Enqueue
        if(!isFull()){
            if(front==-1) front++;
            arr[++rear]=x;
        }
    }
    public void dequeue() {
        // Dequeue
        if(!isEmpty()){
           if(front==rear) front=rear=-1; // when only 1 elem present in queue
            else{
                for(int i=1;i<=rear;i++)
                 arr[i-1]=arr[i];
                 rear--;
             } 
        }
    }

    public int getFront() {
        // Get front element
        if(isEmpty()) return -1;
        return arr[front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty()) return -1;
        return arr[rear];
        
    }
}
