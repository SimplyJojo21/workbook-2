public class HighScoreWins {

    import java.util.Scanner;
    public class HighScoreWins; {
        public static void main(String[] args); {
            Scanner scanner = new Scanner(System.in);

            // Prompt user for game score
            System.out.print("Please enter a game score: ");
            String input = scanner.nextLine();

            // First split by pipe (|)
            String[] parts = input.split("\\|");

            // Get teams and scores part
            String teams = parts[0];
            String scores = parts[1];

            // Now split teams by colon (:)
            String[] teamNames = teams.split(":");

            // Split scores by colon (:)
            String[] scoreNumbers = scores.split(":");

            // Parse scores into integers
            int score1 = Integer.parseInt(scoreNumbers[0]);
            int score2 = Integer.parseInt(scoreNumbers[1]);

            // Compare scores and print winner
            if (score1 > score2) {
                System.out.println("Winner: " + teamNames[0]);
            } else if (score2 > score1) {
                System.out.println("Winner: " + teamNames[1]);
            } else {
                System.out.println("It's a tie!");
            }
        }
    }









}
