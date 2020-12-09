import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args) {

        //Get number of items
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        String enteredNumber = input.nextLine();
        int numItems = Integer.parseInt(enteredNumber);

        int[][] inputData = new int[numItems][2];

        //Get weights
        for (int i = 0; i < numItems; i++) {
            System.out.println("What is the weight of item " + (i+1) + "? ");
            enteredNumber = input.nextLine();
            inputData[i][0] = Integer.parseInt(enteredNumber);
        }

        //Get values
        for (int i = 0; i < numItems; i++) {
            System.out.println("What is the value of item " + (i+1) + "? ");
            enteredNumber = input.nextLine();
            inputData[i][1] = Integer.parseInt(enteredNumber);
        }
    }
}
