package oops_practice.gcr_codebase.Java_Interface;
interface StreamingService {

    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {

    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming Movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing Game...");
    }

    @Override
    public void showSubscriptionDetails() {

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();

        System.out.println("All subscriptions are active.");
    }
}

public class SmartTVDemo {

    public static void main(String[] args) {

        String[] movies = {
                "Avengers",
                "Interstellar",
                "Inception"
        };

        String[] games = {
                "FIFA",
                "Minecraft",
                "PUBG"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nMovies Available:");
        for (String movie : movies)
            System.out.println(movie);

        System.out.println("\nGames Available:");
        for (String game : games)
            System.out.println(game);

        tv.streamMovie();
        tv.playGame();
    }
}
