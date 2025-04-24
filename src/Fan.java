
public class Fan {
    private String name;
    private String favoriteTeam;
    private int quizScore;

    public Fan(String name, String favoriteTeam) {
        this.name = name;
        this.favoriteTeam = favoriteTeam;
        this.quizScore = 0;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteTeam() {
        return favoriteTeam;
    }

    public int getQuizScore() {
        return quizScore;
    }

    public void setQuizScore(int score) {
        this.quizScore = score;
    }
}
