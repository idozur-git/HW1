public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        long[] lastTwo = {0, 1};
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(lastTwo[1]);
            if (lastTwo[1] % 2 != 0) numOdd++;
            if (i < x - 1) 
                System.out.print(" ");
            long next = lastTwo[0] + lastTwo[1];
            lastTwo[0] = lastTwo[1];
            lastTwo[1] = next;
        }
        System.out.println();
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
