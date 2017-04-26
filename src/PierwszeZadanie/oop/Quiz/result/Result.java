package PierwszeZadanie.oop.Quiz.result;

/**
 * Created by bartosz on 26.04.2017.
 */
public class Result {
    private String playerName;
    private int result;

    public Result(String playerName, int result) {
        this.playerName = playerName;
        this.result = result;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getResult() {
        return result;
    }
}
