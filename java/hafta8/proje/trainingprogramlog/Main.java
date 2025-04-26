package hafta8.proje.trainingprogramlog;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome To the Training Program...");
        System.out.println("Available exercises:\n" +
                "Push-up\nSit-up\nSquat\nPull-up");

        System.out.println("Create a workout...");
        System.out.print("Enter the number of Push-up: ");
        int pushUpCount = scanner.nextInt();

        System.out.print("Enter the number of Sit-up: ");
        int sitUpCount = scanner.nextInt();

        System.out.print("Enter the number of Squat: ");
        int squatCount = scanner.nextInt();

        System.out.print("Enter the number of Pull-up: ");
        int pullUpCount = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(pushUpCount,sitUpCount,squatCount,pullUpCount);
        System.out.println("Training Starts...");


        try(FileWriter fw = new FileWriter("idman.txt",true)){
            int count = 1;
            var date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            fw.write("\n"+"Training Program - " + date + "\n");
            fw.write("Push-up: " + pushUpCount + " \n");
            fw.write("Sit-up: " + sitUpCount + " \n");
            fw.write("Squat: " + squatCount + " \n");
            fw.write("Pull-up: " + pullUpCount + " \n");

            while (!idman.isTrainingOver()){

            System.out.println("Choose the exercise.(Push-up,Sit-up,Squat,Pull-up)");
            String selectedExersize = scanner.nextLine();

            System.out.println("Enter the number of " + selectedExersize + " repetitions.");
            int repetiton = scanner.nextInt();
            scanner.nextLine();

            idman.doExersize(selectedExersize,repetiton);

            fw.write("Process " + count++ + " ----------> " + selectedExersize + " : " + repetiton + "\n");

        }
            System.out.println("Your exercise is over thanks.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
