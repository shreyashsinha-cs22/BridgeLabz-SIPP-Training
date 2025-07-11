package com.stack_queue_hashMap_and_hashing_function;

import java.util.Scanner;

class PetrolPump {
    int petrol;
    int distance;

    public PetrolPump(int petrol, int distance) {
        this.petrol = petrol;
        this.distance = distance;
    }
}

public class CircularTourProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of petrol pumps
        System.out.print("Enter the number of petrol pumps: ");
        int n = sc.nextInt();

        PetrolPump[] pumps = new PetrolPump[n];
        System.out.println("Enter petrol and distance to next pump for each petrol pump:");
        for (int i = 0; i < n; i++) {
            int petrol = sc.nextInt();
            int distance = sc.nextInt();
            pumps[i] = new PetrolPump(petrol, distance);
        }

        // Find starting point for circular tour
        int startPoint = findStartingPump(pumps, n);

        // Output: Result
        if (startPoint != -1) {
            System.out.println("Start the tour from petrol pump: " + startPoint);
        } else {
            System.out.println("No solution exists. Tour cannot be completed.");
        }

        // Close the scanner
        sc.close();
    }

    // Function to find starting petrol pump index
    public static int findStartingPump(PetrolPump[] pumps, int n) {
        int start = 0, end = 1;
        int currPetrol = pumps[start].petrol - pumps[start].distance;

        while (start != end || currPetrol < 0) {
            // If current petrol becomes negative, move start ahead
            while (currPetrol < 0 && start != end) {
                currPetrol -= pumps[start].petrol - pumps[start].distance;
                start = (start + 1) % n;

                // If we've returned to starting point, no solution exists
                if (start == 0) {
                    return -1;
                }
            }

            // Add next pump to the tour
            currPetrol += pumps[end].petrol - pumps[end].distance;
            end = (end + 1) % n;
        }

        return start; // Found valid starting point
    }
}