public class NumbersStackTest {
    public static void main(String[] args) {
        NumbersStack numbersStack = new NumbersStack();
        testThat(numbersStack.getCount() == 0);
        numbersStack.push(10);
        testThat(numbersStack.getCount() == 1);
        numbersStack.push(20);
        testThat(numbersStack.getCount() == 2);
        testThat(numbersStack.pop() == 20);
    }

    public static void testThat(boolean condition) {
        if (condition) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }

}

