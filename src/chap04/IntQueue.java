package chap04;

public class IntQueue {
    private int[] que;
    private int capacity;
    private int front;
    private int rear;
    private int num; // 현재 데이터 개수

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException(){}
    }

    public IntQueue(int maxLen) {
        num = 0;
        front = 0;
        rear = 0;

        try {
            que = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException{
        if (num >= capacity) {
            throw new OverflowIntQueueException();
        }
        que[rear++] = x;
        num++;
        if (rear == capacity) {
            rear = 0;
        }
        return x;
    }

    public int deque() throws EmptyIntQueueException{
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        int x = que[front];
        front++;
        num--;
        if (front == capacity) {
            front = 0;
        }
        return x;
    }

    public int peek() {
        if (num <= 0) {
            throw new EmptyIntQueueException();
        }
        return que[front];
    }

    public void clear() {
        num = 0;
        front = 0;
        rear = 0;
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int index = (i + front) % capacity;
            if (que[index] == x) {
                return index;
            }
        }
        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비었습니다");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }

    }

}
