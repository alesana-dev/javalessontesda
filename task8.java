public class task8 {
   /**
     * Calculates the triangular sum for each argument passed via varargs,
     * tracks the running cumulative sum, and prints the step-by-step progress.
     * 
     * @param numbers variable number of integer arguments
     * @return the total cumulative sum of all triangular sums
     */
    public static int sumOfSums(int... numbers) {
        int cumulativeSum = 0;

        for (int n : numbers) {
            // Triangular sum formula: 1 + 2 + ... + n = n * (n + 1) / 2
            int triangularSum = n * (n + 1) / 2;
            
            // Add to running cumulative sum
            cumulativeSum += triangularSum;

            // Print requirement output for each parameter
            System.out.println("Parameter " + n + ": sum = " + triangularSum + ", cumulative sum = " + cumulativeSum);
        }

        return cumulativeSum;
    }

    public static void main(String[] args) {
        // Calling the varargs method with the sample input
        int total = sumOfSums(4, 5, 10);

        // Printing the final total return value
        System.out.println("Total sum: " + total);
    }
}
