package EduCollections;

public class SimpleStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public SimpleStack(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long element){
        stackArray[++top] = element;
    }

    public long pop(){
        return stackArray[top--];
    }

    public long peek(){
        return stackArray[top];
    }

    private boolean isEmpty() {
        return top == -1;
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(10);
        stack.push(67);
        stack.push(77);
        stack.push(99);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }


}
