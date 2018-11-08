public class Main {

    public static void main(String[] args) {
        boolean game_over = true;
        int score = 1500;
        int level_completed = 800;
        int bonus = 200;

        int final_score = finalScore(game_over,score,level_completed,bonus);
        System.out.println("Your final score is: " + final_score);
        String name1 = "Juan";
        displayHighScorePosition(name1,CalculateHighScorePosition(score));

        score = 1000;
        final_score = finalScore(game_over,score,level_completed,bonus);
        System.out.println("Your final score is: " + final_score);
        String name2 = "Miguel";
        displayHighScorePosition(name2,CalculateHighScorePosition(score));

        score = 400;
        final_score = finalScore(game_over,score,level_completed,bonus);
        System.out.println("Your final score is: " + final_score);
        String name3 = "Carlos";
        displayHighScorePosition(name3,CalculateHighScorePosition(score));

        score = 50;
        final_score = finalScore(game_over,score,level_completed,bonus);
        System.out.println("Your final score is: " + final_score);
        String name4 = "Marco";
        displayHighScorePosition(name4,CalculateHighScorePosition(score));
    }

    public static int finalScore(boolean game_over, int score, int level_completed, int bonus) {
        if (game_over) {
            int final_score = score + (level_completed * bonus);
            final_score += 1000;
        //    System.out.println("Your final score is: " + final_score);
            return final_score;
        }else{
            return -1;
        }
    }

    public static void displayHighScorePosition(String player_name,int position){
        System.out.println(player_name+" managed to get into the position "+position+" on the highscore table");
    }

    public static int CalculateHighScorePosition(int score){
        if(score >= 1000)
            return 1;
        if(score >= 500 && score < 1000)
            return 2;
        if(score >= 100 && score < 500)
            return 3;

        return 4;
    }
}
