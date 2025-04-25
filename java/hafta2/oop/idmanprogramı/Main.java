package hafta2.oop.idmanprogramı;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To the Training Program...");
        System.out.println("Available exercises:\n" +
                "Push-up\nSit-up\nSquat\nPull-up");

        System.out.println("Create a workout...");
        System.out.print("Enter the number of Push-ups: ");
        int pushUpCount = scanner.nextInt();
        System.out.print("Enter the number of Sit-ups: ");
        int sitUpCount = scanner.nextInt();
        System.out.print("Enter the number of Squat: ");
        int squatCount = scanner.nextInt();
        System.out.print("Enter the number of Pull-ups: ");
        int pullUpCount = scanner.nextInt();
        Idman idman = new Idman(pushUpCount,sitUpCount,squatCount,pullUpCount);
        System.out.println("Training Starts...");
        scanner.nextLine();
        while (!idman.isTrainingOver()){

            System.out.println("Choose the exercise.(Push-up,Sit-up,Squat,Pull-up)");
            String selectedExersize = scanner.nextLine();
            System.out.println("Enter the number of " + selectedExersize + " repetitions.");
            int repetiton = scanner.nextInt();
            scanner.nextLine();

            idman.doExersize(selectedExersize,repetiton);

            System.out.println("Your exercise is over thanks.");
        }

    }
}
