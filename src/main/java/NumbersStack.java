public class NumbersStack {
    private int[] numbers = new int[10];
    private int top;
    private int count = 0;

    public NumbersStack() {
    }

    public NumbersStack(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void push(int number) {
        numbers[count] = number;
        count++;
    }

    public int pop() {
        int top = numbers[count - 1];
        count--;
        return top;
    }
}
