package exercise3.app;

public class FibonacciRunner {
    public static void main(String[] args) {

        int result = getFibonacciIndex(8);
        System.out.println(result);
    }

    public static int getFibonacciIndex(int number) {
        int previous = 0;
        int current = 1;
        int index = 0;
        while (current < number) {
            int temp = current;
            current += previous;
            previous = temp;
            index++;
            if (current == number) {
                return index;
            }
        }
        return -1;

    }
}
