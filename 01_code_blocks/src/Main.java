public class Main {

    public static void main(String[] args) {
        boolean game_over = true;
        int score = 10000;
        int level_completed = 8;
        int bonus = 200;

        if (game_over) {
            int final_score = score + (level_completed * bonus);
            System.out.println("Your final score is: " + final_score);
        }
    }
}
