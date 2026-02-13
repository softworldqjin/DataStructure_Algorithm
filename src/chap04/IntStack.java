package chap04;

public class IntStack {
    private int[] stk;
    private int capacity;
    private int ptr;

    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException() {

        }
    }

    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {

        }
    }

    public IntStack(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError error) {
            capacity = 0;
        }
    }

    public int push(int x) throws OverflowIntStackException{
        if (ptr >= capacity) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++];
    }

    public int pop() throws EmptyIntStackException{
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }
}
