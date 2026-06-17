package core_java_practice.gcr_codebase.String.level_3;
import java.util.Scanner;

public class DeckOfCards {

    public static String[] initializeDeck() {

        String[] suits = {
                "Hearts",
                "Diamonds",
                "Clubs",
                "Spades"
        };

        String[] ranks = {
                "2", "3", "4", "5", "6",
                "7", "8", "9", "10",
                "Jack", "Queen",
                "King", "Ace"
        };

        String[] deck =
                new String[suits.length
                        * ranks.length];

        int index = 0;

        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] =
                        rank + " of " + suit;
            }
        }

        return deck;
    }

    public static void shuffleDeck(
            String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            int randomCard =
                    i + (int)
                            (Math.random()
                                    * (n - i));

            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    public static String[][] distributeCards(
            String[] deck,
            int players,
            int cardsPerPlayer) {

        if (players * cardsPerPlayer
                > deck.length) {

            return null;
        }

        String[][] result =
                new String[players]
                        [cardsPerPlayer];

        int index = 0;

        for (int i = 0; i < players; i++) {

            for (int j = 0;
                 j < cardsPerPlayer;
                 j++) {

                result[i][j] =
                        deck[index++];
            }
        }

        return result;
    }

    public static void displayPlayers(
            String[][] players) {

        for (int i = 0;
             i < players.length;
             i++) {

            System.out.println(
                    "\nPlayer "
                            + (i + 1));

            for (int j = 0;
                 j < players[i].length;
                 j++) {

                System.out.println(
                        players[i][j]);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
                "Enter Number of Players: ");

        int players = sc.nextInt();

        System.out.print(
                "Enter Cards Per Player: ");

        int cards = sc.nextInt();

        String[] deck =
                initializeDeck();

        shuffleDeck(deck);

        String[][] distributed =
                distributeCards(
                        deck,
                        players,
                        cards);

        if (distributed == null) {

            System.out.println(
                    "Not enough cards.");

        } else {

            displayPlayers(
                    distributed);
        }

        sc.close();
    }
}