package chap04EX;

public class Practice02<E> {
    private E[] stk;
    private int capacity;
    private int ptr;

    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {}
    }

    public static class OverflowStackException extends RuntimeException {
        public OverflowStackException() {};
    }

    public Practice02(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        try {
            stk = (E[])new Object[capacity];
        }catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E push(E x) throws OverflowStackException {
        if(ptr >= capacity)
            throw new OverflowStackException();
        return stk[ptr++] = x;
    }

    public E pop() throws EmptyStackException {
        if(ptr <= 0)
            throw new EmptyStackException();
        return stk[--ptr];
    }

    public E peek() throws EmptyStackException {
        if(ptr<=0)
            throw new EmptyStackException();
        return stk[ptr-1];
    }

    public void clear() {
        ptr = 0;
    }

    public void dump() {
        if(ptr <= 0)
            System.out.println("スタックが空です。");
        else {
            for(int i=0; i<ptr; i++)
                System.out.println(stk[i] + " ");
            System.out.println();
        }
    }

    public int size() {
        return ptr;
    }

    public int getCapacity() {
        return capacity;
    }

    public int indexOf(E x) {
        for(int i = ptr-1; i>=0; i--)
            if(stk[i].equals(x))
                return i;
        return -1;
    }
}
