public class Main {
    // Calculating factorial recursively
    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    // Calculate Fibonacci recursively
    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    // Find the smallest value in an array recursively
    public static int findMin(int[] array, int index) {
        // Base case: if we have reached the end of the array
        if (index == array.length - 1) {
            return array[index];
        }

        // Recursive case: get the minimum of the rest of the array
        int minOfRest = findMin(array, index + 1);

        // Return the smaller of the current element and the minimum of the rest
        return Math.min(array[index], minOfRest);
    }

    public static void main(String[] args) {
        int number = 3;
        int resultFac = factorial(number);
        System.out.println("Factorial of " + number + " is " + resultFac);
        int resultFib = Fibonacci(number);
        System.out.println("Fibonacci of " + number + " is " + resultFib);

        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int smallest = findMin(array, 0);
        System.out.println("Smallest value in the array is: " + smallest);
    }
}
