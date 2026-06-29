package oops_practice.gcr_codebase.Java_Interface;
interface TextModeration {

    void checkOffensiveContent(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language is allowed.");
    }

    static boolean containsRestrictedWords(String post) {

        String lower = post.toLowerCase();

        return lower.contains("bad") || lower.contains("hate") || lower.contains("abuse");
    }
}

interface SpamDetection {

    void checkSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam messages are prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public void checkOffensiveContent(String post) {

        if (TextModeration.containsRestrictedWords(post))
            System.out.println("Offensive Post");
    }

    @Override
    public void checkSpam(String post) {

        String lower = post.toLowerCase();

        if (lower.contains("buy now") ||
                lower.contains("free") ||
                lower.contains("click"))
            System.out.println("Spam Post");
    }

    @Override
    public void displayModerationPolicy() {

        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ModerationDemo {

    public static void main(String[] args) {

        String[] posts = {
                "Buy now and get FREE gifts",
                "I hate this service",
                "Hello everyone",
                "Click here to win",
                "Have a nice day",
                "You are bad"
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println();

        for (String post : posts) {

            System.out.println("Post: " + post);

            boolean spam = post.toLowerCase().contains("buy now")
                    || post.toLowerCase().contains("free")
                    || post.toLowerCase().contains("click");

            boolean offensive = TextModeration.containsRestrictedWords(post);

            if (spam)
                System.out.println("Status: Spam Post");
            else if (offensive)
                System.out.println("Status: Offensive Post");
            else
                System.out.println("Status: Valid Post");

            System.out.println();
        }
    }
}