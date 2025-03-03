package com.company;
import java.util.Scanner;
import java.util.Random;

public class stone_paper_scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();

        // Explaining game rules
        System.out.println("WELCOME TO THE GAME\n");
        System.out.println("Stone beats Scissors");
        System.out.println("Scissors beats Paper");
        System.out.println("Paper beats Stone");
        System.out.println("If both choose the same, it's a draw.\n");

        System.out.println("LET'S START THE GAME\n");
        System.out.println("0 = Stone\n1 = Paper\n2 = Scissors");

        // Counters for wins
        int userWins = 0;
        int compWins = 0;

        System.out.println("There will be 5 rounds\n");

        for (int i = 1; i <= 5; i++) {
            System.out.println("ROUND " + i + "\n");
            System.out.print("Enter a number: ");

            int user = sc.nextInt();
            String[] choice = {"Stone", "Paper", "Scissors"};

            // Generate computer's choice for each round
            int comp = rn.nextInt(3);

            // Validate user input
            if (user < 0 || user > 2) {
                System.out.println("Invalid choice! Please select 0, 1, or 2.\n");
                i--; // Do not count this round
                continue;
            }

            System.out.println("Computer chooses: " + choice[comp]);
            System.out.println("User chooses: " + choice[user]);

            // Determine winner
            if (comp == user) {
                System.out.println("It's a draw!\n");
            } else if ((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1)) {
                System.out.println("User wins this round!\n");
                userWins++;
            } else {
                System.out.println("Computer wins this round!\n");
                compWins++;
            }
        }

        // Final result
        System.out.println("Final Score: User = " + userWins + " | Computer = " + compWins);
        if (userWins > compWins) {
            System.out.println("Congratulations! You won the game!\n");
        } else if (userWins < compWins) {
            System.out.println("Computer won the game! Better luck next time!\n");
        } else {
            System.out.println("It's a draw! Well played!\n");
        }

        sc.close();
    }
}
