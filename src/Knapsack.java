import java.util.Scanner;

public class Knapsack {

    public static int[] weights;
    public static int[] values;
    public static int[][] F;

    public static void main(String[] args) {

        //Get number of items
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        String enteredNumber = input.nextLine();
        int numItems = Integer.parseInt(enteredNumber);
        weights = new int[numItems];
        values = new int[numItems];

        //Get capacity
        System.out.println("Enter the capacity: ");
        enteredNumber = input.nextLine();
        int capacity = Integer.parseInt(enteredNumber);

        F = new int[numItems+1][capacity+1];
        //Initialize all values to -1;
        for (int i = 1; i < F.length; i++) {
            for (int j = 1; j < F[0].length; j++) {
                F[i][j] = 0;
            }
        }

        //Get weights
        for (int i = 0; i < numItems; i++) {
            System.out.println("What is the weight of item " + (i+1) + "? ");
            enteredNumber = input.nextLine();
            weights[i] = Integer.parseInt(enteredNumber);
        }

        //Get values
        for (int i = 0; i < numItems; i++) {
            System.out.println("What is the value of item " + (i+1) + "? ");
            enteredNumber = input.nextLine();
            values[i] = Integer.parseInt(enteredNumber);
        }

        int maxValue = MFKnapsack(numItems,capacity);
        System.out.print("The maximum possible value is " + maxValue);
    }
    public static int MFKnapsack(int i, int j) {
        if (F[i][j] < 0) {
            if (j < weights[i]) {
                F[i][j] = MFKnapsack(i-1,j);
            }
            else {
                F[i][j] = Math.max(MFKnapsack(i-1,j), values[i] + MFKnapsack(i-1,j-weights[i]));
            }
        }
        return F[i][j];
    }
}
