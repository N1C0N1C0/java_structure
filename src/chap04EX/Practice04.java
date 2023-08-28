package chap04EX;

public class Practice04 {
    private int[] que;
    private int capacity;
    private int num;

    public class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() {}
    }

    public class OverflowQueueException extends RuntimeException {
        public OverflowQueueException() {}
    }

    public Practice04(int maxLen) {
        num = 0;
        capacity = maxLen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enqueue(int x) throws OverflowQueueException {
        if(num >= capacity)
            throw new OverflowQueueException();
        return que[num++] = x;
    }

    public int dequeue() throws EmptyQueueException {
        if(num <= 0)
            throw new EmptyQueueException();
        int x = que[0];
        for(int i=0; i<num-1; i++)
            que[i] = que[i+1];
        num--;
        return x;
    }

    public int peek() throws EmptyQueueException {
        if(num <= 0)
            throw new EmptyQueueException();
        return que[num-1];
    }

    public void clear() {
        num = 0;
    }

    public void dump() {
        if(num <= 0)
            System.out.println("キューが空です。");
        else {
            for(int i=0; i<num; i++)
                System.out.print(que[i] + " ");
            System.out.println();
        }
    }

    public int size() {
        return num;
    }

    public int getCapacity() {
        return capacity;
    }

    public int indexOf(int x) {
        for(int i=0; i < num; i++)
            if(que[i]==x)
                return 1;
        return -1;
    }
}
