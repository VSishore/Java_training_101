import java.util.Scanner;

public class Exercise_program {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the count of the big number: ");int big =sc.nextInt();
        System.out.print("Enter the count of the Small number: ");int small=sc.nextInt();
        System.out.print("Enter the Goal: ");int goal =sc.nextInt();
        int bigUnits = 5;
        boolean goalReached = false;

        // Try to use as many big numbers as possible without exceeding the goal
        int maxBigNeeded = goal / bigUnits;
        int bigToUse = Math.min(maxBigNeeded, big);

        // Calculate the remaining goal to be achieved using small numbers
        int remainingGoal = goal - (bigToUse * bigUnits);

        // Check if we can achieve the remaining goal using small numbers
        if (remainingGoal <= small) {
            goalReached = true;
            System.out.println("The goal reached with " + bigToUse + " big and " + remainingGoal + " small.");
        }

        if (!goalReached) {
            System.out.println("The goal doesn't reached.");
        }
        }


    }

