package core_java_practice.gcr_codebase.String.level_2;

import java.util.Scanner;

public class RockPaperScissorsStats {

    public static String computerChoice() {

        int random = (int)(Math.random() * 3);

        if (random == 0) return "Rock";
        if (random == 1) return "Paper";

        return "Scissors";
    }

    public static String winner(String user,
                                String computer) {

        if (user.equals(computer))
            return "Draw";

        if ((user.equals("Rock")
                && computer.equals("Scissors"))
                || (user.equals("Paper")
                && computer.equals("Rock"))
                || (user.equals("Scissors")
                && computer.equals("Paper"))) {

            return "Player";
        }

        return "Computer";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Games: ");
        int n = sc.nextInt();

        int playerWins = 0;
        int computerWins = 0;

        System.out.println("\nGame\tPlayer\tComputer\tWinner");

        for (int i = 1; i <= n; i++) {

            System.out.print(
                    "\nEnter Choice (Rock/Paper/Scissors): ");

            String player = sc.next();

            String computer = computerChoice();

            String result = winner(player, computer);

            if (result.equals("Player"))
                playerWins++;

            if (result.equals("Computer"))
                computerWins++;

            System.out.println(i + "\t"
                    + player + "\t"
                    + computer + "\t\t"
                    + result);
        }

        double playerPercent =
                (playerWins * 100.0) / n;

        double computerPercent =
                (computerWins * 100.0) / n;

        System.out.println("\n----- Statistics -----");
        System.out.println("Player Wins   : "
                + playerWins);

        System.out.println("Computer Wins : "
                + computerWins);

        System.out.println("Player %      : "
                + playerPercent);

        System.out.println("Computer %    : "
                + computerPercent);

        sc.close();
    }
}