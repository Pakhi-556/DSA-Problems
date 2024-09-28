class NodeOfDeque {
    int value;
    NodeOfDeque prev;
    NodeOfDeque next;

    public NodeOfDeque(int value, NodeOfDeque prev, NodeOfDeque next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }

    public NodeOfDeque(int value) {
        this(value, null, null);
    }
}

class MyCircularDeque {
    private int size = 0;
    private int maxSize;
    private NodeOfDeque front;
    private NodeOfDeque rear;

    public MyCircularDeque(int k) {
        this.maxSize = k;
    }

    public boolean insertFront(int value) {
        if (isFull())
            return false;
        if (front == null) 
            front = rear = new NodeOfDeque(value);
        else 
            front = front.next = new NodeOfDeque(value, front, null);
        size += 1;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull())
            return false;
        if (front == null) 
            front = rear = new NodeOfDeque(value);
        else 
            rear = rear.prev = new NodeOfDeque(value, null, rear);
        size += 1;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty())
            return false;
        if (front == rear) 
            front = rear = null;
        else 
            (front = front.prev).next = null;
        size -= 1;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty())
            return false;
        if (front == rear) 
            front = rear = null;
        else 
            (rear = rear.next).prev = null;
        size -= 1;
        return true;
    }

    public int getFront() {
        return front != null ? front.value : -1;
    }

    public int getRear() {
        return rear != null ? rear.value : -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == maxSize;
    }
}
